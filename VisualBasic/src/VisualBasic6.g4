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
identifier: ID; // this makes it easier to grab IDs later
propertyAccess: DOT identifier;
assignTarget
    :   identifier
    |   propertyAccess
    |   assignTarget arguments
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
    :   unary=(PLUS|MINUS|NOT) expression
    |   LPAREN expression RPAREN
    |   expression aOpr=EXP expression
    |   expression aOp=(MUL|DIV|MOD) expression
    |   expression aOpr=(PLUS|MINUS) expression
    |   expression aOpr=(EQ|NEQ) expression
    |   expression aOpr=(LT|LTE) expression
    |   expression aOpr=(GT|GTE) expression
    |   expression LIKE expression
    |   expression AMP expression
    |   expression lOpr=(AND|OR) expression
    |   expression  arguments                   #lookup
    |   expression (DOT expression)+            #lookup
    |   atom
    ;

arguments
    :   LPAREN (    namedArguments
                |   positionalArguments
                |   positionalArguments COMMA namedArguments
                )?
        RPAREN
    ;
positionalArguments:   expression (COMMA expression?)*;
namedArguments: tag expression (COMMA tag expression)*;
tag: identifier PARAM_TAG;

atom
    :   propertyAccess
    |   identifier
    |   literal
    |   ME
    ;
literal
    :   FLOAT_LITERAL
    |   INTEGER_LITERAL
    |   STRING_LITERAL
    |   DATE_LITERAL
    |   NOTHING
    |   TRUE | FALSE
    ;
floatLiteral
    :   FLOAT_LITERAL
    ;
integerLiteral
    :   INTEGER_LITERAL
    ;

newExpr
    :   NEW identifier arguments?
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
    |   invocationStmt
    |   loopStmt
    |   selectStmt
    |   withStmt
    ;

assignmentStmt
    :   assignTarget EQ expression
    |   SET assignTarget EQ expression  #objectAssignStmt
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
    :   DIM identifier (AS type)
    ;

errorStmt
    : ON_ERROR  (   GOTO identifier
                |   GOTO_ZERO
                )
    ;

exitStmt
    : EXIT  (   FOR
            |   LOOP
            |   FUNCTION
            |   SUB
            )
    ;

invocationStmt
    :   CALL expression
    ;

loopStmt
    :   forLoop
    |   doWhileLoop
    |   whileLoop
    ;
doWhileLoop
    :   DO ((WHILE | UNTIL) expression)? colonOrNL
        block
        LOOP ((WHILE | UNTIL) expression)?
    ;
forLoop
    :   FOR expression EQ expression TO expression colonOrNL
        block
        NEXT expression?
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









