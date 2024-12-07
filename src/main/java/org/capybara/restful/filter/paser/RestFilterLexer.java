// Generated from E:/source_code/restful-filter-parser/src/main/antlr/RestFilter.g4 by ANTLR 4.13.2

    package org.capybara.restful.filter.paser;

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
		T__0=1, T__1=2, OPERATOR=3, BOOLEAN=4, AND=5, OR=6, NULL=7, STRING=8, 
		NUMBER=9, IDENTIFIER=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "OPERATOR", "BOOLEAN", "AND", "OR", "NULL", "STRING", 
			"NUMBER", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "OPERATOR", "BOOLEAN", "AND", "OR", "NULL", "STRING", 
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
		"\u0004\u0000\u000b\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003B\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007[\b\u0007\n\u0007\f\u0007^\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0003\bc\b\b\u0001\b\u0004\bf\b\b\u000b\b\f\bg\u0001\b"+
		"\u0001\b\u0004\bl\b\b\u000b\b\f\bm\u0003\bp\b\b\u0001\b\u0001\b\u0003"+
		"\bt\b\b\u0001\b\u0004\bw\b\b\u000b\b\f\bx\u0003\b{\b\b\u0001\t\u0001\t"+
		"\u0005\t\u007f\b\t\n\t\f\t\u0082\t\t\u0001\n\u0004\n\u0085\b\n\u000b\n"+
		"\f\n\u0086\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0001\u0000\u000f\u0002\u0000EEee\u0002\u0000QQqq\u0002\u0000"+
		"NNnn\u0002\u0000GGgg\u0002\u0000TTtt\u0002\u0000LLll\u0002\u0000CCcc\u0002"+
		"\u0000SSss\u0002\u0000BBbb\u0003\u0000\n\n\r\r\'\'\u0002\u0000++--\u0001"+
		"\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00a0"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019"+
		"\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007A\u0001\u0000"+
		"\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000"+
		"\rQ\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011b\u0001"+
		"\u0000\u0000\u0000\u0013|\u0001\u0000\u0000\u0000\u0015\u0084\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0005(\u0000\u0000\u0018\u0002\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005)\u0000\u0000\u001a\u0004\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0007\u0000\u0000\u0000\u001c.\u0007\u0001\u0000\u0000\u001d"+
		"\u001e\u0007\u0002\u0000\u0000\u001e.\u0007\u0001\u0000\u0000\u001f \u0007"+
		"\u0003\u0000\u0000 .\u0007\u0004\u0000\u0000!\"\u0007\u0003\u0000\u0000"+
		"\"#\u0007\u0004\u0000\u0000#.\u0007\u0000\u0000\u0000$%\u0007\u0005\u0000"+
		"\u0000%.\u0007\u0004\u0000\u0000&\'\u0007\u0005\u0000\u0000\'(\u0007\u0004"+
		"\u0000\u0000(.\u0007\u0000\u0000\u0000)*\u0007\u0006\u0000\u0000*.\u0007"+
		"\u0007\u0000\u0000+,\u0007\b\u0000\u0000,.\u0007\u0003\u0000\u0000-\u001b"+
		"\u0001\u0000\u0000\u0000-\u001d\u0001\u0000\u0000\u0000-\u001f\u0001\u0000"+
		"\u0000\u0000-!\u0001\u0000\u0000\u0000-$\u0001\u0000\u0000\u0000-&\u0001"+
		"\u0000\u0000\u0000-)\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		".\u0006\u0001\u0000\u0000\u0000/0\u0005t\u0000\u000001\u0005r\u0000\u0000"+
		"12\u0005u\u0000\u00002B\u0005e\u0000\u000034\u0005f\u0000\u000045\u0005"+
		"a\u0000\u000056\u0005l\u0000\u000067\u0005s\u0000\u00007B\u0005e\u0000"+
		"\u000089\u0005T\u0000\u00009:\u0005R\u0000\u0000:;\u0005U\u0000\u0000"+
		";B\u0005E\u0000\u0000<=\u0005F\u0000\u0000=>\u0005A\u0000\u0000>?\u0005"+
		"L\u0000\u0000?@\u0005S\u0000\u0000@B\u0005E\u0000\u0000A/\u0001\u0000"+
		"\u0000\u0000A3\u0001\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000A<\u0001"+
		"\u0000\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005A\u0000\u0000DE\u0005"+
		"N\u0000\u0000EJ\u0005D\u0000\u0000FG\u0005a\u0000\u0000GH\u0005n\u0000"+
		"\u0000HJ\u0005d\u0000\u0000IC\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000"+
		"\u0000J\n\u0001\u0000\u0000\u0000KL\u0005O\u0000\u0000LP\u0005R\u0000"+
		"\u0000MN\u0005o\u0000\u0000NP\u0005r\u0000\u0000OK\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005n\u0000\u0000"+
		"RS\u0005u\u0000\u0000ST\u0005l\u0000\u0000TU\u0005l\u0000\u0000U\u000e"+
		"\u0001\u0000\u0000\u0000V\\\u0005\'\u0000\u0000W[\b\t\u0000\u0000XY\u0005"+
		"\\\u0000\u0000Y[\u0005\'\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_`\u0005\'\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ac\u0007\n"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000df\u0007\u000b\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000ho\u0001\u0000\u0000\u0000ik\u0005.\u0000\u0000jl\u0007\u000b\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oi\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pz\u0001\u0000\u0000\u0000"+
		"qs\u0007\u0000\u0000\u0000rt\u0007\n\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000uw\u0007\u000b\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zq\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0012\u0001\u0000\u0000"+
		"\u0000|\u0080\u0007\f\u0000\u0000}\u007f\u0007\r\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0014\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085\u0007\u000e\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0006\n\u0000\u0000"+
		"\u0089\u0016\u0001\u0000\u0000\u0000\u0010\u0000-AIOZ\\bgmosxz\u0080\u0086"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}