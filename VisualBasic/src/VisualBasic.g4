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
 */

grammar VisualBasic;

import VB6Lexer;

///
/// Parser
///

//
//  line level
//
colonOrNL: COLON? NL | COLON;

/** the identifier rule makes it easier to pick IDs out of the parse tree */
identifier: ID;
arrayReference: LPAREN expression RPAREN;

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
    :   identifier arrayReference?
    |   MINUS? INTEGER_LITERAL
    |   MINUS? FLOAT_LITERAL
    |   STRING_LITERAL
    ;
booleanValue
    :   TRUE
    |   FALSE
    ;
objectValue
    :   expression
    |   identifier arrayReference?
    |   NEW identifier
    |   NOTHING
    ;

expression
    :   MINUS expression
    |   expression op=AMP expression
    |   expression op=(MUL|DIV)    expression
    |   expression op=(PLUS|MINUS) expression
    |   LPAREN expression RPAREN
    |   (   //symbolLookup
           literalValue
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
    : line+
    ;

line
    :   label? statements? NL
    ;
label: ID COLON;

statements
    :   statement
    |   statements COLON statement
    ;
statement
    :   assignmentStmt
    |   localVariableStmt
    |   conditionalStmt
    |   doLoop
    |   errorClause
    |   exitClause
    |   forLoop
    //|   methodInvocation
    |   selectClause
    |   whileLoop
    |   withClause
    ;

assignmentStmt
    :   ID
    ;

localVariableStmt
    : ID
    ;

conditionalStmt
    :   conditionalStatement
    |   conditionalBlock
    ;
conditionalStatement
    : IF booleanExpression THEN COLON? statements (ELSE statements)?
    ;
conditionalBlock
    :   conditionalBlockIf
        conditionalBlockElseIf*
        conditionalBlockElse?
        conditionalBlockEnd
    ;
conditionalBlockIf: IF booleanExpression THEN block?;
conditionalBlockElseIf: ELSEIF booleanExpression THEN colonOrNL block?;
conditionalBlockElse: (ELSE colonOrNL block?);
conditionalBlockEnd: END IF;

doLoop
    :   DO NL
        block
        LOOP WHILE booleanExpression
    ;

exitClause
    : EXIT  (   FOR
            |   FUNCTION
            |   LOOP
            |   SUB
            )
    ;

errorClause
    :   ON_ERROR RESUME_NEXT
    |   ON_ERROR GOTO identifier
    |   ON_ERROR GOTO_ZERO
    ;

forLoop
    :   FOR identifier EQ expression TO expression colonOrNL
        block
        NEXT identifier?
    |   FOR EACH identifier IN objectValue colonOrNL
        block
        NEXT identifier?
    ;

//methodInvocation
//    :   explicitMethodCall
//    |   withMethodCall
    //|   silentMethodCall
//    ;
//explicitMethodCall
//    :   CALL symbolLookup
//    ;
//silentMethodCall
//    :   identifier parameters?
//    ;
//symbolLookup
//    :   identifier groupedParameters? (DOT symbolLookup)?
//    ;
//groupedParameters
//    :   LPAREN parameters? RPAREN
//    ;
//parameters
//    :   (parameter COMMA)* parameter
//    ;
//parameter
//    :   tag?    (   expression
//                |   booleanExpression
//                |   objectValue
//                )
//    ;
//tag: identifier PARAM_TAG;

selectClause
    :   SELECT CASE identifier colonOrNL (NL+)?
        case*
        caseElse?
        END SELECT
    ;
case
    : CASE literalValue colonOrNL block
    ;
caseElse
    : CASE ELSE colonOrNL block
    ;

whileLoop
    :   DO WHILE booleanExpression NL
        block
        LOOP
    ;

withClause
    :   WITH objectValue colonOrNL
        block
        END WITH
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
    :   visibility? SUB identifier NL
        metaAttributes?
        block
        END SUB
    ;
metaAttributes
    : NL
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