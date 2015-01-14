/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar VisualBasic;

options {

}

///
/// Lexer
///

// Visibility
PUBLIC              : 'Public';
PRIVATE             : 'Private';
FRIEND              : 'Friend';

// Methods
SUB                 : 'Sub';
FUNCTION            : 'Function';
PROPERTY            : 'Property';
GET                 : 'Get';
SET                 : 'Set';
LET                 : 'Let';

// Types
BOOLEAN             : 'Boolean';
BYTE                : 'Byte';
CURRENCY            : 'Currency';
DATE                : 'Date';
DECIMAL             : 'Decimal';
DOUBLE              : 'Double';
INTEGER             : 'Integer';
LONG                : 'Long';
OBJECT              : 'Object';
SINGLE              : 'Single';
STRING              : 'String';
VARIANT             : 'Variant';

// File headers
OPTION_EXPLICIT     : 'Option Explicit';
ATTRIBUTE           : 'Attribute';
VERSION             : 'VERSION';
CLASS               : 'CLASS';
BEGIN               : [Bb][Ee][Gg][Ii][Nn]; // Case insensitive

// Flow control
IF                  : 'If';
THEN                : 'Then';
ELSEIF              : 'ElseIf';
ELSE                : 'Else';
FOR                 : 'For';
EACH                : 'Each';
NEXT                : 'Next';
TO                  : 'To';
IN                  : 'In';
DO                  : 'Do';
WHILE               : 'While';
LOOP                : 'Loop';
END                 : [Ee][Nn][Dd];
EXIT                : 'Exit';
SELECT              : 'Select';
CASE                : 'Case';
ON_ERROR            : 'On Error';
GOTO_ZERO           : 'GoTo 0';
GOTO                : 'GoTo';
RESUME_NEXT         : 'Resume Next';
WITH                : 'With';
CALL                : 'Call';

// Misc keywords
AS                  : 'As';
DIM                 : 'Dim';
ENUM                : 'Enum';
EVENTS              : 'WithEvents';
TYPE                : 'Type';
NEW                 : 'New';
CONST               : 'Const';

// Operators
EQ                  : '=';
NEQ                 : '<>';
LTE                 : '<=';
GTE                 : '>=';
GT                  : '>';
LT                  : '<';
IS                  : 'Is';
OR                  : 'Or';
AND                 : 'And';
DIV                 : '/';
NOT                 : 'Not';
MUL                 : '*';
MOD                 : 'Mod';
AMP                 : '&';
PLUS                : '+';
MINUS               : '-';

// Separators
LPAREN              : '(';
RPAREN              : ')';
LBRACE              : '{';
RBRACE              : '}';
LBRACK              : '[';
RBRACK              : ']';
COMMA               : ',';
DOT                 : '.';
COLON               : ':';

// Literal values
STRING_LITERAL      : '"' (ESC|.)*? '"';
fragment ESC        : '""';

FLOAT_LITERAL       : [0-9]+ ('.'[0-9]+);
INTEGER_LITERAL     : [0-9]+ '&'?;

FALSE               : 'False';
TRUE                : 'True';
NOTHING             : 'Nothing';

ID                  : [a-zA-Z][A-Za-z0-9_]*;

// whitespace
NL                  : '\r'?'\n';                // unforunately newlines can be syntactic in VB6 so we can't just throw them out
CONT                : '_' WS* NL                -> skip; // treat line continuations as whitespace
WS                  : [ \t\f]+                  -> skip;
COMMENT             : '\'' ~[\r\n]*             -> channel(HIDDEN);

///
/// Parser
///

//
//  line level
//
/** the identifier rule makes it easier to pick IDs out of the parse tree */
identifier: ID;

visibility
    :   PUBLIC
    |   PRIVATE
    |   FRIEND
    ;

variableType
    :   BOOLEAN
    |   BYTE
    |   CURRENCY
    |   DATE
    |   DECIMAL
    |   DOUBLE
    |   INTEGER
    |   LONG
    |   OBJECT
    |   SINGLE
    |   STRING
    |   VARIANT
    ;

literalValue
    :   identifier
    |   MINUS? INTEGER_LITERAL
    |   MINUS? FLOAT_LITERAL
    |   STRING_LITERAL
    ;
booleanValue
    :   TRUE
    |   FALSE
    ;
objectValue
    :   identifier
    |   NEW identifier
    |   NOTHING
    ;

expression
    :   MINUS expression
    |   expression op=AMP expression
    |   expression op=(MUL|DIV)    expression
    |   expression op=(PLUS|MINUS) expression
    |   LPAREN expression RPAREN
    |   (   literalValue
        //| functionCall
        )
    ;

booleanExpression
    :   NOT booleanExpression
    |   booleanExpression op=(AND|OR) booleanExpression
    |   expression op=( EQ|NEQ
                      | GT|GTE
                      | LT|LTE
                      )
        expression
    |   objectValue IS objectValue
    |   LPAREN booleanExpression RPAREN
    |   expression
    |   booleanValue
    ;

//
//  block level
//
block
    : ( blockStatement NL+ )* blockStatement NL+
    ;
blockStatement
    : (     assignment
      |     blockVariable
      |     conditional
      |     doLoop
      |     errorStatement
      |     exitStatement
      |     whileLoop
      )
    ;

assignment
    : identifier EQ expression
    ;

blockVariable
    : DIM identifier (AS variableType)?
    ;

conditional
    :   conditionalStatement
    |   conditionalBlock
    ;
conditionalStatement
    : IF booleanExpression THEN (   assignment
                                |   errorStatement
                                |   exitStatement
                                //|   functionCall
                                )
    ;
conditionalBlock
    :   conditionalBlockIf
        conditionalBlockElseIf*
        conditionalBlockElse?
        conditionalBlockEnd
    ;
conditionalBlockIf: IF booleanExpression THEN NL block?;
conditionalBlockElseIf: ELSEIF booleanExpression THEN NL? block?;
conditionalBlockElse: (ELSE (COLON|COLON? NL) block?);
conditionalBlockEnd: END IF;


exitStatement
    : EXIT  (   FOR
            |   FUNCTION
            |   LOOP
            |   SUB
            )
    ;

doLoop
    :   DO NL
        block
        LOOP WHILE booleanExpression
    ;

errorStatement
    :   ON_ERROR RESUME_NEXT
    |   ON_ERROR GOTO identifier
    |   ON_ERROR GOTO_ZERO
    ;

whileLoop
    :   DO WHILE booleanExpression NL
        block
        LOOP
    ;

//
//  module level
//
bodyStatement
    : (     subDefinition
      )
    ;

moduleVariable
    :
    ;

functionDefinition
    :
    ;

subDefinition
    :   visibility SUB identifier NL
        block
        END SUB
    ;

//
// File headers (VS6 hides all this, but just open up the same file in Notepad to see what's really there)
//
headerStatement
    :   VERSION FLOAT_LITERAL CLASS?
    ;


// Start rule
file
    :   (headerStatement NL+)+ (bodyStatement NL+)*
    ;