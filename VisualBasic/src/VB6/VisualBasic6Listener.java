// Generated from C:/Users/creimann/IdeaProjects/VisualBasicGrammar/VisualBasic/src\VisualBasic6.g4 by ANTLR 4.5
package VB6;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VisualBasic6Parser}.
 */
public interface VisualBasic6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#colonOrNL}.
	 * @param ctx the parse tree
	 */
	void enterColonOrNL(@NotNull VisualBasic6Parser.ColonOrNLContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#colonOrNL}.
	 * @param ctx the parse tree
	 */
	void exitColonOrNL(@NotNull VisualBasic6Parser.ColonOrNLContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull VisualBasic6Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull VisualBasic6Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#typeCharacter}.
	 * @param ctx the parse tree
	 */
	void enterTypeCharacter(@NotNull VisualBasic6Parser.TypeCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#typeCharacter}.
	 * @param ctx the parse tree
	 */
	void exitTypeCharacter(@NotNull VisualBasic6Parser.TypeCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#asArray}.
	 * @param ctx the parse tree
	 */
	void enterAsArray(@NotNull VisualBasic6Parser.AsArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#asArray}.
	 * @param ctx the parse tree
	 */
	void exitAsArray(@NotNull VisualBasic6Parser.AsArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(@NotNull VisualBasic6Parser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(@NotNull VisualBasic6Parser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void enterAssignTarget(@NotNull VisualBasic6Parser.AssignTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#assignTarget}.
	 * @param ctx the parse tree
	 */
	void exitAssignTarget(@NotNull VisualBasic6Parser.AssignTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(@NotNull VisualBasic6Parser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(@NotNull VisualBasic6Parser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull VisualBasic6Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull VisualBasic6Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#builtinType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinType(@NotNull VisualBasic6Parser.BuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#builtinType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinType(@NotNull VisualBasic6Parser.BuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull VisualBasic6Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull VisualBasic6Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#callArguments}.
	 * @param ctx the parse tree
	 */
	void enterCallArguments(@NotNull VisualBasic6Parser.CallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#callArguments}.
	 * @param ctx the parse tree
	 */
	void exitCallArguments(@NotNull VisualBasic6Parser.CallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull VisualBasic6Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull VisualBasic6Parser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArguments(@NotNull VisualBasic6Parser.PositionalArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArguments(@NotNull VisualBasic6Parser.PositionalArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#namedArguments}.
	 * @param ctx the parse tree
	 */
	void enterNamedArguments(@NotNull VisualBasic6Parser.NamedArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#namedArguments}.
	 * @param ctx the parse tree
	 */
	void exitNamedArguments(@NotNull VisualBasic6Parser.NamedArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull VisualBasic6Parser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull VisualBasic6Parser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull VisualBasic6Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull VisualBasic6Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull VisualBasic6Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull VisualBasic6Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull VisualBasic6Parser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull VisualBasic6Parser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull VisualBasic6Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull VisualBasic6Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#newExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(@NotNull VisualBasic6Parser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#newExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(@NotNull VisualBasic6Parser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull VisualBasic6Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull VisualBasic6Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull VisualBasic6Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull VisualBasic6Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull VisualBasic6Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull VisualBasic6Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull VisualBasic6Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull VisualBasic6Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull VisualBasic6Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull VisualBasic6Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(@NotNull VisualBasic6Parser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(@NotNull VisualBasic6Parser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStmt(@NotNull VisualBasic6Parser.ConditionalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStmt(@NotNull VisualBasic6Parser.ConditionalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull VisualBasic6Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull VisualBasic6Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(@NotNull VisualBasic6Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(@NotNull VisualBasic6Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(@NotNull VisualBasic6Parser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(@NotNull VisualBasic6Parser.IfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void enterElseIfClause(@NotNull VisualBasic6Parser.ElseIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void exitElseIfClause(@NotNull VisualBasic6Parser.ElseIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(@NotNull VisualBasic6Parser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(@NotNull VisualBasic6Parser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#endIfClause}.
	 * @param ctx the parse tree
	 */
	void enterEndIfClause(@NotNull VisualBasic6Parser.EndIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#endIfClause}.
	 * @param ctx the parse tree
	 */
	void exitEndIfClause(@NotNull VisualBasic6Parser.EndIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStmt(@NotNull VisualBasic6Parser.DeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStmt(@NotNull VisualBasic6Parser.DeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(@NotNull VisualBasic6Parser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(@NotNull VisualBasic6Parser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(@NotNull VisualBasic6Parser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(@NotNull VisualBasic6Parser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStmt(@NotNull VisualBasic6Parser.GotoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStmt(@NotNull VisualBasic6Parser.GotoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#invocationStmt}.
	 * @param ctx the parse tree
	 */
	void enterInvocationStmt(@NotNull VisualBasic6Parser.InvocationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#invocationStmt}.
	 * @param ctx the parse tree
	 */
	void exitInvocationStmt(@NotNull VisualBasic6Parser.InvocationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(@NotNull VisualBasic6Parser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(@NotNull VisualBasic6Parser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(@NotNull VisualBasic6Parser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(@NotNull VisualBasic6Parser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull VisualBasic6Parser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull VisualBasic6Parser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull VisualBasic6Parser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull VisualBasic6Parser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(@NotNull VisualBasic6Parser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(@NotNull VisualBasic6Parser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(@NotNull VisualBasic6Parser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(@NotNull VisualBasic6Parser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(@NotNull VisualBasic6Parser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(@NotNull VisualBasic6Parser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#caseElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseElseStmt(@NotNull VisualBasic6Parser.CaseElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#caseElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseElseStmt(@NotNull VisualBasic6Parser.CaseElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(@NotNull VisualBasic6Parser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(@NotNull VisualBasic6Parser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull VisualBasic6Parser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull VisualBasic6Parser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull VisualBasic6Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull VisualBasic6Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull VisualBasic6Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull VisualBasic6Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull VisualBasic6Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull VisualBasic6Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#enumField}.
	 * @param ctx the parse tree
	 */
	void enterEnumField(@NotNull VisualBasic6Parser.EnumFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#enumField}.
	 * @param ctx the parse tree
	 */
	void exitEnumField(@NotNull VisualBasic6Parser.EnumFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEventDeclaration(@NotNull VisualBasic6Parser.EventDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEventDeclaration(@NotNull VisualBasic6Parser.EventDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(@NotNull VisualBasic6Parser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(@NotNull VisualBasic6Parser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull VisualBasic6Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull VisualBasic6Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#subDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubDeclaration(@NotNull VisualBasic6Parser.SubDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#subDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubDeclaration(@NotNull VisualBasic6Parser.SubDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull VisualBasic6Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull VisualBasic6Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull VisualBasic6Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull VisualBasic6Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull VisualBasic6Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull VisualBasic6Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull VisualBasic6Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull VisualBasic6Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(@NotNull VisualBasic6Parser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(@NotNull VisualBasic6Parser.ParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(@NotNull VisualBasic6Parser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(@NotNull VisualBasic6Parser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull VisualBasic6Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull VisualBasic6Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#typeField}.
	 * @param ctx the parse tree
	 */
	void enterTypeField(@NotNull VisualBasic6Parser.TypeFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#typeField}.
	 * @param ctx the parse tree
	 */
	void exitTypeField(@NotNull VisualBasic6Parser.TypeFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull VisualBasic6Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull VisualBasic6Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull VisualBasic6Parser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull VisualBasic6Parser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull VisualBasic6Parser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull VisualBasic6Parser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#hdrAttributeStatement}.
	 * @param ctx the parse tree
	 */
	void enterHdrAttributeStatement(@NotNull VisualBasic6Parser.HdrAttributeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#hdrAttributeStatement}.
	 * @param ctx the parse tree
	 */
	void exitHdrAttributeStatement(@NotNull VisualBasic6Parser.HdrAttributeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#hdrPropertyBlock}.
	 * @param ctx the parse tree
	 */
	void enterHdrPropertyBlock(@NotNull VisualBasic6Parser.HdrPropertyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#hdrPropertyBlock}.
	 * @param ctx the parse tree
	 */
	void exitHdrPropertyBlock(@NotNull VisualBasic6Parser.HdrPropertyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#hdrProperty}.
	 * @param ctx the parse tree
	 */
	void enterHdrProperty(@NotNull VisualBasic6Parser.HdrPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#hdrProperty}.
	 * @param ctx the parse tree
	 */
	void exitHdrProperty(@NotNull VisualBasic6Parser.HdrPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#hdrComplexProperty}.
	 * @param ctx the parse tree
	 */
	void enterHdrComplexProperty(@NotNull VisualBasic6Parser.HdrComplexPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#hdrComplexProperty}.
	 * @param ctx the parse tree
	 */
	void exitHdrComplexProperty(@NotNull VisualBasic6Parser.HdrComplexPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#hdrVersionStatement}.
	 * @param ctx the parse tree
	 */
	void enterHdrVersionStatement(@NotNull VisualBasic6Parser.HdrVersionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#hdrVersionStatement}.
	 * @param ctx the parse tree
	 */
	void exitHdrVersionStatement(@NotNull VisualBasic6Parser.HdrVersionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionStatement(@NotNull VisualBasic6Parser.OptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionStatement(@NotNull VisualBasic6Parser.OptionStatementContext ctx);
}