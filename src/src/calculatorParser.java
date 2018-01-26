// $ANTLR 3.4 src\\calculator.g 2015-06-30 13:49:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class calculatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ID", "INT", "WS", "'!'", "'!='", "'#include'", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'['", "']'", "'^'", "'^='", "'break'", "'case'", "'char'", "'char*'", "'cin'", "'cout'", "'default'", "'double'", "'double*'", "'else'", "'endl'", "'for'", "'if'", "'int&'", "'int'", "'int*'", "'namespace'", "'return'", "'string'", "'switch'", "'using'", "'void'", "'while'", "'{'", "'||'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public calculatorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public calculatorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return calculatorParser.tokenNames; }
    public String getGrammarFileName() { return "src\\calculator.g"; }



    // $ANTLR start "program"
    // src\\calculator.g:3:1: program : statements[0] ;
    public final void program() throws RecognitionException {
        String statements1 =null;


        try {
            // src\\calculator.g:4:2: ( statements[0] )
            // src\\calculator.g:4:4: statements[0]
            {
            pushFollow(FOLLOW_statements_in_program11);
            statements1=statements(0);

            state._fsp--;


            System.out.println(statements1);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "statements"
    // src\\calculator.g:8:1: statements[int tab] returns [String value] : ( statement[$tab] a= statements[$tab] |);
    public final String statements(int tab) throws RecognitionException {
        String value = null;


        String a =null;

        String statement2 =null;



        	value = null;

        try {
            // src\\calculator.g:12:2: ( statement[$tab] a= statements[$tab] |)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==COMMENT||LA1_0==11||(LA1_0 >= 47 && LA1_0 <= 48)||(LA1_0 >= 52 && LA1_0 <= 53)||(LA1_0 >= 58 && LA1_0 <= 60)||LA1_0==63||(LA1_0 >= 65 && LA1_0 <= 66)) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // src\\calculator.g:12:5: statement[$tab] a= statements[$tab]
                    {
                    pushFollow(FOLLOW_statement_in_statements38);
                    statement2=statement(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_statements_in_statements43);
                    a=statements(tab);

                    state._fsp--;


                    value = statement2 + a;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:14:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "statements"



    // $ANTLR start "statement"
    // src\\calculator.g:17:1: statement[int tab] returns [String value] : ( type[$tab] func_or_var[$tab] | '#include' '<' ID '>' | 'using' 'namespace' ID ';' | COMMENT );
    public final String statement(int tab) throws RecognitionException {
        String value = null;


        Token COMMENT4=null;
        String func_or_var3 =null;



        	value = null;

        try {
            // src\\calculator.g:21:2: ( type[$tab] func_or_var[$tab] | '#include' '<' ID '>' | 'using' 'namespace' ID ';' | COMMENT )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
            case 52:
            case 53:
            case 58:
            case 59:
            case 60:
            case 63:
            case 66:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 65:
                {
                alt2=3;
                }
                break;
            case COMMENT:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // src\\calculator.g:21:4: type[$tab] func_or_var[$tab]
                    {
                    pushFollow(FOLLOW_type_in_statement75);
                    type(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_func_or_var_in_statement78);
                    func_or_var3=func_or_var(tab);

                    state._fsp--;


                    value = func_or_var3 + "\n";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:23:4: '#include' '<' ID '>'
                    {
                    match(input,11,FOLLOW_11_in_statement88); 

                    match(input,33,FOLLOW_33_in_statement90); 

                    match(input,ID,FOLLOW_ID_in_statement92); 

                    match(input,38,FOLLOW_38_in_statement94); 

                    value = "";

                    }
                    break;
                case 3 :
                    // src\\calculator.g:25:4: 'using' 'namespace' ID ';'
                    {
                    match(input,65,FOLLOW_65_in_statement103); 

                    match(input,61,FOLLOW_61_in_statement105); 

                    match(input,ID,FOLLOW_ID_in_statement107); 

                    match(input,32,FOLLOW_32_in_statement109); 

                    value = "";

                    }
                    break;
                case 4 :
                    // src\\calculator.g:27:4: COMMENT
                    {
                    COMMENT4=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_statement118); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t"; value += (COMMENT4!=null?COMMENT4.getText():null);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "statement"



    // $ANTLR start "func_or_var"
    // src\\calculator.g:31:1: func_or_var[int tab] returns [String value] : ( dec_func[$tab] | dec_var[$tab] );
    public final String func_or_var(int tab) throws RecognitionException {
        String value = null;


        String dec_func5 =null;

        String dec_var6 =null;



        	value = null;

        try {
            // src\\calculator.g:35:2: ( dec_func[$tab] | dec_var[$tab] )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    alt3=1;
                }
                else if ( (LA3_1==24||LA3_1==32||LA3_1==36||LA3_1==41) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // src\\calculator.g:35:4: dec_func[$tab]
                    {
                    pushFollow(FOLLOW_dec_func_in_func_or_var143);
                    dec_func5=dec_func(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "function " + dec_func5;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:38:4: dec_var[$tab]
                    {
                    pushFollow(FOLLOW_dec_var_in_func_or_var153);
                    dec_var6=dec_var(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "var " + dec_var6;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "func_or_var"



    // $ANTLR start "dec_func"
    // src\\calculator.g:43:1: dec_func[int tab] returns [String value] : dec_func_name[$tab] '{' func_implement[$tab + 1] '}' semi_colon[$tab] ;
    public final String dec_func(int tab) throws RecognitionException {
        String value = null;


        String dec_func_name7 =null;

        String func_implement8 =null;

        String semi_colon9 =null;



        	value = null;

        try {
            // src\\calculator.g:47:2: ( dec_func_name[$tab] '{' func_implement[$tab + 1] '}' semi_colon[$tab] )
            // src\\calculator.g:47:4: dec_func_name[$tab] '{' func_implement[$tab + 1] '}' semi_colon[$tab]
            {
            pushFollow(FOLLOW_dec_func_name_in_dec_func179);
            dec_func_name7=dec_func_name(tab);

            state._fsp--;


            match(input,68,FOLLOW_68_in_dec_func182); 

            pushFollow(FOLLOW_func_implement_in_dec_func184);
            func_implement8=func_implement(tab + 1);

            state._fsp--;


            match(input,70,FOLLOW_70_in_dec_func187); 

            pushFollow(FOLLOW_semi_colon_in_dec_func189);
            semi_colon9=semi_colon(tab);

            state._fsp--;


            value = dec_func_name7 + "\n";
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "{\n" + func_implement8;
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "}" + semi_colon9 + "\n";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_func"



    // $ANTLR start "dec_func_name"
    // src\\calculator.g:55:1: dec_func_name[int tab] returns [String value] : ID '(' dec_param[$tab] ')' ;
    public final String dec_func_name(int tab) throws RecognitionException {
        String value = null;


        Token ID10=null;
        String dec_param11 =null;



        	value = null;

        try {
            // src\\calculator.g:59:2: ( ID '(' dec_param[$tab] ')' )
            // src\\calculator.g:59:4: ID '(' dec_param[$tab] ')'
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_dec_func_name215); 

            match(input,17,FOLLOW_17_in_dec_func_name217); 

            pushFollow(FOLLOW_dec_param_in_dec_func_name219);
            dec_param11=dec_param(tab);

            state._fsp--;


            match(input,18,FOLLOW_18_in_dec_func_name222); 

            value = (ID10!=null?ID10.getText():null) + "(" + dec_param11 + ")";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_func_name"



    // $ANTLR start "dec_param"
    // src\\calculator.g:63:1: dec_param[int tab] returns [String value] : ( type[$tab] ID dec_param_[$tab] |);
    public final String dec_param(int tab) throws RecognitionException {
        String value = null;


        Token ID12=null;
        String dec_param_13 =null;



        	value = null;

        try {
            // src\\calculator.g:67:2: ( type[$tab] ID dec_param_[$tab] |)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= 47 && LA4_0 <= 48)||(LA4_0 >= 52 && LA4_0 <= 53)||(LA4_0 >= 58 && LA4_0 <= 60)||LA4_0==63||LA4_0==66) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // src\\calculator.g:67:4: type[$tab] ID dec_param_[$tab]
                    {
                    pushFollow(FOLLOW_type_in_dec_param247);
                    type(tab);

                    state._fsp--;


                    ID12=(Token)match(input,ID,FOLLOW_ID_in_dec_param250); 

                    pushFollow(FOLLOW_dec_param__in_dec_param252);
                    dec_param_13=dec_param_(tab);

                    state._fsp--;


                    value = (ID12!=null?ID12.getText():null) + dec_param_13;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:69:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_param"



    // $ANTLR start "dec_param_"
    // src\\calculator.g:72:1: dec_param_[int tab] returns [String value] : ( ',' dec_param[$tab] |);
    public final String dec_param_(int tab) throws RecognitionException {
        String value = null;


        String dec_param14 =null;



        	value = null;

        try {
            // src\\calculator.g:76:2: ( ',' dec_param[$tab] |)
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // src\\calculator.g:76:4: ',' dec_param[$tab]
                    {
                    match(input,24,FOLLOW_24_in_dec_param_283); 

                    pushFollow(FOLLOW_dec_param_in_dec_param_286);
                    dec_param14=dec_param(tab);

                    state._fsp--;


                    value = ", " + dec_param14;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:78:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_param_"



    // $ANTLR start "func_implement"
    // src\\calculator.g:81:1: func_implement[int tab] returns [String value] : block[$tab] ;
    public final String func_implement(int tab) throws RecognitionException {
        String value = null;


        String block15 =null;



        	value = null;

        try {
            // src\\calculator.g:85:2: ( block[$tab] )
            // src\\calculator.g:85:4: block[$tab]
            {
            pushFollow(FOLLOW_block_in_func_implement317);
            block15=block(tab);

            state._fsp--;


            value = block15;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "func_implement"



    // $ANTLR start "dec_var"
    // src\\calculator.g:89:1: dec_var[int tab] returns [String value] : ( ID dec_array[$tab] ';' | ID dec_array[$tab] '=' array_value[$tab] ';' | ID dec_expression[$tab] dec_var_[$tab] );
    public final String dec_var(int tab) throws RecognitionException {
        String value = null;


        Token ID16=null;
        Token ID18=null;
        Token ID20=null;
        String dec_array17 =null;

        String array_value19 =null;

        String dec_expression21 =null;

        String dec_var_22 =null;



        	value = null;

        try {
            // src\\calculator.g:93:2: ( ID dec_array[$tab] ';' | ID dec_array[$tab] '=' array_value[$tab] ';' | ID dec_expression[$tab] dec_var_[$tab] )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==41) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==INT) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==42) ) {
                            int LA6_5 = input.LA(5);

                            if ( (LA6_5==32) ) {
                                alt6=1;
                            }
                            else if ( (LA6_5==36) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA6_1==24||LA6_1==32||LA6_1==36) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // src\\calculator.g:93:4: ID dec_array[$tab] ';'
                    {
                    ID16=(Token)match(input,ID,FOLLOW_ID_in_dec_var344); 

                    pushFollow(FOLLOW_dec_array_in_dec_var346);
                    dec_array17=dec_array(tab);

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_dec_var349); 

                    value = (ID16!=null?ID16.getText():null) + " = new Array(" + dec_array17 + ");";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:95:6: ID dec_array[$tab] '=' array_value[$tab] ';'
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_dec_var360); 

                    pushFollow(FOLLOW_dec_array_in_dec_var362);
                    dec_array(tab);

                    state._fsp--;


                    match(input,36,FOLLOW_36_in_dec_var365); 

                    pushFollow(FOLLOW_array_value_in_dec_var367);
                    array_value19=array_value(tab);

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_dec_var370); 

                    value = (ID18!=null?ID18.getText():null) + " = new Array(" + array_value19 + ");";

                    }
                    break;
                case 3 :
                    // src\\calculator.g:97:4: ID dec_expression[$tab] dec_var_[$tab]
                    {
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_dec_var379); 

                    pushFollow(FOLLOW_dec_expression_in_dec_var381);
                    dec_expression21=dec_expression(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_dec_var__in_dec_var384);
                    dec_var_22=dec_var_(tab);

                    state._fsp--;


                    value = (ID20!=null?ID20.getText():null) + dec_expression21 + dec_var_22;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_var"



    // $ANTLR start "dec_var_"
    // src\\calculator.g:101:1: dec_var_[int tab] returns [String value] : ( ';' | ',' dec_var[$tab] );
    public final String dec_var_(int tab) throws RecognitionException {
        String value = null;


        String dec_var23 =null;



        	value = null;

        try {
            // src\\calculator.g:105:2: ( ';' | ',' dec_var[$tab] )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // src\\calculator.g:105:4: ';'
                    {
                    match(input,32,FOLLOW_32_in_dec_var_410); 

                    value = ";";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:107:4: ',' dec_var[$tab]
                    {
                    match(input,24,FOLLOW_24_in_dec_var_419); 

                    pushFollow(FOLLOW_dec_var_in_dec_var_421);
                    dec_var23=dec_var(tab);

                    state._fsp--;


                    value = ", " + dec_var23;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_var_"



    // $ANTLR start "dec_array"
    // src\\calculator.g:111:1: dec_array[int tab] returns [String value] : '[' INT ']' ;
    public final String dec_array(int tab) throws RecognitionException {
        String value = null;


        Token INT24=null;


        	value = null;

        try {
            // src\\calculator.g:115:2: ( '[' INT ']' )
            // src\\calculator.g:115:5: '[' INT ']'
            {
            match(input,41,FOLLOW_41_in_dec_array450); 

            INT24=(Token)match(input,INT,FOLLOW_INT_in_dec_array452); 

            match(input,42,FOLLOW_42_in_dec_array454); 

            value = (INT24!=null?INT24.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_array"



    // $ANTLR start "array_value"
    // src\\calculator.g:119:1: array_value[int tab] returns [String value] : '{' INT ints[$tab] '}' ;
    public final String array_value(int tab) throws RecognitionException {
        String value = null;


        Token INT25=null;
        String ints26 =null;


        try {
            // src\\calculator.g:120:2: ( '{' INT ints[$tab] '}' )
            // src\\calculator.g:120:4: '{' INT ints[$tab] '}'
            {
            match(input,68,FOLLOW_68_in_array_value475); 

            INT25=(Token)match(input,INT,FOLLOW_INT_in_array_value477); 

            pushFollow(FOLLOW_ints_in_array_value479);
            ints26=ints(tab);

            state._fsp--;


            match(input,70,FOLLOW_70_in_array_value482); 

            value = (INT25!=null?INT25.getText():null) + ints26;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "array_value"



    // $ANTLR start "dec_expression"
    // src\\calculator.g:124:1: dec_expression[int tab] returns [String value] : ( '=' expr_value[$tab] |);
    public final String dec_expression(int tab) throws RecognitionException {
        String value = null;


        String expr_value27 =null;



        	value = null;

        try {
            // src\\calculator.g:128:2: ( '=' expr_value[$tab] |)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==24||LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // src\\calculator.g:128:4: '=' expr_value[$tab]
                    {
                    match(input,36,FOLLOW_36_in_dec_expression507); 

                    pushFollow(FOLLOW_expr_value_in_dec_expression509);
                    expr_value27=expr_value(tab);

                    state._fsp--;


                    value = " = " + expr_value27;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:130:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dec_expression"



    // $ANTLR start "block"
    // src\\calculator.g:133:1: block[int tab] returns [String value] : ( stat[$tab] a= block[$tab] |);
    public final String block(int tab) throws RecognitionException {
        String value = null;


        String a =null;

        String stat28 =null;



        	value = null;

        try {
            // src\\calculator.g:137:2: ( stat[$tab] a= block[$tab] |)
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= COMMENT && LA9_0 <= ID)||LA9_0==45||(LA9_0 >= 47 && LA9_0 <= 50)||(LA9_0 >= 52 && LA9_0 <= 53)||(LA9_0 >= 56 && LA9_0 <= 60)||(LA9_0 >= 62 && LA9_0 <= 64)||(LA9_0 >= 66 && LA9_0 <= 67)) ) {
                alt9=1;
            }
            else if ( (LA9_0==46||LA9_0==51||LA9_0==70) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // src\\calculator.g:137:4: stat[$tab] a= block[$tab]
                    {
                    pushFollow(FOLLOW_stat_in_block540);
                    stat28=stat(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_block_in_block545);
                    a=block(tab);

                    state._fsp--;


                    value = stat28 + a;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:139:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "block"



    // $ANTLR start "stat"
    // src\\calculator.g:142:1: stat[int tab] returns [String value] : ( type[$tab] dec_var[$tab] | ie_stat[$tab] | for_stat[$tab] | while_stat[$tab] | switch_stat[$tab] | call_function[$tab] ';' | 'return' return_sentence[$tab] ';' | 'break' ';' | normal_exp[$tab] ';' | 'cin' input[$tab] ';' | 'cout' outputs[$tab] ';' | COMMENT );
    public final String stat(int tab) throws RecognitionException {
        String value = null;


        Token COMMENT40=null;
        String type29 =null;

        String dec_var30 =null;

        String ie_stat31 =null;

        String for_stat32 =null;

        String while_stat33 =null;

        String switch_stat34 =null;

        String call_function35 =null;

        String return_sentence36 =null;

        String normal_exp37 =null;

        String input38 =null;

        String outputs39 =null;



        	value = null;

        try {
            // src\\calculator.g:146:2: ( type[$tab] dec_var[$tab] | ie_stat[$tab] | for_stat[$tab] | while_stat[$tab] | switch_stat[$tab] | call_function[$tab] ';' | 'return' return_sentence[$tab] ';' | 'break' ';' | normal_exp[$tab] ';' | 'cin' input[$tab] ';' | 'cout' outputs[$tab] ';' | COMMENT )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
            case 52:
            case 53:
            case 58:
            case 59:
            case 60:
            case 63:
            case 66:
                {
                alt10=1;
                }
                break;
            case 57:
                {
                alt10=2;
                }
                break;
            case 56:
                {
                alt10=3;
                }
                break;
            case 67:
                {
                alt10=4;
                }
                break;
            case 64:
                {
                alt10=5;
                }
                break;
            case ID:
                {
                int LA10_6 = input.LA(2);

                if ( (LA10_6==17) ) {
                    alt10=6;
                }
                else if ( (LA10_6==10||(LA10_6 >= 12 && LA10_6 <= 16)||(LA10_6 >= 19 && LA10_6 <= 23)||(LA10_6 >= 25 && LA10_6 <= 30)||(LA10_6 >= 32 && LA10_6 <= 33)||(LA10_6 >= 35 && LA10_6 <= 39)||LA10_6==41||(LA10_6 >= 43 && LA10_6 <= 44)||LA10_6==69) ) {
                    alt10=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 6, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                alt10=7;
                }
                break;
            case 45:
                {
                alt10=8;
                }
                break;
            case 49:
                {
                alt10=10;
                }
                break;
            case 50:
                {
                alt10=11;
                }
                break;
            case COMMENT:
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // src\\calculator.g:146:4: type[$tab] dec_var[$tab]
                    {
                    pushFollow(FOLLOW_type_in_stat576);
                    type29=type(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_dec_var_in_stat579);
                    dec_var30=dec_var(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += type29 + " " + dec_var30 + "\n";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:149:4: ie_stat[$tab]
                    {
                    pushFollow(FOLLOW_ie_stat_in_stat589);
                    ie_stat31=ie_stat(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += ie_stat31;

                    }
                    break;
                case 3 :
                    // src\\calculator.g:152:4: for_stat[$tab]
                    {
                    pushFollow(FOLLOW_for_stat_in_stat599);
                    for_stat32=for_stat(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += for_stat32;

                    }
                    break;
                case 4 :
                    // src\\calculator.g:155:4: while_stat[$tab]
                    {
                    pushFollow(FOLLOW_while_stat_in_stat609);
                    while_stat33=while_stat(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += while_stat33;

                    }
                    break;
                case 5 :
                    // src\\calculator.g:158:5: switch_stat[$tab]
                    {
                    pushFollow(FOLLOW_switch_stat_in_stat620);
                    switch_stat34=switch_stat(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += switch_stat34;

                    }
                    break;
                case 6 :
                    // src\\calculator.g:161:4: call_function[$tab] ';'
                    {
                    pushFollow(FOLLOW_call_function_in_stat631);
                    call_function35=call_function(tab);

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_stat634); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += call_function35 + ";\n";

                    }
                    break;
                case 7 :
                    // src\\calculator.g:164:4: 'return' return_sentence[$tab] ';'
                    {
                    match(input,62,FOLLOW_62_in_stat643); 

                    pushFollow(FOLLOW_return_sentence_in_stat645);
                    return_sentence36=return_sentence(tab);

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_stat648); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "return " + return_sentence36 + ";\n";

                    }
                    break;
                case 8 :
                    // src\\calculator.g:167:4: 'break' ';'
                    {
                    match(input,45,FOLLOW_45_in_stat657); 

                    match(input,32,FOLLOW_32_in_stat659); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "break;\n";

                    }
                    break;
                case 9 :
                    // src\\calculator.g:170:4: normal_exp[$tab] ';'
                    {
                    pushFollow(FOLLOW_normal_exp_in_stat668);
                    normal_exp37=normal_exp(tab);

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_stat671); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += normal_exp37 + ";\n";

                    }
                    break;
                case 10 :
                    // src\\calculator.g:173:4: 'cin' input[$tab] ';'
                    {
                    match(input,49,FOLLOW_49_in_stat680); 

                    pushFollow(FOLLOW_input_in_stat682);
                    input38=input(tab);

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_stat685); 

                    value = input38;

                    }
                    break;
                case 11 :
                    // src\\calculator.g:175:4: 'cout' outputs[$tab] ';'
                    {
                    match(input,50,FOLLOW_50_in_stat694); 

                    pushFollow(FOLLOW_outputs_in_stat696);
                    outputs39=outputs(tab);

                    state._fsp--;


                    match(input,32,FOLLOW_32_in_stat699); 

                    value = outputs39;

                    }
                    break;
                case 12 :
                    // src\\calculator.g:177:4: COMMENT
                    {
                    COMMENT40=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_stat708); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t"; value += (COMMENT40!=null?COMMENT40.getText():null);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "stat"



    // $ANTLR start "ie_stat"
    // src\\calculator.g:181:1: ie_stat[int tab] returns [String value] : if_stat[$tab] else_stat[$tab] ;
    public final String ie_stat(int tab) throws RecognitionException {
        String value = null;


        String if_stat41 =null;

        String else_stat42 =null;



        	value = null;

        try {
            // src\\calculator.g:185:2: ( if_stat[$tab] else_stat[$tab] )
            // src\\calculator.g:185:4: if_stat[$tab] else_stat[$tab]
            {
            pushFollow(FOLLOW_if_stat_in_ie_stat733);
            if_stat41=if_stat(tab);

            state._fsp--;


            pushFollow(FOLLOW_else_stat_in_ie_stat736);
            else_stat42=else_stat(tab);

            state._fsp--;


            value = if_stat41 + else_stat42;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "ie_stat"



    // $ANTLR start "if_stat"
    // src\\calculator.g:189:1: if_stat[int tab] returns [String value] : 'if' '(' expr_value[$tab] ')' '{' block[$tab + 1] '}' ;
    public final String if_stat(int tab) throws RecognitionException {
        String value = null;


        String expr_value43 =null;

        String block44 =null;



        	value = null;

        try {
            // src\\calculator.g:193:2: ( 'if' '(' expr_value[$tab] ')' '{' block[$tab + 1] '}' )
            // src\\calculator.g:193:4: 'if' '(' expr_value[$tab] ')' '{' block[$tab + 1] '}'
            {
            match(input,57,FOLLOW_57_in_if_stat762); 

            match(input,17,FOLLOW_17_in_if_stat764); 

            pushFollow(FOLLOW_expr_value_in_if_stat766);
            expr_value43=expr_value(tab);

            state._fsp--;


            match(input,18,FOLLOW_18_in_if_stat769); 

            match(input,68,FOLLOW_68_in_if_stat771); 

            pushFollow(FOLLOW_block_in_if_stat773);
            block44=block(tab + 1);

            state._fsp--;


            match(input,70,FOLLOW_70_in_if_stat776); 

            value = "if(" + expr_value43 + ")\n";
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "{\n" + block44;
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "}\n";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "if_stat"



    // $ANTLR start "else_stat_"
    // src\\calculator.g:201:1: else_stat_[int tab] returns [String value] : ( '{' block[$tab + 1] '}' | ie_stat[$tab] );
    public final String else_stat_(int tab) throws RecognitionException {
        String value = null;


        String block45 =null;

        String ie_stat46 =null;



        	value = null;

        try {
            // src\\calculator.g:205:2: ( '{' block[$tab + 1] '}' | ie_stat[$tab] )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==68) ) {
                alt11=1;
            }
            else if ( (LA11_0==57) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // src\\calculator.g:205:4: '{' block[$tab + 1] '}'
                    {
                    match(input,68,FOLLOW_68_in_else_stat_802); 

                    pushFollow(FOLLOW_block_in_else_stat_804);
                    block45=block(tab + 1);

                    state._fsp--;


                    match(input,70,FOLLOW_70_in_else_stat_807); 

                    value = "\n"; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "{\n" + block45;
                    		 for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "}\n";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:210:4: ie_stat[$tab]
                    {
                    pushFollow(FOLLOW_ie_stat_in_else_stat_816);
                    ie_stat46=ie_stat(tab);

                    state._fsp--;


                    value = " " + ie_stat46;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "else_stat_"



    // $ANTLR start "else_stat"
    // src\\calculator.g:214:1: else_stat[int tab] returns [String value] : ( 'else' else_stat_[$tab] |);
    public final String else_stat(int tab) throws RecognitionException {
        String value = null;


        String else_stat_47 =null;



        	value = null;

        try {
            // src\\calculator.g:218:2: ( 'else' else_stat_[$tab] |)
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==54) ) {
                alt12=1;
            }
            else if ( ((LA12_0 >= COMMENT && LA12_0 <= ID)||(LA12_0 >= 45 && LA12_0 <= 53)||(LA12_0 >= 56 && LA12_0 <= 60)||(LA12_0 >= 62 && LA12_0 <= 64)||(LA12_0 >= 66 && LA12_0 <= 67)||LA12_0==70) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // src\\calculator.g:218:4: 'else' else_stat_[$tab]
                    {
                    match(input,54,FOLLOW_54_in_else_stat842); 

                    pushFollow(FOLLOW_else_stat__in_else_stat844);
                    else_stat_47=else_stat_(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "else" + else_stat_47;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:221:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "else_stat"



    // $ANTLR start "for_stat"
    // src\\calculator.g:224:1: for_stat[int tab] returns [String value] : 'for' '(' for_para[$tab] ';' expr[$tab] ';' normal_exp[$tab] ')' '{' block[$tab + 1] '}' ;
    public final String for_stat(int tab) throws RecognitionException {
        String value = null;


        String for_para48 =null;

        String expr49 =null;

        String normal_exp50 =null;

        String block51 =null;



        	value = null;

        try {
            // src\\calculator.g:228:2: ( 'for' '(' for_para[$tab] ';' expr[$tab] ';' normal_exp[$tab] ')' '{' block[$tab + 1] '}' )
            // src\\calculator.g:228:4: 'for' '(' for_para[$tab] ';' expr[$tab] ';' normal_exp[$tab] ')' '{' block[$tab + 1] '}'
            {
            match(input,56,FOLLOW_56_in_for_stat875); 

            match(input,17,FOLLOW_17_in_for_stat877); 

            pushFollow(FOLLOW_for_para_in_for_stat879);
            for_para48=for_para(tab);

            state._fsp--;


            match(input,32,FOLLOW_32_in_for_stat882); 

            pushFollow(FOLLOW_expr_in_for_stat884);
            expr49=expr(tab);

            state._fsp--;


            match(input,32,FOLLOW_32_in_for_stat887); 

            pushFollow(FOLLOW_normal_exp_in_for_stat889);
            normal_exp50=normal_exp(tab);

            state._fsp--;


            match(input,18,FOLLOW_18_in_for_stat892); 

            match(input,68,FOLLOW_68_in_for_stat894); 

            pushFollow(FOLLOW_block_in_for_stat896);
            block51=block(tab + 1);

            state._fsp--;


            match(input,70,FOLLOW_70_in_for_stat899); 

            value = "for(" + for_para48 + "; " + expr49 + "; " + normal_exp50 + ")\n";
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "{\n" + block51;
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "}\n";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "for_stat"



    // $ANTLR start "for_para"
    // src\\calculator.g:236:1: for_para[int tab] returns [String value] : ( dec_expression[$tab] | normal_exp[$tab] | type[$tab] normal_exp[$tab] );
    public final String for_para(int tab) throws RecognitionException {
        String value = null;


        String dec_expression52 =null;

        String normal_exp53 =null;

        String type54 =null;

        String normal_exp55 =null;



        	value = null;

        try {
            // src\\calculator.g:240:2: ( dec_expression[$tab] | normal_exp[$tab] | type[$tab] normal_exp[$tab] )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 24:
            case 32:
            case 36:
                {
                alt13=1;
                }
                break;
            case ID:
                {
                alt13=2;
                }
                break;
            case 47:
            case 48:
            case 52:
            case 53:
            case 58:
            case 59:
            case 60:
            case 63:
            case 66:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // src\\calculator.g:240:4: dec_expression[$tab]
                    {
                    pushFollow(FOLLOW_dec_expression_in_for_para924);
                    dec_expression52=dec_expression(tab);

                    state._fsp--;


                    value = dec_expression52;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:242:4: normal_exp[$tab]
                    {
                    pushFollow(FOLLOW_normal_exp_in_for_para934);
                    normal_exp53=normal_exp(tab);

                    state._fsp--;


                    value = normal_exp53;

                    }
                    break;
                case 3 :
                    // src\\calculator.g:244:4: type[$tab] normal_exp[$tab]
                    {
                    pushFollow(FOLLOW_type_in_for_para944);
                    type54=type(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_normal_exp_in_for_para947);
                    normal_exp55=normal_exp(tab);

                    state._fsp--;


                    value = type54 + " " + normal_exp55;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "for_para"



    // $ANTLR start "while_stat"
    // src\\calculator.g:248:1: while_stat[int tab] returns [String value] : 'while' '(' expr[$tab] ')' '{' block[$tab + 1] '}' ;
    public final String while_stat(int tab) throws RecognitionException {
        String value = null;


        String expr56 =null;

        String block57 =null;



        	value = null;

        try {
            // src\\calculator.g:252:2: ( 'while' '(' expr[$tab] ')' '{' block[$tab + 1] '}' )
            // src\\calculator.g:252:4: 'while' '(' expr[$tab] ')' '{' block[$tab + 1] '}'
            {
            match(input,67,FOLLOW_67_in_while_stat973); 

            match(input,17,FOLLOW_17_in_while_stat975); 

            pushFollow(FOLLOW_expr_in_while_stat977);
            expr56=expr(tab);

            state._fsp--;


            match(input,18,FOLLOW_18_in_while_stat980); 

            match(input,68,FOLLOW_68_in_while_stat982); 

            pushFollow(FOLLOW_block_in_while_stat984);
            block57=block(tab + 1);

            state._fsp--;


            match(input,70,FOLLOW_70_in_while_stat987); 

            value = "while(" + expr56 + ")\n";
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "{\n" + block57;
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "}\n";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "while_stat"



    // $ANTLR start "switch_stat"
    // src\\calculator.g:260:1: switch_stat[int tab] returns [String value] : 'switch' '(' ID array[$tab] ')' '{' case_stats[$tab + 1] default_stat[$tab + 1] '}' ;
    public final String switch_stat(int tab) throws RecognitionException {
        String value = null;


        Token ID58=null;
        String array59 =null;

        String case_stats60 =null;

        String default_stat61 =null;



        	value = null;

        try {
            // src\\calculator.g:264:2: ( 'switch' '(' ID array[$tab] ')' '{' case_stats[$tab + 1] default_stat[$tab + 1] '}' )
            // src\\calculator.g:264:4: 'switch' '(' ID array[$tab] ')' '{' case_stats[$tab + 1] default_stat[$tab + 1] '}'
            {
            match(input,64,FOLLOW_64_in_switch_stat1012); 

            match(input,17,FOLLOW_17_in_switch_stat1014); 

            ID58=(Token)match(input,ID,FOLLOW_ID_in_switch_stat1016); 

            pushFollow(FOLLOW_array_in_switch_stat1018);
            array59=array(tab);

            state._fsp--;


            match(input,18,FOLLOW_18_in_switch_stat1021); 

            match(input,68,FOLLOW_68_in_switch_stat1023); 

            pushFollow(FOLLOW_case_stats_in_switch_stat1025);
            case_stats60=case_stats(tab + 1);

            state._fsp--;


            pushFollow(FOLLOW_default_stat_in_switch_stat1028);
            default_stat61=default_stat(tab + 1);

            state._fsp--;


            match(input,70,FOLLOW_70_in_switch_stat1031); 

            value = "switch(" + (ID58!=null?ID58.getText():null) + array59 + ")\n";
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "{\n" + case_stats60 + default_stat61;
            		 for(int i = 0; i < tab; i++) value += "\t";
            		 value += "}\n";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "switch_stat"



    // $ANTLR start "case_stats"
    // src\\calculator.g:272:1: case_stats[int tab] returns [String value] : ( case_stat[$tab] a= case_stats[$tab] |);
    public final String case_stats(int tab) throws RecognitionException {
        String value = null;


        String a =null;

        String case_stat62 =null;



        	value = null;

        try {
            // src\\calculator.g:276:2: ( case_stat[$tab] a= case_stats[$tab] |)
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            else if ( (LA14_0==51||LA14_0==70) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src\\calculator.g:276:4: case_stat[$tab] a= case_stats[$tab]
                    {
                    pushFollow(FOLLOW_case_stat_in_case_stats1056);
                    case_stat62=case_stat(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_case_stats_in_case_stats1061);
                    a=case_stats(tab);

                    state._fsp--;


                    value = case_stat62 + a;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:278:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "case_stats"



    // $ANTLR start "case_stat"
    // src\\calculator.g:281:1: case_stat[int tab] returns [String value] : 'case' CHAR ':' block[$tab + 1] ;
    public final String case_stat(int tab) throws RecognitionException {
        String value = null;


        Token CHAR63=null;
        String block64 =null;



        	value = null;

        try {
            // src\\calculator.g:285:2: ( 'case' CHAR ':' block[$tab + 1] )
            // src\\calculator.g:285:4: 'case' CHAR ':' block[$tab + 1]
            {
            match(input,46,FOLLOW_46_in_case_stat1092); 

            CHAR63=(Token)match(input,CHAR,FOLLOW_CHAR_in_case_stat1094); 

            match(input,31,FOLLOW_31_in_case_stat1096); 

            pushFollow(FOLLOW_block_in_case_stat1098);
            block64=block(tab + 1);

            state._fsp--;


            value = ""; for(int i = 0; i < tab; i++) value += "\t";
            		 value += "case " + (CHAR63!=null?CHAR63.getText():null) + " :\n" + block64;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "case_stat"



    // $ANTLR start "default_stat"
    // src\\calculator.g:290:1: default_stat[int tab] returns [String value] : ( 'default' ':' block[$tab + 1] |);
    public final String default_stat(int tab) throws RecognitionException {
        String value = null;


        String block65 =null;



        	value = null;

        try {
            // src\\calculator.g:294:2: ( 'default' ':' block[$tab + 1] |)
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==51) ) {
                alt15=1;
            }
            else if ( (LA15_0==70) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // src\\calculator.g:294:6: 'default' ':' block[$tab + 1]
                    {
                    match(input,51,FOLLOW_51_in_default_stat1126); 

                    match(input,31,FOLLOW_31_in_default_stat1128); 

                    pushFollow(FOLLOW_block_in_default_stat1130);
                    block65=block(tab + 1);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "default :\n" + block65;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:297:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "default_stat"



    // $ANTLR start "input"
    // src\\calculator.g:300:1: input[int tab] returns [String value] : ( '>>' ID a= input[$tab] |);
    public final String input(int tab) throws RecognitionException {
        String value = null;


        Token ID66=null;
        String a =null;



        	value = null;

        try {
            // src\\calculator.g:304:2: ( '>>' ID a= input[$tab] |)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src\\calculator.g:304:4: '>>' ID a= input[$tab]
                    {
                    match(input,40,FOLLOW_40_in_input1161); 

                    ID66=(Token)match(input,ID,FOLLOW_ID_in_input1163); 

                    pushFollow(FOLLOW_input_in_input1167);
                    a=input(tab);

                    state._fsp--;


                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += (ID66!=null?ID66.getText():null) + " = window.prompt() + '\\0';\n" + a;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:307:6: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "input"



    // $ANTLR start "outputs"
    // src\\calculator.g:310:1: outputs[int tab] returns [String value] : ( '<<' output[$tab] a= outputs[$tab] |);
    public final String outputs(int tab) throws RecognitionException {
        String value = null;


        String a =null;

        String output67 =null;



        	value = null;

        try {
            // src\\calculator.g:314:2: ( '<<' output[$tab] a= outputs[$tab] |)
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // src\\calculator.g:314:4: '<<' output[$tab] a= outputs[$tab]
                    {
                    match(input,34,FOLLOW_34_in_outputs1200); 

                    pushFollow(FOLLOW_output_in_outputs1202);
                    output67=output(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_outputs_in_outputs1207);
                    a=outputs(tab);

                    state._fsp--;


                    value = output67 + a;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:316:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "outputs"



    // $ANTLR start "output"
    // src\\calculator.g:319:1: output[int tab] returns [String value] : ( ID | 'endl' );
    public final String output(int tab) throws RecognitionException {
        String value = null;


        Token ID68=null;


        	value = null;

        try {
            // src\\calculator.g:323:2: ( ID | 'endl' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==55) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // src\\calculator.g:323:4: ID
                    {
                    ID68=(Token)match(input,ID,FOLLOW_ID_in_output1238); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    		 value += "console.log(" + (ID68!=null?ID68.getText():null) + ");\n";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:326:6: 'endl'
                    {
                    match(input,55,FOLLOW_55_in_output1249); 

                    value = ""; for(int i = 0; i < tab; i++) value += "\t";
                    	     value += "console.log('\\n');\n";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "output"



    // $ANTLR start "call_function"
    // src\\calculator.g:331:1: call_function[int tab] returns [String value] : ID '(' call_parameter[$tab] ')' ;
    public final String call_function(int tab) throws RecognitionException {
        String value = null;


        Token ID69=null;
        String call_parameter70 =null;



        	value = null;

        try {
            // src\\calculator.g:335:2: ( ID '(' call_parameter[$tab] ')' )
            // src\\calculator.g:335:4: ID '(' call_parameter[$tab] ')'
            {
            ID69=(Token)match(input,ID,FOLLOW_ID_in_call_function1277); 

            match(input,17,FOLLOW_17_in_call_function1279); 

            pushFollow(FOLLOW_call_parameter_in_call_function1281);
            call_parameter70=call_parameter(tab);

            state._fsp--;


            match(input,18,FOLLOW_18_in_call_function1284); 

            value = (ID69!=null?ID69.getText():null) + "(" + call_parameter70 + ")";

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "call_function"



    // $ANTLR start "call_parameter"
    // src\\calculator.g:339:1: call_parameter[int tab] returns [String value] : ( expr_value[$tab] call_parameter_[$tab] |);
    public final String call_parameter(int tab) throws RecognitionException {
        String value = null;


        String expr_value71 =null;

        String call_parameter_72 =null;



        	value = null;

        try {
            // src\\calculator.g:343:2: ( expr_value[$tab] call_parameter_[$tab] |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CHAR||(LA19_0 >= ID && LA19_0 <= INT)||LA19_0==9||LA19_0==17||LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==18) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src\\calculator.g:343:4: expr_value[$tab] call_parameter_[$tab]
                    {
                    pushFollow(FOLLOW_expr_value_in_call_parameter1309);
                    expr_value71=expr_value(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_call_parameter__in_call_parameter1312);
                    call_parameter_72=call_parameter_(tab);

                    state._fsp--;


                    value = expr_value71 + call_parameter_72;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:345:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "call_parameter"



    // $ANTLR start "call_parameter_"
    // src\\calculator.g:348:1: call_parameter_[int tab] returns [String value] : ( ',' call_parameter[$tab] |);
    public final String call_parameter_(int tab) throws RecognitionException {
        String value = null;


        String call_parameter73 =null;



        	value = null;

        try {
            // src\\calculator.g:352:2: ( ',' call_parameter[$tab] |)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            else if ( (LA20_0==18) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // src\\calculator.g:352:4: ',' call_parameter[$tab]
                    {
                    match(input,24,FOLLOW_24_in_call_parameter_1343); 

                    pushFollow(FOLLOW_call_parameter_in_call_parameter_1345);
                    call_parameter73=call_parameter(tab);

                    state._fsp--;


                    value = ", " + call_parameter73;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:354:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "call_parameter_"



    // $ANTLR start "array"
    // src\\calculator.g:357:1: array[int tab] returns [String value] : ( '[' index[$tab] ']' |);
    public final String array(int tab) throws RecognitionException {
        String value = null;


        String index74 =null;



        	value = null;

        try {
            // src\\calculator.g:361:2: ( '[' index[$tab] ']' |)
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==10||(LA21_0 >= 12 && LA21_0 <= 16)||(LA21_0 >= 18 && LA21_0 <= 27)||(LA21_0 >= 29 && LA21_0 <= 30)||(LA21_0 >= 32 && LA21_0 <= 33)||(LA21_0 >= 35 && LA21_0 <= 39)||(LA21_0 >= 42 && LA21_0 <= 44)||LA21_0==69) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // src\\calculator.g:361:4: '[' index[$tab] ']'
                    {
                    match(input,41,FOLLOW_41_in_array1376); 

                    pushFollow(FOLLOW_index_in_array1378);
                    index74=index(tab);

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_array1381); 

                    value = "[" + index74 + "]";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:363:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "array"



    // $ANTLR start "index"
    // src\\calculator.g:366:1: index[int tab] returns [String value] : ( expr_value[$tab] |);
    public final String index(int tab) throws RecognitionException {
        String value = null;


        String expr_value75 =null;



        	value = null;

        try {
            // src\\calculator.g:370:2: ( expr_value[$tab] |)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CHAR||(LA22_0 >= ID && LA22_0 <= INT)||LA22_0==9||LA22_0==17||LA22_0==25) ) {
                alt22=1;
            }
            else if ( (LA22_0==42) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // src\\calculator.g:370:4: expr_value[$tab]
                    {
                    pushFollow(FOLLOW_expr_value_in_index1411);
                    expr_value75=expr_value(tab);

                    state._fsp--;


                    value = expr_value75;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:372:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "index"



    // $ANTLR start "semi_colon"
    // src\\calculator.g:375:1: semi_colon[int tab] returns [String value] : ( ';' |);
    public final String semi_colon(int tab) throws RecognitionException {
        String value = null;



        	value = null;

        try {
            // src\\calculator.g:379:2: ( ';' |)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF||LA23_0==COMMENT||LA23_0==11||(LA23_0 >= 47 && LA23_0 <= 48)||(LA23_0 >= 52 && LA23_0 <= 53)||(LA23_0 >= 58 && LA23_0 <= 60)||LA23_0==63||(LA23_0 >= 65 && LA23_0 <= 66)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // src\\calculator.g:379:4: ';'
                    {
                    match(input,32,FOLLOW_32_in_semi_colon1442); 

                    value = ";";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:381:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "semi_colon"



    // $ANTLR start "expr_value"
    // src\\calculator.g:384:1: expr_value[int tab] returns [String value] : ( expr[$tab] | '!' expr[$tab] | '-' expr[$tab] );
    public final String expr_value(int tab) throws RecognitionException {
        String value = null;


        String expr76 =null;

        String expr77 =null;

        String expr78 =null;



        	value = null;

        try {
            // src\\calculator.g:388:2: ( expr[$tab] | '!' expr[$tab] | '-' expr[$tab] )
            int alt24=3;
            switch ( input.LA(1) ) {
            case CHAR:
            case ID:
            case INT:
            case 17:
                {
                alt24=1;
                }
                break;
            case 9:
                {
                alt24=2;
                }
                break;
            case 25:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // src\\calculator.g:388:4: expr[$tab]
                    {
                    pushFollow(FOLLOW_expr_in_expr_value1472);
                    expr76=expr(tab);

                    state._fsp--;


                    value = expr76;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:390:4: '!' expr[$tab]
                    {
                    match(input,9,FOLLOW_9_in_expr_value1482); 

                    pushFollow(FOLLOW_expr_in_expr_value1484);
                    expr77=expr(tab);

                    state._fsp--;


                    value = "!" + expr77;

                    }
                    break;
                case 3 :
                    // src\\calculator.g:392:4: '-' expr[$tab]
                    {
                    match(input,25,FOLLOW_25_in_expr_value1494); 

                    pushFollow(FOLLOW_expr_in_expr_value1496);
                    expr78=expr(tab);

                    state._fsp--;


                    value = "-" + expr78;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr_value"



    // $ANTLR start "expr"
    // src\\calculator.g:396:1: expr[int tab] returns [String value] : operand[$tab] expr_[$tab] ;
    public final String expr(int tab) throws RecognitionException {
        String value = null;


        String operand79 =null;

        String expr_80 =null;



        	value = null;

        try {
            // src\\calculator.g:400:2: ( operand[$tab] expr_[$tab] )
            // src\\calculator.g:400:4: operand[$tab] expr_[$tab]
            {
            pushFollow(FOLLOW_operand_in_expr1522);
            operand79=operand(tab);

            state._fsp--;


            pushFollow(FOLLOW_expr__in_expr1525);
            expr_80=expr_(tab);

            state._fsp--;


            value = operand79 + expr_80;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "operand"
    // src\\calculator.g:404:1: operand[int tab] returns [String value] : ( ID array[$tab] | INT | CHAR | '(' expr[$tab] ')' | call_function[$tab] | object[$tab] );
    public final String operand(int tab) throws RecognitionException {
        String value = null;


        Token ID81=null;
        Token INT83=null;
        Token CHAR84=null;
        String array82 =null;

        String expr85 =null;

        String call_function86 =null;

        String object87 =null;



        	value = null;

        try {
            // src\\calculator.g:408:2: ( ID array[$tab] | INT | CHAR | '(' expr[$tab] ')' | call_function[$tab] | object[$tab] )
            int alt25=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt25=5;
                    }
                    break;
                case 28:
                    {
                    alt25=6;
                    }
                    break;
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 41:
                case 42:
                case 43:
                case 44:
                case 69:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt25=2;
                }
                break;
            case CHAR:
                {
                alt25=3;
                }
                break;
            case 17:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // src\\calculator.g:408:4: ID array[$tab]
                    {
                    ID81=(Token)match(input,ID,FOLLOW_ID_in_operand1551); 

                    pushFollow(FOLLOW_array_in_operand1553);
                    array82=array(tab);

                    state._fsp--;


                    value = (ID81!=null?ID81.getText():null) + array82;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:410:4: INT
                    {
                    INT83=(Token)match(input,INT,FOLLOW_INT_in_operand1563); 

                    value = (INT83!=null?INT83.getText():null);

                    }
                    break;
                case 3 :
                    // src\\calculator.g:412:6: CHAR
                    {
                    CHAR84=(Token)match(input,CHAR,FOLLOW_CHAR_in_operand1574); 

                    value = (CHAR84!=null?CHAR84.getText():null);

                    }
                    break;
                case 4 :
                    // src\\calculator.g:414:4: '(' expr[$tab] ')'
                    {
                    match(input,17,FOLLOW_17_in_operand1583); 

                    pushFollow(FOLLOW_expr_in_operand1585);
                    expr85=expr(tab);

                    state._fsp--;


                    match(input,18,FOLLOW_18_in_operand1588); 

                    value = "(" + expr85 + ")";

                    }
                    break;
                case 5 :
                    // src\\calculator.g:416:4: call_function[$tab]
                    {
                    pushFollow(FOLLOW_call_function_in_operand1597);
                    call_function86=call_function(tab);

                    state._fsp--;


                    value = call_function86;

                    }
                    break;
                case 6 :
                    // src\\calculator.g:418:4: object[$tab]
                    {
                    pushFollow(FOLLOW_object_in_operand1607);
                    object87=object(tab);

                    state._fsp--;


                    value = object87;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "operand"



    // $ANTLR start "expr_"
    // src\\calculator.g:422:1: expr_[int tab] returns [String value] : ( binary_operator[$tab] expr[$tab] | unary_operator[$tab] |);
    public final String expr_(int tab) throws RecognitionException {
        String value = null;


        String binary_operator88 =null;

        String expr89 =null;

        String unary_operator90 =null;



        	value = null;

        try {
            // src\\calculator.g:426:2: ( binary_operator[$tab] expr[$tab] | unary_operator[$tab] |)
            int alt26=3;
            switch ( input.LA(1) ) {
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 20:
            case 21:
            case 23:
            case 25:
            case 27:
            case 29:
            case 30:
            case 33:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 43:
            case 44:
            case 69:
                {
                alt26=1;
                }
                break;
            case 22:
            case 26:
                {
                alt26=2;
                }
                break;
            case 18:
            case 24:
            case 32:
            case 42:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // src\\calculator.g:426:4: binary_operator[$tab] expr[$tab]
                    {
                    pushFollow(FOLLOW_binary_operator_in_expr_1633);
                    binary_operator88=binary_operator(tab);

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr_1636);
                    expr89=expr(tab);

                    state._fsp--;


                    value = binary_operator88 + expr89;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:428:4: unary_operator[$tab]
                    {
                    pushFollow(FOLLOW_unary_operator_in_expr_1646);
                    unary_operator90=unary_operator(tab);

                    state._fsp--;


                    value = unary_operator90;

                    }
                    break;
                case 3 :
                    // src\\calculator.g:430:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr_"



    // $ANTLR start "object"
    // src\\calculator.g:433:1: object[int tab] returns [String value] : a= ID '.' b= ID ;
    public final String object(int tab) throws RecognitionException {
        String value = null;


        Token a=null;
        Token b=null;


        	value = null;

        try {
            // src\\calculator.g:437:2: (a= ID '.' b= ID )
            // src\\calculator.g:437:4: a= ID '.' b= ID
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_object1679); 

            match(input,28,FOLLOW_28_in_object1681); 

            b=(Token)match(input,ID,FOLLOW_ID_in_object1685); 

            value = (a!=null?a.getText():null) + "." + (b!=null?b.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "object"



    // $ANTLR start "return_sentence"
    // src\\calculator.g:441:1: return_sentence[int tab] returns [String value] : ( expr_value[$tab] |);
    public final String return_sentence(int tab) throws RecognitionException {
        String value = null;


        String expr_value91 =null;



        	value = null;

        try {
            // src\\calculator.g:445:2: ( expr_value[$tab] |)
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CHAR||(LA27_0 >= ID && LA27_0 <= INT)||LA27_0==9||LA27_0==17||LA27_0==25) ) {
                alt27=1;
            }
            else if ( (LA27_0==32) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // src\\calculator.g:445:4: expr_value[$tab]
                    {
                    pushFollow(FOLLOW_expr_value_in_return_sentence1710);
                    expr_value91=expr_value(tab);

                    state._fsp--;


                    value = expr_value91;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:447:4: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "return_sentence"



    // $ANTLR start "normal_exp"
    // src\\calculator.g:450:1: normal_exp[int tab] returns [String value] : normal_give_value[$tab] expr_[$tab] ;
    public final String normal_exp(int tab) throws RecognitionException {
        String value = null;


        String normal_give_value92 =null;

        String expr_93 =null;



        	value = null;

        try {
            // src\\calculator.g:454:2: ( normal_give_value[$tab] expr_[$tab] )
            // src\\calculator.g:454:4: normal_give_value[$tab] expr_[$tab]
            {
            pushFollow(FOLLOW_normal_give_value_in_normal_exp1741);
            normal_give_value92=normal_give_value(tab);

            state._fsp--;


            pushFollow(FOLLOW_expr__in_normal_exp1744);
            expr_93=expr_(tab);

            state._fsp--;


            value = normal_give_value92 + expr_93;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "normal_exp"



    // $ANTLR start "normal_give_value"
    // src\\calculator.g:458:1: normal_give_value[int tab] returns [String value] : ( ID array[$tab] | object[$tab] );
    public final String normal_give_value(int tab) throws RecognitionException {
        String value = null;


        Token ID94=null;
        String array95 =null;

        String object96 =null;



        	value = null;

        try {
            // src\\calculator.g:462:2: ( ID array[$tab] | object[$tab] )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==28) ) {
                    alt28=2;
                }
                else if ( (LA28_1==10||(LA28_1 >= 12 && LA28_1 <= 16)||(LA28_1 >= 18 && LA28_1 <= 23)||(LA28_1 >= 25 && LA28_1 <= 27)||(LA28_1 >= 29 && LA28_1 <= 30)||(LA28_1 >= 32 && LA28_1 <= 33)||(LA28_1 >= 35 && LA28_1 <= 39)||LA28_1==41||(LA28_1 >= 43 && LA28_1 <= 44)||LA28_1==69) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // src\\calculator.g:462:4: ID array[$tab]
                    {
                    ID94=(Token)match(input,ID,FOLLOW_ID_in_normal_give_value1770); 

                    pushFollow(FOLLOW_array_in_normal_give_value1772);
                    array95=array(tab);

                    state._fsp--;


                    value = (ID94!=null?ID94.getText():null) + array95;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:464:4: object[$tab]
                    {
                    pushFollow(FOLLOW_object_in_normal_give_value1782);
                    object96=object(tab);

                    state._fsp--;


                    value = object96;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "normal_give_value"



    // $ANTLR start "binary_operator"
    // src\\calculator.g:468:1: binary_operator[int tab] returns [String value] : ( '+' | '-' | '*' | '/' | '%' | '^' | '&' | '&&' | '||' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '=' | '>' | '>=' | '==' | '<' | '<=' | '!=' );
    public final String binary_operator(int tab) throws RecognitionException {
        String value = null;



        	value = null;

        try {
            // src\\calculator.g:472:2: ( '+' | '-' | '*' | '/' | '%' | '^' | '&' | '&&' | '||' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '=' | '>' | '>=' | '==' | '<' | '<=' | '!=' )
            int alt29=23;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt29=1;
                }
                break;
            case 25:
                {
                alt29=2;
                }
                break;
            case 19:
                {
                alt29=3;
                }
                break;
            case 29:
                {
                alt29=4;
                }
                break;
            case 12:
                {
                alt29=5;
                }
                break;
            case 43:
                {
                alt29=6;
                }
                break;
            case 15:
                {
                alt29=7;
                }
                break;
            case 14:
                {
                alt29=8;
                }
                break;
            case 69:
                {
                alt29=9;
                }
                break;
            case 23:
                {
                alt29=10;
                }
                break;
            case 27:
                {
                alt29=11;
                }
                break;
            case 20:
                {
                alt29=12;
                }
                break;
            case 30:
                {
                alt29=13;
                }
                break;
            case 13:
                {
                alt29=14;
                }
                break;
            case 44:
                {
                alt29=15;
                }
                break;
            case 16:
                {
                alt29=16;
                }
                break;
            case 36:
                {
                alt29=17;
                }
                break;
            case 38:
                {
                alt29=18;
                }
                break;
            case 39:
                {
                alt29=19;
                }
                break;
            case 37:
                {
                alt29=20;
                }
                break;
            case 33:
                {
                alt29=21;
                }
                break;
            case 35:
                {
                alt29=22;
                }
                break;
            case 10:
                {
                alt29=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // src\\calculator.g:472:4: '+'
                    {
                    match(input,21,FOLLOW_21_in_binary_operator1808); 

                    value = " + ";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:474:4: '-'
                    {
                    match(input,25,FOLLOW_25_in_binary_operator1817); 

                    value = " - ";

                    }
                    break;
                case 3 :
                    // src\\calculator.g:476:4: '*'
                    {
                    match(input,19,FOLLOW_19_in_binary_operator1826); 

                    value = " * ";

                    }
                    break;
                case 4 :
                    // src\\calculator.g:478:4: '/'
                    {
                    match(input,29,FOLLOW_29_in_binary_operator1835); 

                    value = " / ";

                    }
                    break;
                case 5 :
                    // src\\calculator.g:480:4: '%'
                    {
                    match(input,12,FOLLOW_12_in_binary_operator1844); 

                    value = " % ";

                    }
                    break;
                case 6 :
                    // src\\calculator.g:482:4: '^'
                    {
                    match(input,43,FOLLOW_43_in_binary_operator1853); 

                    value = " ^ ";

                    }
                    break;
                case 7 :
                    // src\\calculator.g:484:4: '&'
                    {
                    match(input,15,FOLLOW_15_in_binary_operator1862); 

                    value = " & ";

                    }
                    break;
                case 8 :
                    // src\\calculator.g:486:4: '&&'
                    {
                    match(input,14,FOLLOW_14_in_binary_operator1871); 

                    value = " && ";

                    }
                    break;
                case 9 :
                    // src\\calculator.g:488:4: '||'
                    {
                    match(input,69,FOLLOW_69_in_binary_operator1880); 

                    value = " || ";

                    }
                    break;
                case 10 :
                    // src\\calculator.g:490:4: '+='
                    {
                    match(input,23,FOLLOW_23_in_binary_operator1889); 

                    value = " += ";

                    }
                    break;
                case 11 :
                    // src\\calculator.g:492:4: '-='
                    {
                    match(input,27,FOLLOW_27_in_binary_operator1898); 

                    value = " -= ";

                    }
                    break;
                case 12 :
                    // src\\calculator.g:494:4: '*='
                    {
                    match(input,20,FOLLOW_20_in_binary_operator1907); 

                    value = " *= ";

                    }
                    break;
                case 13 :
                    // src\\calculator.g:496:4: '/='
                    {
                    match(input,30,FOLLOW_30_in_binary_operator1916); 

                    value = " /= ";

                    }
                    break;
                case 14 :
                    // src\\calculator.g:498:4: '%='
                    {
                    match(input,13,FOLLOW_13_in_binary_operator1925); 

                    value = " %= ";

                    }
                    break;
                case 15 :
                    // src\\calculator.g:500:4: '^='
                    {
                    match(input,44,FOLLOW_44_in_binary_operator1934); 

                    value = " ^= ";

                    }
                    break;
                case 16 :
                    // src\\calculator.g:502:4: '&='
                    {
                    match(input,16,FOLLOW_16_in_binary_operator1943); 

                    value = " &= ";

                    }
                    break;
                case 17 :
                    // src\\calculator.g:504:4: '='
                    {
                    match(input,36,FOLLOW_36_in_binary_operator1952); 

                    value = " = ";

                    }
                    break;
                case 18 :
                    // src\\calculator.g:506:4: '>'
                    {
                    match(input,38,FOLLOW_38_in_binary_operator1961); 

                    value = " > ";

                    }
                    break;
                case 19 :
                    // src\\calculator.g:508:4: '>='
                    {
                    match(input,39,FOLLOW_39_in_binary_operator1970); 

                    value = " >= ";

                    }
                    break;
                case 20 :
                    // src\\calculator.g:510:4: '=='
                    {
                    match(input,37,FOLLOW_37_in_binary_operator1979); 

                    value = " == ";

                    }
                    break;
                case 21 :
                    // src\\calculator.g:512:4: '<'
                    {
                    match(input,33,FOLLOW_33_in_binary_operator1988); 

                    value = " < ";

                    }
                    break;
                case 22 :
                    // src\\calculator.g:514:4: '<='
                    {
                    match(input,35,FOLLOW_35_in_binary_operator1997); 

                    value = " <= ";

                    }
                    break;
                case 23 :
                    // src\\calculator.g:516:4: '!='
                    {
                    match(input,10,FOLLOW_10_in_binary_operator2006); 

                    value = " != ";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "binary_operator"



    // $ANTLR start "unary_operator"
    // src\\calculator.g:520:1: unary_operator[int tab] returns [String value] : ( '++' | '--' );
    public final String unary_operator(int tab) throws RecognitionException {
        String value = null;



        	value = null;

        try {
            // src\\calculator.g:524:2: ( '++' | '--' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            else if ( (LA30_0==26) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // src\\calculator.g:524:4: '++'
                    {
                    match(input,22,FOLLOW_22_in_unary_operator2031); 

                    value = "++";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:526:4: '--'
                    {
                    match(input,26,FOLLOW_26_in_unary_operator2040); 

                    value = "--";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "unary_operator"



    // $ANTLR start "ints"
    // src\\calculator.g:530:1: ints[int tab] returns [String value] : ( ',' INT a= ints[$tab] |);
    public final String ints(int tab) throws RecognitionException {
        String value = null;


        Token INT97=null;
        String a =null;



        	value = null;

        try {
            // src\\calculator.g:534:5: ( ',' INT a= ints[$tab] |)
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            else if ( (LA31_0==70) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // src\\calculator.g:534:9: ',' INT a= ints[$tab]
                    {
                    match(input,24,FOLLOW_24_in_ints2070); 

                    INT97=(Token)match(input,INT,FOLLOW_INT_in_ints2072); 

                    pushFollow(FOLLOW_ints_in_ints2076);
                    a=ints(tab);

                    state._fsp--;


                    value = ", " + (INT97!=null?INT97.getText():null) + a;

                    }
                    break;
                case 2 :
                    // src\\calculator.g:536:7: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "ints"



    // $ANTLR start "type"
    // src\\calculator.g:539:1: type[int tab] returns [String value] : ( 'int' | 'char' | 'double' | 'void' | 'int*' | 'double*' | 'string' | 'char*' | 'int&' );
    public final String type(int tab) throws RecognitionException {
        String value = null;



        	value = null;

        try {
            // src\\calculator.g:543:2: ( 'int' | 'char' | 'double' | 'void' | 'int*' | 'double*' | 'string' | 'char*' | 'int&' )
            int alt32=9;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt32=1;
                }
                break;
            case 47:
                {
                alt32=2;
                }
                break;
            case 52:
                {
                alt32=3;
                }
                break;
            case 66:
                {
                alt32=4;
                }
                break;
            case 60:
                {
                alt32=5;
                }
                break;
            case 53:
                {
                alt32=6;
                }
                break;
            case 63:
                {
                alt32=7;
                }
                break;
            case 48:
                {
                alt32=8;
                }
                break;
            case 58:
                {
                alt32=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // src\\calculator.g:543:4: 'int'
                    {
                    match(input,59,FOLLOW_59_in_type2117); 

                    value = "var";

                    }
                    break;
                case 2 :
                    // src\\calculator.g:545:4: 'char'
                    {
                    match(input,47,FOLLOW_47_in_type2126); 

                    value = "var";

                    }
                    break;
                case 3 :
                    // src\\calculator.g:547:4: 'double'
                    {
                    match(input,52,FOLLOW_52_in_type2135); 

                    value = "var";

                    }
                    break;
                case 4 :
                    // src\\calculator.g:549:4: 'void'
                    {
                    match(input,66,FOLLOW_66_in_type2144); 

                    value = "var";

                    }
                    break;
                case 5 :
                    // src\\calculator.g:551:4: 'int*'
                    {
                    match(input,60,FOLLOW_60_in_type2153); 

                    value = "var";

                    }
                    break;
                case 6 :
                    // src\\calculator.g:553:4: 'double*'
                    {
                    match(input,53,FOLLOW_53_in_type2162); 

                    value = "var";

                    }
                    break;
                case 7 :
                    // src\\calculator.g:555:4: 'string'
                    {
                    match(input,63,FOLLOW_63_in_type2171); 

                    value = "var";

                    }
                    break;
                case 8 :
                    // src\\calculator.g:557:4: 'char*'
                    {
                    match(input,48,FOLLOW_48_in_type2180); 

                    value = "var";

                    }
                    break;
                case 9 :
                    // src\\calculator.g:559:4: 'int&'
                    {
                    match(input,58,FOLLOW_58_in_type2189); 

                    value = "int&";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_statements_in_program11 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements38 = new BitSet(new long[]{0x9C31800000000820L,0x0000000000000006L});
    public static final BitSet FOLLOW_statements_in_statements43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_statement75 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_func_or_var_in_statement78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_statement88 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_statement90 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_statement92 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_statement94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_statement103 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_statement105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_statement107 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_statement118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_in_func_or_var143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_var_in_func_or_var153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_name_in_dec_func179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_dec_func182 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000000DL});
    public static final BitSet FOLLOW_func_implement_in_dec_func184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_dec_func187 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_semi_colon_in_dec_func189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_func_name215 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_dec_func_name217 = new BitSet(new long[]{0x9C31800000040000L,0x0000000000000004L});
    public static final BitSet FOLLOW_dec_param_in_dec_func_name219 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_dec_func_name222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_dec_param247 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_dec_param250 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_dec_param__in_dec_param252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_dec_param_283 = new BitSet(new long[]{0x9C31800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_dec_param_in_dec_param_286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_func_implement317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_var344 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_dec_array_in_dec_var346 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_dec_var349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_var360 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_dec_array_in_dec_var362 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_dec_var365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_array_value_in_dec_var367 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_dec_var370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_var379 = new BitSet(new long[]{0x0000001101000000L});
    public static final BitSet FOLLOW_dec_expression_in_dec_var381 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_dec_var__in_dec_var384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_dec_var_410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_dec_var_419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_dec_var_in_dec_var_421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_dec_array450 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_dec_array452 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_dec_array454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_array_value475 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_array_value477 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ints_in_array_value479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_array_value482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_dec_expression507 = new BitSet(new long[]{0x00000000020202D0L});
    public static final BitSet FOLLOW_expr_value_in_dec_expression509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_block540 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000000DL});
    public static final BitSet FOLLOW_block_in_block545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_stat576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_dec_var_in_stat579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ie_stat_in_stat589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stat_in_stat599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stat_in_stat609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_stat_in_stat620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_function_in_stat631 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stat634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_stat643 = new BitSet(new long[]{0x00000001020202D0L});
    public static final BitSet FOLLOW_return_sentence_in_stat645 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stat648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_stat657 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stat659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normal_exp_in_stat668 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stat671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_stat680 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_input_in_stat682 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stat685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_stat694 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_outputs_in_stat696 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stat699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_stat708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stat_in_ie_stat733 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_else_stat_in_ie_stat736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_if_stat762 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_if_stat764 = new BitSet(new long[]{0x00000000020202D0L});
    public static final BitSet FOLLOW_expr_value_in_if_stat766 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_if_stat769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_if_stat771 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000004DL});
    public static final BitSet FOLLOW_block_in_if_stat773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_if_stat776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_else_stat_802 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000004DL});
    public static final BitSet FOLLOW_block_in_else_stat_804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_else_stat_807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ie_stat_in_else_stat_816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_else_stat842 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_else_stat__in_else_stat844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_for_stat875 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_for_stat877 = new BitSet(new long[]{0x9C31801000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_for_para_in_for_stat879 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_stat882 = new BitSet(new long[]{0x00000000000200D0L});
    public static final BitSet FOLLOW_expr_in_for_stat884 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_stat887 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_normal_exp_in_for_stat889 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_for_stat892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_for_stat894 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000004DL});
    public static final BitSet FOLLOW_block_in_for_stat896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_for_stat899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_expression_in_for_para924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normal_exp_in_for_para934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_for_para944 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_normal_exp_in_for_para947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_while_stat973 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_while_stat975 = new BitSet(new long[]{0x00000000000200D0L});
    public static final BitSet FOLLOW_expr_in_while_stat977 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_while_stat980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_while_stat982 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000004DL});
    public static final BitSet FOLLOW_block_in_while_stat984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_while_stat987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_switch_stat1012 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_switch_stat1014 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_switch_stat1016 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_array_in_switch_stat1018 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_switch_stat1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_switch_stat1023 = new BitSet(new long[]{0x0008400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_case_stats_in_switch_stat1025 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_default_stat_in_switch_stat1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_switch_stat1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_stat_in_case_stats1056 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_case_stats_in_case_stats1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_case_stat1092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHAR_in_case_stat1094 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_case_stat1096 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000000DL});
    public static final BitSet FOLLOW_block_in_case_stat1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_default_stat1126 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_default_stat1128 = new BitSet(new long[]{0xDF37A00000000060L,0x000000000000000DL});
    public static final BitSet FOLLOW_block_in_default_stat1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_input1161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_input1163 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_input_in_input1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_outputs1200 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_output_in_outputs1202 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_outputs_in_outputs1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_output1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_output1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call_function1277 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_call_function1279 = new BitSet(new long[]{0x00000000020602D0L});
    public static final BitSet FOLLOW_call_parameter_in_call_function1281 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_call_function1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_value_in_call_parameter1309 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_call_parameter__in_call_parameter1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_call_parameter_1343 = new BitSet(new long[]{0x00000000020202D0L});
    public static final BitSet FOLLOW_call_parameter_in_call_parameter_1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_array1376 = new BitSet(new long[]{0x00000400020202D0L});
    public static final BitSet FOLLOW_index_in_array1378 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_array1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_value_in_index1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_semi_colon1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_value1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_expr_value1482 = new BitSet(new long[]{0x00000000000200D0L});
    public static final BitSet FOLLOW_expr_in_expr_value1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_expr_value1494 = new BitSet(new long[]{0x00000000000200D0L});
    public static final BitSet FOLLOW_expr_in_expr_value1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operand_in_expr1522 = new BitSet(new long[]{0x000018FA6EF9F400L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr__in_expr1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operand1551 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_array_in_operand1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_operand1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_operand1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_operand1583 = new BitSet(new long[]{0x00000000000200D0L});
    public static final BitSet FOLLOW_expr_in_operand1585 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_operand1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_function_in_operand1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_operand1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_expr_1633 = new BitSet(new long[]{0x00000000000200D0L});
    public static final BitSet FOLLOW_expr_in_expr_1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_expr_1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_object1679 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_object1681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_object1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_value_in_return_sentence1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normal_give_value_in_normal_exp1741 = new BitSet(new long[]{0x000018FA6EF9F400L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr__in_normal_exp1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_normal_give_value1770 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_array_in_normal_give_value1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_normal_give_value1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_binary_operator1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_binary_operator1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_binary_operator1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_binary_operator1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_binary_operator1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_binary_operator1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_binary_operator1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_binary_operator1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_binary_operator1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_binary_operator1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_binary_operator1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_binary_operator1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_binary_operator1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_binary_operator1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_binary_operator1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_binary_operator1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_binary_operator1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_binary_operator1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_binary_operator1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_binary_operator1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_binary_operator1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_binary_operator1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_binary_operator2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_unary_operator2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_unary_operator2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ints2070 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_ints2072 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ints_in_ints2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_type2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_type2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_type2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_type2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_type2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_type2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_type2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_type2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_type2189 = new BitSet(new long[]{0x0000000000000002L});

}