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
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, AND=5, OR=6, EQUAL=7, NQUAL=8, 
		GT=9, LT=10, ASSIGN=11, LPAR=12, RPAR=13, LBRACE=14, RBRACE=15, INIT=16, 
		END=17, IF=18, ELIF=19, ELSE=20, ENDIF=21, WHILE=22, READ=23, WRITE=24, 
		INT_V=25, STRING_V=26, FLOAT_V=27, BOOLEAN_V=28, NUMBER=29, FLOAT=30, 
		BOOLEAN=31, STRING=32, VARID=33, COMMENT=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TRUE", "FALSE", "NAT", "DOT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
		"AND", "OR", "EQUAL", "NQUAL", "GT", "LT", "ASSIGN", "LPAR", "RPAR", "LBRACE", 
		"RBRACE", "INIT", "END", "IF", "ELIF", "ELSE", "ENDIF", "WHILE", "READ", 
		"WRITE", "INT_V", "STRING_V", "FLOAT_V", "BOOLEAN_V", "NUMBER", "FLOAT", 
		"BOOLEAN", "STRING", "VARID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'='", "'!='", "'>'", 
		"'<'", "'<-'", "'('", "')'", "'{'", "'}'", "'init'", "'end'", "'if'", 
		"'elif'", "'else'", "'fi'", "'while'", "'read'", "'write'", "'int'", "'string'", 
		"'float'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "AND", "OR", "EQUAL", "NQUAL", 
		"GT", "LT", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "INIT", "END", 
		"IF", "ELIF", "ELSE", "ENDIF", "WHILE", "READ", "WRITE", "INT_V", "STRING_V", 
		"FLOAT_V", "BOOLEAN_V", "NUMBER", "FLOAT", "BOOLEAN", "STRING", "VARID", 
		"COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\6\"\u00c5\n\"\r\"\16\"\u00c6\3#\3#\3#\3#\3$\3$\5$\u00cf\n"+
		"$\3%\3%\7%\u00d3\n%\f%\16%\u00d6\13%\3%\3%\3&\6&\u00db\n&\r&\16&\u00dc"+
		"\3\'\3\'\7\'\u00e1\n\'\f\'\16\'\u00e4\13\'\3\'\5\'\u00e7\n\'\3\'\3\'\3"+
		"\'\3\'\3(\6(\u00ee\n(\r(\16(\u00ef\3(\3(\4\u00d4\u00e2\2)\3\2\5\2\7\2"+
		"\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20"+
		"\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37"+
		"E G!I\"K#M$O%\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00f5\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5"+
		"V\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\rb\3\2\2\2\17d\3\2\2\2\21"+
		"f\3\2\2\2\23h\3\2\2\2\25l\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33t\3\2\2\2"+
		"\35v\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081\3\2"+
		"\2\2)\u0083\3\2\2\2+\u0088\3\2\2\2-\u008c\3\2\2\2/\u008f\3\2\2\2\61\u0094"+
		"\3\2\2\2\63\u0099\3\2\2\2\65\u009c\3\2\2\2\67\u00a2\3\2\2\29\u00a7\3\2"+
		"\2\2;\u00ad\3\2\2\2=\u00b1\3\2\2\2?\u00b8\3\2\2\2A\u00be\3\2\2\2C\u00c4"+
		"\3\2\2\2E\u00c8\3\2\2\2G\u00ce\3\2\2\2I\u00d0\3\2\2\2K\u00da\3\2\2\2M"+
		"\u00de\3\2\2\2O\u00ed\3\2\2\2QR\7v\2\2RS\7t\2\2ST\7w\2\2TU\7g\2\2U\4\3"+
		"\2\2\2VW\7h\2\2WX\7c\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\6\3\2\2\2\\]\t\2"+
		"\2\2]\b\3\2\2\2^_\7\60\2\2_\n\3\2\2\2`a\7-\2\2a\f\3\2\2\2bc\7/\2\2c\16"+
		"\3\2\2\2de\7,\2\2e\20\3\2\2\2fg\7\61\2\2g\22\3\2\2\2hi\7c\2\2ij\7p\2\2"+
		"jk\7f\2\2k\24\3\2\2\2lm\7q\2\2mn\7t\2\2n\26\3\2\2\2op\7?\2\2p\30\3\2\2"+
		"\2qr\7#\2\2rs\7?\2\2s\32\3\2\2\2tu\7@\2\2u\34\3\2\2\2vw\7>\2\2w\36\3\2"+
		"\2\2xy\7>\2\2yz\7/\2\2z \3\2\2\2{|\7*\2\2|\"\3\2\2\2}~\7+\2\2~$\3\2\2"+
		"\2\177\u0080\7}\2\2\u0080&\3\2\2\2\u0081\u0082\7\177\2\2\u0082(\3\2\2"+
		"\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7k\2\2\u0086\u0087"+
		"\7v\2\2\u0087*\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a\u008b"+
		"\7f\2\2\u008b,\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7h\2\2\u008e.\3"+
		"\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7h\2\2\u0093\60\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\62\3\2\2\2\u0099\u009a\7h\2\2\u009a"+
		"\u009b\7k\2\2\u009b\64\3\2\2\2\u009c\u009d\7y\2\2\u009d\u009e\7j\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\66\3\2\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7f\2\2"+
		"\u00a68\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2"+
		"\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7"+
		"k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0<\3\2\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\u00b7\7i\2\2\u00b7>\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9"+
		"\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd@\3\2\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7q\2"+
		"\2\u00c1\u00c2\7n\2\2\u00c2B\3\2\2\2\u00c3\u00c5\5\7\4\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"D\3\2\2\2\u00c8\u00c9\5C\"\2\u00c9\u00ca\5\t\5\2\u00ca\u00cb\5C\"\2\u00cb"+
		"F\3\2\2\2\u00cc\u00cf\5\3\2\2\u00cd\u00cf\5\5\3\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00cfH\3\2\2\2\u00d0\u00d4\7$\2\2\u00d1\u00d3\13"+
		"\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7$"+
		"\2\2\u00d8J\3\2\2\2\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddL\3\2\2\2\u00de"+
		"\u00e2\7#\2\2\u00df\u00e1\13\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e7\7\17\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\b\'\2\2\u00ebN\3\2\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\b(\2\2\u00f2P\3\2\2\2\n\2\u00c6\u00ce\u00d4\u00dc"+
		"\u00e2\u00e6\u00ef\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}