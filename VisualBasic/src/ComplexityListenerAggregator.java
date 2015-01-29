/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015. 
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import VB6.VisualBasic6BaseListener;
import VB6.VisualBasic6Lexer;
import VB6.VisualBasic6Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Clay Reimann on 1/20/2015
 *
 * This is a utility class so we can measure more than one aspect of the code with one run of the parse tree
 */
public class ComplexityListenerAggregator extends VisualBasic6BaseListener {
    ArrayList<CodeComplexityListener> m_listeners = new ArrayList<CodeComplexityListener>();
    
    public void addListener(CodeComplexityListener listener) {
        if (!m_listeners.contains(listener)) {
            m_listeners.add(listener);
        }
    }

    private static ParseTree GetFileParseTree(String filePath) throws Exception {
        BufferedReader fs = new BufferedReader(new FileReader(filePath));
        System.out.println("Parsing file: " + filePath);

        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(fs);

        // create a lexer that feeds off of input CharStream
        VisualBasic6Lexer lexer = new VisualBasic6Lexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // parse the file
        VisualBasic6Parser parser = new VisualBasic6Parser(tokens);
        ParseTree tree = parser.file();

        return tree;
    }

    public void analyzeFile(String filePath) throws Exception {
        ParseTree tree = GetFileParseTree(filePath);
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(this, tree);
    }

