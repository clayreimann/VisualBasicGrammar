// Generated from C:/Users/creimann/IdeaProjects/VisualBasicGrammar/VisualBasic/src\VisualBasic6.g4 by ANTLR 4.5
package VB6;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VisualBasic6Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, STRING_LITERAL=3, FLOAT_LITERAL=4, INTEGER_LITERAL=5, 
		DATE_LITERAL=6, FALSE=7, TRUE=8, NOTHING=9, OPTION=10, EXPLICIT=11, STRICT=12, 
		ATTRIBUTE=13, VERSION=14, CLASS=15, BEGIN=16, BEGINPROPERTY=17, ENDPROPERTY=18, 
		PUBLIC=19, PRIVATE=20, FRIEND=21, FUNCTION=22, GET=23, LET=24, PROPERTY=25, 
		SET=26, SUB=27, BOOLEAN=28, BYTE=29, CURRENCY=30, DATE=31, DECIMAL=32, 
		DOUBLE=33, INTEGER=34, LONG=35, OBJECT=36, SINGLE=37, STRING=38, VARIANT=39, 
		CALL=40, CASE=41, DO=42, EACH=43, ELSE=44, ELSEIF=45, END=46, EXIT=47, 
		FOR=48, GOTO=49, GOTO_ZERO=50, IF=51, IN=52, LOOP=53, NEXT=54, ON_ERROR=55, 
		RESUME_NEXT=56, SELECT=57, THEN=58, TO=59, UNTIL=60, WEND=61, WHILE=62, 
		WITH=63, AS=64, ALIAS=65, BYREF=66, BYVAL=67, CONST=68, DECLARE=69, DIM=70, 
		ENUM=71, EVENT=72, WITHEVENTS=73, LIB=74, ME=75, NEW=76, OPTIONAL=77, 
		PARAMARRAY=78, TYPE=79, TYPEOF=80, AMP=81, AND=82, DIV=83, INTDIV=84, 
		EQ=85, EXP=86, GT=87, GTE=88, IS=89, LIKE=90, LT=91, LTE=92, MINUS=93, 
		MOD=94, MUL=95, NEQ=96, NOT=97, OR=98, PARAM_TAG=99, PLUS=100, LPAREN=101, 
		RPAREN=102, LBRACE=103, RBRACE=104, LBRACK=105, RBRACK=106, COMMA=107, 
		DOT=108, COLON=109, ID=110, NL=111, CONT=112, WS=113, COMMENT=114;
	public static final int
		RULE_colonOrNL = 0, RULE_identifier = 1, RULE_typeCharacter = 2, RULE_asArray = 3, 
		RULE_propertyAccess = 4, RULE_assignTarget = 5, RULE_visibility = 6, RULE_type = 7, 
		RULE_builtinType = 8, RULE_expression = 9, RULE_callArguments = 10, RULE_arguments = 11, 
		RULE_positionalArguments = 12, RULE_namedArguments = 13, RULE_tag = 14, 
		RULE_atom = 15, RULE_literal = 16, RULE_floatLiteral = 17, RULE_integerLiteral = 18, 
		RULE_newExpr = 19, RULE_block = 20, RULE_line = 21, RULE_label = 22, RULE_statements = 23, 
		RULE_statement = 24, RULE_assignmentStmt = 25, RULE_conditionalStmt = 26, 
		RULE_ifStatement = 27, RULE_ifBlock = 28, RULE_ifClause = 29, RULE_elseIfClause = 30, 
		RULE_elseClause = 31, RULE_endIfClause = 32, RULE_declarationStmt = 33, 
		RULE_errorStmt = 34, RULE_exitStmt = 35, RULE_gotoStmt = 36, RULE_invocationStmt = 37, 
		RULE_loopStmt = 38, RULE_doWhileLoop = 39, RULE_forLoop = 40, RULE_whileLoop = 41, 
		RULE_selectStmt = 42, RULE_caseStmt = 43, RULE_caseClause = 44, RULE_caseElseStmt = 45, 
		RULE_withStmt = 46, RULE_memberDeclaration = 47, RULE_attributes = 48, 
		RULE_attribute = 49, RULE_enumDeclaration = 50, RULE_enumField = 51, RULE_eventDeclaration = 52, 
		RULE_externalDeclaration = 53, RULE_methodDeclaration = 54, RULE_subDeclaration = 55, 
		RULE_functionDeclaration = 56, RULE_parameterList = 57, RULE_parameters = 58, 
		RULE_parameter = 59, RULE_parameterModifier = 60, RULE_propertyDeclaration = 61, 
		RULE_typeDeclaration = 62, RULE_typeField = 63, RULE_variableDeclaration = 64, 
		RULE_file = 65, RULE_header = 66, RULE_hdrAttributeStatement = 67, RULE_hdrPropertyBlock = 68, 
		RULE_hdrProperty = 69, RULE_hdrComplexProperty = 70, RULE_hdrVersionStatement = 71, 
		RULE_optionStatement = 72;
	public static final String[] ruleNames = {
		"colonOrNL", "identifier", "typeCharacter", "asArray", "propertyAccess", 
		"assignTarget", "visibility", "type", "builtinType", "expression", "callArguments", 
		"arguments", "positionalArguments", "namedArguments", "tag", "atom", "literal", 
		"floatLiteral", "integerLiteral", "newExpr", "block", "line", "label", 
		"statements", "statement", "assignmentStmt", "conditionalStmt", "ifStatement", 
		"ifBlock", "ifClause", "elseIfClause", "elseClause", "endIfClause", "declarationStmt", 
		"errorStmt", "exitStmt", "gotoStmt", "invocationStmt", "loopStmt", "doWhileLoop", 
		"forLoop", "whileLoop", "selectStmt", "caseStmt", "caseClause", "caseElseStmt", 
		"withStmt", "memberDeclaration", "attributes", "attribute", "enumDeclaration", 
		"enumField", "eventDeclaration", "externalDeclaration", "methodDeclaration", 
		"subDeclaration", "functionDeclaration", "parameterList", "parameters", 
		"parameter", "parameterModifier", "propertyDeclaration", "typeDeclaration", 
		"typeField", "variableDeclaration", "file", "header", "hdrAttributeStatement", 
		"hdrPropertyBlock", "hdrProperty", "hdrComplexProperty", "hdrVersionStatement", 
		"optionStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "';'", null, null, null, null, "'False'", "'True'", "'Nothing'", 
		"'Option'", "'Explicit'", "'Strict'", "'Attribute'", "'VERSION'", "'CLASS'", 
		null, "'BeginProperty'", "'EndProperty'", "'Public'", "'Private'", "'Friend'", 
		"'Function'", "'Get'", "'Let'", "'Property'", "'Set'", "'Sub'", "'Boolean'", 
		"'Byte'", "'Currency'", "'Date'", "'Decimal'", "'Double'", "'Integer'", 
		"'Long'", "'Object'", "'Single'", "'String'", "'Variant'", "'Call'", "'Case'", 
		"'Do'", "'Each'", "'Else'", "'ElseIf'", null, "'Exit'", "'For'", "'GoTo'", 
		"'GoTo 0'", "'If'", "'In'", "'Loop'", "'Next'", "'On Error'", "'Resume Next'", 
		"'Select'", "'Then'", "'To'", "'Until'", "'Wend'", "'While'", "'With'", 
		"'As'", "'Alias'", "'ByRef'", "'ByVal'", "'Const'", "'Declare'", "'Dim'", 
		"'Enum'", "'Event'", "'WithEvents'", "'Lib'", "'Me'", "'New'", "'Optional'", 
		"'ParamArray'", "'Type'", "'TypeOf'", "'&'", "'And'", "'/'", "'\\'", "'='", 
		"'^'", "'>'", "'>='", "'Is'", "'Like'", "'<'", "'<='", "'-'", "'Mod'", 
		"'*'", "'<>'", "'Not'", "'Or'", "':='", "'+'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "','", "'.'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "STRING_LITERAL", "FLOAT_LITERAL", "INTEGER_LITERAL", 
		"DATE_LITERAL", "FALSE", "TRUE", "NOTHING", "OPTION", "EXPLICIT", "STRICT", 
		"ATTRIBUTE", "VERSION", "CLASS", "BEGIN", "BEGINPROPERTY", "ENDPROPERTY", 
		"PUBLIC", "PRIVATE", "FRIEND", "FUNCTION", "GET", "LET", "PROPERTY", "SET", 
		"SUB", "BOOLEAN", "BYTE", "CURRENCY", "DATE", "DECIMAL", "DOUBLE", "INTEGER", 
		"LONG", "OBJECT", "SINGLE", "STRING", "VARIANT", "CALL", "CASE", "DO", 
		"EACH", "ELSE", "ELSEIF", "END", "EXIT", "FOR", "GOTO", "GOTO_ZERO", "IF", 
		"IN", "LOOP", "NEXT", "ON_ERROR", "RESUME_NEXT", "SELECT", "THEN", "TO", 
		"UNTIL", "WEND", "WHILE", "WITH", "AS", "ALIAS", "BYREF", "BYVAL", "CONST", 
		"DECLARE", "DIM", "ENUM", "EVENT", "WITHEVENTS", "LIB", "ME", "NEW", "OPTIONAL", 
		"PARAMARRAY", "TYPE", "TYPEOF", "AMP", "AND", "DIV", "INTDIV", "EQ", "EXP", 
		"GT", "GTE", "IS", "LIKE", "LT", "LTE", "MINUS", "MOD", "MUL", "NEQ", 
		"NOT", "OR", "PARAM_TAG", "PLUS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "COMMA", "DOT", "COLON", "ID", "NL", "CONT", "WS", 
		"COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VisualBasic6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VisualBasic6Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ColonOrNLContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(VisualBasic6Parser.NL, 0); }
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public ColonOrNLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonOrNL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterColonOrNL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitColonOrNL(this);
		}
	}

	public final ColonOrNLContext colonOrNL() throws RecognitionException {
		ColonOrNLContext _localctx = new ColonOrNLContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_colonOrNL);
		int _la;
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(146); 
					match(COLON);
					}
				}

				setState(149); 
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); 
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(VisualBasic6Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VisualBasic6Parser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(VisualBasic6Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VisualBasic6Parser.DOT, i);
		}
		public TypeCharacterContext typeCharacter() {
			return getRuleContext(TypeCharacterContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153); 
					match(ID);
					setState(154); 
					match(DOT);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(160); 
			match(ID);
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(161); 
				typeCharacter();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCharacterContext extends ParserRuleContext {
		public TypeCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterTypeCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitTypeCharacter(this);
		}
	}

	public final TypeCharacterContext typeCharacter() throws RecognitionException {
		TypeCharacterContext _localctx = new TypeCharacterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeCharacter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsArrayContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VisualBasic6Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VisualBasic6Parser.RPAREN, 0); }
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public TerminalNode TO() { return getToken(VisualBasic6Parser.TO, 0); }
		public AsArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterAsArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitAsArray(this);
		}
	}

	public final AsArrayContext asArray() throws RecognitionException {
		AsArrayContext _localctx = new AsArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			match(LPAREN);
			setState(172);
			_la = _input.LA(1);
			if (_la==INTEGER_LITERAL || _la==MINUS || _la==PLUS) {
				{
				setState(167); 
				integerLiteral();
				setState(170);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(168); 
					match(TO);
					setState(169); 
					integerLiteral();
					}
				}

				}
			}

			setState(174); 
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAccessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(VisualBasic6Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitPropertyAccess(this);
		}
	}

	public final PropertyAccessContext propertyAccess() throws RecognitionException {
		PropertyAccessContext _localctx = new PropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propertyAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			match(DOT);
			setState(177); 
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignTargetContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public AssignTargetContext assignTarget() {
			return getRuleContext(AssignTargetContext.class,0);
		}
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public AssignTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterAssignTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitAssignTarget(this);
		}
	}

	public final AssignTargetContext assignTarget() throws RecognitionException {
		return assignTarget(0);
	}

	private AssignTargetContext assignTarget(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssignTargetContext _localctx = new AssignTargetContext(_ctx, _parentState);
		AssignTargetContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_assignTarget, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(180); 
				identifier();
				}
				break;
			case DOT:
				{
				setState(181); 
				propertyAccess();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AssignTargetContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignTarget);
						setState(184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185); 
						callArguments();
						}
						break;
					case 2:
						{
						_localctx = new AssignTargetContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignTarget);
						setState(186);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(187); 
						propertyAccess();
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(VisualBasic6Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(VisualBasic6Parser.PRIVATE, 0); }
		public TerminalNode FRIEND() { return getToken(VisualBasic6Parser.FRIEND, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitVisibility(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FRIEND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CURRENCY:
			case DATE:
			case DECIMAL:
			case DOUBLE:
			case INTEGER:
			case LONG:
			case OBJECT:
			case SINGLE:
			case STRING:
			case VARIANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); 
				builtinType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); 
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltinTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(VisualBasic6Parser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(VisualBasic6Parser.BYTE, 0); }
		public TerminalNode CURRENCY() { return getToken(VisualBasic6Parser.CURRENCY, 0); }
		public TerminalNode DATE() { return getToken(VisualBasic6Parser.DATE, 0); }
		public TerminalNode DECIMAL() { return getToken(VisualBasic6Parser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(VisualBasic6Parser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(VisualBasic6Parser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(VisualBasic6Parser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(VisualBasic6Parser.OBJECT, 0); }
		public TerminalNode SINGLE() { return getToken(VisualBasic6Parser.SINGLE, 0); }
		public TerminalNode STRING() { return getToken(VisualBasic6Parser.STRING, 0); }
		public TerminalNode VARIANT() { return getToken(VisualBasic6Parser.VARIANT, 0); }
		public BuiltinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterBuiltinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitBuiltinType(this);
		}
	}

	public final BuiltinTypeContext builtinType() throws RecognitionException {
		BuiltinTypeContext _localctx = new BuiltinTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_builtinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CURRENCY) | (1L << DATE) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << INTEGER) | (1L << LONG) | (1L << OBJECT) | (1L << SINGLE) | (1L << STRING) | (1L << VARIANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token unary;
		public Token arithmeticOp;
		public Token comparisonOp;
		public Token conjunctionOp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VisualBasic6Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VisualBasic6Parser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(VisualBasic6Parser.NOT, 0); }
		public TerminalNode TYPEOF() { return getToken(VisualBasic6Parser.TYPEOF, 0); }
		public TerminalNode LPAREN() { return getToken(VisualBasic6Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VisualBasic6Parser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode EXP() { return getToken(VisualBasic6Parser.EXP, 0); }
		public TerminalNode MUL() { return getToken(VisualBasic6Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VisualBasic6Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(VisualBasic6Parser.MOD, 0); }
		public TerminalNode INTDIV() { return getToken(VisualBasic6Parser.INTDIV, 0); }
		public TerminalNode AMP() { return getToken(VisualBasic6Parser.AMP, 0); }
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VisualBasic6Parser.NEQ, 0); }
		public TerminalNode LT() { return getToken(VisualBasic6Parser.LT, 0); }
		public TerminalNode LTE() { return getToken(VisualBasic6Parser.LTE, 0); }
		public TerminalNode GT() { return getToken(VisualBasic6Parser.GT, 0); }
		public TerminalNode GTE() { return getToken(VisualBasic6Parser.GTE, 0); }
		public TerminalNode LIKE() { return getToken(VisualBasic6Parser.LIKE, 0); }
		public TerminalNode IS() { return getToken(VisualBasic6Parser.IS, 0); }
		public TerminalNode AND() { return getToken(VisualBasic6Parser.AND, 0); }
		public TerminalNode OR() { return getToken(VisualBasic6Parser.OR, 0); }
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(VisualBasic6Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VisualBasic6Parser.DOT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(202);
				((ExpressionContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (TYPEOF - 80)) | (1L << (MINUS - 80)) | (1L << (NOT - 80)) | (1L << (PLUS - 80)))) != 0)) ) {
					((ExpressionContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(203); 
				expression(4);
				}
				break;
			case 2:
				{
				setState(204); 
				match(LPAREN);
				setState(205); 
				expression(0);
				setState(206); 
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(208); 
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(212); 
						((ExpressionContext)_localctx).arithmeticOp = match(EXP);
						setState(213); 
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(215);
						((ExpressionContext)_localctx).arithmeticOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (DIV - 83)) | (1L << (INTDIV - 83)) | (1L << (MOD - 83)) | (1L << (MUL - 83)))) != 0)) ) {
							((ExpressionContext)_localctx).arithmeticOp = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(216); 
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(218);
						((ExpressionContext)_localctx).arithmeticOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((ExpressionContext)_localctx).arithmeticOp = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(219); 
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(221); 
						match(AMP);
						setState(222); 
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(224);
						((ExpressionContext)_localctx).comparisonOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExpressionContext)_localctx).comparisonOp = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(225); 
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						((ExpressionContext)_localctx).comparisonOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==LTE) ) {
							((ExpressionContext)_localctx).comparisonOp = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(228); 
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
						((ExpressionContext)_localctx).comparisonOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GT || _la==GTE) ) {
							((ExpressionContext)_localctx).comparisonOp = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(231); 
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(233);
						((ExpressionContext)_localctx).comparisonOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IS || _la==LIKE) ) {
							((ExpressionContext)_localctx).comparisonOp = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(234); 
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						((ExpressionContext)_localctx).conjunctionOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionContext)_localctx).conjunctionOp = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(237); 
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(239); 
						callArguments();
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(241); 
								match(DOT);
								setState(242); 
								expression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(245); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VisualBasic6Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VisualBasic6Parser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitCallArguments(this);
		}
	}

	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			match(LPAREN);
			setState(254);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ME - 75)) | (1L << (TYPEOF - 75)) | (1L << (MINUS - 75)) | (1L << (NOT - 75)) | (1L << (PLUS - 75)) | (1L << (LPAREN - 75)) | (1L << (COMMA - 75)) | (1L << (DOT - 75)) | (1L << (ID - 75)))) != 0)) {
				{
				setState(253); 
				arguments();
				}
			}

			setState(256); 
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public NamedArgumentsContext namedArguments() {
			return getRuleContext(NamedArgumentsContext.class,0);
		}
		public PositionalArgumentsContext positionalArguments() {
			return getRuleContext(PositionalArgumentsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(VisualBasic6Parser.COMMA, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		try {
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); 
				namedArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); 
				positionalArguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260); 
				positionalArguments();
				setState(261); 
				match(COMMA);
				setState(262); 
				namedArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionalArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualBasic6Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualBasic6Parser.COMMA, i);
		}
		public PositionalArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterPositionalArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitPositionalArguments(this);
		}
	}

	public final PositionalArgumentsContext positionalArguments() throws RecognitionException {
		PositionalArgumentsContext _localctx = new PositionalArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_positionalArguments);
		int _la;
		try {
			int _alt;
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); 
				expression(0);
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267); 
						match(COMMA);
						setState(269);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(268); 
							expression(0);
							}
							break;
						}
						}
						} 
					}
					setState(275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (ME - 75)) | (1L << (TYPEOF - 75)) | (1L << (MINUS - 75)) | (1L << (NOT - 75)) | (1L << (PLUS - 75)) | (1L << (LPAREN - 75)) | (1L << (DOT - 75)) | (1L << (ID - 75)))) != 0)) {
					{
					setState(276); 
					expression(0);
					}
				}

				setState(283); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(279); 
						match(COMMA);
						setState(281);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(280); 
							expression(0);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(285); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentsContext extends ParserRuleContext {
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualBasic6Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualBasic6Parser.COMMA, i);
		}
		public NamedArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterNamedArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitNamedArguments(this);
		}
	}

	public final NamedArgumentsContext namedArguments() throws RecognitionException {
		NamedArgumentsContext _localctx = new NamedArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_namedArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289); 
			tag();
			setState(290); 
			expression(0);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291); 
					match(COMMA);
					setState(292); 
					tag();
					setState(293); 
					expression(0);
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PARAM_TAG() { return getToken(VisualBasic6Parser.PARAM_TAG, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); 
			identifier();
			setState(301); 
			match(PARAM_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ME() { return getToken(VisualBasic6Parser.ME, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); 
				propertyAccess();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); 
				identifier();
				}
				break;
			case STRING_LITERAL:
			case FLOAT_LITERAL:
			case INTEGER_LITERAL:
			case DATE_LITERAL:
			case FALSE:
			case TRUE:
			case NOTHING:
			case MINUS:
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(305); 
				literal();
				}
				break;
			case ME:
				enterOuterAlt(_localctx, 4);
				{
				setState(306); 
				match(ME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(VisualBasic6Parser.STRING_LITERAL, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(VisualBasic6Parser.DATE_LITERAL, 0); }
		public TerminalNode NOTHING() { return getToken(VisualBasic6Parser.NOTHING, 0); }
		public TerminalNode TRUE() { return getToken(VisualBasic6Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VisualBasic6Parser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); 
				floatLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); 
				integerLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311); 
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312); 
				match(DATE_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(313); 
				match(NOTHING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314); 
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(315); 
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(VisualBasic6Parser.FLOAT_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(VisualBasic6Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VisualBasic6Parser.MINUS, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(321); 
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(VisualBasic6Parser.INTEGER_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(VisualBasic6Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VisualBasic6Parser.MINUS, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(323);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(326); 
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(VisualBasic6Parser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitNewExpr(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); 
			match(NEW);
			setState(329); 
			identifier();
			setState(331);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(330); 
				callArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333); 
				line();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING) | (1L << SET) | (1L << CALL) | (1L << DO) | (1L << EXIT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << ON_ERROR) | (1L << SELECT) | (1L << WHILE) | (1L << WITH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CONST - 68)) | (1L << (DIM - 68)) | (1L << (ME - 68)) | (1L << (TYPEOF - 68)) | (1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (PLUS - 68)) | (1L << (LPAREN - 68)) | (1L << (DOT - 68)) | (1L << (ID - 68)) | (1L << (NL - 68)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(VisualBasic6Parser.NL, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(338); 
				label();
				}
				break;
			}
			setState(342);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING) | (1L << SET) | (1L << CALL) | (1L << DO) | (1L << EXIT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << ON_ERROR) | (1L << SELECT) | (1L << WHILE) | (1L << WITH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CONST - 68)) | (1L << (DIM - 68)) | (1L << (ME - 68)) | (1L << (TYPEOF - 68)) | (1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (PLUS - 68)) | (1L << (LPAREN - 68)) | (1L << (DOT - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				setState(341); 
				statements(0);
				}
			}

			setState(344); 
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VisualBasic6Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			match(ID);
			setState(347); 
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(350); 
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(352);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(353); 
					match(COLON);
					setState(354); 
					statement();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public ConditionalStmtContext conditionalStmt() {
			return getRuleContext(ConditionalStmtContext.class,0);
		}
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class,0);
		}
		public ErrorStmtContext errorStmt() {
			return getRuleContext(ErrorStmtContext.class,0);
		}
		public ExitStmtContext exitStmt() {
			return getRuleContext(ExitStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public InvocationStmtContext invocationStmt() {
			return getRuleContext(InvocationStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public WithStmtContext withStmt() {
			return getRuleContext(WithStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); 
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); 
				conditionalStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362); 
				declarationStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363); 
				errorStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364); 
				exitStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(365); 
				gotoStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(366); 
				invocationStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(367); 
				loopStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(368); 
				selectStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(369); 
				withStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStmtContext extends ParserRuleContext {
		public AssignTargetContext assignTarget() {
			return getRuleContext(AssignTargetContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SET() { return getToken(VisualBasic6Parser.SET, 0); }
		public TerminalNode NEW() { return getToken(VisualBasic6Parser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitAssignmentStmt(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignmentStmt);
		try {
			setState(387);
			switch (_input.LA(1)) {
			case DOT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(372); 
				assignTarget(0);
				setState(373); 
				match(EQ);
				setState(374); 
				expression(0);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); 
				match(SET);
				setState(377); 
				assignTarget(0);
				setState(378); 
				match(EQ);
				setState(385);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case FLOAT_LITERAL:
				case INTEGER_LITERAL:
				case DATE_LITERAL:
				case FALSE:
				case TRUE:
				case NOTHING:
				case ME:
				case TYPEOF:
				case MINUS:
				case NOT:
				case PLUS:
				case LPAREN:
				case DOT:
				case ID:
					{
					setState(379); 
					expression(0);
					}
					break;
				case NEW:
					{
					setState(380); 
					match(NEW);
					setState(381); 
					identifier();
					setState(383);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(382); 
						callArguments();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStmtContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ConditionalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterConditionalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitConditionalStmt(this);
		}
	}

	public final ConditionalStmtContext conditionalStmt() throws RecognitionException {
		ConditionalStmtContext _localctx = new ConditionalStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalStmt);
		try {
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389); 
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); 
				ifBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VisualBasic6Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VisualBasic6Parser.THEN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public TerminalNode ELSE() { return getToken(VisualBasic6Parser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			match(IF);
			setState(394); 
			expression(0);
			setState(395); 
			match(THEN);
			setState(397);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(396); 
				match(COLON);
				}
			}

			setState(399); 
			statements(0);
			setState(402);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(400); 
				match(ELSE);
				setState(401); 
				statements(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public IfClauseContext ifClause() {
			return getRuleContext(IfClauseContext.class,0);
		}
		public EndIfClauseContext endIfClause() {
			return getRuleContext(EndIfClauseContext.class,0);
		}
		public List<ElseIfClauseContext> elseIfClause() {
			return getRuleContexts(ElseIfClauseContext.class);
		}
		public ElseIfClauseContext elseIfClause(int i) {
			return getRuleContext(ElseIfClauseContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); 
			ifClause();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(405); 
				elseIfClause();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(411); 
				elseClause();
				}
			}

			setState(414); 
			endIfClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfClauseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VisualBasic6Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VisualBasic6Parser.THEN, 0); }
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitIfClause(this);
		}
	}

	public final IfClauseContext ifClause() throws RecognitionException {
		IfClauseContext _localctx = new IfClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); 
			match(IF);
			setState(417); 
			expression(0);
			setState(418); 
			match(THEN);
			setState(420);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(419); 
				match(COLON);
				}
			}

			setState(423);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING) | (1L << SET) | (1L << CALL) | (1L << DO) | (1L << EXIT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << ON_ERROR) | (1L << SELECT) | (1L << WHILE) | (1L << WITH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CONST - 68)) | (1L << (DIM - 68)) | (1L << (ME - 68)) | (1L << (TYPEOF - 68)) | (1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (PLUS - 68)) | (1L << (LPAREN - 68)) | (1L << (DOT - 68)) | (1L << (ID - 68)) | (1L << (NL - 68)))) != 0)) {
				{
				setState(422); 
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfClauseContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(VisualBasic6Parser.ELSEIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VisualBasic6Parser.THEN, 0); }
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterElseIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitElseIfClause(this);
		}
	}

	public final ElseIfClauseContext elseIfClause() throws RecognitionException {
		ElseIfClauseContext _localctx = new ElseIfClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseIfClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); 
			match(ELSEIF);
			setState(426); 
			expression(0);
			setState(427); 
			match(THEN);
			setState(429);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(428); 
				match(COLON);
				}
			}

			setState(432);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING) | (1L << SET) | (1L << CALL) | (1L << DO) | (1L << EXIT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << ON_ERROR) | (1L << SELECT) | (1L << WHILE) | (1L << WITH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CONST - 68)) | (1L << (DIM - 68)) | (1L << (ME - 68)) | (1L << (TYPEOF - 68)) | (1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (PLUS - 68)) | (1L << (LPAREN - 68)) | (1L << (DOT - 68)) | (1L << (ID - 68)) | (1L << (NL - 68)))) != 0)) {
				{
				setState(431); 
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(VisualBasic6Parser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitElseClause(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); 
			match(ELSE);
			setState(436);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(435); 
				match(COLON);
				}
			}

			setState(439);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING) | (1L << SET) | (1L << CALL) | (1L << DO) | (1L << EXIT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << ON_ERROR) | (1L << SELECT) | (1L << WHILE) | (1L << WITH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CONST - 68)) | (1L << (DIM - 68)) | (1L << (ME - 68)) | (1L << (TYPEOF - 68)) | (1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (PLUS - 68)) | (1L << (LPAREN - 68)) | (1L << (DOT - 68)) | (1L << (ID - 68)) | (1L << (NL - 68)))) != 0)) {
				{
				setState(438); 
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndIfClauseContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public TerminalNode IF() { return getToken(VisualBasic6Parser.IF, 0); }
		public EndIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterEndIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitEndIfClause(this);
		}
	}

	public final EndIfClauseContext endIfClause() throws RecognitionException {
		EndIfClauseContext _localctx = new EndIfClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_endIfClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); 
			match(END);
			setState(442); 
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStmtContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(VisualBasic6Parser.DIM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AsArrayContext asArray() {
			return getRuleContext(AsArrayContext.class,0);
		}
		public TerminalNode AS() { return getToken(VisualBasic6Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONST() { return getToken(VisualBasic6Parser.CONST, 0); }
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DeclarationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterDeclarationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitDeclarationStmt(this);
		}
	}

	public final DeclarationStmtContext declarationStmt() throws RecognitionException {
		DeclarationStmtContext _localctx = new DeclarationStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarationStmt);
		try {
			setState(463);
			switch (_input.LA(1)) {
			case DIM:
				enterOuterAlt(_localctx, 1);
				{
				setState(444); 
				match(DIM);
				setState(445); 
				identifier();
				setState(447);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(446); 
					asArray();
					}
					break;
				}
				setState(451);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(449); 
					match(AS);
					setState(450); 
					type();
					}
					break;
				}
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(453); 
				match(CONST);
				setState(454); 
				identifier();
				setState(457);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(455); 
					match(AS);
					setState(456); 
					type();
					}
					break;
				}
				setState(461);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(459); 
					match(EQ);
					setState(460); 
					literal();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorStmtContext extends ParserRuleContext {
		public TerminalNode ON_ERROR() { return getToken(VisualBasic6Parser.ON_ERROR, 0); }
		public TerminalNode GOTO() { return getToken(VisualBasic6Parser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode GOTO_ZERO() { return getToken(VisualBasic6Parser.GOTO_ZERO, 0); }
		public TerminalNode RESUME_NEXT() { return getToken(VisualBasic6Parser.RESUME_NEXT, 0); }
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public ErrorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterErrorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitErrorStmt(this);
		}
	}

	public final ErrorStmtContext errorStmt() throws RecognitionException {
		ErrorStmtContext _localctx = new ErrorStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_errorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); 
			match(ON_ERROR);
			setState(470);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(466); 
				match(GOTO);
				setState(467); 
				identifier();
				}
				break;
			case GOTO_ZERO:
				{
				setState(468); 
				match(GOTO_ZERO);
				}
				break;
			case RESUME_NEXT:
				{
				setState(469); 
				match(RESUME_NEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(472); 
				match(COLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStmtContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(VisualBasic6Parser.EXIT, 0); }
		public TerminalNode DO() { return getToken(VisualBasic6Parser.DO, 0); }
		public TerminalNode FOR() { return getToken(VisualBasic6Parser.FOR, 0); }
		public TerminalNode LOOP() { return getToken(VisualBasic6Parser.LOOP, 0); }
		public TerminalNode FUNCTION() { return getToken(VisualBasic6Parser.FUNCTION, 0); }
		public TerminalNode SUB() { return getToken(VisualBasic6Parser.SUB, 0); }
		public ExitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitExitStmt(this);
		}
	}

	public final ExitStmtContext exitStmt() throws RecognitionException {
		ExitStmtContext _localctx = new ExitStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); 
			match(EXIT);
			setState(476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << SUB) | (1L << DO) | (1L << FOR) | (1L << LOOP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(VisualBasic6Parser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitGotoStmt(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); 
			match(GOTO);
			setState(479); 
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationStmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(VisualBasic6Parser.CALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InvocationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterInvocationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitInvocationStmt(this);
		}
	}

	public final InvocationStmtContext invocationStmt() throws RecognitionException {
		InvocationStmtContext _localctx = new InvocationStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_invocationStmt);
		try {
			setState(486);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(481); 
				match(CALL);
				setState(482); 
				expression(0);
				}
				break;
			case STRING_LITERAL:
			case FLOAT_LITERAL:
			case INTEGER_LITERAL:
			case DATE_LITERAL:
			case FALSE:
			case TRUE:
			case NOTHING:
			case ME:
			case TYPEOF:
			case MINUS:
			case NOT:
			case PLUS:
			case LPAREN:
			case DOT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(483); 
				expression(0);
				setState(484); 
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStmtContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitLoopStmt(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loopStmt);
		try {
			setState(491);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(488); 
				forLoop();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(489); 
				doWhileLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(490); 
				whileLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(VisualBasic6Parser.DO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColonOrNLContext colonOrNL() {
			return getRuleContext(ColonOrNLContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(VisualBasic6Parser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(VisualBasic6Parser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(VisualBasic6Parser.UNTIL, 0); }
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitDoWhileLoop(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_doWhileLoop);
		int _la;
		try {
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493); 
				match(DO);
				setState(494);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(495); 
				expression(0);
				setState(496); 
				colonOrNL();
				setState(497); 
				block();
				setState(498); 
				match(LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500); 
				match(DO);
				setState(501); 
				colonOrNL();
				setState(502); 
				block();
				setState(503); 
				match(LOOP);
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==UNTIL || _la==WHILE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(505); 
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VisualBasic6Parser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public TerminalNode TO() { return getToken(VisualBasic6Parser.TO, 0); }
		public ColonOrNLContext colonOrNL() {
			return getRuleContext(ColonOrNLContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(VisualBasic6Parser.NEXT, 0); }
		public TerminalNode EACH() { return getToken(VisualBasic6Parser.EACH, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(VisualBasic6Parser.IN, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forLoop);
		try {
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509); 
				match(FOR);
				setState(510); 
				expression(0);
				setState(511); 
				match(EQ);
				setState(512); 
				expression(0);
				setState(513); 
				match(TO);
				setState(514); 
				expression(0);
				setState(515); 
				colonOrNL();
				setState(516); 
				block();
				setState(517); 
				match(NEXT);
				setState(519);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(518); 
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521); 
				match(FOR);
				setState(522); 
				match(EACH);
				setState(523); 
				identifier();
				setState(524); 
				match(IN);
				setState(525); 
				expression(0);
				setState(526); 
				colonOrNL();
				setState(527); 
				block();
				setState(528); 
				match(NEXT);
				setState(530);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(529); 
					identifier();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VisualBasic6Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColonOrNLContext colonOrNL() {
			return getRuleContext(ColonOrNLContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WEND() { return getToken(VisualBasic6Parser.WEND, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); 
			match(WHILE);
			setState(535); 
			expression(0);
			setState(536); 
			colonOrNL();
			setState(537); 
			block();
			setState(538); 
			match(WEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public List<TerminalNode> SELECT() { return getTokens(VisualBasic6Parser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(VisualBasic6Parser.SELECT, i);
		}
		public TerminalNode CASE() { return getToken(VisualBasic6Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public List<CaseStmtContext> caseStmt() {
			return getRuleContexts(CaseStmtContext.class);
		}
		public CaseStmtContext caseStmt(int i) {
			return getRuleContext(CaseStmtContext.class,i);
		}
		public CaseElseStmtContext caseElseStmt() {
			return getRuleContext(CaseElseStmtContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitSelectStmt(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_selectStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540); 
			match(SELECT);
			setState(541); 
			match(CASE);
			setState(542); 
			expression(0);
			setState(544);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(543); 
				match(COLON);
				}
			}

			setState(551);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(547); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(546); 
					match(NL);
					}
					}
					setState(549); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
			}

			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(553); 
					caseStmt();
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(560);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(559); 
				caseElseStmt();
				}
			}

			setState(562); 
			match(END);
			setState(563); 
			match(SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VisualBasic6Parser.CASE, 0); }
		public CaseClauseContext caseClause() {
			return getRuleContext(CaseClauseContext.class,0);
		}
		public ColonOrNLContext colonOrNL() {
			return getRuleContext(ColonOrNLContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitCaseStmt(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_caseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); 
			match(CASE);
			setState(566); 
			caseClause(0);
			setState(567); 
			colonOrNL();
			setState(568); 
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(VisualBasic6Parser.IS, 0); }
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VisualBasic6Parser.NEQ, 0); }
		public TerminalNode GT() { return getToken(VisualBasic6Parser.GT, 0); }
		public TerminalNode GTE() { return getToken(VisualBasic6Parser.GTE, 0); }
		public TerminalNode LT() { return getToken(VisualBasic6Parser.LT, 0); }
		public TerminalNode LTE() { return getToken(VisualBasic6Parser.LTE, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(VisualBasic6Parser.COMMA, 0); }
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		return caseClause(0);
	}

	private CaseClauseContext caseClause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, _parentState);
		CaseClauseContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_caseClause, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case FLOAT_LITERAL:
			case INTEGER_LITERAL:
			case DATE_LITERAL:
			case FALSE:
			case TRUE:
			case NOTHING:
			case ME:
			case TYPEOF:
			case MINUS:
			case NOT:
			case PLUS:
			case LPAREN:
			case DOT:
			case ID:
				{
				setState(571); 
				expression(0);
				}
				break;
			case IS:
				{
				setState(572); 
				match(IS);
				setState(573);
				((CaseClauseContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EQ - 85)) | (1L << (GT - 85)) | (1L << (GTE - 85)) | (1L << (LT - 85)) | (1L << (LTE - 85)) | (1L << (NEQ - 85)))) != 0)) ) {
					((CaseClauseContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(574); 
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CaseClauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_caseClause);
					setState(577);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(578); 
					match(COMMA);
					setState(579); 
					caseClause(2);
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaseElseStmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VisualBasic6Parser.CASE, 0); }
		public TerminalNode ELSE() { return getToken(VisualBasic6Parser.ELSE, 0); }
		public ColonOrNLContext colonOrNL() {
			return getRuleContext(ColonOrNLContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterCaseElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitCaseElseStmt(this);
		}
	}

	public final CaseElseStmtContext caseElseStmt() throws RecognitionException {
		CaseElseStmtContext _localctx = new CaseElseStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_caseElseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); 
			match(CASE);
			setState(586); 
			match(ELSE);
			setState(587); 
			colonOrNL();
			setState(588); 
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStmtContext extends ParserRuleContext {
		public List<TerminalNode> WITH() { return getTokens(VisualBasic6Parser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(VisualBasic6Parser.WITH, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColonOrNLContext colonOrNL() {
			return getRuleContext(ColonOrNLContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public WithStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterWithStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitWithStmt(this);
		}
	}

	public final WithStmtContext withStmt() throws RecognitionException {
		WithStmtContext _localctx = new WithStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_withStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); 
			match(WITH);
			setState(591); 
			expression(0);
			setState(592); 
			colonOrNL();
			setState(593); 
			block();
			setState(594); 
			match(END);
			setState(595); 
			match(WITH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public EventDeclarationContext eventDeclaration() {
			return getRuleContext(EventDeclarationContext.class,0);
		}
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_memberDeclaration);
		try {
			setState(604);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597); 
				enumDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598); 
				eventDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599); 
				externalDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(600); 
				methodDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(601); 
				propertyDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(602); 
				typeDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(603); 
				variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(606); 
			attribute();
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607); 
					match(NL);
					setState(608); 
					attribute();
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(VisualBasic6Parser.ATTRIBUTE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(VisualBasic6Parser.DOT, 0); }
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); 
			match(ATTRIBUTE);
			setState(615); 
			identifier();
			setState(616); 
			match(DOT);
			setState(617); 
			identifier();
			setState(618); 
			match(EQ);
			setState(619); 
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ENUM() { return getTokens(VisualBasic6Parser.ENUM); }
		public TerminalNode ENUM(int i) {
			return getToken(VisualBasic6Parser.ENUM, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FRIEND))) != 0)) {
				{
				setState(621); 
				visibility();
				}
			}

			setState(624); 
			match(ENUM);
			setState(625); 
			identifier();
			setState(627); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(626); 
				match(NL);
				}
				}
				setState(629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(632); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(631); 
				enumField();
				}
				}
				setState(634); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(636); 
			match(END);
			setState(637); 
			match(ENUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterEnumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitEnumField(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639); 
			identifier();
			setState(642);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(640); 
				match(EQ);
				setState(641); 
				integerLiteral();
				}
			}

			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(644); 
				match(NL);
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDeclarationContext extends ParserRuleContext {
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode EVENT() { return getToken(VisualBasic6Parser.EVENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode NL() { return getToken(VisualBasic6Parser.NL, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public EventDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterEventDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitEventDeclaration(this);
		}
	}

	public final EventDeclarationContext eventDeclaration() throws RecognitionException {
		EventDeclarationContext _localctx = new EventDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_eventDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); 
			visibility();
			setState(650); 
			match(EVENT);
			setState(651); 
			identifier();
			setState(652); 
			parameterList();
			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(653); 
				match(NL);
				setState(654); 
				attributes();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(VisualBasic6Parser.DECLARE, 0); }
		public TerminalNode SUB() { return getToken(VisualBasic6Parser.SUB, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIB() { return getToken(VisualBasic6Parser.LIB, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(VisualBasic6Parser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(VisualBasic6Parser.STRING_LITERAL, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ALIAS() { return getToken(VisualBasic6Parser.ALIAS, 0); }
		public TerminalNode FUNCTION() { return getToken(VisualBasic6Parser.FUNCTION, 0); }
		public TerminalNode AS() { return getToken(VisualBasic6Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_externalDeclaration);
		int _la;
		try {
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657); 
				visibility();
				setState(658); 
				match(DECLARE);
				setState(659); 
				match(SUB);
				setState(660); 
				identifier();
				setState(661); 
				match(LIB);
				setState(662); 
				match(STRING_LITERAL);
				setState(665);
				_la = _input.LA(1);
				if (_la==ALIAS) {
					{
					setState(663); 
					match(ALIAS);
					setState(664); 
					match(STRING_LITERAL);
					}
				}

				setState(667); 
				parameterList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669); 
				visibility();
				setState(670); 
				match(DECLARE);
				setState(671); 
				match(FUNCTION);
				setState(672); 
				identifier();
				setState(673); 
				match(LIB);
				setState(674); 
				match(STRING_LITERAL);
				setState(677);
				_la = _input.LA(1);
				if (_la==ALIAS) {
					{
					setState(675); 
					match(ALIAS);
					setState(676); 
					match(STRING_LITERAL);
					}
				}

				setState(679); 
				parameterList();
				setState(682);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(680); 
					match(AS);
					setState(681); 
					type();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public SubDeclarationContext subDeclaration() {
			return getRuleContext(SubDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_methodDeclaration);
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686); 
				subDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687); 
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> SUB() { return getTokens(VisualBasic6Parser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(VisualBasic6Parser.SUB, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SubDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterSubDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitSubDeclaration(this);
		}
	}

	public final SubDeclarationContext subDeclaration() throws RecognitionException {
		SubDeclarationContext _localctx = new SubDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_subDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FRIEND))) != 0)) {
				{
				setState(690); 
				visibility();
				}
			}

			setState(693); 
			match(SUB);
			setState(694); 
			identifier();
			setState(695); 
			parameterList();
			setState(697); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(696); 
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(699); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(702);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(701); 
				attributes();
				}
			}

			setState(705);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING) | (1L << SET) | (1L << CALL) | (1L << DO) | (1L << EXIT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << ON_ERROR) | (1L << SELECT) | (1L << WHILE) | (1L << WITH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CONST - 68)) | (1L << (DIM - 68)) | (1L << (ME - 68)) | (1L << (TYPEOF - 68)) | (1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (PLUS - 68)) | (1L << (LPAREN - 68)) | (1L << (DOT - 68)) | (1L << (ID - 68)) | (1L << (NL - 68)))) != 0)) {
				{
				setState(704); 
				block();
				}
			}

			setState(707); 
			match(END);
			setState(708); 
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(VisualBasic6Parser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(VisualBasic6Parser.FUNCTION, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode AS() { return getToken(VisualBasic6Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FRIEND))) != 0)) {
				{
				setState(710); 
				visibility();
				}
			}

			setState(713); 
			match(FUNCTION);
			setState(714); 
			identifier();
			setState(715); 
			parameterList();
			setState(718);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(716); 
				match(AS);
				setState(717); 
				type();
				}
			}

			setState(721); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(720); 
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(723); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(726);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(725); 
				attributes();
				}
			}

			setState(729);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << INTEGER_LITERAL) | (1L << DATE_LITERAL) | (1L << FALSE) | (1L << TRUE) | (1L << NOTHING) | (1L << SET) | (1L << CALL) | (1L << DO) | (1L << EXIT) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << ON_ERROR) | (1L << SELECT) | (1L << WHILE) | (1L << WITH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CONST - 68)) | (1L << (DIM - 68)) | (1L << (ME - 68)) | (1L << (TYPEOF - 68)) | (1L << (MINUS - 68)) | (1L << (NOT - 68)) | (1L << (PLUS - 68)) | (1L << (LPAREN - 68)) | (1L << (DOT - 68)) | (1L << (ID - 68)) | (1L << (NL - 68)))) != 0)) {
				{
				setState(728); 
				block();
				}
			}

			setState(731); 
			match(END);
			setState(732); 
			match(FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VisualBasic6Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VisualBasic6Parser.RPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); 
			match(LPAREN);
			setState(736);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BYREF - 66)) | (1L << (BYVAL - 66)) | (1L << (OPTIONAL - 66)) | (1L << (PARAMARRAY - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				setState(735); 
				parameters();
				}
			}

			setState(738); 
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualBasic6Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualBasic6Parser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); 
			parameter();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(741); 
				match(COMMA);
				setState(742); 
				parameter();
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ParameterModifierContext> parameterModifier() {
			return getRuleContexts(ParameterModifierContext.class);
		}
		public ParameterModifierContext parameterModifier(int i) {
			return getRuleContext(ParameterModifierContext.class,i);
		}
		public AsArrayContext asArray() {
			return getRuleContext(AsArrayContext.class,0);
		}
		public TerminalNode AS() { return getToken(VisualBasic6Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BYREF - 66)) | (1L << (BYVAL - 66)) | (1L << (OPTIONAL - 66)) | (1L << (PARAMARRAY - 66)))) != 0)) {
				{
				{
				setState(748); 
				parameterModifier();
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754); 
			identifier();
			setState(756);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(755); 
				asArray();
				}
			}

			setState(760);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(758); 
				match(AS);
				setState(759); 
				type();
				}
			}

			setState(767);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(762); 
				match(EQ);
				setState(765);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case FLOAT_LITERAL:
				case INTEGER_LITERAL:
				case DATE_LITERAL:
				case FALSE:
				case TRUE:
				case NOTHING:
				case MINUS:
				case PLUS:
					{
					setState(763); 
					literal();
					}
					break;
				case ID:
					{
					setState(764); 
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterModifierContext extends ParserRuleContext {
		public TerminalNode BYVAL() { return getToken(VisualBasic6Parser.BYVAL, 0); }
		public TerminalNode BYREF() { return getToken(VisualBasic6Parser.BYREF, 0); }
		public TerminalNode OPTIONAL() { return getToken(VisualBasic6Parser.OPTIONAL, 0); }
		public TerminalNode PARAMARRAY() { return getToken(VisualBasic6Parser.PARAMARRAY, 0); }
		public ParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitParameterModifier(this);
		}
	}

	public final ParameterModifierContext parameterModifier() throws RecognitionException {
		ParameterModifierContext _localctx = new ParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parameterModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BYREF - 66)) | (1L << (BYVAL - 66)) | (1L << (OPTIONAL - 66)) | (1L << (PARAMARRAY - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public Token propType;
		public List<TerminalNode> PROPERTY() { return getTokens(VisualBasic6Parser.PROPERTY); }
		public TerminalNode PROPERTY(int i) {
			return getToken(VisualBasic6Parser.PROPERTY, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public TerminalNode LET() { return getToken(VisualBasic6Parser.LET, 0); }
		public TerminalNode GET() { return getToken(VisualBasic6Parser.GET, 0); }
		public TerminalNode SET() { return getToken(VisualBasic6Parser.SET, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode AS() { return getToken(VisualBasic6Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitPropertyDeclaration(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_propertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FRIEND))) != 0)) {
				{
				setState(771); 
				visibility();
				}
			}

			setState(774); 
			match(PROPERTY);
			setState(775);
			((PropertyDeclarationContext)_localctx).propType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << LET) | (1L << SET))) != 0)) ) {
				((PropertyDeclarationContext)_localctx).propType = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(776); 
			identifier();
			setState(777); 
			parameterList();
			setState(780);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(778); 
				match(AS);
				setState(779); 
				type();
				}
			}

			setState(783); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(782); 
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(785); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(788);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(787); 
				attributes();
				}
			}

			setState(790); 
			block();
			setState(791); 
			match(END);
			setState(792); 
			match(PROPERTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(VisualBasic6Parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(VisualBasic6Parser.TYPE, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public List<TypeFieldContext> typeField() {
			return getRuleContexts(TypeFieldContext.class);
		}
		public TypeFieldContext typeField(int i) {
			return getRuleContext(TypeFieldContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FRIEND))) != 0)) {
				{
				setState(794); 
				visibility();
				}
			}

			setState(797); 
			match(TYPE);
			setState(798); 
			identifier();
			setState(800); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(799); 
				match(NL);
				}
				}
				setState(802); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(807); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(804); 
				typeField();
				setState(805); 
				match(NL);
				}
				}
				setState(809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(811); 
			match(END);
			setState(812); 
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(VisualBasic6Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterTypeField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitTypeField(this);
		}
	}

	public final TypeFieldContext typeField() throws RecognitionException {
		TypeFieldContext _localctx = new TypeFieldContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typeField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); 
			identifier();
			setState(815); 
			match(AS);
			setState(816); 
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(VisualBasic6Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WITHEVENTS() { return getToken(VisualBasic6Parser.WITHEVENTS, 0); }
		public AsArrayContext asArray() {
			return getRuleContext(AsArrayContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public TerminalNode CONST() { return getToken(VisualBasic6Parser.CONST, 0); }
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_variableDeclaration);
		int _la;
		try {
			setState(855);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(818); 
				visibility();
				setState(820);
				_la = _input.LA(1);
				if (_la==WITHEVENTS) {
					{
					setState(819); 
					match(WITHEVENTS);
					}
				}

				setState(822); 
				identifier();
				setState(824);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(823); 
					asArray();
					}
				}

				setState(826); 
				match(AS);
				setState(827); 
				type();
				setState(834);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(829); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(828); 
						match(NL);
						}
						}
						setState(831); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NL );
					setState(833); 
					attributes();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FRIEND))) != 0)) {
					{
					setState(836); 
					visibility();
					}
				}

				setState(839); 
				match(CONST);
				setState(840); 
				identifier();
				setState(843);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(841); 
					match(AS);
					setState(842); 
					type();
					}
				}

				setState(845); 
				match(EQ);
				setState(846); 
				literal();
				setState(853);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(848); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(847); 
						match(NL);
						}
						}
						setState(850); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NL );
					setState(852); 
					attributes();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << VERSION) | (1L << BEGIN) | (1L << OBJECT))) != 0)) {
				{
				setState(857); 
				header();
				}
			}

			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(860); 
				match(NL);
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTION) {
				{
				{
				setState(866); 
				optionStatement();
				setState(868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(867); 
					match(NL);
					}
					}
					setState(870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (PUBLIC - 19)) | (1L << (PRIVATE - 19)) | (1L << (FRIEND - 19)) | (1L << (FUNCTION - 19)) | (1L << (PROPERTY - 19)) | (1L << (SUB - 19)) | (1L << (CONST - 19)) | (1L << (ENUM - 19)) | (1L << (TYPE - 19)))) != 0)) {
				{
				{
				setState(877); 
				memberDeclaration();
				setState(879); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(878); 
					match(NL);
					}
					}
					setState(881); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public HdrVersionStatementContext hdrVersionStatement() {
			return getRuleContext(HdrVersionStatementContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public List<HdrAttributeStatementContext> hdrAttributeStatement() {
			return getRuleContexts(HdrAttributeStatementContext.class);
		}
		public HdrAttributeStatementContext hdrAttributeStatement(int i) {
			return getRuleContext(HdrAttributeStatementContext.class,i);
		}
		public List<HdrPropertyBlockContext> hdrPropertyBlock() {
			return getRuleContexts(HdrPropertyBlockContext.class);
		}
		public HdrPropertyBlockContext hdrPropertyBlock(int i) {
			return getRuleContext(HdrPropertyBlockContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(888); 
				hdrVersionStatement();
				setState(889); 
				match(NL);
				}
			}

			setState(899); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(895);
				switch (_input.LA(1)) {
				case ATTRIBUTE:
				case OBJECT:
					{
					setState(893); 
					hdrAttributeStatement();
					}
					break;
				case BEGIN:
					{
					setState(894); 
					hdrPropertyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(897); 
				match(NL);
				}
				}
				setState(901); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIBUTE) | (1L << BEGIN) | (1L << OBJECT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HdrAttributeStatementContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(VisualBasic6Parser.ATTRIBUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(VisualBasic6Parser.OBJECT, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(VisualBasic6Parser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(VisualBasic6Parser.STRING_LITERAL, i);
		}
		public HdrAttributeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdrAttributeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterHdrAttributeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitHdrAttributeStatement(this);
		}
	}

	public final HdrAttributeStatementContext hdrAttributeStatement() throws RecognitionException {
		HdrAttributeStatementContext _localctx = new HdrAttributeStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_hdrAttributeStatement);
		try {
			setState(913);
			switch (_input.LA(1)) {
			case ATTRIBUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(903); 
				match(ATTRIBUTE);
				setState(904); 
				identifier();
				setState(905); 
				match(EQ);
				setState(906); 
				literal();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(908); 
				match(OBJECT);
				setState(909); 
				match(EQ);
				setState(910); 
				match(STRING_LITERAL);
				setState(911); 
				match(T__1);
				setState(912); 
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HdrPropertyBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(VisualBasic6Parser.BEGIN, 0); }
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public TerminalNode END() { return getToken(VisualBasic6Parser.END, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<HdrPropertyContext> hdrProperty() {
			return getRuleContexts(HdrPropertyContext.class);
		}
		public HdrPropertyContext hdrProperty(int i) {
			return getRuleContext(HdrPropertyContext.class,i);
		}
		public List<HdrComplexPropertyContext> hdrComplexProperty() {
			return getRuleContexts(HdrComplexPropertyContext.class);
		}
		public HdrComplexPropertyContext hdrComplexProperty(int i) {
			return getRuleContext(HdrComplexPropertyContext.class,i);
		}
		public List<HdrPropertyBlockContext> hdrPropertyBlock() {
			return getRuleContexts(HdrPropertyBlockContext.class);
		}
		public HdrPropertyBlockContext hdrPropertyBlock(int i) {
			return getRuleContext(HdrPropertyBlockContext.class,i);
		}
		public HdrPropertyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdrPropertyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterHdrPropertyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitHdrPropertyBlock(this);
		}
	}

	public final HdrPropertyBlockContext hdrPropertyBlock() throws RecognitionException {
		HdrPropertyBlockContext _localctx = new HdrPropertyBlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_hdrPropertyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915); 
			match(BEGIN);
			setState(920);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(916); 
				identifier();
				setState(918);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(917); 
					identifier();
					}
				}

				}
			}

			setState(922); 
			match(NL);
			setState(930); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(926);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(923); 
					hdrProperty();
					}
					break;
				case BEGINPROPERTY:
					{
					setState(924); 
					hdrComplexProperty();
					}
					break;
				case BEGIN:
					{
					setState(925); 
					hdrPropertyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(928); 
				match(NL);
				}
				}
				setState(932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGIN || _la==BEGINPROPERTY || _la==ID );
			setState(934); 
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HdrPropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(VisualBasic6Parser.EQ, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VisualBasic6Parser.COLON, 0); }
		public HdrPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdrProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterHdrProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitHdrProperty(this);
		}
	}

	public final HdrPropertyContext hdrProperty() throws RecognitionException {
		HdrPropertyContext _localctx = new HdrPropertyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_hdrProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936); 
			identifier();
			setState(937); 
			match(EQ);
			setState(938); 
			literal();
			setState(941);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(939); 
				match(COLON);
				setState(940); 
				literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HdrComplexPropertyContext extends ParserRuleContext {
		public TerminalNode BEGINPROPERTY() { return getToken(VisualBasic6Parser.BEGINPROPERTY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VisualBasic6Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VisualBasic6Parser.NL, i);
		}
		public TerminalNode ENDPROPERTY() { return getToken(VisualBasic6Parser.ENDPROPERTY, 0); }
		public List<HdrPropertyContext> hdrProperty() {
			return getRuleContexts(HdrPropertyContext.class);
		}
		public HdrPropertyContext hdrProperty(int i) {
			return getRuleContext(HdrPropertyContext.class,i);
		}
		public HdrComplexPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdrComplexProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterHdrComplexProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitHdrComplexProperty(this);
		}
	}

	public final HdrComplexPropertyContext hdrComplexProperty() throws RecognitionException {
		HdrComplexPropertyContext _localctx = new HdrComplexPropertyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_hdrComplexProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); 
			match(BEGINPROPERTY);
			setState(944); 
			identifier();
			setState(945); 
			match(NL);
			setState(949); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(946); 
				hdrProperty();
				setState(947); 
				match(NL);
				}
				}
				setState(951); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(953); 
			match(ENDPROPERTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HdrVersionStatementContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(VisualBasic6Parser.VERSION, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(VisualBasic6Parser.FLOAT_LITERAL, 0); }
		public TerminalNode CLASS() { return getToken(VisualBasic6Parser.CLASS, 0); }
		public HdrVersionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdrVersionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterHdrVersionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitHdrVersionStatement(this);
		}
	}

	public final HdrVersionStatementContext hdrVersionStatement() throws RecognitionException {
		HdrVersionStatementContext _localctx = new HdrVersionStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_hdrVersionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955); 
			match(VERSION);
			setState(956); 
			match(FLOAT_LITERAL);
			setState(958);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(957); 
				match(CLASS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionStatementContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(VisualBasic6Parser.OPTION, 0); }
		public TerminalNode EXPLICIT() { return getToken(VisualBasic6Parser.EXPLICIT, 0); }
		public TerminalNode STRICT() { return getToken(VisualBasic6Parser.STRICT, 0); }
		public OptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).enterOptionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualBasic6Listener ) ((VisualBasic6Listener)listener).exitOptionStatement(this);
		}
	}

	public final OptionStatementContext optionStatement() throws RecognitionException {
		OptionStatementContext _localctx = new OptionStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_optionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960); 
			match(OPTION);
			setState(961);
			_la = _input.LA(1);
			if ( !(_la==EXPLICIT || _la==STRICT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: 
			return assignTarget_sempred((AssignTargetContext)_localctx, predIndex);
		case 9: 
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 23: 
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 44: 
			return caseClause_sempred((CaseClauseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean assignTarget_sempred(AssignTargetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 2);
		case 1: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: 
			return precpred(_ctx, 13);
		case 3: 
			return precpred(_ctx, 12);
		case 4: 
			return precpred(_ctx, 11);
		case 5: 
			return precpred(_ctx, 10);
		case 6: 
			return precpred(_ctx, 9);
		case 7: 
			return precpred(_ctx, 8);
		case 8: 
			return precpred(_ctx, 7);
		case 9: 
			return precpred(_ctx, 6);
		case 10: 
			return precpred(_ctx, 5);
		case 11: 
			return precpred(_ctx, 3);
		case 12: 
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: 
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean caseClause_sempred(CaseClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: 
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3t\u03c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\5\2\u0096\n\2\3\2\3\2\5\2\u009a\n\2\3\3\3\3\7\3\u009e\n"+
		"\3\f\3\16\3\u00a1\13\3\3\3\3\3\5\3\u00a5\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5\u00ad\n\5\5\5\u00af\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00b9\n"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00bf\n\7\f\7\16\7\u00c2\13\7\3\b\3\b\3\t\3\t\5"+
		"\t\u00c8\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d4"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\6\13\u00f6\n\13\r\13\16\13\u00f7\7\13\u00fa"+
		"\n\13\f\13\16\13\u00fd\13\13\3\f\3\f\5\f\u0101\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u010b\n\r\3\16\3\16\3\16\5\16\u0110\n\16\7\16\u0112\n"+
		"\16\f\16\16\16\u0115\13\16\3\16\5\16\u0118\n\16\3\16\3\16\5\16\u011c\n"+
		"\16\6\16\u011e\n\16\r\16\16\16\u011f\5\16\u0122\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u012a\n\17\f\17\16\17\u012d\13\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\5\21\u0136\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u013f\n\22\3\23\5\23\u0142\n\23\3\23\3\23\3\24\5\24\u0147\n\24\3"+
		"\24\3\24\3\25\3\25\3\25\5\25\u014e\n\25\3\26\6\26\u0151\n\26\r\26\16\26"+
		"\u0152\3\27\5\27\u0156\n\27\3\27\5\27\u0159\n\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0166\n\31\f\31\16\31\u0169\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0175\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0182\n\33"+
		"\5\33\u0184\n\33\5\33\u0186\n\33\3\34\3\34\5\34\u018a\n\34\3\35\3\35\3"+
		"\35\3\35\5\35\u0190\n\35\3\35\3\35\3\35\5\35\u0195\n\35\3\36\3\36\7\36"+
		"\u0199\n\36\f\36\16\36\u019c\13\36\3\36\5\36\u019f\n\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\5\37\u01a7\n\37\3\37\5\37\u01aa\n\37\3 \3 \3 \3 \5 \u01b0"+
		"\n \3 \5 \u01b3\n \3!\3!\5!\u01b7\n!\3!\5!\u01ba\n!\3\"\3\"\3\"\3#\3#"+
		"\3#\5#\u01c2\n#\3#\3#\5#\u01c6\n#\3#\3#\3#\3#\5#\u01cc\n#\3#\3#\5#\u01d0"+
		"\n#\5#\u01d2\n#\3$\3$\3$\3$\3$\5$\u01d9\n$\3$\5$\u01dc\n$\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01e9\n\'\3(\3(\3(\5(\u01ee\n(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01fe\n)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\5*\u020a\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0215\n*\5*\u0217\n"+
		"*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\5,\u0223\n,\3,\6,\u0226\n,\r,\16,\u0227"+
		"\5,\u022a\n,\3,\7,\u022d\n,\f,\16,\u0230\13,\3,\5,\u0233\n,\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0242\n.\3.\3.\3.\7.\u0247\n.\f.\16.\u024a"+
		"\13.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u025f\n\61\3\62\3\62\3\62\7\62\u0264\n\62\f"+
		"\62\16\62\u0267\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\5\64\u0271"+
		"\n\64\3\64\3\64\3\64\6\64\u0276\n\64\r\64\16\64\u0277\3\64\6\64\u027b"+
		"\n\64\r\64\16\64\u027c\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u0285\n\65\3"+
		"\65\6\65\u0288\n\65\r\65\16\65\u0289\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0292\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u029c\n\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02a8\n\67\3\67"+
		"\3\67\3\67\5\67\u02ad\n\67\5\67\u02af\n\67\38\38\58\u02b3\n8\39\59\u02b6"+
		"\n9\39\39\39\39\69\u02bc\n9\r9\169\u02bd\39\59\u02c1\n9\39\59\u02c4\n"+
		"9\39\39\39\3:\5:\u02ca\n:\3:\3:\3:\3:\3:\5:\u02d1\n:\3:\6:\u02d4\n:\r"+
		":\16:\u02d5\3:\5:\u02d9\n:\3:\5:\u02dc\n:\3:\3:\3:\3;\3;\5;\u02e3\n;\3"+
		";\3;\3<\3<\3<\7<\u02ea\n<\f<\16<\u02ed\13<\3=\7=\u02f0\n=\f=\16=\u02f3"+
		"\13=\3=\3=\5=\u02f7\n=\3=\3=\5=\u02fb\n=\3=\3=\3=\5=\u0300\n=\5=\u0302"+
		"\n=\3>\3>\3?\5?\u0307\n?\3?\3?\3?\3?\3?\3?\5?\u030f\n?\3?\6?\u0312\n?"+
		"\r?\16?\u0313\3?\5?\u0317\n?\3?\3?\3?\3?\3@\5@\u031e\n@\3@\3@\3@\6@\u0323"+
		"\n@\r@\16@\u0324\3@\3@\3@\6@\u032a\n@\r@\16@\u032b\3@\3@\3@\3A\3A\3A\3"+
		"A\3B\3B\5B\u0337\nB\3B\3B\5B\u033b\nB\3B\3B\3B\6B\u0340\nB\rB\16B\u0341"+
		"\3B\5B\u0345\nB\3B\5B\u0348\nB\3B\3B\3B\3B\5B\u034e\nB\3B\3B\3B\6B\u0353"+
		"\nB\rB\16B\u0354\3B\5B\u0358\nB\5B\u035a\nB\3C\5C\u035d\nC\3C\7C\u0360"+
		"\nC\fC\16C\u0363\13C\3C\3C\6C\u0367\nC\rC\16C\u0368\7C\u036b\nC\fC\16"+
		"C\u036e\13C\3C\3C\6C\u0372\nC\rC\16C\u0373\7C\u0376\nC\fC\16C\u0379\13"+
		"C\3D\3D\3D\5D\u037e\nD\3D\3D\5D\u0382\nD\3D\3D\6D\u0386\nD\rD\16D\u0387"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0394\nE\3F\3F\3F\5F\u0399\nF\5F\u039b"+
		"\nF\3F\3F\3F\3F\5F\u03a1\nF\3F\3F\6F\u03a5\nF\rF\16F\u03a6\3F\3F\3G\3"+
		"G\3G\3G\3G\5G\u03b0\nG\3H\3H\3H\3H\3H\3H\6H\u03b8\nH\rH\16H\u03b9\3H\3"+
		"H\3I\3I\3I\5I\u03c1\nI\3J\3J\3J\3J\2\6\f\24\60ZK\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2"+
		"\22\3\2\25\27\3\2\36)\6\2RR__ccff\4\2UV`a\4\2__ff\4\2WWbb\3\2]^\3\2YZ"+
		"\3\2[\\\4\2TTdd\7\2\30\30\35\35,,\62\62\67\67\4\2>>@@\6\2WWYZ]^bb\4\2"+
		"DEOP\4\2\31\32\34\34\3\2\r\16\u041f\2\u0099\3\2\2\2\4\u009f\3\2\2\2\6"+
		"\u00a6\3\2\2\2\b\u00a8\3\2\2\2\n\u00b2\3\2\2\2\f\u00b8\3\2\2\2\16\u00c3"+
		"\3\2\2\2\20\u00c7\3\2\2\2\22\u00c9\3\2\2\2\24\u00d3\3\2\2\2\26\u00fe\3"+
		"\2\2\2\30\u010a\3\2\2\2\32\u0121\3\2\2\2\34\u0123\3\2\2\2\36\u012e\3\2"+
		"\2\2 \u0135\3\2\2\2\"\u013e\3\2\2\2$\u0141\3\2\2\2&\u0146\3\2\2\2(\u014a"+
		"\3\2\2\2*\u0150\3\2\2\2,\u0155\3\2\2\2.\u015c\3\2\2\2\60\u015f\3\2\2\2"+
		"\62\u0174\3\2\2\2\64\u0185\3\2\2\2\66\u0189\3\2\2\28\u018b\3\2\2\2:\u0196"+
		"\3\2\2\2<\u01a2\3\2\2\2>\u01ab\3\2\2\2@\u01b4\3\2\2\2B\u01bb\3\2\2\2D"+
		"\u01d1\3\2\2\2F\u01d3\3\2\2\2H\u01dd\3\2\2\2J\u01e0\3\2\2\2L\u01e8\3\2"+
		"\2\2N\u01ed\3\2\2\2P\u01fd\3\2\2\2R\u0216\3\2\2\2T\u0218\3\2\2\2V\u021e"+
		"\3\2\2\2X\u0237\3\2\2\2Z\u0241\3\2\2\2\\\u024b\3\2\2\2^\u0250\3\2\2\2"+
		"`\u025e\3\2\2\2b\u0260\3\2\2\2d\u0268\3\2\2\2f\u0270\3\2\2\2h\u0281\3"+
		"\2\2\2j\u028b\3\2\2\2l\u02ae\3\2\2\2n\u02b2\3\2\2\2p\u02b5\3\2\2\2r\u02c9"+
		"\3\2\2\2t\u02e0\3\2\2\2v\u02e6\3\2\2\2x\u02f1\3\2\2\2z\u0303\3\2\2\2|"+
		"\u0306\3\2\2\2~\u031d\3\2\2\2\u0080\u0330\3\2\2\2\u0082\u0359\3\2\2\2"+
		"\u0084\u035c\3\2\2\2\u0086\u037d\3\2\2\2\u0088\u0393\3\2\2\2\u008a\u0395"+
		"\3\2\2\2\u008c\u03aa\3\2\2\2\u008e\u03b1\3\2\2\2\u0090\u03bd\3\2\2\2\u0092"+
		"\u03c2\3\2\2\2\u0094\u0096\7o\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u009a\7q\2\2\u0098\u009a\7o\2\2\u0099\u0095"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\3\3\2\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009e\7n\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\7p\2\2\u00a3\u00a5\5\6\4\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\5\3\2\2\2\u00a6\u00a7\7\3\2\2\u00a7\7\3\2\2\2\u00a8\u00ae\7"+
		"g\2\2\u00a9\u00ac\5&\24\2\u00aa\u00ab\7=\2\2\u00ab\u00ad\5&\24\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a9\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\t\3\2\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\5\4\3\2\u00b4\13\3\2\2\2\u00b5"+
		"\u00b6\b\7\1\2\u00b6\u00b9\5\4\3\2\u00b7\u00b9\5\n\6\2\u00b8\u00b5\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb\f\4\2\2\u00bb"+
		"\u00bf\5\26\f\2\u00bc\u00bd\f\3\2\2\u00bd\u00bf\5\n\6\2\u00be\u00ba\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\t\2\2\2"+
		"\u00c4\17\3\2\2\2\u00c5\u00c8\5\22\n\2\u00c6\u00c8\5\4\3\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\21\3\2\2\2\u00c9\u00ca\t\3\2\2\u00ca"+
		"\23\3\2\2\2\u00cb\u00cc\b\13\1\2\u00cc\u00cd\t\4\2\2\u00cd\u00d4\5\24"+
		"\13\6\u00ce\u00cf\7g\2\2\u00cf\u00d0\5\24\13\2\u00d0\u00d1\7h\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d4\5 \21\2\u00d3\u00cb\3\2\2\2\u00d3\u00ce\3\2"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00fb\3\2\2\2\u00d5\u00d6\f\17\2\2\u00d6"+
		"\u00d7\7X\2\2\u00d7\u00fa\5\24\13\20\u00d8\u00d9\f\16\2\2\u00d9\u00da"+
		"\t\5\2\2\u00da\u00fa\5\24\13\17\u00db\u00dc\f\r\2\2\u00dc\u00dd\t\6\2"+
		"\2\u00dd\u00fa\5\24\13\16\u00de\u00df\f\f\2\2\u00df\u00e0\7S\2\2\u00e0"+
		"\u00fa\5\24\13\r\u00e1\u00e2\f\13\2\2\u00e2\u00e3\t\7\2\2\u00e3\u00fa"+
		"\5\24\13\f\u00e4\u00e5\f\n\2\2\u00e5\u00e6\t\b\2\2\u00e6\u00fa\5\24\13"+
		"\13\u00e7\u00e8\f\t\2\2\u00e8\u00e9\t\t\2\2\u00e9\u00fa\5\24\13\n\u00ea"+
		"\u00eb\f\b\2\2\u00eb\u00ec\t\n\2\2\u00ec\u00fa\5\24\13\t\u00ed\u00ee\f"+
		"\7\2\2\u00ee\u00ef\t\13\2\2\u00ef\u00fa\5\24\13\b\u00f0\u00f1\f\5\2\2"+
		"\u00f1\u00fa\5\26\f\2\u00f2\u00f5\f\4\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f6"+
		"\5\24\13\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00d5\3\2\2\2\u00f9\u00d8"+
		"\3\2\2\2\u00f9\u00db\3\2\2\2\u00f9\u00de\3\2\2\2\u00f9\u00e1\3\2\2\2\u00f9"+
		"\u00e4\3\2\2\2\u00f9\u00e7\3\2\2\2\u00f9\u00ea\3\2\2\2\u00f9\u00ed\3\2"+
		"\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f2\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\25\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fe\u0100\7g\2\2\u00ff\u0101\5\30\r\2\u0100\u00ff\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7h\2\2\u0103\27\3\2\2\2\u0104"+
		"\u010b\5\34\17\2\u0105\u010b\5\32\16\2\u0106\u0107\5\32\16\2\u0107\u0108"+
		"\7m\2\2\u0108\u0109\5\34\17\2\u0109\u010b\3\2\2\2\u010a\u0104\3\2\2\2"+
		"\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010b\31\3\2\2\2\u010c\u0113"+
		"\5\24\13\2\u010d\u010f\7m\2\2\u010e\u0110\5\24\13\2\u010f\u010e\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010d\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0122\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0118\5\24\13\2\u0117\u0116\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u011d\3\2\2\2\u0119\u011b\7m\2\2\u011a\u011c\5\24\13\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0119\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u010c\3\2\2\2\u0121\u0117\3\2\2\2\u0122\33\3\2\2"+
		"\2\u0123\u0124\5\36\20\2\u0124\u012b\5\24\13\2\u0125\u0126\7m\2\2\u0126"+
		"\u0127\5\36\20\2\u0127\u0128\5\24\13\2\u0128\u012a\3\2\2\2\u0129\u0125"+
		"\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\35\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5\4\3\2\u012f\u0130\7e\2\2"+
		"\u0130\37\3\2\2\2\u0131\u0136\5\n\6\2\u0132\u0136\5\4\3\2\u0133\u0136"+
		"\5\"\22\2\u0134\u0136\7M\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136!\3\2\2\2\u0137\u013f\5$\23\2"+
		"\u0138\u013f\5&\24\2\u0139\u013f\7\5\2\2\u013a\u013f\7\b\2\2\u013b\u013f"+
		"\7\13\2\2\u013c\u013f\7\n\2\2\u013d\u013f\7\t\2\2\u013e\u0137\3\2\2\2"+
		"\u013e\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013b"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f#\3\2\2\2\u0140"+
		"\u0142\t\6\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\7\6\2\2\u0144%\3\2\2\2\u0145\u0147\t\6\2\2\u0146\u0145"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\7\2\2\u0149"+
		"\'\3\2\2\2\u014a\u014b\7N\2\2\u014b\u014d\5\4\3\2\u014c\u014e\5\26\f\2"+
		"\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e)\3\2\2\2\u014f\u0151\5"+
		",\27\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153+\3\2\2\2\u0154\u0156\5.\30\2\u0155\u0154\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5\60\31\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7q\2\2\u015b"+
		"-\3\2\2\2\u015c\u015d\7p\2\2\u015d\u015e\7o\2\2\u015e/\3\2\2\2\u015f\u0160"+
		"\b\31\1\2\u0160\u0161\5\62\32\2\u0161\u0167\3\2\2\2\u0162\u0163\f\3\2"+
		"\2\u0163\u0164\7o\2\2\u0164\u0166\5\62\32\2\u0165\u0162\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\61\3\2\2"+
		"\2\u0169\u0167\3\2\2\2\u016a\u0175\5\64\33\2\u016b\u0175\5\66\34\2\u016c"+
		"\u0175\5D#\2\u016d\u0175\5F$\2\u016e\u0175\5H%\2\u016f\u0175\5J&\2\u0170"+
		"\u0175\5L\'\2\u0171\u0175\5N(\2\u0172\u0175\5V,\2\u0173\u0175\5^\60\2"+
		"\u0174\u016a\3\2\2\2\u0174\u016b\3\2\2\2\u0174\u016c\3\2\2\2\u0174\u016d"+
		"\3\2\2\2\u0174\u016e\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2\2\u0174"+
		"\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\63\3\2\2"+
		"\2\u0176\u0177\5\f\7\2\u0177\u0178\7W\2\2\u0178\u0179\5\24\13\2\u0179"+
		"\u0186\3\2\2\2\u017a\u017b\7\34\2\2\u017b\u017c\5\f\7\2\u017c\u0183\7"+
		"W\2\2\u017d\u0184\5\24\13\2\u017e\u017f\7N\2\2\u017f\u0181\5\4\3\2\u0180"+
		"\u0182\5\26\f\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3"+
		"\2\2\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2\2\2\u0184\u0186\3\2\2\2\u0185"+
		"\u0176\3\2\2\2\u0185\u017a\3\2\2\2\u0186\65\3\2\2\2\u0187\u018a\58\35"+
		"\2\u0188\u018a\5:\36\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\67"+
		"\3\2\2\2\u018b\u018c\7\65\2\2\u018c\u018d\5\24\13\2\u018d\u018f\7<\2\2"+
		"\u018e\u0190\7o\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0194\5\60\31\2\u0192\u0193\7.\2\2\u0193\u0195\5\60\31"+
		"\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u01959\3\2\2\2\u0196\u019a"+
		"\5<\37\2\u0197\u0199\5> \2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u019f\5@!\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a1\5B\"\2\u01a1;\3\2\2\2\u01a2\u01a3\7\65\2\2\u01a3"+
		"\u01a4\5\24\13\2\u01a4\u01a6\7<\2\2\u01a5\u01a7\7o\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5*\26\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa=\3\2\2\2\u01ab\u01ac\7/\2\2\u01ac"+
		"\u01ad\5\24\13\2\u01ad\u01af\7<\2\2\u01ae\u01b0\7o\2\2\u01af\u01ae\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\5*\26\2\u01b2"+
		"\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3?\3\2\2\2\u01b4\u01b6\7.\2\2\u01b5"+
		"\u01b7\7o\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2"+
		"\2\2\u01b8\u01ba\5*\26\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"A\3\2\2\2\u01bb\u01bc\7\60\2\2\u01bc\u01bd\7\65\2\2\u01bdC\3\2\2\2\u01be"+
		"\u01bf\7H\2\2\u01bf\u01c1\5\4\3\2\u01c0\u01c2\5\b\5\2\u01c1\u01c0\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c4\7B\2\2\u01c4"+
		"\u01c6\5\20\t\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01d2\3"+
		"\2\2\2\u01c7\u01c8\7F\2\2\u01c8\u01cb\5\4\3\2\u01c9\u01ca\7B\2\2\u01ca"+
		"\u01cc\5\20\t\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3"+
		"\2\2\2\u01cd\u01ce\7W\2\2\u01ce\u01d0\5\"\22\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01be\3\2\2\2\u01d1\u01c7\3\2"+
		"\2\2\u01d2E\3\2\2\2\u01d3\u01d8\79\2\2\u01d4\u01d5\7\63\2\2\u01d5\u01d9"+
		"\5\4\3\2\u01d6\u01d9\7\64\2\2\u01d7\u01d9\7:\2\2\u01d8\u01d4\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01dc\7o"+
		"\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcG\3\2\2\2\u01dd\u01de"+
		"\7\61\2\2\u01de\u01df\t\f\2\2\u01dfI\3\2\2\2\u01e0\u01e1\7\63\2\2\u01e1"+
		"\u01e2\5\4\3\2\u01e2K\3\2\2\2\u01e3\u01e4\7*\2\2\u01e4\u01e9\5\24\13\2"+
		"\u01e5\u01e6\5\24\13\2\u01e6\u01e7\5\30\r\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01e3\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e9M\3\2\2\2\u01ea\u01ee\5R*\2\u01eb"+
		"\u01ee\5P)\2\u01ec\u01ee\5T+\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2"+
		"\u01ed\u01ec\3\2\2\2\u01eeO\3\2\2\2\u01ef\u01f0\7,\2\2\u01f0\u01f1\t\r"+
		"\2\2\u01f1\u01f2\5\24\13\2\u01f2\u01f3\5\2\2\2\u01f3\u01f4\5*\26\2\u01f4"+
		"\u01f5\7\67\2\2\u01f5\u01fe\3\2\2\2\u01f6\u01f7\7,\2\2\u01f7\u01f8\5\2"+
		"\2\2\u01f8\u01f9\5*\26\2\u01f9\u01fa\7\67\2\2\u01fa\u01fb\t\r\2\2\u01fb"+
		"\u01fc\5\24\13\2\u01fc\u01fe\3\2\2\2\u01fd\u01ef\3\2\2\2\u01fd\u01f6\3"+
		"\2\2\2\u01feQ\3\2\2\2\u01ff\u0200\7\62\2\2\u0200\u0201\5\24\13\2\u0201"+
		"\u0202\7W\2\2\u0202\u0203\5\24\13\2\u0203\u0204\7=\2\2\u0204\u0205\5\24"+
		"\13\2\u0205\u0206\5\2\2\2\u0206\u0207\5*\26\2\u0207\u0209\78\2\2\u0208"+
		"\u020a\5\24\13\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0217\3"+
		"\2\2\2\u020b\u020c\7\62\2\2\u020c\u020d\7-\2\2\u020d\u020e\5\4\3\2\u020e"+
		"\u020f\7\66\2\2\u020f\u0210\5\24\13\2\u0210\u0211\5\2\2\2\u0211\u0212"+
		"\5*\26\2\u0212\u0214\78\2\2\u0213\u0215\5\4\3\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u01ff\3\2\2\2\u0216\u020b\3\2"+
		"\2\2\u0217S\3\2\2\2\u0218\u0219\7@\2\2\u0219\u021a\5\24\13\2\u021a\u021b"+
		"\5\2\2\2\u021b\u021c\5*\26\2\u021c\u021d\7?\2\2\u021dU\3\2\2\2\u021e\u021f"+
		"\7;\2\2\u021f\u0220\7+\2\2\u0220\u0222\5\24\13\2\u0221\u0223\7o\2\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0229\3\2\2\2\u0224\u0226\7q"+
		"\2\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0225\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022e\3\2\2\2\u022b\u022d\5X-\2\u022c\u022b\3\2\2\2\u022d\u0230"+
		"\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\5\\/\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7\60\2\2\u0235\u0236\7;\2\2\u0236"+
		"W\3\2\2\2\u0237\u0238\7+\2\2\u0238\u0239\5Z.\2\u0239\u023a\5\2\2\2\u023a"+
		"\u023b\5*\26\2\u023bY\3\2\2\2\u023c\u023d\b.\1\2\u023d\u0242\5\24\13\2"+
		"\u023e\u023f\7[\2\2\u023f\u0240\t\16\2\2\u0240\u0242\5\24\13\2\u0241\u023c"+
		"\3\2\2\2\u0241\u023e\3\2\2\2\u0242\u0248\3\2\2\2\u0243\u0244\f\3\2\2\u0244"+
		"\u0245\7m\2\2\u0245\u0247\5Z.\4\u0246\u0243\3\2\2\2\u0247\u024a\3\2\2"+
		"\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249[\3\2\2\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024c\7+\2\2\u024c\u024d\7.\2\2\u024d\u024e\5\2\2\2\u024e"+
		"\u024f\5*\26\2\u024f]\3\2\2\2\u0250\u0251\7A\2\2\u0251\u0252\5\24\13\2"+
		"\u0252\u0253\5\2\2\2\u0253\u0254\5*\26\2\u0254\u0255\7\60\2\2\u0255\u0256"+
		"\7A\2\2\u0256_\3\2\2\2\u0257\u025f\5f\64\2\u0258\u025f\5j\66\2\u0259\u025f"+
		"\5l\67\2\u025a\u025f\5n8\2\u025b\u025f\5|?\2\u025c\u025f\5~@\2\u025d\u025f"+
		"\5\u0082B\2\u025e\u0257\3\2\2\2\u025e\u0258\3\2\2\2\u025e\u0259\3\2\2"+
		"\2\u025e\u025a\3\2\2\2\u025e\u025b\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025d"+
		"\3\2\2\2\u025fa\3\2\2\2\u0260\u0265\5d\63\2\u0261\u0262\7q\2\2\u0262\u0264"+
		"\5d\63\2\u0263\u0261\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266c\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\7\17\2\2"+
		"\u0269\u026a\5\4\3\2\u026a\u026b\7n\2\2\u026b\u026c\5\4\3\2\u026c\u026d"+
		"\7W\2\2\u026d\u026e\5\"\22\2\u026ee\3\2\2\2\u026f\u0271\5\16\b\2\u0270"+
		"\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\7I"+
		"\2\2\u0273\u0275\5\4\3\2\u0274\u0276\7q\2\2\u0275\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2"+
		"\2\2\u0279\u027b\5h\65\2\u027a\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\7\60"+
		"\2\2\u027f\u0280\7I\2\2\u0280g\3\2\2\2\u0281\u0284\5\4\3\2\u0282\u0283"+
		"\7W\2\2\u0283\u0285\5&\24\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0287\3\2\2\2\u0286\u0288\7q\2\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028ai\3\2\2\2\u028b\u028c"+
		"\5\16\b\2\u028c\u028d\7J\2\2\u028d\u028e\5\4\3\2\u028e\u0291\5t;\2\u028f"+
		"\u0290\7q\2\2\u0290\u0292\5b\62\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292k\3\2\2\2\u0293\u0294\5\16\b\2\u0294\u0295\7G\2\2\u0295\u0296"+
		"\7\35\2\2\u0296\u0297\5\4\3\2\u0297\u0298\7L\2\2\u0298\u029b\7\5\2\2\u0299"+
		"\u029a\7C\2\2\u029a\u029c\7\5\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029e\5t;\2\u029e\u02af\3\2\2\2\u029f\u02a0"+
		"\5\16\b\2\u02a0\u02a1\7G\2\2\u02a1\u02a2\7\30\2\2\u02a2\u02a3\5\4\3\2"+
		"\u02a3\u02a4\7L\2\2\u02a4\u02a7\7\5\2\2\u02a5\u02a6\7C\2\2\u02a6\u02a8"+
		"\7\5\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02ac\5t;\2\u02aa\u02ab\7B\2\2\u02ab\u02ad\5\20\t\2\u02ac\u02aa\3\2\2"+
		"\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u0293\3\2\2\2\u02ae\u029f"+
		"\3\2\2\2\u02afm\3\2\2\2\u02b0\u02b3\5p9\2\u02b1\u02b3\5r:\2\u02b2\u02b0"+
		"\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3o\3\2\2\2\u02b4\u02b6\5\16\b\2\u02b5"+
		"\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\7\35"+
		"\2\2\u02b8\u02b9\5\4\3\2\u02b9\u02bb\5t;\2\u02ba\u02bc\7q\2\2\u02bb\u02ba"+
		"\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c0\3\2\2\2\u02bf\u02c1\5b\62\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c4\5*\26\2\u02c3\u02c2\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\7\60\2\2\u02c6\u02c7\7"+
		"\35\2\2\u02c7q\3\2\2\2\u02c8\u02ca\5\16\b\2\u02c9\u02c8\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\7\30\2\2\u02cc\u02cd\5"+
		"\4\3\2\u02cd\u02d0\5t;\2\u02ce\u02cf\7B\2\2\u02cf\u02d1\5\20\t\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d4\7q"+
		"\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d9\5b\62\2\u02d8\u02d7\3\2"+
		"\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02dc\5*\26\2\u02db"+
		"\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\7\60"+
		"\2\2\u02de\u02df\7\30\2\2\u02dfs\3\2\2\2\u02e0\u02e2\7g\2\2\u02e1\u02e3"+
		"\5v<\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\7h\2\2\u02e5u\3\2\2\2\u02e6\u02eb\5x=\2\u02e7\u02e8\7m\2\2\u02e8"+
		"\u02ea\5x=\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2"+
		"\2\u02eb\u02ec\3\2\2\2\u02ecw\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02f0"+
		"\5z>\2\u02ef\u02ee\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f6\5\4"+
		"\3\2\u02f5\u02f7\5\b\5\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02fa\3\2\2\2\u02f8\u02f9\7B\2\2\u02f9\u02fb\5\20\t\2\u02fa\u02f8\3\2"+
		"\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0301\3\2\2\2\u02fc\u02ff\7W\2\2\u02fd"+
		"\u0300\5\"\22\2\u02fe\u0300\5\4\3\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3"+
		"\2\2\2\u0300\u0302\3\2\2\2\u0301\u02fc\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"y\3\2\2\2\u0303\u0304\t\17\2\2\u0304{\3\2\2\2\u0305\u0307\5\16\b\2\u0306"+
		"\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\7\33"+
		"\2\2\u0309\u030a\t\20\2\2\u030a\u030b\5\4\3\2\u030b\u030e\5t;\2\u030c"+
		"\u030d\7B\2\2\u030d\u030f\5\20\t\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2"+
		"\2\2\u030f\u0311\3\2\2\2\u0310\u0312\7q\2\2\u0311\u0310\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2"+
		"\2\2\u0315\u0317\5b\62\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0319\5*\26\2\u0319\u031a\7\60\2\2\u031a\u031b\7"+
		"\33\2\2\u031b}\3\2\2\2\u031c\u031e\5\16\b\2\u031d\u031c\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\7Q\2\2\u0320\u0322\5\4"+
		"\3\2\u0321\u0323\7q\2\2\u0322\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0329\3\2\2\2\u0326\u0327\5\u0080"+
		"A\2\u0327\u0328\7q\2\2\u0328\u032a\3\2\2\2\u0329\u0326\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032e\7\60\2\2\u032e\u032f\7Q\2\2\u032f\177\3\2\2\2\u0330\u0331\5\4\3"+
		"\2\u0331\u0332\7B\2\2\u0332\u0333\5\20\t\2\u0333\u0081\3\2\2\2\u0334\u0336"+
		"\5\16\b\2\u0335\u0337\7K\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u033a\5\4\3\2\u0339\u033b\5\b\5\2\u033a\u0339\3\2"+
		"\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\7B\2\2\u033d"+
		"\u0344\5\20\t\2\u033e\u0340\7q\2\2\u033f\u033e\3\2\2\2\u0340\u0341\3\2"+
		"\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0345\5b\62\2\u0344\u033f\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u035a\3\2"+
		"\2\2\u0346\u0348\5\16\b\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u034a\7F\2\2\u034a\u034d\5\4\3\2\u034b\u034c\7B\2"+
		"\2\u034c\u034e\5\20\t\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0350\7W\2\2\u0350\u0357\5\"\22\2\u0351\u0353\7q"+
		"\2\2\u0352\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0352\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\5b\62\2\u0357\u0352\3\2"+
		"\2\2\u0357\u0358\3\2\2\2\u0358\u035a\3\2\2\2\u0359\u0334\3\2\2\2\u0359"+
		"\u0347\3\2\2\2\u035a\u0083\3\2\2\2\u035b\u035d\5\u0086D\2\u035c\u035b"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0361\3\2\2\2\u035e\u0360\7q\2\2\u035f"+
		"\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2"+
		"\2\2\u0362\u036c\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0366\5\u0092J\2\u0365"+
		"\u0367\7q\2\2\u0366\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2"+
		"\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u0364\3\2\2\2\u036b"+
		"\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0377\3\2"+
		"\2\2\u036e\u036c\3\2\2\2\u036f\u0371\5`\61\2\u0370\u0372\7q\2\2\u0371"+
		"\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2"+
		"\2\2\u0374\u0376\3\2\2\2\u0375\u036f\3\2\2\2\u0376\u0379\3\2\2\2\u0377"+
		"\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0085\3\2\2\2\u0379\u0377\3\2"+
		"\2\2\u037a\u037b\5\u0090I\2\u037b\u037c\7q\2\2\u037c\u037e\3\2\2\2\u037d"+
		"\u037a\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0385\3\2\2\2\u037f\u0382\5\u0088"+
		"E\2\u0380\u0382\5\u008aF\2\u0381\u037f\3\2\2\2\u0381\u0380\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u0384\7q\2\2\u0384\u0386\3\2\2\2\u0385\u0381\3\2"+
		"\2\2\u0386\u0387\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u0087\3\2\2\2\u0389\u038a\7\17\2\2\u038a\u038b\5\4\3\2\u038b\u038c\7"+
		"W\2\2\u038c\u038d\5\"\22\2\u038d\u0394\3\2\2\2\u038e\u038f\7&\2\2\u038f"+
		"\u0390\7W\2\2\u0390\u0391\7\5\2\2\u0391\u0392\7\4\2\2\u0392\u0394\7\5"+
		"\2\2\u0393\u0389\3\2\2\2\u0393\u038e\3\2\2\2\u0394\u0089\3\2\2\2\u0395"+
		"\u039a\7\22\2\2\u0396\u0398\5\4\3\2\u0397\u0399\5\4\3\2\u0398\u0397\3"+
		"\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u0396\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u03a4\7q\2\2\u039d\u03a1\5\u008c"+
		"G\2\u039e\u03a1\5\u008eH\2\u039f\u03a1\5\u008aF\2\u03a0\u039d\3\2\2\2"+
		"\u03a0\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3"+
		"\7q\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\7\60"+
		"\2\2\u03a9\u008b\3\2\2\2\u03aa\u03ab\5\4\3\2\u03ab\u03ac\7W\2\2\u03ac"+
		"\u03af\5\"\22\2\u03ad\u03ae\7o\2\2\u03ae\u03b0\5\"\22\2\u03af\u03ad\3"+
		"\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u008d\3\2\2\2\u03b1\u03b2\7\23\2\2\u03b2"+
		"\u03b3\5\4\3\2\u03b3\u03b7\7q\2\2\u03b4\u03b5\5\u008cG\2\u03b5\u03b6\7"+
		"q\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b4\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\7\24"+
		"\2\2\u03bc\u008f\3\2\2\2\u03bd\u03be\7\20\2\2\u03be\u03c0\7\6\2\2\u03bf"+
		"\u03c1\7\21\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u0091\3"+
		"\2\2\2\u03c2\u03c3\7\f\2\2\u03c3\u03c4\t\21\2\2\u03c4\u0093\3\2\2\2\u0083"+
		"\u0095\u0099\u009f\u00a4\u00ac\u00ae\u00b8\u00be\u00c0\u00c7\u00d3\u00f7"+
		"\u00f9\u00fb\u0100\u010a\u010f\u0113\u0117\u011b\u011f\u0121\u012b\u0135"+
		"\u013e\u0141\u0146\u014d\u0152\u0155\u0158\u0167\u0174\u0181\u0183\u0185"+
		"\u0189\u018f\u0194\u019a\u019e\u01a6\u01a9\u01af\u01b2\u01b6\u01b9\u01c1"+
		"\u01c5\u01cb\u01cf\u01d1\u01d8\u01db\u01e8\u01ed\u01fd\u0209\u0214\u0216"+
		"\u0222\u0227\u0229\u022e\u0232\u0241\u0248\u025e\u0265\u0270\u0277\u027c"+
		"\u0284\u0289\u0291\u029b\u02a7\u02ac\u02ae\u02b2\u02b5\u02bd\u02c0\u02c3"+
		"\u02c9\u02d0\u02d5\u02d8\u02db\u02e2\u02eb\u02f1\u02f6\u02fa\u02ff\u0301"+
		"\u0306\u030e\u0313\u0316\u031d\u0324\u032b\u0336\u033a\u0341\u0344\u0347"+
		"\u034d\u0354\u0357\u0359\u035c\u0361\u0368\u036c\u0373\u0377\u037d\u0381"+
		"\u0387\u0393\u0398\u039a\u03a0\u03a6\u03af\u03b9\u03c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}