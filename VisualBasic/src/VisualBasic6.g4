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
 *  2. a = b = c is not parsed correctly
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

visibility
    :   PUBLIC
    |   PRIVATE
    |   FRIEND
    ;

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
    :   atom
    |   unary=(PLUS|MINUS|NOT) expression
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
    ;

expressionWithArguments
    :   expression  arguments?
    |   expression (DOT expressionWithArguments)*
    ;
arguments
    :   LPAREN (    namedArguments
                |   positionalArguments
                |   positionalArguments COMMA namedArguments
                )
        RPAREN
    ;
positionalArguments:   expressionWithArguments (COMMA expressionWithArguments)*;
namedArguments: tag expressionWithArguments (COMMA tag expressionWithArguments)*;
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
    |   errorStmt
    |   exitStmt
    |   loopStmt
    |   selectStmt
    |   withStmt
    ;

assignmentStmt
    :   expressionWithArguments EQ expressionWithArguments
    ;

conditionalStmt
    :   ifStatement
    |   ifBlock
    ;
ifStatement
    :   IF expressionWithArguments THEN COLON? statements (ELSE statements)?
    ;
ifBlock
    :   ifClause
        elseIfClause*
        elseClause?
        endIfClause
    ;
ifClause: IF expressionWithArguments THEN COLON? block?;
elseIfClause: ELSEIF expressionWithArguments THEN COLON? block?;
elseClause: ELSE COLON? block?;
endIfClause: END IF;

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

loopStmt
    :   forLoop
    |   doWhileLoop
    |   whileLoop
    ;
doWhileLoop
    :   DO ((WHILE | UNTIL) expressionWithArguments)? colonOrNL
        block
        LOOP ((WHILE | UNTIL) expressionWithArguments)?
    ;
forLoop
    :   FOR expressionWithArguments EQ expressionWithArguments TO expressionWithArguments colonOrNL
        block
        NEXT expressionWithArguments?
    ;
whileLoop
    :   WHILE expressionWithArguments colonOrNL
        block
        WEND
    ;

selectStmt
    :   SELECT CASE expressionWithArguments COLON? (NL+)?
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
    :   WITH expressionWithArguments colonOrNL
        block
        END WITH
    ;