    @Override
    public void enterColonOrNL(@NotNull VisualBasic6Parser.ColonOrNLContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterColonOrNL(ctx);
        }
    }

    @Override
    public void exitColonOrNL(@NotNull VisualBasic6Parser.ColonOrNLContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitColonOrNL(ctx);
        }
    }

    @Override
    public void enterIdentifier(@NotNull VisualBasic6Parser.IdentifierContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterIdentifier(ctx);
        }
    }

    @Override
    public void exitIdentifier(@NotNull VisualBasic6Parser.IdentifierContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitIdentifier(ctx);
        }
    }

    @Override
    public void enterTypeCharacter(@NotNull VisualBasic6Parser.TypeCharacterContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterTypeCharacter(ctx);
        }
    }

    @Override
    public void exitTypeCharacter(@NotNull VisualBasic6Parser.TypeCharacterContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitTypeCharacter(ctx);
        }
    }

    @Override
    public void enterAsArray(@NotNull VisualBasic6Parser.AsArrayContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterAsArray(ctx);
        }
    }

    @Override
    public void exitAsArray(@NotNull VisualBasic6Parser.AsArrayContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitAsArray(ctx);
        }
    }

    @Override
    public void enterPropertyAccess(@NotNull VisualBasic6Parser.PropertyAccessContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterPropertyAccess(ctx);
        }
    }

    @Override
    public void exitPropertyAccess(@NotNull VisualBasic6Parser.PropertyAccessContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitPropertyAccess(ctx);
        }
    }

    @Override
    public void enterAssignTarget(@NotNull VisualBasic6Parser.AssignTargetContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterAssignTarget(ctx);
        }
    }

    @Override
    public void exitAssignTarget(@NotNull VisualBasic6Parser.AssignTargetContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitAssignTarget(ctx);
        }
    }

    @Override
    public void enterVisibility(@NotNull VisualBasic6Parser.VisibilityContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterVisibility(ctx);
        }
    }

    @Override
    public void exitVisibility(@NotNull VisualBasic6Parser.VisibilityContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitVisibility(ctx);
        }
    }

    @Override
    public void enterType(@NotNull VisualBasic6Parser.TypeContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterType(ctx);
        }
    }

    @Override
    public void exitType(@NotNull VisualBasic6Parser.TypeContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitType(ctx);
        }
    }

    @Override
    public void enterBuiltinType(@NotNull VisualBasic6Parser.BuiltinTypeContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterBuiltinType(ctx);
        }
    }

    @Override
    public void exitBuiltinType(@NotNull VisualBasic6Parser.BuiltinTypeContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitBuiltinType(ctx);
        }
    }

    @Override
    public void enterExpression(@NotNull VisualBasic6Parser.ExpressionContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterExpression(ctx);
        }
    }

    @Override
    public void exitExpression(@NotNull VisualBasic6Parser.ExpressionContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitExpression(ctx);
        }
    }

    @Override
    public void enterCallArguments(@NotNull VisualBasic6Parser.CallArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterCallArguments(ctx);
        }
    }

    @Override
    public void exitCallArguments(@NotNull VisualBasic6Parser.CallArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitCallArguments(ctx);
        }
    }

    @Override
    public void enterArguments(@NotNull VisualBasic6Parser.ArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterArguments(ctx);
        }
    }

    @Override
    public void exitArguments(@NotNull VisualBasic6Parser.ArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitArguments(ctx);
        }
    }

    @Override
    public void enterPositionalArguments(@NotNull VisualBasic6Parser.PositionalArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterPositionalArguments(ctx);
        }
    }

    @Override
    public void exitPositionalArguments(@NotNull VisualBasic6Parser.PositionalArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitPositionalArguments(ctx);
        }
    }

    @Override
    public void enterNamedArguments(@NotNull VisualBasic6Parser.NamedArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterNamedArguments(ctx);
        }
    }

    @Override
    public void exitNamedArguments(@NotNull VisualBasic6Parser.NamedArgumentsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitNamedArguments(ctx);
        }
    }

    @Override
    public void enterTag(@NotNull VisualBasic6Parser.TagContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterTag(ctx);
        }
    }

    @Override
    public void exitTag(@NotNull VisualBasic6Parser.TagContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitTag(ctx);
        }
    }

    @Override
    public void enterAtom(@NotNull VisualBasic6Parser.AtomContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterAtom(ctx);
        }
    }

    @Override
    public void exitAtom(@NotNull VisualBasic6Parser.AtomContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitAtom(ctx);
        }
    }

    @Override
    public void enterLiteral(@NotNull VisualBasic6Parser.LiteralContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterLiteral(ctx);
        }
    }

    @Override
    public void exitLiteral(@NotNull VisualBasic6Parser.LiteralContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitLiteral(ctx);
        }
    }

    @Override
    public void enterFloatLiteral(@NotNull VisualBasic6Parser.FloatLiteralContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterFloatLiteral(ctx);
        }
    }

    @Override
    public void exitFloatLiteral(@NotNull VisualBasic6Parser.FloatLiteralContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitFloatLiteral(ctx);
        }
    }

    @Override
    public void enterIntegerLiteral(@NotNull VisualBasic6Parser.IntegerLiteralContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterIntegerLiteral(ctx);
        }
    }

    @Override
    public void exitIntegerLiteral(@NotNull VisualBasic6Parser.IntegerLiteralContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitIntegerLiteral(ctx);
        }
    }

    @Override
    public void enterNewExpr(@NotNull VisualBasic6Parser.NewExprContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterNewExpr(ctx);
        }
    }

    @Override
    public void exitNewExpr(@NotNull VisualBasic6Parser.NewExprContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitNewExpr(ctx);
        }
    }

    @Override
    public void enterBlock(@NotNull VisualBasic6Parser.BlockContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterBlock(ctx);
        }
    }

    @Override
    public void exitBlock(@NotNull VisualBasic6Parser.BlockContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitBlock(ctx);
        }
    }

    @Override
    public void enterLine(@NotNull VisualBasic6Parser.LineContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterLine(ctx);
        }
    }

    @Override
    public void exitLine(@NotNull VisualBasic6Parser.LineContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitLine(ctx);
        }
    }

    @Override
    public void enterLabel(@NotNull VisualBasic6Parser.LabelContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterLabel(ctx);
        }
    }

    @Override
    public void exitLabel(@NotNull VisualBasic6Parser.LabelContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitLabel(ctx);
        }
    }

    @Override
    public void enterStatements(@NotNull VisualBasic6Parser.StatementsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterStatements(ctx);
        }
    }

    @Override
    public void exitStatements(@NotNull VisualBasic6Parser.StatementsContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitStatements(ctx);
        }
    }

    @Override
    public void enterStatement(@NotNull VisualBasic6Parser.StatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterStatement(ctx);
        }
    }

    @Override
    public void exitStatement(@NotNull VisualBasic6Parser.StatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitStatement(ctx);
        }
    }

    @Override
    public void enterAssignmentStmt(@NotNull VisualBasic6Parser.AssignmentStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterAssignmentStmt(ctx);
        }
    }

    @Override
    public void exitAssignmentStmt(@NotNull VisualBasic6Parser.AssignmentStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitAssignmentStmt(ctx);
        }
    }

    @Override
    public void enterConditionalStmt(@NotNull VisualBasic6Parser.ConditionalStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterConditionalStmt(ctx);
        }
    }

    @Override
    public void exitConditionalStmt(@NotNull VisualBasic6Parser.ConditionalStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitConditionalStmt(ctx);
        }
    }

    @Override
    public void enterIfStatement(@NotNull VisualBasic6Parser.IfStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterIfStatement(ctx);
        }
    }

    @Override
    public void exitIfStatement(@NotNull VisualBasic6Parser.IfStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitIfStatement(ctx);
        }
    }

    @Override
    public void enterIfBlock(@NotNull VisualBasic6Parser.IfBlockContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterIfBlock(ctx);
        }
    }

    @Override
    public void exitIfBlock(@NotNull VisualBasic6Parser.IfBlockContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitIfBlock(ctx);
        }
    }

    @Override
    public void enterIfClause(@NotNull VisualBasic6Parser.IfClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterIfClause(ctx);
        }
    }

    @Override
    public void exitIfClause(@NotNull VisualBasic6Parser.IfClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitIfClause(ctx);
        }
    }

    @Override
    public void enterElseIfClause(@NotNull VisualBasic6Parser.ElseIfClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterElseIfClause(ctx);
        }
    }

    @Override
    public void exitElseIfClause(@NotNull VisualBasic6Parser.ElseIfClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitElseIfClause(ctx);
        }
    }

    @Override
    public void enterElseClause(@NotNull VisualBasic6Parser.ElseClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterElseClause(ctx);
        }
    }

    @Override
    public void exitElseClause(@NotNull VisualBasic6Parser.ElseClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitElseClause(ctx);
        }
    }

    @Override
    public void enterEndIfClause(@NotNull VisualBasic6Parser.EndIfClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterEndIfClause(ctx);
        }
    }

    @Override
    public void exitEndIfClause(@NotNull VisualBasic6Parser.EndIfClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitEndIfClause(ctx);
        }
    }

    @Override
    public void enterDeclarationStmt(@NotNull VisualBasic6Parser.DeclarationStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterDeclarationStmt(ctx);
        }
    }

    @Override
    public void exitDeclarationStmt(@NotNull VisualBasic6Parser.DeclarationStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitDeclarationStmt(ctx);
        }
    }

    @Override
    public void enterErrorStmt(@NotNull VisualBasic6Parser.ErrorStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterErrorStmt(ctx);
        }
    }

    @Override
    public void exitErrorStmt(@NotNull VisualBasic6Parser.ErrorStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitErrorStmt(ctx);
        }
    }

    @Override
    public void enterExitStmt(@NotNull VisualBasic6Parser.ExitStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterExitStmt(ctx);
        }
    }

    @Override
    public void exitExitStmt(@NotNull VisualBasic6Parser.ExitStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitExitStmt(ctx);
        }
    }

    @Override
    public void enterGotoStmt(@NotNull VisualBasic6Parser.GotoStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterGotoStmt(ctx);
        }
    }

    @Override
    public void exitGotoStmt(@NotNull VisualBasic6Parser.GotoStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitGotoStmt(ctx);
        }
    }

    @Override
    public void enterInvocationStmt(@NotNull VisualBasic6Parser.InvocationStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterInvocationStmt(ctx);
        }
    }

    @Override
    public void exitInvocationStmt(@NotNull VisualBasic6Parser.InvocationStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitInvocationStmt(ctx);
        }
    }

    @Override
    public void enterLoopStmt(@NotNull VisualBasic6Parser.LoopStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterLoopStmt(ctx);
        }
    }

    @Override
    public void exitLoopStmt(@NotNull VisualBasic6Parser.LoopStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitLoopStmt(ctx);
        }
    }

    @Override
    public void enterDoWhileLoop(@NotNull VisualBasic6Parser.DoWhileLoopContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterDoWhileLoop(ctx);
        }
    }

    @Override
    public void exitDoWhileLoop(@NotNull VisualBasic6Parser.DoWhileLoopContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitDoWhileLoop(ctx);
        }
    }

    @Override
    public void enterForLoop(@NotNull VisualBasic6Parser.ForLoopContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterForLoop(ctx);
        }
    }

    @Override
    public void exitForLoop(@NotNull VisualBasic6Parser.ForLoopContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitForLoop(ctx);
        }
    }

    @Override
    public void enterWhileLoop(@NotNull VisualBasic6Parser.WhileLoopContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterWhileLoop(ctx);
        }
    }

    @Override
    public void exitWhileLoop(@NotNull VisualBasic6Parser.WhileLoopContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitWhileLoop(ctx);
        }
    }

    @Override
    public void enterSelectStmt(@NotNull VisualBasic6Parser.SelectStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterSelectStmt(ctx);
        }
    }

    @Override
    public void exitSelectStmt(@NotNull VisualBasic6Parser.SelectStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitSelectStmt(ctx);
        }
    }

    @Override
    public void enterCaseStmt(@NotNull VisualBasic6Parser.CaseStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterCaseStmt(ctx);
        }
    }

    @Override
    public void exitCaseStmt(@NotNull VisualBasic6Parser.CaseStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitCaseStmt(ctx);
        }
    }

    @Override
    public void enterCaseClause(@NotNull VisualBasic6Parser.CaseClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterCaseClause(ctx);
        }
    }

    @Override
    public void exitCaseClause(@NotNull VisualBasic6Parser.CaseClauseContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitCaseClause(ctx);
        }
    }

    @Override
    public void enterCaseElseStmt(@NotNull VisualBasic6Parser.CaseElseStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterCaseElseStmt(ctx);
        }
    }

    @Override
    public void exitCaseElseStmt(@NotNull VisualBasic6Parser.CaseElseStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitCaseElseStmt(ctx);
        }
    }

    @Override
    public void enterWithStmt(@NotNull VisualBasic6Parser.WithStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterWithStmt(ctx);
        }
    }

    @Override
    public void exitWithStmt(@NotNull VisualBasic6Parser.WithStmtContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitWithStmt(ctx);
        }
    }

    @Override
    public void enterMemberDeclaration(@NotNull VisualBasic6Parser.MemberDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterMemberDeclaration(ctx);
        }
    }

    @Override
    public void exitMemberDeclaration(@NotNull VisualBasic6Parser.MemberDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitMemberDeclaration(ctx);
        }
    }

    @Override
    public void enterAttributes(@NotNull VisualBasic6Parser.AttributesContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterAttributes(ctx);
        }
    }

    @Override
    public void exitAttributes(@NotNull VisualBasic6Parser.AttributesContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitAttributes(ctx);
        }
    }

    @Override
    public void enterAttribute(@NotNull VisualBasic6Parser.AttributeContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterAttribute(ctx);
        }
    }

    @Override
    public void exitAttribute(@NotNull VisualBasic6Parser.AttributeContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitAttribute(ctx);
        }
    }

    @Override
    public void enterEnumDeclaration(@NotNull VisualBasic6Parser.EnumDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterEnumDeclaration(ctx);
        }
    }

    @Override
    public void exitEnumDeclaration(@NotNull VisualBasic6Parser.EnumDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitEnumDeclaration(ctx);
        }
    }

    @Override
    public void enterEnumField(@NotNull VisualBasic6Parser.EnumFieldContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterEnumField(ctx);
        }
    }

    @Override
    public void exitEnumField(@NotNull VisualBasic6Parser.EnumFieldContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitEnumField(ctx);
        }
    }

    @Override
    public void enterEventDeclaration(@NotNull VisualBasic6Parser.EventDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterEventDeclaration(ctx);
        }
    }

    @Override
    public void exitEventDeclaration(@NotNull VisualBasic6Parser.EventDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitEventDeclaration(ctx);
        }
    }

    @Override
    public void enterExternalDeclaration(@NotNull VisualBasic6Parser.ExternalDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterExternalDeclaration(ctx);
        }
    }

    @Override
    public void exitExternalDeclaration(@NotNull VisualBasic6Parser.ExternalDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitExternalDeclaration(ctx);
        }
    }

    @Override
    public void enterMethodDeclaration(@NotNull VisualBasic6Parser.MethodDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterMethodDeclaration(ctx);
        }
    }

    @Override
    public void exitMethodDeclaration(@NotNull VisualBasic6Parser.MethodDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitMethodDeclaration(ctx);
        }
    }

    @Override
    public void enterSubDeclaration(@NotNull VisualBasic6Parser.SubDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterSubDeclaration(ctx);
        }
    }

    @Override
    public void exitSubDeclaration(@NotNull VisualBasic6Parser.SubDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitSubDeclaration(ctx);
        }
    }

    @Override
    public void enterFunctionDeclaration(@NotNull VisualBasic6Parser.FunctionDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterFunctionDeclaration(ctx);
        }
    }

    @Override
    public void exitFunctionDeclaration(@NotNull VisualBasic6Parser.FunctionDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitFunctionDeclaration(ctx);
        }
    }

    @Override
    public void enterParameterList(@NotNull VisualBasic6Parser.ParameterListContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterParameterList(ctx);
        }
    }

    @Override
    public void exitParameterList(@NotNull VisualBasic6Parser.ParameterListContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitParameterList(ctx);
        }
    }

    @Override
    public void enterParameters(@NotNull VisualBasic6Parser.ParametersContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterParameters(ctx);
        }
    }

    @Override
    public void exitParameters(@NotNull VisualBasic6Parser.ParametersContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitParameters(ctx);
        }
    }

    @Override
    public void enterParameter(@NotNull VisualBasic6Parser.ParameterContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterParameter(ctx);
        }
    }

    @Override
    public void exitParameter(@NotNull VisualBasic6Parser.ParameterContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitParameter(ctx);
        }
    }

    @Override
    public void enterParameterModifier(@NotNull VisualBasic6Parser.ParameterModifierContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterParameterModifier(ctx);
        }
    }

    @Override
    public void exitParameterModifier(@NotNull VisualBasic6Parser.ParameterModifierContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitParameterModifier(ctx);
        }
    }

    @Override
    public void enterPropertyDeclaration(@NotNull VisualBasic6Parser.PropertyDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterPropertyDeclaration(ctx);
        }
    }

    @Override
    public void exitPropertyDeclaration(@NotNull VisualBasic6Parser.PropertyDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitPropertyDeclaration(ctx);
        }
    }

    @Override
    public void enterTypeDeclaration(@NotNull VisualBasic6Parser.TypeDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterTypeDeclaration(ctx);
        }
    }

    @Override
    public void exitTypeDeclaration(@NotNull VisualBasic6Parser.TypeDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitTypeDeclaration(ctx);
        }
    }

    @Override
    public void enterTypeField(@NotNull VisualBasic6Parser.TypeFieldContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterTypeField(ctx);
        }
    }

    @Override
    public void exitTypeField(@NotNull VisualBasic6Parser.TypeFieldContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitTypeField(ctx);
        }
    }

    @Override
    public void enterVariableDeclaration(@NotNull VisualBasic6Parser.VariableDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterVariableDeclaration(ctx);
        }
    }

    @Override
    public void exitVariableDeclaration(@NotNull VisualBasic6Parser.VariableDeclarationContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitVariableDeclaration(ctx);
        }
    }

    @Override
    public void enterFile(@NotNull VisualBasic6Parser.FileContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterFile(ctx);
        }
    }

    @Override
    public void exitFile(@NotNull VisualBasic6Parser.FileContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitFile(ctx);
        }
    }

    @Override
    public void enterHeader(@NotNull VisualBasic6Parser.HeaderContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterHeader(ctx);
        }
    }

    @Override
    public void exitHeader(@NotNull VisualBasic6Parser.HeaderContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitHeader(ctx);
        }
    }

    @Override
    public void enterHdrAttributeStatement(@NotNull VisualBasic6Parser.HdrAttributeStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterHdrAttributeStatement(ctx);
        }
    }

    @Override
    public void exitHdrAttributeStatement(@NotNull VisualBasic6Parser.HdrAttributeStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitHdrAttributeStatement(ctx);
        }
    }

    @Override
    public void enterHdrPropertyBlock(@NotNull VisualBasic6Parser.HdrPropertyBlockContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterHdrPropertyBlock(ctx);
        }
    }

    @Override
    public void exitHdrPropertyBlock(@NotNull VisualBasic6Parser.HdrPropertyBlockContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitHdrPropertyBlock(ctx);
        }
    }

    @Override
    public void enterHdrProperty(@NotNull VisualBasic6Parser.HdrPropertyContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterHdrProperty(ctx);
        }
    }

    @Override
    public void exitHdrProperty(@NotNull VisualBasic6Parser.HdrPropertyContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitHdrProperty(ctx);
        }
    }

    @Override
    public void enterHdrComplexProperty(@NotNull VisualBasic6Parser.HdrComplexPropertyContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterHdrComplexProperty(ctx);
        }
    }

    @Override
    public void exitHdrComplexProperty(@NotNull VisualBasic6Parser.HdrComplexPropertyContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitHdrComplexProperty(ctx);
        }
    }

    @Override
    public void enterHdrVersionStatement(@NotNull VisualBasic6Parser.HdrVersionStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterHdrVersionStatement(ctx);
        }
    }

    @Override
    public void exitHdrVersionStatement(@NotNull VisualBasic6Parser.HdrVersionStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitHdrVersionStatement(ctx);
        }
    }

    @Override
    public void enterOptionStatement(@NotNull VisualBasic6Parser.OptionStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterOptionStatement(ctx);
        }
    }

    @Override
    public void exitOptionStatement(@NotNull VisualBasic6Parser.OptionStatementContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitOptionStatement(ctx);
        }
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.enterEveryRule(ctx);
        }
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext ctx) {
        for (CodeComplexityListener listener : m_listeners) {
            listener.exitEveryRule(ctx);
        }
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {
        super.visitErrorNode(node);
    }
}
