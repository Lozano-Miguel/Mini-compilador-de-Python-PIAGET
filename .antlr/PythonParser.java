// Generated from /Users/diogo.pereira/Library/CloudStorage/OneDrive-InstitutoPiaget/2 ano/2 Semestre/Teoria de Autómatos e Compiladores/Trabalho/Mini-compilador-de-Python-PIAGET/PythonParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, STAR=3, DIV=4, FLOOR_DIV=5, MOD=6, POWER=7, AT=8, EQ=9, 
		NOT_EQ=10, GT=11, LT=12, GT_EQ=13, LT_EQ=14, AMP=15, PIPE=16, CARET=17, 
		TILDE=18, LSHIFT=19, RSHIFT=20, ASSIGN=21, WALRUS=22, PLUS_EQ=23, MINUS_EQ=24, 
		STAR_EQ=25, DIV_EQ=26, FLOOR_DIV_EQ=27, MOD_EQ=28, POWER_EQ=29, AMP_EQ=30, 
		PIPE_EQ=31, CARET_EQ=32, LSHIFT_EQ=33, RSHIFT_EQ=34, SINGLE_QUOTE=35, 
		DOUBLE_QUOTE=36, LBRACK=37, RBRACK=38, LBRACE=39, RBRACE=40, LPAREN=41, 
		RPAREN=42, COLON=43, IF=44, ELIF=45, ELSE=46, FOR=47, WHILE=48, DEF=49, 
		CLASS=50, TRY=51, EXCEPT=52, FINALLY=53, WITH=54, MATCH=55, CASE=56, INT=57, 
		FLOAT=58, STR=59, BOOL=60, LIST=61, DICT=62, SET=63, TUPLE=64, NONE=65, 
		TRUE=66, FALSE=67, PRINT=68, INPUT=69, LEN=70, TYPE=71, RANGE=72, OPEN=73, 
		SUM=74, MAX=75, MIN=76, AND=77, OR=78, NOT=79, IMPORT=80, FROM=81, AS=82, 
		IN=83, IS=84, RETURN=85, YIELD=86, LAMBDA=87, BREAK=88, CONTINUE=89, PASS=90, 
		DEL=91, GLOBAL=92, NONLOCAL=93, ASSERT=94, RAISE=95, ASYNC=96, AWAIT=97, 
		INT_DIGIT=98, FLOAT_DIGIT=99, STRING=100, IDENTIFIER=101, NEWLINE=102, 
		WS=103;
	public static final int
		RULE_code = 0, RULE_stat = 1, RULE_expr = 2, RULE_ids = 3, RULE_numeros = 4, 
		RULE_expressoesEntreParenteses = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "stat", "expr", "ids", "numeros", "expressoesEntreParenteses"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'**'", "'@'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'&'", "'|'", "'^'", "'~'", "'<<'", 
			"'>>'", "'='", "':='", "'+='", "'-='", "'*='", "'/='", "'//='", "'%='", 
			"'**='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'''", "'\"'", "'['", 
			"']'", "'{'", "'}'", "'('", "')'", "':'", "'if'", "'elif'", "'else'", 
			"'for'", "'while'", "'def'", "'class'", "'try'", "'except'", "'finally'", 
			"'with'", "'match'", "'case'", "'int'", "'float'", "'str'", "'bool'", 
			"'list'", "'dict'", "'set'", "'tuple'", "'None'", "'True'", "'False'", 
			"'print'", "'input'", "'len'", "'type'", "'range'", "'open'", "'sum'", 
			"'max'", "'min'", "'and'", "'or'", "'not'", "'import'", "'from'", "'as'", 
			"'in'", "'is'", "'return'", "'yield'", "'lambda'", "'break'", "'continue'", 
			"'pass'", "'del'", "'global'", "'nonlocal'", "'assert'", "'raise'", "'async'", 
			"'await'", null, null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "STAR", "DIV", "FLOOR_DIV", "MOD", "POWER", "AT", 
			"EQ", "NOT_EQ", "GT", "LT", "GT_EQ", "LT_EQ", "AMP", "PIPE", "CARET", 
			"TILDE", "LSHIFT", "RSHIFT", "ASSIGN", "WALRUS", "PLUS_EQ", "MINUS_EQ", 
			"STAR_EQ", "DIV_EQ", "FLOOR_DIV_EQ", "MOD_EQ", "POWER_EQ", "AMP_EQ", 
			"PIPE_EQ", "CARET_EQ", "LSHIFT_EQ", "RSHIFT_EQ", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COLON", 
			"IF", "ELIF", "ELSE", "FOR", "WHILE", "DEF", "CLASS", "TRY", "EXCEPT", 
			"FINALLY", "WITH", "MATCH", "CASE", "INT", "FLOAT", "STR", "BOOL", "LIST", 
			"DICT", "SET", "TUPLE", "NONE", "TRUE", "FALSE", "PRINT", "INPUT", "LEN", 
			"TYPE", "RANGE", "OPEN", "SUM", "MAX", "MIN", "AND", "OR", "NOT", "IMPORT", 
			"FROM", "AS", "IN", "IS", "RETURN", "YIELD", "LAMBDA", "BREAK", "CONTINUE", 
			"PASS", "DEL", "GLOBAL", "NONLOCAL", "ASSERT", "RAISE", "ASYNC", "AWAIT", 
			"INT_DIGIT", "FLOAT_DIGIT", "STRING", "IDENTIFIER", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (LPAREN - 41)) | (1L << (INT_DIGIT - 41)) | (1L << (FLOAT_DIGIT - 41)) | (1L << (IDENTIFIER - 41)))) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			expr(0);
			setState(21);
			match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public ExpressoesEntreParentesesContext expressoesEntreParenteses() {
			return getRuleContext(ExpressoesEntreParentesesContext.class,0);
		}
		public NumerosContext numeros() {
			return getRuleContext(NumerosContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public TerminalNode FLOOR_DIV() { return getToken(PythonParser.FLOOR_DIV, 0); }
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(24);
				expressoesEntreParenteses();
				}
				break;
			case INT_DIGIT:
			case FLOAT_DIGIT:
				{
				setState(25);
				numeros();
				}
				break;
			case IDENTIFIER:
				{
				setState(26);
				ids();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(29);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(30);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << DIV) | (1L << FLOOR_DIV) | (1L << MOD) | (1L << POWER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(31);
					expr(4);
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PythonParser.IDENTIFIER, 0); }
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(IDENTIFIER);
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

	public static class NumerosContext extends ParserRuleContext {
		public TerminalNode INT_DIGIT() { return getToken(PythonParser.INT_DIGIT, 0); }
		public TerminalNode FLOAT_DIGIT() { return getToken(PythonParser.FLOAT_DIGIT, 0); }
		public NumerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros; }
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numeros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==INT_DIGIT || _la==FLOAT_DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressoesEntreParentesesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public ExpressoesEntreParentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressoesEntreParenteses; }
	}

	public final ExpressoesEntreParentesesContext expressoesEntreParenteses() throws RecognitionException {
		ExpressoesEntreParentesesContext _localctx = new ExpressoesEntreParentesesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressoesEntreParenteses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(LPAREN);
			setState(42);
			expr(0);
			setState(43);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i\60\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\7\4#\n\4\f\4\16"+
		"\4&\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\3\6\b\2\4\6\b\n\f\2\4\3"+
		"\2\3\t\3\2de\2-\2\21\3\2\2\2\4\26\3\2\2\2\6\35\3\2\2\2\b\'\3\2\2\2\n)"+
		"\3\2\2\2\f+\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3"+
		"\2\2\2\26\27\5\6\4\2\27\30\7h\2\2\30\5\3\2\2\2\31\32\b\4\1\2\32\36\5\f"+
		"\7\2\33\36\5\n\6\2\34\36\5\b\5\2\35\31\3\2\2\2\35\33\3\2\2\2\35\34\3\2"+
		"\2\2\36$\3\2\2\2\37 \f\5\2\2 !\t\2\2\2!#\5\6\4\6\"\37\3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&$\3\2\2\2\'(\7g\2\2(\t\3\2\2\2)*\t"+
		"\3\2\2*\13\3\2\2\2+,\7+\2\2,-\5\6\4\2-.\7,\2\2.\r\3\2\2\2\5\21\35$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}