// Generated from E:/source_code/restful-filter-parser/src/main/antlr/RestFilter.g4 by ANTLR 4.13.2

    package org.capybara.restful.filter.filter.paser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RestFilterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, OPERATOR=4, BOOLEAN=5, AND=6, OR=7, NULL=8, STRING=9, 
		NUMBER=10, IDENTIFIER=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "OPERATOR", "BOOLEAN", "AND", "OR", "NULL", "STRING", 
			"NUMBER", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "OPERATOR", "BOOLEAN", "AND", "OR", "NULL", "STRING", 
			"NUMBER", "IDENTIFIER", "WS"
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


	public RestFilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RestFilter.g4"; }

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
		"\u0004\u0000\f\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005R\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006X\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bc\b\b\n\b\f\bf\t\b\u0001\b\u0001\b\u0001\t\u0003\tk"+
		"\b\t\u0001\t\u0004\tn\b\t\u000b\t\f\to\u0001\t\u0001\t\u0004\tt\b\t\u000b"+
		"\t\f\tu\u0003\tx\b\t\u0001\t\u0001\t\u0003\t|\b\t\u0001\t\u0004\t\u007f"+
		"\b\t\u000b\t\f\t\u0080\u0003\t\u0083\b\t\u0001\n\u0001\n\u0005\n\u0087"+
		"\b\n\n\n\f\n\u008a\t\n\u0001\u000b\u0004\u000b\u008d\b\u000b\u000b\u000b"+
		"\f\u000b\u008e\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0010\u0002\u0000EEee\u0002"+
		"\u0000QQqq\u0002\u0000NNnn\u0002\u0000GGgg\u0002\u0000TTtt\u0002\u0000"+
		"LLll\u0002\u0000CCcc\u0002\u0000SSss\u0002\u0000BBbb\u0002\u0000IIii\u0003"+
		"\u0000\n\n\r\r\'\'\u0002\u0000++--\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u00aa\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003"+
		"\u001b\u0001\u0000\u0000\u0000\u0005\u001d\u0001\u0000\u0000\u0000\u0007"+
		"5\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000"+
		"\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000fY\u0001\u0000\u0000\u0000"+
		"\u0011^\u0001\u0000\u0000\u0000\u0013j\u0001\u0000\u0000\u0000\u0015\u0084"+
		"\u0001\u0000\u0000\u0000\u0017\u008c\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005(\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		")\u0000\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005,\u0000"+
		"\u0000\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0007\u0000\u0000\u0000"+
		" 6\u0007\u0001\u0000\u0000!\"\u0007\u0002\u0000\u0000\"6\u0007\u0001\u0000"+
		"\u0000#$\u0007\u0003\u0000\u0000$6\u0007\u0004\u0000\u0000%&\u0007\u0003"+
		"\u0000\u0000&\'\u0007\u0004\u0000\u0000\'6\u0007\u0000\u0000\u0000()\u0007"+
		"\u0005\u0000\u0000)6\u0007\u0004\u0000\u0000*+\u0007\u0005\u0000\u0000"+
		"+,\u0007\u0004\u0000\u0000,6\u0007\u0000\u0000\u0000-.\u0007\u0006\u0000"+
		"\u0000.6\u0007\u0007\u0000\u0000/0\u0007\b\u0000\u000006\u0007\u0003\u0000"+
		"\u000012\u0007\t\u0000\u000026\u0007\u0002\u0000\u000034\u0007\u0002\u0000"+
		"\u000046\u0007\t\u0000\u00005\u001f\u0001\u0000\u0000\u00005!\u0001\u0000"+
		"\u0000\u00005#\u0001\u0000\u0000\u00005%\u0001\u0000\u0000\u00005(\u0001"+
		"\u0000\u0000\u00005*\u0001\u0000\u0000\u00005-\u0001\u0000\u0000\u0000"+
		"5/\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u00006\b\u0001\u0000\u0000\u000078\u0005t\u0000\u000089\u0005r\u0000"+
		"\u00009:\u0005u\u0000\u0000:J\u0005e\u0000\u0000;<\u0005f\u0000\u0000"+
		"<=\u0005a\u0000\u0000=>\u0005l\u0000\u0000>?\u0005s\u0000\u0000?J\u0005"+
		"e\u0000\u0000@A\u0005T\u0000\u0000AB\u0005R\u0000\u0000BC\u0005U\u0000"+
		"\u0000CJ\u0005E\u0000\u0000DE\u0005F\u0000\u0000EF\u0005A\u0000\u0000"+
		"FG\u0005L\u0000\u0000GH\u0005S\u0000\u0000HJ\u0005E\u0000\u0000I7\u0001"+
		"\u0000\u0000\u0000I;\u0001\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000"+
		"ID\u0001\u0000\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005A\u0000\u0000"+
		"LM\u0005N\u0000\u0000MR\u0005D\u0000\u0000NO\u0005a\u0000\u0000OP\u0005"+
		"n\u0000\u0000PR\u0005d\u0000\u0000QK\u0001\u0000\u0000\u0000QN\u0001\u0000"+
		"\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005O\u0000\u0000TX\u0005R"+
		"\u0000\u0000UV\u0005o\u0000\u0000VX\u0005r\u0000\u0000WS\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000X\u000e\u0001\u0000\u0000\u0000YZ\u0005"+
		"n\u0000\u0000Z[\u0005u\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005l\u0000"+
		"\u0000]\u0010\u0001\u0000\u0000\u0000^d\u0005\'\u0000\u0000_c\b\n\u0000"+
		"\u0000`a\u0005\\\u0000\u0000ac\u0005\'\u0000\u0000b_\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gh\u0005\'\u0000\u0000h\u0012\u0001\u0000\u0000\u0000"+
		"ik\u0007\u000b\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000ln\u0007\f\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pw\u0001\u0000\u0000\u0000qs\u0005.\u0000\u0000rt\u0007\f"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wq\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0082\u0001\u0000"+
		"\u0000\u0000y{\u0007\u0000\u0000\u0000z|\u0007\u000b\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}\u007f\u0007\f\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082y\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0014\u0001\u0000\u0000"+
		"\u0000\u0084\u0088\u0007\r\u0000\u0000\u0085\u0087\u0007\u000e\u0000\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u0016\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0007\u000f\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0006\u000b\u0000\u0000\u0091\u0018\u0001\u0000\u0000\u0000"+
		"\u0010\u00005IQWbdjouw{\u0080\u0082\u0088\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}