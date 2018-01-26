// $ANTLR 3.4 src\\calculator.g 2015-06-30 13:49:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class calculatorLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public calculatorLexer() {} 
    public calculatorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public calculatorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src\\calculator.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:2:6: ( '!' )
            // src\\calculator.g:2:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:3:7: ( '!=' )
            // src\\calculator.g:3:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:4:7: ( '#include' )
            // src\\calculator.g:4:9: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:5:7: ( '%' )
            // src\\calculator.g:5:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:6:7: ( '%=' )
            // src\\calculator.g:6:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:7:7: ( '&&' )
            // src\\calculator.g:7:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:8:7: ( '&' )
            // src\\calculator.g:8:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:9:7: ( '&=' )
            // src\\calculator.g:9:9: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:10:7: ( '(' )
            // src\\calculator.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:11:7: ( ')' )
            // src\\calculator.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:12:7: ( '*' )
            // src\\calculator.g:12:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:13:7: ( '*=' )
            // src\\calculator.g:13:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:14:7: ( '+' )
            // src\\calculator.g:14:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:15:7: ( '++' )
            // src\\calculator.g:15:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:16:7: ( '+=' )
            // src\\calculator.g:16:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:17:7: ( ',' )
            // src\\calculator.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:18:7: ( '-' )
            // src\\calculator.g:18:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:19:7: ( '--' )
            // src\\calculator.g:19:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:20:7: ( '-=' )
            // src\\calculator.g:20:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:21:7: ( '.' )
            // src\\calculator.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:22:7: ( '/' )
            // src\\calculator.g:22:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:23:7: ( '/=' )
            // src\\calculator.g:23:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:24:7: ( ':' )
            // src\\calculator.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:25:7: ( ';' )
            // src\\calculator.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:26:7: ( '<' )
            // src\\calculator.g:26:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:27:7: ( '<<' )
            // src\\calculator.g:27:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:28:7: ( '<=' )
            // src\\calculator.g:28:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:29:7: ( '=' )
            // src\\calculator.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:30:7: ( '==' )
            // src\\calculator.g:30:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:31:7: ( '>' )
            // src\\calculator.g:31:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:32:7: ( '>=' )
            // src\\calculator.g:32:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:33:7: ( '>>' )
            // src\\calculator.g:33:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:34:7: ( '[' )
            // src\\calculator.g:34:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:35:7: ( ']' )
            // src\\calculator.g:35:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:36:7: ( '^' )
            // src\\calculator.g:36:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:37:7: ( '^=' )
            // src\\calculator.g:37:9: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:38:7: ( 'break' )
            // src\\calculator.g:38:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:39:7: ( 'case' )
            // src\\calculator.g:39:9: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:40:7: ( 'char' )
            // src\\calculator.g:40:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:41:7: ( 'char*' )
            // src\\calculator.g:41:9: 'char*'
            {
            match("char*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:42:7: ( 'cin' )
            // src\\calculator.g:42:9: 'cin'
            {
            match("cin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:43:7: ( 'cout' )
            // src\\calculator.g:43:9: 'cout'
            {
            match("cout"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:44:7: ( 'default' )
            // src\\calculator.g:44:9: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:45:7: ( 'double' )
            // src\\calculator.g:45:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:46:7: ( 'double*' )
            // src\\calculator.g:46:9: 'double*'
            {
            match("double*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:47:7: ( 'else' )
            // src\\calculator.g:47:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:48:7: ( 'endl' )
            // src\\calculator.g:48:9: 'endl'
            {
            match("endl"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:49:7: ( 'for' )
            // src\\calculator.g:49:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:50:7: ( 'if' )
            // src\\calculator.g:50:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:51:7: ( 'int&' )
            // src\\calculator.g:51:9: 'int&'
            {
            match("int&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:52:7: ( 'int' )
            // src\\calculator.g:52:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:53:7: ( 'int*' )
            // src\\calculator.g:53:9: 'int*'
            {
            match("int*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:54:7: ( 'namespace' )
            // src\\calculator.g:54:9: 'namespace'
            {
            match("namespace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:55:7: ( 'return' )
            // src\\calculator.g:55:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:56:7: ( 'string' )
            // src\\calculator.g:56:9: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:57:7: ( 'switch' )
            // src\\calculator.g:57:9: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:58:7: ( 'using' )
            // src\\calculator.g:58:9: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:59:7: ( 'void' )
            // src\\calculator.g:59:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:60:7: ( 'while' )
            // src\\calculator.g:60:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:61:7: ( '{' )
            // src\\calculator.g:61:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:62:7: ( '||' )
            // src\\calculator.g:62:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:63:7: ( '}' )
            // src\\calculator.g:63:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:563:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src\\calculator.g:563:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src\\calculator.g:563:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src\\calculator.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:566:5: ( ( '-' )? ( '0' .. '9' ) ( '0' .. '9' )* )
            // src\\calculator.g:566:7: ( '-' )? ( '0' .. '9' ) ( '0' .. '9' )*
            {
            // src\\calculator.g:566:7: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // src\\calculator.g:566:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src\\calculator.g:566:21: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src\\calculator.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:569:5: ( '\\'' ( . )* '\\'' )
            // src\\calculator.g:569:7: '\\'' ( . )* '\\''
            {
            match('\''); 

            // src\\calculator.g:569:12: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src\\calculator.g:569:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:573:5: ( '/*' ( . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='*') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='/') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // src\\calculator.g:573:7: '/*' ( . )* '*/'
                    {
                    match("/*"); 



                    // src\\calculator.g:573:12: ( . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src\\calculator.g:573:12: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    }
                    break;
                case 2 :
                    // src\\calculator.g:574:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // src\\calculator.g:574:12: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src\\calculator.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // src\\calculator.g:574:30: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src\\calculator.g:574:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src\\calculator.g:577:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // src\\calculator.g:577:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // src\\calculator.g:577:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src\\calculator.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // src\\calculator.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ID | INT | CHAR | COMMENT | WS )
        int alt10=67;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // src\\calculator.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // src\\calculator.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // src\\calculator.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // src\\calculator.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // src\\calculator.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // src\\calculator.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // src\\calculator.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // src\\calculator.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // src\\calculator.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // src\\calculator.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // src\\calculator.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // src\\calculator.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // src\\calculator.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // src\\calculator.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // src\\calculator.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // src\\calculator.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // src\\calculator.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // src\\calculator.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // src\\calculator.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // src\\calculator.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // src\\calculator.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // src\\calculator.g:1:135: T__30
                {
                mT__30(); 


                }
                break;
            case 23 :
                // src\\calculator.g:1:141: T__31
                {
                mT__31(); 


                }
                break;
            case 24 :
                // src\\calculator.g:1:147: T__32
                {
                mT__32(); 


                }
                break;
            case 25 :
                // src\\calculator.g:1:153: T__33
                {
                mT__33(); 


                }
                break;
            case 26 :
                // src\\calculator.g:1:159: T__34
                {
                mT__34(); 


                }
                break;
            case 27 :
                // src\\calculator.g:1:165: T__35
                {
                mT__35(); 


                }
                break;
            case 28 :
                // src\\calculator.g:1:171: T__36
                {
                mT__36(); 


                }
                break;
            case 29 :
                // src\\calculator.g:1:177: T__37
                {
                mT__37(); 


                }
                break;
            case 30 :
                // src\\calculator.g:1:183: T__38
                {
                mT__38(); 


                }
                break;
            case 31 :
                // src\\calculator.g:1:189: T__39
                {
                mT__39(); 


                }
                break;
            case 32 :
                // src\\calculator.g:1:195: T__40
                {
                mT__40(); 


                }
                break;
            case 33 :
                // src\\calculator.g:1:201: T__41
                {
                mT__41(); 


                }
                break;
            case 34 :
                // src\\calculator.g:1:207: T__42
                {
                mT__42(); 


                }
                break;
            case 35 :
                // src\\calculator.g:1:213: T__43
                {
                mT__43(); 


                }
                break;
            case 36 :
                // src\\calculator.g:1:219: T__44
                {
                mT__44(); 


                }
                break;
            case 37 :
                // src\\calculator.g:1:225: T__45
                {
                mT__45(); 


                }
                break;
            case 38 :
                // src\\calculator.g:1:231: T__46
                {
                mT__46(); 


                }
                break;
            case 39 :
                // src\\calculator.g:1:237: T__47
                {
                mT__47(); 


                }
                break;
            case 40 :
                // src\\calculator.g:1:243: T__48
                {
                mT__48(); 


                }
                break;
            case 41 :
                // src\\calculator.g:1:249: T__49
                {
                mT__49(); 


                }
                break;
            case 42 :
                // src\\calculator.g:1:255: T__50
                {
                mT__50(); 


                }
                break;
            case 43 :
                // src\\calculator.g:1:261: T__51
                {
                mT__51(); 


                }
                break;
            case 44 :
                // src\\calculator.g:1:267: T__52
                {
                mT__52(); 


                }
                break;
            case 45 :
                // src\\calculator.g:1:273: T__53
                {
                mT__53(); 


                }
                break;
            case 46 :
                // src\\calculator.g:1:279: T__54
                {
                mT__54(); 


                }
                break;
            case 47 :
                // src\\calculator.g:1:285: T__55
                {
                mT__55(); 


                }
                break;
            case 48 :
                // src\\calculator.g:1:291: T__56
                {
                mT__56(); 


                }
                break;
            case 49 :
                // src\\calculator.g:1:297: T__57
                {
                mT__57(); 


                }
                break;
            case 50 :
                // src\\calculator.g:1:303: T__58
                {
                mT__58(); 


                }
                break;
            case 51 :
                // src\\calculator.g:1:309: T__59
                {
                mT__59(); 


                }
                break;
            case 52 :
                // src\\calculator.g:1:315: T__60
                {
                mT__60(); 


                }
                break;
            case 53 :
                // src\\calculator.g:1:321: T__61
                {
                mT__61(); 


                }
                break;
            case 54 :
                // src\\calculator.g:1:327: T__62
                {
                mT__62(); 


                }
                break;
            case 55 :
                // src\\calculator.g:1:333: T__63
                {
                mT__63(); 


                }
                break;
            case 56 :
                // src\\calculator.g:1:339: T__64
                {
                mT__64(); 


                }
                break;
            case 57 :
                // src\\calculator.g:1:345: T__65
                {
                mT__65(); 


                }
                break;
            case 58 :
                // src\\calculator.g:1:351: T__66
                {
                mT__66(); 


                }
                break;
            case 59 :
                // src\\calculator.g:1:357: T__67
                {
                mT__67(); 


                }
                break;
            case 60 :
                // src\\calculator.g:1:363: T__68
                {
                mT__68(); 


                }
                break;
            case 61 :
                // src\\calculator.g:1:369: T__69
                {
                mT__69(); 


                }
                break;
            case 62 :
                // src\\calculator.g:1:375: T__70
                {
                mT__70(); 


                }
                break;
            case 63 :
                // src\\calculator.g:1:381: ID
                {
                mID(); 


                }
                break;
            case 64 :
                // src\\calculator.g:1:384: INT
                {
                mINT(); 


                }
                break;
            case 65 :
                // src\\calculator.g:1:388: CHAR
                {
                mCHAR(); 


                }
                break;
            case 66 :
                // src\\calculator.g:1:393: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 67 :
                // src\\calculator.g:1:401: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\51\1\uffff\1\53\1\56\2\uffff\1\60\1\63\1\uffff\1\66\1"+
        "\uffff\1\71\2\uffff\1\74\1\76\1\101\2\uffff\1\103\14\44\43\uffff"+
        "\12\44\1\141\13\44\1\155\5\44\1\163\1\uffff\1\166\10\44\1\177\1"+
        "\u0081\1\uffff\1\u0082\2\44\1\u0085\1\u0086\4\uffff\5\44\1\u008c"+
        "\1\44\1\u008e\4\uffff\2\44\2\uffff\4\44\1\u0095\1\uffff\1\u0096"+
        "\1\uffff\1\44\1\u0099\1\44\1\u009b\1\u009c\1\u009d\2\uffff\1\u009e"+
        "\2\uffff\1\44\4\uffff\1\44\1\u00a1\1\uffff";
    static final String DFA10_eofS =
        "\u00a2\uffff";
    static final String DFA10_minS =
        "\1\11\1\75\1\uffff\1\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\uffff"+
        "\1\52\2\uffff\1\74\2\75\2\uffff\1\75\1\162\1\141\1\145\1\154\1\157"+
        "\1\146\1\141\1\145\1\164\1\163\1\157\1\150\43\uffff\1\145\1\163"+
        "\1\141\1\156\1\165\1\146\1\165\1\163\1\144\1\162\1\60\1\164\1\155"+
        "\1\164\1\162\4\151\1\141\1\145\1\162\1\60\1\164\1\141\1\142\1\145"+
        "\1\154\1\60\1\uffff\1\46\1\145\1\165\1\151\1\164\1\156\1\144\1\154"+
        "\1\153\1\60\1\52\1\uffff\1\60\1\165\1\154\2\60\4\uffff\1\163\1\162"+
        "\1\156\1\143\1\147\1\60\1\145\1\60\4\uffff\1\154\1\145\2\uffff\1"+
        "\160\1\156\1\147\1\150\1\60\1\uffff\1\60\1\uffff\1\164\1\52\1\141"+
        "\3\60\2\uffff\1\60\2\uffff\1\143\4\uffff\1\145\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\1\75\1\uffff\2\75\2\uffff\2\75\1\uffff\1\75\1\uffff\1\75"+
        "\2\uffff\2\75\1\76\2\uffff\1\75\1\162\2\157\1\156\1\157\1\156\1"+
        "\141\1\145\1\167\1\163\1\157\1\150\43\uffff\1\145\1\163\1\141\1"+
        "\156\1\165\1\146\1\165\1\163\1\144\1\162\1\172\1\164\1\155\1\164"+
        "\1\162\4\151\1\141\1\145\1\162\1\172\1\164\1\141\1\142\1\145\1\154"+
        "\1\172\1\uffff\1\172\1\145\1\165\1\151\1\164\1\156\1\144\1\154\1"+
        "\153\2\172\1\uffff\1\172\1\165\1\154\2\172\4\uffff\1\163\1\162\1"+
        "\156\1\143\1\147\1\172\1\145\1\172\4\uffff\1\154\1\145\2\uffff\1"+
        "\160\1\156\1\147\1\150\1\172\1\uffff\1\172\1\uffff\1\164\1\172\1"+
        "\141\3\172\2\uffff\1\172\2\uffff\1\143\4\uffff\1\145\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\3\2\uffff\1\11\1\12\2\uffff\1\20\1\uffff\1\24\1\uffff"+
        "\1\27\1\30\3\uffff\1\41\1\42\15\uffff\1\74\1\75\1\76\1\77\1\100"+
        "\1\101\1\103\1\2\1\1\1\5\1\4\1\6\1\10\1\7\1\14\1\13\1\16\1\17\1"+
        "\15\1\22\1\23\1\21\1\26\1\102\1\25\1\32\1\33\1\31\1\35\1\34\1\37"+
        "\1\40\1\36\1\44\1\43\35\uffff\1\61\13\uffff\1\51\5\uffff\1\60\1"+
        "\62\1\64\1\63\10\uffff\1\46\1\50\1\47\1\52\2\uffff\1\56\1\57\5\uffff"+
        "\1\72\1\uffff\1\45\6\uffff\1\71\1\73\1\uffff\1\55\1\54\1\uffff\1"+
        "\66\1\67\1\70\1\53\2\uffff\1\65";
    static final String DFA10_specialS =
        "\u00a2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\1\1\uffff\1\2\1\uffff\1\3"+
            "\1\4\1\46\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\12\45\1\15\1"+
            "\16\1\17\1\20\1\21\2\uffff\32\44\1\22\1\uffff\1\23\1\24\1\44"+
            "\1\uffff\1\44\1\25\1\26\1\27\1\30\1\31\2\44\1\32\4\44\1\33\3"+
            "\44\1\34\1\35\1\44\1\36\1\37\1\40\3\44\1\41\1\42\1\43",
            "\1\50",
            "",
            "\1\52",
            "\1\54\26\uffff\1\55",
            "",
            "",
            "\1\57",
            "\1\61\21\uffff\1\62",
            "",
            "\1\64\2\uffff\12\45\3\uffff\1\65",
            "",
            "\1\70\4\uffff\1\70\15\uffff\1\67",
            "",
            "",
            "\1\72\1\73",
            "\1\75",
            "\1\77\1\100",
            "",
            "",
            "\1\102",
            "\1\104",
            "\1\105\6\uffff\1\106\1\107\5\uffff\1\110",
            "\1\111\11\uffff\1\112",
            "\1\113\1\uffff\1\114",
            "\1\115",
            "\1\116\7\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122\2\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\164\3\uffff\1\165\5\uffff\12\44\7\uffff\32\44\4\uffff\1"+
            "\44\1\uffff\32\44",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0080\5\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0083",
            "\1\u0084",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0097",
            "\1\u0098\5\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "\1\u009a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u009f",
            "",
            "",
            "",
            "",
            "\1\u00a0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | ID | INT | CHAR | COMMENT | WS );";
        }
    }
 

}