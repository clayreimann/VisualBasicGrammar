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
 *  Known Limitations:
 *  1. Labels are not allowed on the following lines
 *      - Case
 *      - End Function
 *      - End Property
 *      - End Select
 *      - End Sub
 *      - End With
 *      - ElseIf
 *      - End If
 *      - Loop
 *      - Next
 *
 *  Gotchas
 *  None currently known
 *
 *  FYI
 *  1. VB.NET syntax: http://msdn.microsoft.com/en-us/library/aa711636(v=vs.71).aspx
 */

grammar VisualBasic6;

import VB6Lexer;

//
//  line level
//

colonOrNL: COLON? NL | COLON;
identifier: (ID DOT)* ID typeCharacter?; // this makes it easier to grab IDs later
typeCharacter: '$';
asArray: LPAREN (integerLiteral (TO integerLiteral)?)? RPAREN;
propertyAccess: DOT identifier;
assignTarget
    :   identifier
    |   propertyAccess
    |   assignTarget callArguments
    |   assignTarget propertyAccess
    ;

visibility
    :   PUBLIC
    |   PRIVATE
    |   FRIEND
    ;

type: builtinType | identifier;

builtinType
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

expression
    :   LPAREN expression RPAREN
    |   expression arithmeticOp=EXP expression
    |   expression arithmeticOp=(MUL|DIV|MOD|INTDIV) expression
    |   expression arithmeticOp=(PLUS|MINUS) expression
    |   expression AMP expression
    |   expression comparisonOp=(EQ|NEQ) expression
    |   expression comparisonOp=(LT|LTE) expression
    |   expression comparisonOp=(GT|GTE) expression
    |   expression comparisonOp=(LIKE|IS) expression
    |   expression conjunctionOp=(AND|OR) expression
    |   unary=(PLUS|MINUS|NOT|TYPEOF) expression
    |   expression  callArguments
    |   expression (DOT expression)+
    |   atom
    ;

callArguments:   LPAREN arguments? RPAREN;
arguments
    :    namedArguments
    |   positionalArguments
    |   positionalArguments COMMA namedArguments
    ;
positionalArguments
    :   expression  (COMMA expression?)*
    |   expression? (COMMA expression?)+;
namedArguments: tag expression (COMMA tag expression)*;
tag: identifier PARAM_TAG;

atom
    :   propertyAccess
    |   identifier
    |   literal
    |   ME
    ;
literal
    :   floatLiteral
    |   integerLiteral
    |   STRING_LITERAL
    |   DATE_LITERAL
    |   NOTHING
    |   TRUE | FALSE
    ;
floatLiteral
    :   (PLUS|MINUS)? FLOAT_LITERAL
    ;
integerLiteral
    :   (PLUS|MINUS)? INTEGER_LITERAL
    ;

newExpr
    :   NEW identifier callArguments?
    ;

//
//  statement level
//
block: line+;
line:   label? statements? NL;
label: ID COLON;
statements
    :   statement
    |   statements COLON statement;

statement
    :   assignmentStmt
    |   conditionalStmt
    |   declarationStmt
    |   errorStmt
    |   exitStmt
    |   gotoStmt
    |   invocationStmt
    |   loopStmt
    |   selectStmt
    |   withStmt
    ;

assignmentStmt
    :   assignTarget EQ expression
    |   SET assignTarget EQ (   expression
                            |   NEW identifier callArguments?
                            )
    ;

conditionalStmt
    :   ifStatement
    |   ifBlock
    ;
ifStatement
    :   IF expression THEN COLON? statements (ELSE statements)?
    ;
ifBlock
    :   ifClause
        elseIfClause*
        elseClause?
        endIfClause
    ;
ifClause: IF expression THEN COLON? block?;
elseIfClause: ELSEIF expression THEN COLON? block?;
elseClause: ELSE COLON? block?;
endIfClause: END IF;

declarationStmt
    :   DIM identifier asArray? (AS type)?
    |   CONST identifier (AS type)? (EQ literal)?
    ;

errorStmt
    : ON_ERROR  (   GOTO identifier
                |   GOTO_ZERO
                |   RESUME_NEXT
                ) COLON?
    ;

exitStmt
    : EXIT  (   DO
            |   FOR
            |   LOOP
            |   FUNCTION
            |   SUB
            )
    ;

gotoStmt
    : GOTO identifier;

invocationStmt
    :   CALL expression
    |   expression arguments
    ;

