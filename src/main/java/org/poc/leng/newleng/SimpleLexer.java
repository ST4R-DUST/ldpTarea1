// Generated from Simple.g4 by ANTLR 4.6
package org.poc.leng.newleng;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, AND=3, OR=4, EQUAL=5, NQUAL=6, GT=7, LT=8, ASSIGN=9, 
		LPAR=10, RPAR=11, LBRACE=12, RBRACE=13, INIT=14, END=15, IF=16, ELIF=17, 
		ELSE=18, ENDIF=19, READ=20, WRITE=21, INT_V=22, STRING_V=23, FLOAT_V=24, 
		BOOLEAN_V=25, NUMBER=26, FLOAT=27, BOOLEAN=28, STRING=29, VARID=30, COMMENT=31, 
		WS=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TRUE", "FALSE", "NAT", "DOT", "PLUS", "MINUS", "AND", "OR", "EQUAL", 
		"NQUAL", "GT", "LT", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "INIT", 
		"END", "IF", "ELIF", "ELSE", "ENDIF", "READ", "WRITE", "INT_V", "STRING_V", 
		"FLOAT_V", "BOOLEAN_V", "NUMBER", "FLOAT", "BOOLEAN", "STRING", "VARID", 
		"COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'and'", "'or'", "'='", "'<>'", "'>'", "'<'", "'<-'", 
		"'('", "')'", "'{'", "'}'", "'init'", "'end'", "'if'", "'elif'", "'else'", 
		"'fi'", "'read'", "'write'", "'int'", "'string'", "'float'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "AND", "OR", "EQUAL", "NQUAL", "GT", "LT", "ASSIGN", 
		"LPAR", "RPAR", "LBRACE", "RBRACE", "INIT", "END", "IF", "ELIF", "ELSE", 
		"ENDIF", "READ", "WRITE", "INT_V", "STRING_V", "FLOAT_V", "BOOLEAN_V", 
		"NUMBER", "FLOAT", "BOOLEAN", "STRING", "VARID", "COMMENT", "WS"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00b5\n\37\r\37\16\37\u00b6\3 "+
		"\3 \3 \3 \3!\3!\5!\u00bf\n!\3\"\3\"\7\"\u00c3\n\"\f\"\16\"\u00c6\13\""+
		"\3\"\3\"\3#\6#\u00cb\n#\r#\16#\u00cc\3$\3$\7$\u00d1\n$\f$\16$\u00d4\13"+
		"$\3$\5$\u00d7\n$\3$\3$\3$\3$\3%\6%\u00de\n%\r%\16%\u00df\3%\3%\4\u00c4"+
		"\u00d2\2&\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13"+
		"\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32"+
		";\33=\34?\35A\36C\37E G!I\"\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\""+
		"\u00e5\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5P\3\2\2\2\7V\3\2"+
		"\2\2\tX\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21b\3\2\2\2\23e\3"+
		"\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35q\3\2\2\2\37"+
		"s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'~\3\2\2\2)\u0082\3\2\2\2+\u0085"+
		"\3\2\2\2-\u008a\3\2\2\2/\u008f\3\2\2\2\61\u0092\3\2\2\2\63\u0097\3\2\2"+
		"\2\65\u009d\3\2\2\2\67\u00a1\3\2\2\29\u00a8\3\2\2\2;\u00ae\3\2\2\2=\u00b4"+
		"\3\2\2\2?\u00b8\3\2\2\2A\u00be\3\2\2\2C\u00c0\3\2\2\2E\u00ca\3\2\2\2G"+
		"\u00ce\3\2\2\2I\u00dd\3\2\2\2KL\7v\2\2LM\7t\2\2MN\7w\2\2NO\7g\2\2O\4\3"+
		"\2\2\2PQ\7h\2\2QR\7c\2\2RS\7n\2\2ST\7u\2\2TU\7g\2\2U\6\3\2\2\2VW\t\2\2"+
		"\2W\b\3\2\2\2XY\7\60\2\2Y\n\3\2\2\2Z[\7-\2\2[\f\3\2\2\2\\]\7/\2\2]\16"+
		"\3\2\2\2^_\7c\2\2_`\7p\2\2`a\7f\2\2a\20\3\2\2\2bc\7q\2\2cd\7t\2\2d\22"+
		"\3\2\2\2ef\7?\2\2f\24\3\2\2\2gh\7>\2\2hi\7@\2\2i\26\3\2\2\2jk\7@\2\2k"+
		"\30\3\2\2\2lm\7>\2\2m\32\3\2\2\2no\7>\2\2op\7/\2\2p\34\3\2\2\2qr\7*\2"+
		"\2r\36\3\2\2\2st\7+\2\2t \3\2\2\2uv\7}\2\2v\"\3\2\2\2wx\7\177\2\2x$\3"+
		"\2\2\2yz\7k\2\2z{\7p\2\2{|\7k\2\2|}\7v\2\2}&\3\2\2\2~\177\7g\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7f\2\2\u0081(\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7h\2\2\u0084*\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7k\2\2\u0088\u0089\7h\2\2\u0089,\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e.\3\2\2\2\u008f\u0090"+
		"\7h\2\2\u0090\u0091\7k\2\2\u0091\60\3\2\2\2\u0092\u0093\7t\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7c\2\2\u0095\u0096\7f\2\2\u0096\62\3\2\2\2\u0097\u0098"+
		"\7y\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7g\2\2\u009c\64\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\66\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7i\2\2"+
		"\u00a78\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7q\2"+
		"\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad:\3\2\2\2\u00ae\u00af\7"+
		"d\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7n\2\2\u00b2<"+
		"\3\2\2\2\u00b3\u00b5\5\7\4\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7>\3\2\2\2\u00b8\u00b9\5=\37\2"+
		"\u00b9\u00ba\5\t\5\2\u00ba\u00bb\5=\37\2\u00bb@\3\2\2\2\u00bc\u00bf\5"+
		"\3\2\2\u00bd\u00bf\5\5\3\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"B\3\2\2\2\u00c0\u00c4\7$\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8D\3\2\2\2\u00c9\u00cb"+
		"\t\3\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cdF\3\2\2\2\u00ce\u00d2\7#\2\2\u00cf\u00d1\13\2\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7\17\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\7\f\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b$\2\2\u00dbH\3\2\2\2\u00dc\u00de"+
		"\t\4\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b%\2\2\u00e2J\3\2\2\2\n"+
		"\2\u00b6\u00be\u00c4\u00cc\u00d2\u00d6\u00df\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}