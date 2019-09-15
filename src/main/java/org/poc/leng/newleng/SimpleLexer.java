// Generated from Simple.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, AND=3, OR=4, EQUAL=5, NQUAL=6, GT=7, ASSIGN=8, LPAR=9, 
		RPAR=10, LBRACE=11, RBRACE=12, BEGIN_RW=13, END_RW=14, IF_RW=15, ELIF_RW=16, 
		ELSE_RW=17, ENDIF_RW=18, READ_RW=19, WRITE_RW=20, INTEGER_RW=21, STRING_RW=22, 
		REAL_RW=23, BOOLEAN_RW=24, NUMBER=25, FLOAT=26, BOOLEAN=27, STRING=28, 
		ID=29, COMMENT=30, WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"TRUE", "FALSE", "NAT", "DOT", "PLUS", "MINUS", "AND", "OR", "EQUAL", 
		"NQUAL", "GT", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "BEGIN_RW", 
		"END_RW", "IF_RW", "ELIF_RW", "ELSE_RW", "ENDIF_RW", "READ_RW", "WRITE_RW", 
		"INTEGER_RW", "STRING_RW", "REAL_RW", "BOOLEAN_RW", "NUMBER", "FLOAT", 
		"BOOLEAN", "STRING", "ID", "COMMENT", "WS"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\6\36\u00ba\n\36\r\36\16\36\u00bb\3\37\3\37\3\37\3\37\3 \3 \5 \u00c4\n"+
		" \3!\3!\7!\u00c8\n!\f!\16!\u00cb\13!\3!\3!\3\"\6\"\u00d0\n\"\r\"\16\""+
		"\u00d1\3#\3#\7#\u00d6\n#\f#\16#\u00d9\13#\3#\5#\u00dc\n#\3#\3#\3#\3#\3"+
		"$\6$\u00e3\n$\r$\16$\u00e4\3$\3$\4\u00c9\u00d7\2%\3\2\5\2\7\2\t\2\13\3"+
		"\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22"+
		"+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!\3\2\5"+
		"\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00ea\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I"+
		"\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3"+
		"\2\2\2\21Y\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33"+
		"f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2\2\2%u\3\2\2\2\'y\3\2"+
		"\2\2)|\3\2\2\2+\u0084\3\2\2\2-\u0089\3\2\2\2/\u0090\3\2\2\2\61\u0095\3"+
		"\2\2\2\63\u009e\3\2\2\2\65\u00a5\3\2\2\2\67\u00ac\3\2\2\29\u00b1\3\2\2"+
		"\2;\u00b9\3\2\2\2=\u00bd\3\2\2\2?\u00c3\3\2\2\2A\u00c5\3\2\2\2C\u00cf"+
		"\3\2\2\2E\u00d3\3\2\2\2G\u00e2\3\2\2\2IJ\7x\2\2J\4\3\2\2\2KL\7h\2\2L\6"+
		"\3\2\2\2MN\t\2\2\2N\b\3\2\2\2OP\7\60\2\2P\n\3\2\2\2QR\7-\2\2R\f\3\2\2"+
		"\2ST\7/\2\2T\16\3\2\2\2UV\7c\2\2VW\7p\2\2WX\7f\2\2X\20\3\2\2\2YZ\7q\2"+
		"\2Z[\7t\2\2[\22\3\2\2\2\\]\7?\2\2]\24\3\2\2\2^_\7>\2\2_`\7@\2\2`\26\3"+
		"\2\2\2ab\7@\2\2b\30\3\2\2\2cd\7>\2\2de\7/\2\2e\32\3\2\2\2fg\7*\2\2g\34"+
		"\3\2\2\2hi\7+\2\2i\36\3\2\2\2jk\7}\2\2k \3\2\2\2lm\7\177\2\2m\"\3\2\2"+
		"\2no\7k\2\2op\7p\2\2pq\7k\2\2qr\7e\2\2rs\7k\2\2st\7q\2\2t$\3\2\2\2uv\7"+
		"h\2\2vw\7k\2\2wx\7p\2\2x&\3\2\2\2yz\7u\2\2z{\7k\2\2{(\3\2\2\2|}\7u\2\2"+
		"}~\7k\2\2~\177\7p\2\2\177\u0080\7q\2\2\u0080\u0081\7a\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u0083\7k\2\2\u0083*\3\2\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7q\2\2\u0088,\3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7a\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7k\2\2\u008f.\3\2\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7g\2\2\u0093\u0094\7t\2\2\u0094\60\3\2\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7u\2\2\u0097\u0098\7e\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7k\2\2\u009a\u009b\7d\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7t\2\2\u009d\62\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\64\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7f\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7c\2\2\u00ab\66\3\2\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7n\2\2"+
		"\u00b08\3\2\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7i\2"+
		"\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7q\2\2\u00b7:\3\2"+
		"\2\2\u00b8\u00ba\5\7\4\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc<\3\2\2\2\u00bd\u00be\5;\36\2"+
		"\u00be\u00bf\5\t\5\2\u00bf\u00c0\5;\36\2\u00c0>\3\2\2\2\u00c1\u00c4\5"+
		"\3\2\2\u00c2\u00c4\5\5\3\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"@\3\2\2\2\u00c5\u00c9\7$\2\2\u00c6\u00c8\13\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7$\2\2\u00cdB\3\2\2\2\u00ce\u00d0"+
		"\t\3\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2D\3\2\2\2\u00d3\u00d7\7#\2\2\u00d4\u00d6\13\2\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\7\17\2\2"+
		"\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\7\f\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b#\2\2\u00e0F\3\2\2\2\u00e1\u00e3"+
		"\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b$\2\2\u00e7H\3\2\2\2\n"+
		"\2\u00bb\u00c3\u00c9\u00d1\u00d7\u00db\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}