loopStmt
    :   forLoop
    |   doWhileLoop
    |   whileLoop
    ;
doWhileLoop
    :   DO (WHILE | UNTIL) expression colonOrNL
        block
        LOOP
    |   DO colonOrNL
        block
        LOOP (WHILE | UNTIL) expression
    ;
forLoop
    :   FOR expression EQ expression TO expression colonOrNL
        block
        NEXT expression?
    |   FOR EACH identifier IN expression colonOrNL
        block
        NEXT identifier?
    ;
whileLoop
    :   WHILE expression colonOrNL
        block
        WEND
    ;

selectStmt
    :   SELECT CASE expression COLON? (NL+)?
        caseStmt*
        caseElseStmt?
        END SELECT
    ;
caseStmt: CASE caseClause colonOrNL block;
caseClause
    :   expression
    |   IS op=  ( EQ | NEQ
                | GT | GTE
                | LT | LTE
                )
        expression
    | caseClause COMMA caseClause
    ;
caseElseStmt: CASE ELSE colonOrNL block;

withStmt
    :   WITH expression colonOrNL
        block
        END WITH
    ;

//
//  module level
//
memberDeclaration
    :   enumDeclaration
    |   eventDeclaration
    |   externalDeclaration
    |   methodDeclaration
    |   propertyDeclaration
    |   typeDeclaration
    |   variableDeclaration
    ;

attributes: attribute (NL attribute)*;
attribute: ATTRIBUTE identifier DOT identifier EQ literal;

enumDeclaration
    :   visibility? ENUM identifier NL+
        enumField+
        END ENUM
    ;
enumField:  identifier (EQ integerLiteral)? NL+;

eventDeclaration
    :   visibility EVENT identifier parameterList (NL attributes)?
    ;

externalDeclaration
    :   visibility DECLARE SUB identifier
            LIB STRING_LITERAL (ALIAS STRING_LITERAL)? parameterList
    |   visibility DECLARE FUNCTION identifier
            LIB STRING_LITERAL (ALIAS STRING_LITERAL)? parameterList (AS type)?
    ;

methodDeclaration
    :   subDeclaration
    |   functionDeclaration
    ;
subDeclaration
    :   visibility? SUB identifier parameterList NL+
        attributes?
        block?
        END SUB
    ;
functionDeclaration
    :   visibility? FUNCTION identifier parameterList (AS type)? NL+
        attributes?
        block?
        END FUNCTION
    ;
parameterList: LPAREN parameters? RPAREN;
parameters: parameter (COMMA parameter)*;
parameter: parameterModifier* identifier asArray? (AS type)? (EQ (literal | identifier))?;
parameterModifier: BYVAL | BYREF | OPTIONAL | PARAMARRAY;

propertyDeclaration
    :   visibility? PROPERTY propType=( LET | GET | SET ) identifier parameterList (AS type)? NL+
        attributes?
        block
        END PROPERTY
    ;

typeDeclaration
    :   visibility? TYPE identifier NL+
        (typeField NL)+
        END TYPE
    ;
typeField: identifier AS type;

variableDeclaration
    :   visibility WITHEVENTS? identifier asArray? AS type (NL+ attributes)?
    |   visibility? CONST identifier (AS type)? EQ literal (NL+ attributes)?
    ;


//
//  file level
//
file
    :   header NL*
        (optionStatement NL+)*
        (memberDeclaration NL+)*
    ;

header
    :   (hdrVersionStatement NL)?
        ((   hdrAttributeStatement
         |   hdrPropertyBlock
         ) NL)+
    ;

hdrAttributeStatement
    :   ATTRIBUTE identifier EQ literal
    |   OBJECT EQ STRING_LITERAL ';' STRING_LITERAL
    ;

hdrPropertyBlock
    :   BEGIN (identifier identifier?)? NL
        (   (   hdrProperty
            |   hdrComplexProperty
            |   hdrPropertyBlock
            ) NL
        )+
        END
    ;
hdrProperty
    :   identifier EQ literal(COLON literal)?
    ;
hdrComplexProperty
    :   BEGINPROPERTY identifier NL
        (hdrProperty NL)+
        ENDPROPERTY
    ;

hdrVersionStatement
    :   VERSION FLOAT_LITERAL CLASS?
    ;

optionStatement
    :   OPTION  (   EXPLICIT
                |   STRICT
                )
    ;

