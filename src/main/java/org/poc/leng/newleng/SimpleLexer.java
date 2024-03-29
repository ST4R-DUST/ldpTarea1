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
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, DOT=5, AND=6, OR=7, EQUAL=8, NQUAL=9, 
		GT=10, LT=11, ASSIGN=12, LPAR=13, RPAR=14, LBRACE=15, RBRACE=16, INIT=17, 
		END=18, IF=19, ELIF=20, ELSE=21, ENDIF=22, WHILE=23, READ=24, WRITE=25, 
		INT_V=26, FLOAT_V=27, BOOLEAN_V=28, NUMBER=29, FLOAT=30, BOOLEAN=31, STRING=32, 
		VARID=33, COMMENT=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TRUE", "FALSE", "NAT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "DOT", 
		"AND", "OR", "EQUAL", "NQUAL", "GT", "LT", "ASSIGN", "LPAR", "RPAR", "LBRACE", 
		"RBRACE", "INIT", "END", "IF", "ELIF", "ELSE", "ENDIF", "WHILE", "READ", 
		"WRITE", "INT_V", "FLOAT_V", "BOOLEAN_V", "NUMBER", "FLOAT", "BOOLEAN", 
		"STRING", "VARID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'.'", "' && '", "' || '", "'='", "'<>'", 
		"'>'", "'<'", "'<-'", "'('", "')'", "'{'", "'}'", "'init'", "'end'", "'if'", 
		"'elif'", "'else'", "'fi'", "'while'", "'read'", "'write'", "'int'", "'float'", 
		"'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "DOT", "AND", "OR", "EQUAL", 
		"NQUAL", "GT", "LT", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "INIT", 
		"END", "IF", "ELIF", "ELSE", "ENDIF", "WHILE", "READ", "WRITE", "INT_V", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\6!\u00bf"+
		"\n!\r!\16!\u00c0\3\"\3\"\3\"\3\"\3#\3#\5#\u00c9\n#\3$\3$\7$\u00cd\n$\f"+
		"$\16$\u00d0\13$\3$\3$\3%\6%\u00d5\n%\r%\16%\u00d6\3&\3&\7&\u00db\n&\f"+
		"&\16&\u00de\13&\3&\5&\u00e1\n&\3&\3&\3&\3&\3\'\6\'\u00e8\n\'\r\'\16\'"+
		"\u00e9\3\'\3\'\4\u00ce\u00dc\2(\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23"+
		"\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61"+
		"\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%\3\2\5\3\2\62;\4"+
		"\2C\\c|\5\2\13\f\17\17\"\"\u00f0\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5T\3\2\2\2\7Z\3\2\2\2\t\\\3"+
		"\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23f\3\2\2\2\25k"+
		"\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!"+
		"|\3\2\2\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0082\3\2\2\2)\u0084\3\2\2\2+\u0089"+
		"\3\2\2\2-\u008d\3\2\2\2/\u0090\3\2\2\2\61\u0095\3\2\2\2\63\u009a\3\2\2"+
		"\2\65\u009d\3\2\2\2\67\u00a3\3\2\2\29\u00a8\3\2\2\2;\u00ae\3\2\2\2=\u00b2"+
		"\3\2\2\2?\u00b8\3\2\2\2A\u00be\3\2\2\2C\u00c2\3\2\2\2E\u00c8\3\2\2\2G"+
		"\u00ca\3\2\2\2I\u00d4\3\2\2\2K\u00d8\3\2\2\2M\u00e7\3\2\2\2OP\7v\2\2P"+
		"Q\7t\2\2QR\7w\2\2RS\7g\2\2S\4\3\2\2\2TU\7h\2\2UV\7c\2\2VW\7n\2\2WX\7u"+
		"\2\2XY\7g\2\2Y\6\3\2\2\2Z[\t\2\2\2[\b\3\2\2\2\\]\7-\2\2]\n\3\2\2\2^_\7"+
		"/\2\2_\f\3\2\2\2`a\7,\2\2a\16\3\2\2\2bc\7\61\2\2c\20\3\2\2\2de\7\60\2"+
		"\2e\22\3\2\2\2fg\7\"\2\2gh\7(\2\2hi\7(\2\2ij\7\"\2\2j\24\3\2\2\2kl\7\""+
		"\2\2lm\7~\2\2mn\7~\2\2no\7\"\2\2o\26\3\2\2\2pq\7?\2\2q\30\3\2\2\2rs\7"+
		">\2\2st\7@\2\2t\32\3\2\2\2uv\7@\2\2v\34\3\2\2\2wx\7>\2\2x\36\3\2\2\2y"+
		"z\7>\2\2z{\7/\2\2{ \3\2\2\2|}\7*\2\2}\"\3\2\2\2~\177\7+\2\2\177$\3\2\2"+
		"\2\u0080\u0081\7}\2\2\u0081&\3\2\2\2\u0082\u0083\7\177\2\2\u0083(\3\2"+
		"\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7k\2\2\u0087\u0088"+
		"\7v\2\2\u0088*\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c"+
		"\7f\2\2\u008c,\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7h\2\2\u008f.\3"+
		"\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7h\2\2\u0094\60\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\62\3\2\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7k\2\2\u009c\64\3\2\2\2\u009d\u009e\7y\2\2\u009e\u009f\7j\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\66\3\2\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2"+
		"\u00a78\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2"+
		"\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7g\2\2\u00ad:\3\2\2\2\u00ae\u00af\7"+
		"k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1<\3\2\2\2\u00b2\u00b3"+
		"\7h\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7>\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7q\2\2\u00bb\u00bc\7n\2\2\u00bc@\3\2\2\2\u00bd\u00bf\5\7\4\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1B\3\2\2\2\u00c2\u00c3\5A!\2\u00c3\u00c4\5\21\t\2\u00c4\u00c5"+
		"\5A!\2\u00c5D\3\2\2\2\u00c6\u00c9\5\3\2\2\u00c7\u00c9\5\5\3\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9F\3\2\2\2\u00ca\u00ce\7$\2\2\u00cb\u00cd"+
		"\13\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\7$\2\2\u00d2H\3\2\2\2\u00d3\u00d5\t\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7J\3\2\2\2\u00d8"+
		"\u00dc\7#\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e1\7\17\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b&\2\2\u00e5L\3\2\2\2\u00e6\u00e8\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\b\'\2\2\u00ecN\3\2\2\2\n\2\u00c0\u00c8\u00ce\u00d6\u00dc"+
		"\u00e0\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}