// Generated from /Users/diogo.pereira/Library/CloudStorage/OneDrive-InstitutoPiaget/2 ano/2 Semestre/Teoria de Autómatos e Compiladores/Trabalho/Mini-compilador-de-Python-PIAGET/PythonLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonLexer extends Lexer {
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
		INT_DIGIT=98, FLOAT_DIGIT=99, STRING=100, IDENTIFIER=101, WS=102;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "STAR", "DIV", "FLOOR_DIV", "MOD", "POWER", "AT", "EQ", 
			"NOT_EQ", "GT", "LT", "GT_EQ", "LT_EQ", "AMP", "PIPE", "CARET", "TILDE", 
			"LSHIFT", "RSHIFT", "ASSIGN", "WALRUS", "PLUS_EQ", "MINUS_EQ", "STAR_EQ", 
			"DIV_EQ", "FLOOR_DIV_EQ", "MOD_EQ", "POWER_EQ", "AMP_EQ", "PIPE_EQ", 
			"CARET_EQ", "LSHIFT_EQ", "RSHIFT_EQ", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COLON", 
			"IF", "ELIF", "ELSE", "FOR", "WHILE", "DEF", "CLASS", "TRY", "EXCEPT", 
			"FINALLY", "WITH", "MATCH", "CASE", "INT", "FLOAT", "STR", "BOOL", "LIST", 
			"DICT", "SET", "TUPLE", "NONE", "TRUE", "FALSE", "PRINT", "INPUT", "LEN", 
			"TYPE", "RANGE", "OPEN", "SUM", "MAX", "MIN", "AND", "OR", "NOT", "IMPORT", 
			"FROM", "AS", "IN", "IS", "RETURN", "YIELD", "LAMBDA", "BREAK", "CONTINUE", 
			"PASS", "DEL", "GLOBAL", "NONLOCAL", "ASSERT", "RAISE", "ASYNC", "AWAIT", 
			"INT_DIGIT", "FLOAT_DIGIT", "STRING", "IDENTIFIER", "LETTER", "DIGIT", 
			"WS"
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
			"'await'"
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
			"INT_DIGIT", "FLOAT_DIGIT", "STRING", "IDENTIFIER", "WS"
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


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2h\u02a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3"+
		"D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3"+
		"M\3M\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3"+
		"R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3"+
		"W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3b\3"+
		"b\3b\3b\3b\3b\3c\6c\u0260\nc\rc\16c\u0261\3d\6d\u0265\nd\rd\16d\u0266"+
		"\3d\3d\7d\u026b\nd\fd\16d\u026e\13d\3d\3d\6d\u0272\nd\rd\16d\u0273\5d"+
		"\u0276\nd\3e\3e\3e\3e\7e\u027c\ne\fe\16e\u027f\13e\3e\3e\3e\3e\3e\7e\u0286"+
		"\ne\fe\16e\u0289\13e\3e\5e\u028c\ne\3f\3f\5f\u0290\nf\3f\3f\3f\7f\u0295"+
		"\nf\ff\16f\u0298\13f\3g\3g\3h\3h\3i\6i\u029f\ni\ri\16i\u02a0\3i\3i\2\2"+
		"j\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9"+
		"f\u00cbg\u00cd\2\u00cf\2\u00d1h\3\2\7\6\2\f\f\17\17))^^\6\2\f\f\17\17"+
		"$$^^\4\2C\\c|\3\2\62;\3\2\16\17\2\u02b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00d1\3\2\2\2\3\u00d3\3\2\2"+
		"\2\5\u00d5\3\2\2\2\7\u00d7\3\2\2\2\t\u00d9\3\2\2\2\13\u00db\3\2\2\2\r"+
		"\u00de\3\2\2\2\17\u00e0\3\2\2\2\21\u00e3\3\2\2\2\23\u00e5\3\2\2\2\25\u00e8"+
		"\3\2\2\2\27\u00eb\3\2\2\2\31\u00ed\3\2\2\2\33\u00ef\3\2\2\2\35\u00f2\3"+
		"\2\2\2\37\u00f5\3\2\2\2!\u00f7\3\2\2\2#\u00f9\3\2\2\2%\u00fb\3\2\2\2\'"+
		"\u00fd\3\2\2\2)\u0100\3\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2/\u0108\3\2"+
		"\2\2\61\u010b\3\2\2\2\63\u010e\3\2\2\2\65\u0111\3\2\2\2\67\u0114\3\2\2"+
		"\29\u0118\3\2\2\2;\u011b\3\2\2\2=\u011f\3\2\2\2?\u0122\3\2\2\2A\u0125"+
		"\3\2\2\2C\u0128\3\2\2\2E\u012c\3\2\2\2G\u0130\3\2\2\2I\u0132\3\2\2\2K"+
		"\u0134\3\2\2\2M\u0136\3\2\2\2O\u0138\3\2\2\2Q\u013a\3\2\2\2S\u013c\3\2"+
		"\2\2U\u013e\3\2\2\2W\u0140\3\2\2\2Y\u0142\3\2\2\2[\u0145\3\2\2\2]\u014a"+
		"\3\2\2\2_\u014f\3\2\2\2a\u0153\3\2\2\2c\u0159\3\2\2\2e\u015d\3\2\2\2g"+
		"\u0163\3\2\2\2i\u0167\3\2\2\2k\u016e\3\2\2\2m\u0176\3\2\2\2o\u017b\3\2"+
		"\2\2q\u0181\3\2\2\2s\u0186\3\2\2\2u\u018a\3\2\2\2w\u0190\3\2\2\2y\u0194"+
		"\3\2\2\2{\u0199\3\2\2\2}\u019e\3\2\2\2\177\u01a3\3\2\2\2\u0081\u01a7\3"+
		"\2\2\2\u0083\u01ad\3\2\2\2\u0085\u01b2\3\2\2\2\u0087\u01b7\3\2\2\2\u0089"+
		"\u01bd\3\2\2\2\u008b\u01c3\3\2\2\2\u008d\u01c9\3\2\2\2\u008f\u01cd\3\2"+
		"\2\2\u0091\u01d2\3\2\2\2\u0093\u01d8\3\2\2\2\u0095\u01dd\3\2\2\2\u0097"+
		"\u01e1\3\2\2\2\u0099\u01e5\3\2\2\2\u009b\u01e9\3\2\2\2\u009d\u01ed\3\2"+
		"\2\2\u009f\u01f0\3\2\2\2\u00a1\u01f4\3\2\2\2\u00a3\u01fb\3\2\2\2\u00a5"+
		"\u0200\3\2\2\2\u00a7\u0203\3\2\2\2\u00a9\u0206\3\2\2\2\u00ab\u0209\3\2"+
		"\2\2\u00ad\u0210\3\2\2\2\u00af\u0216\3\2\2\2\u00b1\u021d\3\2\2\2\u00b3"+
		"\u0223\3\2\2\2\u00b5\u022c\3\2\2\2\u00b7\u0231\3\2\2\2\u00b9\u0235\3\2"+
		"\2\2\u00bb\u023c\3\2\2\2\u00bd\u0245\3\2\2\2\u00bf\u024c\3\2\2\2\u00c1"+
		"\u0252\3\2\2\2\u00c3\u0258\3\2\2\2\u00c5\u025f\3\2\2\2\u00c7\u0275\3\2"+
		"\2\2\u00c9\u028b\3\2\2\2\u00cb\u028f\3\2\2\2\u00cd\u0299\3\2\2\2\u00cf"+
		"\u029b\3\2\2\2\u00d1\u029e\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\4\3\2\2\2"+
		"\u00d5\u00d6\7/\2\2\u00d6\6\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\b\3\2\2\2"+
		"\u00d9\u00da\7\61\2\2\u00da\n\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd"+
		"\7\61\2\2\u00dd\f\3\2\2\2\u00de\u00df\7\'\2\2\u00df\16\3\2\2\2\u00e0\u00e1"+
		"\7,\2\2\u00e1\u00e2\7,\2\2\u00e2\20\3\2\2\2\u00e3\u00e4\7B\2\2\u00e4\22"+
		"\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6\u00e7\7?\2\2\u00e7\24\3\2\2\2\u00e8"+
		"\u00e9\7#\2\2\u00e9\u00ea\7?\2\2\u00ea\26\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec"+
		"\30\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\32\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0"+
		"\u00f1\7?\2\2\u00f1\34\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f4\7?\2\2\u00f4"+
		"\36\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6 \3\2\2\2\u00f7\u00f8\7~\2\2\u00f8"+
		"\"\3\2\2\2\u00f9\u00fa\7`\2\2\u00fa$\3\2\2\2\u00fb\u00fc\7\u0080\2\2\u00fc"+
		"&\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7>\2\2\u00ff(\3\2\2\2\u0100\u0101"+
		"\7@\2\2\u0101\u0102\7@\2\2\u0102*\3\2\2\2\u0103\u0104\7?\2\2\u0104,\3"+
		"\2\2\2\u0105\u0106\7<\2\2\u0106\u0107\7?\2\2\u0107.\3\2\2\2\u0108\u0109"+
		"\7-\2\2\u0109\u010a\7?\2\2\u010a\60\3\2\2\2\u010b\u010c\7/\2\2\u010c\u010d"+
		"\7?\2\2\u010d\62\3\2\2\2\u010e\u010f\7,\2\2\u010f\u0110\7?\2\2\u0110\64"+
		"\3\2\2\2\u0111\u0112\7\61\2\2\u0112\u0113\7?\2\2\u0113\66\3\2\2\2\u0114"+
		"\u0115\7\61\2\2\u0115\u0116\7\61\2\2\u0116\u0117\7?\2\2\u01178\3\2\2\2"+
		"\u0118\u0119\7\'\2\2\u0119\u011a\7?\2\2\u011a:\3\2\2\2\u011b\u011c\7,"+
		"\2\2\u011c\u011d\7,\2\2\u011d\u011e\7?\2\2\u011e<\3\2\2\2\u011f\u0120"+
		"\7(\2\2\u0120\u0121\7?\2\2\u0121>\3\2\2\2\u0122\u0123\7~\2\2\u0123\u0124"+
		"\7?\2\2\u0124@\3\2\2\2\u0125\u0126\7`\2\2\u0126\u0127\7?\2\2\u0127B\3"+
		"\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7>\2\2\u012a\u012b\7?\2\2\u012b"+
		"D\3\2\2\2\u012c\u012d\7@\2\2\u012d\u012e\7@\2\2\u012e\u012f\7?\2\2\u012f"+
		"F\3\2\2\2\u0130\u0131\7)\2\2\u0131H\3\2\2\2\u0132\u0133\7$\2\2\u0133J"+
		"\3\2\2\2\u0134\u0135\7]\2\2\u0135L\3\2\2\2\u0136\u0137\7_\2\2\u0137N\3"+
		"\2\2\2\u0138\u0139\7}\2\2\u0139P\3\2\2\2\u013a\u013b\7\177\2\2\u013bR"+
		"\3\2\2\2\u013c\u013d\7*\2\2\u013dT\3\2\2\2\u013e\u013f\7+\2\2\u013fV\3"+
		"\2\2\2\u0140\u0141\7<\2\2\u0141X\3\2\2\2\u0142\u0143\7k\2\2\u0143\u0144"+
		"\7h\2\2\u0144Z\3\2\2\2\u0145\u0146\7g\2\2\u0146\u0147\7n\2\2\u0147\u0148"+
		"\7k\2\2\u0148\u0149\7h\2\2\u0149\\\3\2\2\2\u014a\u014b\7g\2\2\u014b\u014c"+
		"\7n\2\2\u014c\u014d\7u\2\2\u014d\u014e\7g\2\2\u014e^\3\2\2\2\u014f\u0150"+
		"\7h\2\2\u0150\u0151\7q\2\2\u0151\u0152\7t\2\2\u0152`\3\2\2\2\u0153\u0154"+
		"\7y\2\2\u0154\u0155\7j\2\2\u0155\u0156\7k\2\2\u0156\u0157\7n\2\2\u0157"+
		"\u0158\7g\2\2\u0158b\3\2\2\2\u0159\u015a\7f\2\2\u015a\u015b\7g\2\2\u015b"+
		"\u015c\7h\2\2\u015cd\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f\7n\2\2\u015f"+
		"\u0160\7c\2\2\u0160\u0161\7u\2\2\u0161\u0162\7u\2\2\u0162f\3\2\2\2\u0163"+
		"\u0164\7v\2\2\u0164\u0165\7t\2\2\u0165\u0166\7{\2\2\u0166h\3\2\2\2\u0167"+
		"\u0168\7g\2\2\u0168\u0169\7z\2\2\u0169\u016a\7e\2\2\u016a\u016b\7g\2\2"+
		"\u016b\u016c\7r\2\2\u016c\u016d\7v\2\2\u016dj\3\2\2\2\u016e\u016f\7h\2"+
		"\2\u016f\u0170\7k\2\2\u0170\u0171\7p\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7n\2\2\u0173\u0174\7n\2\2\u0174\u0175\7{\2\2\u0175l\3\2\2\2\u0176\u0177"+
		"\7y\2\2\u0177\u0178\7k\2\2\u0178\u0179\7v\2\2\u0179\u017a\7j\2\2\u017a"+
		"n\3\2\2\2\u017b\u017c\7o\2\2\u017c\u017d\7c\2\2\u017d\u017e\7v\2\2\u017e"+
		"\u017f\7e\2\2\u017f\u0180\7j\2\2\u0180p\3\2\2\2\u0181\u0182\7e\2\2\u0182"+
		"\u0183\7c\2\2\u0183\u0184\7u\2\2\u0184\u0185\7g\2\2\u0185r\3\2\2\2\u0186"+
		"\u0187\7k\2\2\u0187\u0188\7p\2\2\u0188\u0189\7v\2\2\u0189t\3\2\2\2\u018a"+
		"\u018b\7h\2\2\u018b\u018c\7n\2\2\u018c\u018d\7q\2\2\u018d\u018e\7c\2\2"+
		"\u018e\u018f\7v\2\2\u018fv\3\2\2\2\u0190\u0191\7u\2\2\u0191\u0192\7v\2"+
		"\2\u0192\u0193\7t\2\2\u0193x\3\2\2\2\u0194\u0195\7d\2\2\u0195\u0196\7"+
		"q\2\2\u0196\u0197\7q\2\2\u0197\u0198\7n\2\2\u0198z\3\2\2\2\u0199\u019a"+
		"\7n\2\2\u019a\u019b\7k\2\2\u019b\u019c\7u\2\2\u019c\u019d\7v\2\2\u019d"+
		"|\3\2\2\2\u019e\u019f\7f\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7e\2\2\u01a1"+
		"\u01a2\7v\2\2\u01a2~\3\2\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7g\2\2\u01a5"+
		"\u01a6\7v\2\2\u01a6\u0080\3\2\2\2\u01a7\u01a8\7v\2\2\u01a8\u01a9\7w\2"+
		"\2\u01a9\u01aa\7r\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac\7g\2\2\u01ac\u0082"+
		"\3\2\2\2\u01ad\u01ae\7P\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7p\2\2\u01b0"+
		"\u01b1\7g\2\2\u01b1\u0084\3\2\2\2\u01b2\u01b3\7V\2\2\u01b3\u01b4\7t\2"+
		"\2\u01b4\u01b5\7w\2\2\u01b5\u01b6\7g\2\2\u01b6\u0086\3\2\2\2\u01b7\u01b8"+
		"\7H\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7u\2\2\u01bb"+
		"\u01bc\7g\2\2\u01bc\u0088\3\2\2\2\u01bd\u01be\7r\2\2\u01be\u01bf\7t\2"+
		"\2\u01bf\u01c0\7k\2\2\u01c0\u01c1\7p\2\2\u01c1\u01c2\7v\2\2\u01c2\u008a"+
		"\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c6\7r\2\2\u01c6"+
		"\u01c7\7w\2\2\u01c7\u01c8\7v\2\2\u01c8\u008c\3\2\2\2\u01c9\u01ca\7n\2"+
		"\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7p\2\2\u01cc\u008e\3\2\2\2\u01cd\u01ce"+
		"\7v\2\2\u01ce\u01cf\7{\2\2\u01cf\u01d0\7r\2\2\u01d0\u01d1\7g\2\2\u01d1"+
		"\u0090\3\2\2\2\u01d2\u01d3\7t\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5\7p\2"+
		"\2\u01d5\u01d6\7i\2\2\u01d6\u01d7\7g\2\2\u01d7\u0092\3\2\2\2\u01d8\u01d9"+
		"\7q\2\2\u01d9\u01da\7r\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7p\2\2\u01dc"+
		"\u0094\3\2\2\2\u01dd\u01de\7u\2\2\u01de\u01df\7w\2\2\u01df\u01e0\7o\2"+
		"\2\u01e0\u0096\3\2\2\2\u01e1\u01e2\7o\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4"+
		"\7z\2\2\u01e4\u0098\3\2\2\2\u01e5\u01e6\7o\2\2\u01e6\u01e7\7k\2\2\u01e7"+
		"\u01e8\7p\2\2\u01e8\u009a\3\2\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7p\2"+
		"\2\u01eb\u01ec\7f\2\2\u01ec\u009c\3\2\2\2\u01ed\u01ee\7q\2\2\u01ee\u01ef"+
		"\7t\2\2\u01ef\u009e\3\2\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7q\2\2\u01f2"+
		"\u01f3\7v\2\2\u01f3\u00a0\3\2\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6\7o\2"+
		"\2\u01f6\u01f7\7r\2\2\u01f7\u01f8\7q\2\2\u01f8\u01f9\7t\2\2\u01f9\u01fa"+
		"\7v\2\2\u01fa\u00a2\3\2\2\2\u01fb\u01fc\7h\2\2\u01fc\u01fd\7t\2\2\u01fd"+
		"\u01fe\7q\2\2\u01fe\u01ff\7o\2\2\u01ff\u00a4\3\2\2\2\u0200\u0201\7c\2"+
		"\2\u0201\u0202\7u\2\2\u0202\u00a6\3\2\2\2\u0203\u0204\7k\2\2\u0204\u0205"+
		"\7p\2\2\u0205\u00a8\3\2\2\2\u0206\u0207\7k\2\2\u0207\u0208\7u\2\2\u0208"+
		"\u00aa\3\2\2\2\u0209\u020a\7t\2\2\u020a\u020b\7g\2\2\u020b\u020c\7v\2"+
		"\2\u020c\u020d\7w\2\2\u020d\u020e\7t\2\2\u020e\u020f\7p\2\2\u020f\u00ac"+
		"\3\2\2\2\u0210\u0211\7{\2\2\u0211\u0212\7k\2\2\u0212\u0213\7g\2\2\u0213"+
		"\u0214\7n\2\2\u0214\u0215\7f\2\2\u0215\u00ae\3\2\2\2\u0216\u0217\7n\2"+
		"\2\u0217\u0218\7c\2\2\u0218\u0219\7o\2\2\u0219\u021a\7d\2\2\u021a\u021b"+
		"\7f\2\2\u021b\u021c\7c\2\2\u021c\u00b0\3\2\2\2\u021d\u021e\7d\2\2\u021e"+
		"\u021f\7t\2\2\u021f\u0220\7g\2\2\u0220\u0221\7c\2\2\u0221\u0222\7m\2\2"+
		"\u0222\u00b2\3\2\2\2\u0223\u0224\7e\2\2\u0224\u0225\7q\2\2\u0225\u0226"+
		"\7p\2\2\u0226\u0227\7v\2\2\u0227\u0228\7k\2\2\u0228\u0229\7p\2\2\u0229"+
		"\u022a\7w\2\2\u022a\u022b\7g\2\2\u022b\u00b4\3\2\2\2\u022c\u022d\7r\2"+
		"\2\u022d\u022e\7c\2\2\u022e\u022f\7u\2\2\u022f\u0230\7u\2\2\u0230\u00b6"+
		"\3\2\2\2\u0231\u0232\7f\2\2\u0232\u0233\7g\2\2\u0233\u0234\7n\2\2\u0234"+
		"\u00b8\3\2\2\2\u0235\u0236\7i\2\2\u0236\u0237\7n\2\2\u0237\u0238\7q\2"+
		"\2\u0238\u0239\7d\2\2\u0239\u023a\7c\2\2\u023a\u023b\7n\2\2\u023b\u00ba"+
		"\3\2\2\2\u023c\u023d\7p\2\2\u023d\u023e\7q\2\2\u023e\u023f\7p\2\2\u023f"+
		"\u0240\7n\2\2\u0240\u0241\7q\2\2\u0241\u0242\7e\2\2\u0242\u0243\7c\2\2"+
		"\u0243\u0244\7n\2\2\u0244\u00bc\3\2\2\2\u0245\u0246\7c\2\2\u0246\u0247"+
		"\7u\2\2\u0247\u0248\7u\2\2\u0248\u0249\7g\2\2\u0249\u024a\7t\2\2\u024a"+
		"\u024b\7v\2\2\u024b\u00be\3\2\2\2\u024c\u024d\7t\2\2\u024d\u024e\7c\2"+
		"\2\u024e\u024f\7k\2\2\u024f\u0250\7u\2\2\u0250\u0251\7g\2\2\u0251\u00c0"+
		"\3\2\2\2\u0252\u0253\7c\2\2\u0253\u0254\7u\2\2\u0254\u0255\7{\2\2\u0255"+
		"\u0256\7p\2\2\u0256\u0257\7e\2\2\u0257\u00c2\3\2\2\2\u0258\u0259\7c\2"+
		"\2\u0259\u025a\7y\2\2\u025a\u025b\7c\2\2\u025b\u025c\7k\2\2\u025c\u025d"+
		"\7v\2\2\u025d\u00c4\3\2\2\2\u025e\u0260\5\u00cfh\2\u025f\u025e\3\2\2\2"+
		"\u0260\u0261\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u00c6"+
		"\3\2\2\2\u0263\u0265\5\u00cfh\2\u0264\u0263\3\2\2\2\u0265\u0266\3\2\2"+
		"\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026c"+
		"\7\60\2\2\u0269\u026b\5\u00cfh\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2"+
		"\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0276\3\2\2\2\u026e\u026c"+
		"\3\2\2\2\u026f\u0271\7\60\2\2\u0270\u0272\5\u00cfh\2\u0271\u0270\3\2\2"+
		"\2\u0272\u0273\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276"+
		"\3\2\2\2\u0275\u0264\3\2\2\2\u0275\u026f\3\2\2\2\u0276\u00c8\3\2\2\2\u0277"+
		"\u027d\7)\2\2\u0278\u027c\n\2\2\2\u0279\u027a\7^\2\2\u027a\u027c\13\2"+
		"\2\2\u027b\u0278\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u028c\7)\2\2\u0281\u0287\7$\2\2\u0282\u0286\n\3\2\2\u0283\u0284"+
		"\7^\2\2\u0284\u0286\13\2\2\2\u0285\u0282\3\2\2\2\u0285\u0283\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u028a\u028c\7$\2\2\u028b\u0277\3\2\2\2\u028b"+
		"\u0281\3\2\2\2\u028c\u00ca\3\2\2\2\u028d\u0290\5\u00cdg\2\u028e\u0290"+
		"\7a\2\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2\2\2\u0290\u0296\3\2\2\2\u0291"+
		"\u0295\5\u00cdg\2\u0292\u0295\5\u00cfh\2\u0293\u0295\7a\2\2\u0294\u0291"+
		"\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u00cc\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029a\t\4\2\2\u029a\u00ce\3\2\2\2\u029b\u029c\t\5\2\2\u029c"+
		"\u00d0\3\2\2\2\u029d\u029f\t\6\2\2\u029e\u029d\3\2\2\2\u029f\u02a0\3\2"+
		"\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a3\bi\2\2\u02a3\u00d2\3\2\2\2\21\2\u0261\u0266\u026c\u0273\u0275\u027b"+
		"\u027d\u0285\u0287\u028b\u028f\u0294\u0296\u02a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}