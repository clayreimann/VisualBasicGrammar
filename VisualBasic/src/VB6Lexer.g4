/*
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2015 Clay Reimann
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 */

lexer grammar VB6Lexer;

///
/// Lexer
///

//
//  Literals
STRING_LITERAL      : '"' (ESC|.)*? '"';
fragment ESC        : '""';

fragment DIGIT      : [0-9];
fragment EXPONENT   : [eE] (PLUS | MINUS)? DIGIT+;
FLOAT_LITERAL       : DIGIT+ DOT DIGIT+ EXPONENT?
                    | DOT DIGIT+ EXPONENT?
                    | DIGIT+ EXPONENT
                    ;
INTEGER_LITERAL     : DIGIT+ AMP?;

fragment DATE_F     : DIGIT+ '/' DIGIT+ '/' DIGIT;
fragment TIME_F     : DIGIT+ ':' DIGIT+ (':' DIGIT+)? ('AM'|'PM')?;
DATE_LITERAL        : '#' (WS+)?    (   DATE_F
                                    |   TIME_F
                                    |   DATE_F WS+ TIME_F
                                    )
                      (WS+)? '#';

FALSE               : 'False';
TRUE                : 'True';
NOTHING             : 'Nothing';


// File headers
OPTION_EXPLICIT     : 'Option Explicit';
ATTRIBUTE           : 'Attribute';
VERSION             : 'VERSION';
CLASS               : 'CLASS';
BEGIN               : [Bb][Ee][Gg][Ii][Nn]; // Case insensitive

// Visibility
PUBLIC              : 'Public';
PRIVATE             : 'Private';
FRIEND              : 'Friend';

// Methods
FUNCTION            : 'Function';
GET                 : 'Get';
LET                 : 'Let';
PROPERTY            : 'Property';
SET                 : 'Set';
SUB                 : 'Sub';

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

// Flow control
CALL                : 'Call';
CASE                : 'Case';
DO                  : 'Do';
EACH                : 'Each';
ELSE                : 'Else';
ELSEIF              : 'ElseIf';
END                 : [Ee][Nn][Dd];
EXIT                : 'Exit';
FOR                 : 'For';
GOTO                : 'GoTo';
GOTO_ZERO           : 'GoTo 0';
IF                  : 'If';
IN                  : 'In';
LOOP                : 'Loop';
NEXT                : 'Next';
ON_ERROR            : 'On Error';
RESUME_NEXT         : 'Resume Next';
SELECT              : 'Select';
THEN                : 'Then';
TO                  : 'To';
UNTIL               : 'Until';
WEND                : 'Wend';
WHILE               : 'While';
WITH                : 'With';

// Misc keywords
AS                  : 'As';
DIM                 : 'Dim';
ENUM                : 'Enum';
EVENTS              : 'WithEvents';
TYPE                : 'Type';
ME                  : 'Me';
NEW                 : 'New';
CONST               : 'Const';

// Operators
AMP                 : '&';
AND                 : 'And';
DIV                 : '/';
EQ                  : '=';
EXP                 : '^';
GT                  : '>';
GTE                 : '>=';
IS                  : 'Is';
LIKE                : 'Like';
LT                  : '<';
LTE                 : '<=';
MINUS               : '-';
MOD                 : 'Mod';
MUL                 : '*';
NEQ                 : '<>';
NOT                 : 'Not';
OR                  : 'Or';
PARAM_TAG           : ':=';
PLUS                : '+';

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

ID                  : [a-zA-Z][A-Za-z0-9_]*;

// whitespace
NL                  : '\r'?'\n';                // unforunately newlines can be syntactic in VB6 so we can't just throw them out
CONT                : '_' WS* NL                -> skip; // treat line continuations as whitespace
WS                  : [ \t\f]+                  -> skip;
COMMENT             : '\'' ~[\r\n]*             -> channel(HIDDEN);