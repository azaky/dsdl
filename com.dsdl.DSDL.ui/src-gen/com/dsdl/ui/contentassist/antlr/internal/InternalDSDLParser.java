package com.dsdl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.dsdl.services.DSDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'{'", "'}'", "'table'", "':'", "'('", "')'", "'refer_to'", "'.'", "'integer'", "'varchar'", "'text'", "'datetime'", "'primary_key'", "'auto_increment'", "'nullable'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSDLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g"; }


     
     	private DSDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DSDLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDatabase"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:60:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:61:1: ( ruleDatabase EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:62:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase61);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:69:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:73:2: ( ( ( rule__Database__Group__0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:74:1: ( ( rule__Database__Group__0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:74:1: ( ( rule__Database__Group__0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:75:1: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:76:1: ( rule__Database__Group__0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:76:2: rule__Database__Group__0
            {
            pushFollow(FOLLOW_rule__Database__Group__0_in_ruleDatabase94);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:88:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:89:1: ( ruleTable EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:90:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable121);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:97:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:101:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:102:1: ( ( rule__Table__Group__0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:102:1: ( ( rule__Table__Group__0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:103:1: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:104:1: ( rule__Table__Group__0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:104:2: rule__Table__Group__0
            {
            pushFollow(FOLLOW_rule__Table__Group__0_in_ruleTable154);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleAttribute"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:116:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:117:1: ( ruleAttribute EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:118:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute181);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:125:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:129:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:130:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:130:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:131:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:132:1: ( rule__Attribute__Group__0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:132:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute214);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:144:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:145:1: ( ruleType EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:146:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType241);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:153:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:157:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:158:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:158:1: ( ( rule__Type__Alternatives ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:159:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:160:1: ( rule__Type__Alternatives )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:160:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType274);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleProperty"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:172:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:173:1: ( ruleProperty EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:174:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty301);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:181:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:185:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:186:1: ( ( rule__Property__Alternatives ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:186:1: ( ( rule__Property__Alternatives ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:187:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:188:1: ( rule__Property__Alternatives )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:188:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty334);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleInteger"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:200:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:201:1: ( ruleInteger EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:202:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger361);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:209:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:213:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:214:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:214:1: ( ( rule__Integer__Group__0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:215:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:216:1: ( rule__Integer__Group__0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:216:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger394);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleVarchar"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:228:1: entryRuleVarchar : ruleVarchar EOF ;
    public final void entryRuleVarchar() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:229:1: ( ruleVarchar EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:230:1: ruleVarchar EOF
            {
             before(grammarAccess.getVarcharRule()); 
            pushFollow(FOLLOW_ruleVarchar_in_entryRuleVarchar421);
            ruleVarchar();

            state._fsp--;

             after(grammarAccess.getVarcharRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarchar428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarchar"


    // $ANTLR start "ruleVarchar"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:237:1: ruleVarchar : ( ( rule__Varchar__Group__0 ) ) ;
    public final void ruleVarchar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:241:2: ( ( ( rule__Varchar__Group__0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:242:1: ( ( rule__Varchar__Group__0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:242:1: ( ( rule__Varchar__Group__0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:243:1: ( rule__Varchar__Group__0 )
            {
             before(grammarAccess.getVarcharAccess().getGroup()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:244:1: ( rule__Varchar__Group__0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:244:2: rule__Varchar__Group__0
            {
            pushFollow(FOLLOW_rule__Varchar__Group__0_in_ruleVarchar454);
            rule__Varchar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarcharAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarchar"


    // $ANTLR start "entryRuleText"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:256:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:257:1: ( ruleText EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:258:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText481);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:265:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:269:2: ( ( ( rule__Text__TextAssignment ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:270:1: ( ( rule__Text__TextAssignment ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:270:1: ( ( rule__Text__TextAssignment ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:271:1: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:272:1: ( rule__Text__TextAssignment )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:272:2: rule__Text__TextAssignment
            {
            pushFollow(FOLLOW_rule__Text__TextAssignment_in_ruleText514);
            rule__Text__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleDateTime"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:284:1: entryRuleDateTime : ruleDateTime EOF ;
    public final void entryRuleDateTime() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:285:1: ( ruleDateTime EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:286:1: ruleDateTime EOF
            {
             before(grammarAccess.getDateTimeRule()); 
            pushFollow(FOLLOW_ruleDateTime_in_entryRuleDateTime541);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getDateTimeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTime548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:293:1: ruleDateTime : ( ( rule__DateTime__DateAssignment ) ) ;
    public final void ruleDateTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:297:2: ( ( ( rule__DateTime__DateAssignment ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:298:1: ( ( rule__DateTime__DateAssignment ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:298:1: ( ( rule__DateTime__DateAssignment ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:299:1: ( rule__DateTime__DateAssignment )
            {
             before(grammarAccess.getDateTimeAccess().getDateAssignment()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:300:1: ( rule__DateTime__DateAssignment )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:300:2: rule__DateTime__DateAssignment
            {
            pushFollow(FOLLOW_rule__DateTime__DateAssignment_in_ruleDateTime574);
            rule__DateTime__DateAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeAccess().getDateAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRulePrimaryKey"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:312:1: entryRulePrimaryKey : rulePrimaryKey EOF ;
    public final void entryRulePrimaryKey() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:313:1: ( rulePrimaryKey EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:314:1: rulePrimaryKey EOF
            {
             before(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey601);
            rulePrimaryKey();

            state._fsp--;

             after(grammarAccess.getPrimaryKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryKey608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:321:1: rulePrimaryKey : ( ( rule__PrimaryKey__PrimaryKeyAssignment ) ) ;
    public final void rulePrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:325:2: ( ( ( rule__PrimaryKey__PrimaryKeyAssignment ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:326:1: ( ( rule__PrimaryKey__PrimaryKeyAssignment ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:326:1: ( ( rule__PrimaryKey__PrimaryKeyAssignment ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:327:1: ( rule__PrimaryKey__PrimaryKeyAssignment )
            {
             before(grammarAccess.getPrimaryKeyAccess().getPrimaryKeyAssignment()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:328:1: ( rule__PrimaryKey__PrimaryKeyAssignment )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:328:2: rule__PrimaryKey__PrimaryKeyAssignment
            {
            pushFollow(FOLLOW_rule__PrimaryKey__PrimaryKeyAssignment_in_rulePrimaryKey634);
            rule__PrimaryKey__PrimaryKeyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryKeyAccess().getPrimaryKeyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleAutoIncrement"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:340:1: entryRuleAutoIncrement : ruleAutoIncrement EOF ;
    public final void entryRuleAutoIncrement() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:341:1: ( ruleAutoIncrement EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:342:1: ruleAutoIncrement EOF
            {
             before(grammarAccess.getAutoIncrementRule()); 
            pushFollow(FOLLOW_ruleAutoIncrement_in_entryRuleAutoIncrement661);
            ruleAutoIncrement();

            state._fsp--;

             after(grammarAccess.getAutoIncrementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutoIncrement668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutoIncrement"


    // $ANTLR start "ruleAutoIncrement"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:349:1: ruleAutoIncrement : ( ( rule__AutoIncrement__AutoIncrementAssignment ) ) ;
    public final void ruleAutoIncrement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:353:2: ( ( ( rule__AutoIncrement__AutoIncrementAssignment ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:354:1: ( ( rule__AutoIncrement__AutoIncrementAssignment ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:354:1: ( ( rule__AutoIncrement__AutoIncrementAssignment ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:355:1: ( rule__AutoIncrement__AutoIncrementAssignment )
            {
             before(grammarAccess.getAutoIncrementAccess().getAutoIncrementAssignment()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:356:1: ( rule__AutoIncrement__AutoIncrementAssignment )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:356:2: rule__AutoIncrement__AutoIncrementAssignment
            {
            pushFollow(FOLLOW_rule__AutoIncrement__AutoIncrementAssignment_in_ruleAutoIncrement694);
            rule__AutoIncrement__AutoIncrementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAutoIncrementAccess().getAutoIncrementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutoIncrement"


    // $ANTLR start "entryRuleNullable"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:368:1: entryRuleNullable : ruleNullable EOF ;
    public final void entryRuleNullable() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:369:1: ( ruleNullable EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:370:1: ruleNullable EOF
            {
             before(grammarAccess.getNullableRule()); 
            pushFollow(FOLLOW_ruleNullable_in_entryRuleNullable721);
            ruleNullable();

            state._fsp--;

             after(grammarAccess.getNullableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullable728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullable"


    // $ANTLR start "ruleNullable"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:377:1: ruleNullable : ( ( rule__Nullable__NullableAssignment ) ) ;
    public final void ruleNullable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:381:2: ( ( ( rule__Nullable__NullableAssignment ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:382:1: ( ( rule__Nullable__NullableAssignment ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:382:1: ( ( rule__Nullable__NullableAssignment ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:383:1: ( rule__Nullable__NullableAssignment )
            {
             before(grammarAccess.getNullableAccess().getNullableAssignment()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:384:1: ( rule__Nullable__NullableAssignment )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:384:2: rule__Nullable__NullableAssignment
            {
            pushFollow(FOLLOW_rule__Nullable__NullableAssignment_in_ruleNullable754);
            rule__Nullable__NullableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullableAccess().getNullableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullable"


    // $ANTLR start "entryRuleForeignKey"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:396:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:397:1: ( ruleForeignKey EOF )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:398:1: ruleForeignKey EOF
            {
             before(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey781);
            ruleForeignKey();

            state._fsp--;

             after(grammarAccess.getForeignKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:405:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:409:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:410:1: ( ( rule__ForeignKey__Group__0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:410:1: ( ( rule__ForeignKey__Group__0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:411:1: ( rule__ForeignKey__Group__0 )
            {
             before(grammarAccess.getForeignKeyAccess().getGroup()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:412:1: ( rule__ForeignKey__Group__0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:412:2: rule__ForeignKey__Group__0
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__0_in_ruleForeignKey814);
            rule__ForeignKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:424:1: rule__Type__Alternatives : ( ( ruleInteger ) | ( ruleVarchar ) | ( ruleText ) | ( ruleDateTime ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:428:1: ( ( ruleInteger ) | ( ruleVarchar ) | ( ruleText ) | ( ruleDateTime ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:429:1: ( ruleInteger )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:429:1: ( ruleInteger )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:430:1: ruleInteger
                    {
                     before(grammarAccess.getTypeAccess().getIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInteger_in_rule__Type__Alternatives850);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:435:6: ( ruleVarchar )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:435:6: ( ruleVarchar )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:436:1: ruleVarchar
                    {
                     before(grammarAccess.getTypeAccess().getVarcharParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVarchar_in_rule__Type__Alternatives867);
                    ruleVarchar();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getVarcharParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:441:6: ( ruleText )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:441:6: ( ruleText )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:442:1: ruleText
                    {
                     before(grammarAccess.getTypeAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleText_in_rule__Type__Alternatives884);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTextParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:447:6: ( ruleDateTime )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:447:6: ( ruleDateTime )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:448:1: ruleDateTime
                    {
                     before(grammarAccess.getTypeAccess().getDateTimeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDateTime_in_rule__Type__Alternatives901);
                    ruleDateTime();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDateTimeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:458:1: rule__Property__Alternatives : ( ( rulePrimaryKey ) | ( ruleAutoIncrement ) | ( ruleNullable ) | ( ruleForeignKey ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:462:1: ( ( rulePrimaryKey ) | ( ruleAutoIncrement ) | ( ruleNullable ) | ( ruleForeignKey ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 18:
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
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:463:1: ( rulePrimaryKey )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:463:1: ( rulePrimaryKey )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:464:1: rulePrimaryKey
                    {
                     before(grammarAccess.getPropertyAccess().getPrimaryKeyParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimaryKey_in_rule__Property__Alternatives933);
                    rulePrimaryKey();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPrimaryKeyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:469:6: ( ruleAutoIncrement )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:469:6: ( ruleAutoIncrement )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:470:1: ruleAutoIncrement
                    {
                     before(grammarAccess.getPropertyAccess().getAutoIncrementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAutoIncrement_in_rule__Property__Alternatives950);
                    ruleAutoIncrement();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAutoIncrementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:475:6: ( ruleNullable )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:475:6: ( ruleNullable )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:476:1: ruleNullable
                    {
                     before(grammarAccess.getPropertyAccess().getNullableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNullable_in_rule__Property__Alternatives967);
                    ruleNullable();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getNullableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:481:6: ( ruleForeignKey )
                    {
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:481:6: ( ruleForeignKey )
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:482:1: ruleForeignKey
                    {
                     before(grammarAccess.getPropertyAccess().getForeignKeyParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleForeignKey_in_rule__Property__Alternatives984);
                    ruleForeignKey();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getForeignKeyParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Database__Group__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:494:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:498:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:499:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01014);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01017);
            rule__Database__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:506:1: rule__Database__Group__0__Impl : ( 'database' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:510:1: ( ( 'database' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:511:1: ( 'database' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:511:1: ( 'database' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:512:1: 'database'
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__0__Impl1045); 
             after(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:525:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:529:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:530:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11076);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11079);
            rule__Database__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:537:1: rule__Database__Group__1__Impl : ( ( rule__Database__NameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:541:1: ( ( ( rule__Database__NameAssignment_1 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:542:1: ( ( rule__Database__NameAssignment_1 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:542:1: ( ( rule__Database__NameAssignment_1 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:543:1: ( rule__Database__NameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_1()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:544:1: ( rule__Database__NameAssignment_1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:544:2: rule__Database__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Database__NameAssignment_1_in_rule__Database__Group__1__Impl1106);
            rule__Database__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:554:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:558:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:559:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21136);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__3_in_rule__Database__Group__21139);
            rule__Database__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:566:1: rule__Database__Group__2__Impl : ( '{' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:570:1: ( ( '{' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:571:1: ( '{' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:571:1: ( '{' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:572:1: '{'
            {
             before(grammarAccess.getDatabaseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Database__Group__2__Impl1167); 
             after(grammarAccess.getDatabaseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:585:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:589:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:590:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__31198);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__4_in_rule__Database__Group__31201);
            rule__Database__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:597:1: rule__Database__Group__3__Impl : ( ( rule__Database__TableAssignment_3 )* ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:601:1: ( ( ( rule__Database__TableAssignment_3 )* ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:602:1: ( ( rule__Database__TableAssignment_3 )* )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:602:1: ( ( rule__Database__TableAssignment_3 )* )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:603:1: ( rule__Database__TableAssignment_3 )*
            {
             before(grammarAccess.getDatabaseAccess().getTableAssignment_3()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:604:1: ( rule__Database__TableAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:604:2: rule__Database__TableAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Database__TableAssignment_3_in_rule__Database__Group__3__Impl1228);
            	    rule__Database__TableAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getTableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:614:1: rule__Database__Group__4 : rule__Database__Group__4__Impl ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:618:1: ( rule__Database__Group__4__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:619:2: rule__Database__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__41259);
            rule__Database__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:625:1: rule__Database__Group__4__Impl : ( '}' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:629:1: ( ( '}' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:630:1: ( '}' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:630:1: ( '}' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:631:1: '}'
            {
             before(grammarAccess.getDatabaseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Database__Group__4__Impl1287); 
             after(grammarAccess.getDatabaseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:654:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:658:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:659:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__01328);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__1_in_rule__Table__Group__01331);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:666:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:670:1: ( ( 'table' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:671:1: ( 'table' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:671:1: ( 'table' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:672:1: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Table__Group__0__Impl1359); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:685:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:689:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:690:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__11390);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__2_in_rule__Table__Group__11393);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:697:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:701:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:702:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:702:1: ( ( rule__Table__NameAssignment_1 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:703:1: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:704:1: ( rule__Table__NameAssignment_1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:704:2: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl1420);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:714:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:718:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:719:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__21450);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__3_in_rule__Table__Group__21453);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:726:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:730:1: ( ( '{' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:731:1: ( '{' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:731:1: ( '{' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:732:1: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Table__Group__2__Impl1481); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:745:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:749:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:750:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__31512);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__4_in_rule__Table__Group__31515);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:757:1: rule__Table__Group__3__Impl : ( ( rule__Table__AttributeAssignment_3 )* ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:761:1: ( ( ( rule__Table__AttributeAssignment_3 )* ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:762:1: ( ( rule__Table__AttributeAssignment_3 )* )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:762:1: ( ( rule__Table__AttributeAssignment_3 )* )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:763:1: ( rule__Table__AttributeAssignment_3 )*
            {
             before(grammarAccess.getTableAccess().getAttributeAssignment_3()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:764:1: ( rule__Table__AttributeAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:764:2: rule__Table__AttributeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Table__AttributeAssignment_3_in_rule__Table__Group__3__Impl1542);
            	    rule__Table__AttributeAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:774:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:778:1: ( rule__Table__Group__4__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:779:2: rule__Table__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__41573);
            rule__Table__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:785:1: rule__Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:789:1: ( ( '}' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:790:1: ( '}' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:790:1: ( '}' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:791:1: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Table__Group__4__Impl1601); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:814:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:818:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:819:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01642);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01645);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:826:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttributeNameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:830:1: ( ( ( rule__Attribute__AttributeNameAssignment_0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:831:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:831:1: ( ( rule__Attribute__AttributeNameAssignment_0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:832:1: ( rule__Attribute__AttributeNameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:833:1: ( rule__Attribute__AttributeNameAssignment_0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:833:2: rule__Attribute__AttributeNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__AttributeNameAssignment_0_in_rule__Attribute__Group__0__Impl1672);
            rule__Attribute__AttributeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:843:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:847:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:848:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11702);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11705);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:855:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:859:1: ( ( ':' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:860:1: ( ':' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:860:1: ( ':' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:861:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Attribute__Group__1__Impl1733); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:874:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:878:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:879:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21764);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__21767);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:886:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:890:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:891:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:891:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:892:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:893:1: ( rule__Attribute__TypeAssignment_2 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:893:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1794);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:903:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:907:1: ( rule__Attribute__Group__3__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:908:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__31824);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:914:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__PropertyAssignment_3 )* ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:918:1: ( ( ( rule__Attribute__PropertyAssignment_3 )* ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:919:1: ( ( rule__Attribute__PropertyAssignment_3 )* )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:919:1: ( ( rule__Attribute__PropertyAssignment_3 )* )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:920:1: ( rule__Attribute__PropertyAssignment_3 )*
            {
             before(grammarAccess.getAttributeAccess().getPropertyAssignment_3()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:921:1: ( rule__Attribute__PropertyAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||(LA5_0>=24 && LA5_0<=26)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:921:2: rule__Attribute__PropertyAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__PropertyAssignment_3_in_rule__Attribute__Group__3__Impl1851);
            	    rule__Attribute__PropertyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getPropertyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:939:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:943:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:944:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__01890);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__01893);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:951:1: rule__Integer__Group__0__Impl : ( ( rule__Integer__IntegerAssignment_0 ) ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:955:1: ( ( ( rule__Integer__IntegerAssignment_0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:956:1: ( ( rule__Integer__IntegerAssignment_0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:956:1: ( ( rule__Integer__IntegerAssignment_0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:957:1: ( rule__Integer__IntegerAssignment_0 )
            {
             before(grammarAccess.getIntegerAccess().getIntegerAssignment_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:958:1: ( rule__Integer__IntegerAssignment_0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:958:2: rule__Integer__IntegerAssignment_0
            {
            pushFollow(FOLLOW_rule__Integer__IntegerAssignment_0_in_rule__Integer__Group__0__Impl1920);
            rule__Integer__IntegerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getIntegerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:968:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:972:1: ( rule__Integer__Group__1__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:973:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__11950);
            rule__Integer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:979:1: rule__Integer__Group__1__Impl : ( ( rule__Integer__Group_1__0 )? ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:983:1: ( ( ( rule__Integer__Group_1__0 )? ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:984:1: ( ( rule__Integer__Group_1__0 )? )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:984:1: ( ( rule__Integer__Group_1__0 )? )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:985:1: ( rule__Integer__Group_1__0 )?
            {
             before(grammarAccess.getIntegerAccess().getGroup_1()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:986:1: ( rule__Integer__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:986:2: rule__Integer__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Integer__Group_1__0_in_rule__Integer__Group__1__Impl1977);
                    rule__Integer__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group_1__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1000:1: rule__Integer__Group_1__0 : rule__Integer__Group_1__0__Impl rule__Integer__Group_1__1 ;
    public final void rule__Integer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1004:1: ( rule__Integer__Group_1__0__Impl rule__Integer__Group_1__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1005:2: rule__Integer__Group_1__0__Impl rule__Integer__Group_1__1
            {
            pushFollow(FOLLOW_rule__Integer__Group_1__0__Impl_in_rule__Integer__Group_1__02012);
            rule__Integer__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Integer__Group_1__1_in_rule__Integer__Group_1__02015);
            rule__Integer__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_1__0"


    // $ANTLR start "rule__Integer__Group_1__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1012:1: rule__Integer__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Integer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1016:1: ( ( '(' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1017:1: ( '(' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1017:1: ( '(' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1018:1: '('
            {
             before(grammarAccess.getIntegerAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Integer__Group_1__0__Impl2043); 
             after(grammarAccess.getIntegerAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_1__0__Impl"


    // $ANTLR start "rule__Integer__Group_1__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1031:1: rule__Integer__Group_1__1 : rule__Integer__Group_1__1__Impl rule__Integer__Group_1__2 ;
    public final void rule__Integer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1035:1: ( rule__Integer__Group_1__1__Impl rule__Integer__Group_1__2 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1036:2: rule__Integer__Group_1__1__Impl rule__Integer__Group_1__2
            {
            pushFollow(FOLLOW_rule__Integer__Group_1__1__Impl_in_rule__Integer__Group_1__12074);
            rule__Integer__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Integer__Group_1__2_in_rule__Integer__Group_1__12077);
            rule__Integer__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_1__1"


    // $ANTLR start "rule__Integer__Group_1__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1043:1: rule__Integer__Group_1__1__Impl : ( ( rule__Integer__LengthAssignment_1_1 ) ) ;
    public final void rule__Integer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1047:1: ( ( ( rule__Integer__LengthAssignment_1_1 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1048:1: ( ( rule__Integer__LengthAssignment_1_1 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1048:1: ( ( rule__Integer__LengthAssignment_1_1 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1049:1: ( rule__Integer__LengthAssignment_1_1 )
            {
             before(grammarAccess.getIntegerAccess().getLengthAssignment_1_1()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1050:1: ( rule__Integer__LengthAssignment_1_1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1050:2: rule__Integer__LengthAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Integer__LengthAssignment_1_1_in_rule__Integer__Group_1__1__Impl2104);
            rule__Integer__LengthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_1__1__Impl"


    // $ANTLR start "rule__Integer__Group_1__2"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1060:1: rule__Integer__Group_1__2 : rule__Integer__Group_1__2__Impl ;
    public final void rule__Integer__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1064:1: ( rule__Integer__Group_1__2__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1065:2: rule__Integer__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group_1__2__Impl_in_rule__Integer__Group_1__22134);
            rule__Integer__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_1__2"


    // $ANTLR start "rule__Integer__Group_1__2__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1071:1: rule__Integer__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Integer__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1075:1: ( ( ')' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1076:1: ( ')' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1076:1: ( ')' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1077:1: ')'
            {
             before(grammarAccess.getIntegerAccess().getRightParenthesisKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Integer__Group_1__2__Impl2162); 
             after(grammarAccess.getIntegerAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_1__2__Impl"


    // $ANTLR start "rule__Varchar__Group__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1096:1: rule__Varchar__Group__0 : rule__Varchar__Group__0__Impl rule__Varchar__Group__1 ;
    public final void rule__Varchar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1100:1: ( rule__Varchar__Group__0__Impl rule__Varchar__Group__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1101:2: rule__Varchar__Group__0__Impl rule__Varchar__Group__1
            {
            pushFollow(FOLLOW_rule__Varchar__Group__0__Impl_in_rule__Varchar__Group__02199);
            rule__Varchar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Varchar__Group__1_in_rule__Varchar__Group__02202);
            rule__Varchar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__0"


    // $ANTLR start "rule__Varchar__Group__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1108:1: rule__Varchar__Group__0__Impl : ( ( rule__Varchar__VarcharAssignment_0 ) ) ;
    public final void rule__Varchar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1112:1: ( ( ( rule__Varchar__VarcharAssignment_0 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1113:1: ( ( rule__Varchar__VarcharAssignment_0 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1113:1: ( ( rule__Varchar__VarcharAssignment_0 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1114:1: ( rule__Varchar__VarcharAssignment_0 )
            {
             before(grammarAccess.getVarcharAccess().getVarcharAssignment_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1115:1: ( rule__Varchar__VarcharAssignment_0 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1115:2: rule__Varchar__VarcharAssignment_0
            {
            pushFollow(FOLLOW_rule__Varchar__VarcharAssignment_0_in_rule__Varchar__Group__0__Impl2229);
            rule__Varchar__VarcharAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarcharAccess().getVarcharAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__0__Impl"


    // $ANTLR start "rule__Varchar__Group__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1125:1: rule__Varchar__Group__1 : rule__Varchar__Group__1__Impl ;
    public final void rule__Varchar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1129:1: ( rule__Varchar__Group__1__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1130:2: rule__Varchar__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Varchar__Group__1__Impl_in_rule__Varchar__Group__12259);
            rule__Varchar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__1"


    // $ANTLR start "rule__Varchar__Group__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1136:1: rule__Varchar__Group__1__Impl : ( ( rule__Varchar__Group_1__0 )? ) ;
    public final void rule__Varchar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1140:1: ( ( ( rule__Varchar__Group_1__0 )? ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1141:1: ( ( rule__Varchar__Group_1__0 )? )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1141:1: ( ( rule__Varchar__Group_1__0 )? )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1142:1: ( rule__Varchar__Group_1__0 )?
            {
             before(grammarAccess.getVarcharAccess().getGroup_1()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1143:1: ( rule__Varchar__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1143:2: rule__Varchar__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Varchar__Group_1__0_in_rule__Varchar__Group__1__Impl2286);
                    rule__Varchar__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarcharAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group__1__Impl"


    // $ANTLR start "rule__Varchar__Group_1__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1157:1: rule__Varchar__Group_1__0 : rule__Varchar__Group_1__0__Impl rule__Varchar__Group_1__1 ;
    public final void rule__Varchar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1161:1: ( rule__Varchar__Group_1__0__Impl rule__Varchar__Group_1__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1162:2: rule__Varchar__Group_1__0__Impl rule__Varchar__Group_1__1
            {
            pushFollow(FOLLOW_rule__Varchar__Group_1__0__Impl_in_rule__Varchar__Group_1__02321);
            rule__Varchar__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Varchar__Group_1__1_in_rule__Varchar__Group_1__02324);
            rule__Varchar__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group_1__0"


    // $ANTLR start "rule__Varchar__Group_1__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1169:1: rule__Varchar__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Varchar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1173:1: ( ( '(' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1174:1: ( '(' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1174:1: ( '(' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1175:1: '('
            {
             before(grammarAccess.getVarcharAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Varchar__Group_1__0__Impl2352); 
             after(grammarAccess.getVarcharAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group_1__0__Impl"


    // $ANTLR start "rule__Varchar__Group_1__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1188:1: rule__Varchar__Group_1__1 : rule__Varchar__Group_1__1__Impl rule__Varchar__Group_1__2 ;
    public final void rule__Varchar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1192:1: ( rule__Varchar__Group_1__1__Impl rule__Varchar__Group_1__2 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1193:2: rule__Varchar__Group_1__1__Impl rule__Varchar__Group_1__2
            {
            pushFollow(FOLLOW_rule__Varchar__Group_1__1__Impl_in_rule__Varchar__Group_1__12383);
            rule__Varchar__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Varchar__Group_1__2_in_rule__Varchar__Group_1__12386);
            rule__Varchar__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group_1__1"


    // $ANTLR start "rule__Varchar__Group_1__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1200:1: rule__Varchar__Group_1__1__Impl : ( ( rule__Varchar__LengthAssignment_1_1 ) ) ;
    public final void rule__Varchar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1204:1: ( ( ( rule__Varchar__LengthAssignment_1_1 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1205:1: ( ( rule__Varchar__LengthAssignment_1_1 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1205:1: ( ( rule__Varchar__LengthAssignment_1_1 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1206:1: ( rule__Varchar__LengthAssignment_1_1 )
            {
             before(grammarAccess.getVarcharAccess().getLengthAssignment_1_1()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1207:1: ( rule__Varchar__LengthAssignment_1_1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1207:2: rule__Varchar__LengthAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Varchar__LengthAssignment_1_1_in_rule__Varchar__Group_1__1__Impl2413);
            rule__Varchar__LengthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarcharAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group_1__1__Impl"


    // $ANTLR start "rule__Varchar__Group_1__2"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1217:1: rule__Varchar__Group_1__2 : rule__Varchar__Group_1__2__Impl ;
    public final void rule__Varchar__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1221:1: ( rule__Varchar__Group_1__2__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1222:2: rule__Varchar__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Varchar__Group_1__2__Impl_in_rule__Varchar__Group_1__22443);
            rule__Varchar__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group_1__2"


    // $ANTLR start "rule__Varchar__Group_1__2__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1228:1: rule__Varchar__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Varchar__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1232:1: ( ( ')' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1233:1: ( ')' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1233:1: ( ')' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1234:1: ')'
            {
             before(grammarAccess.getVarcharAccess().getRightParenthesisKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Varchar__Group_1__2__Impl2471); 
             after(grammarAccess.getVarcharAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__Group_1__2__Impl"


    // $ANTLR start "rule__ForeignKey__Group__0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1253:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1257:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1258:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__0__Impl_in_rule__ForeignKey__Group__02508);
            rule__ForeignKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForeignKey__Group__1_in_rule__ForeignKey__Group__02511);
            rule__ForeignKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0"


    // $ANTLR start "rule__ForeignKey__Group__0__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1265:1: rule__ForeignKey__Group__0__Impl : ( 'refer_to' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1269:1: ( ( 'refer_to' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1270:1: ( 'refer_to' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1270:1: ( 'refer_to' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1271:1: 'refer_to'
            {
             before(grammarAccess.getForeignKeyAccess().getRefer_toKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ForeignKey__Group__0__Impl2539); 
             after(grammarAccess.getForeignKeyAccess().getRefer_toKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group__1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1284:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1288:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1289:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__1__Impl_in_rule__ForeignKey__Group__12570);
            rule__ForeignKey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForeignKey__Group__2_in_rule__ForeignKey__Group__12573);
            rule__ForeignKey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1"


    // $ANTLR start "rule__ForeignKey__Group__1__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1296:1: rule__ForeignKey__Group__1__Impl : ( ( rule__ForeignKey__TableNameAssignment_1 ) ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1300:1: ( ( ( rule__ForeignKey__TableNameAssignment_1 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1301:1: ( ( rule__ForeignKey__TableNameAssignment_1 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1301:1: ( ( rule__ForeignKey__TableNameAssignment_1 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1302:1: ( rule__ForeignKey__TableNameAssignment_1 )
            {
             before(grammarAccess.getForeignKeyAccess().getTableNameAssignment_1()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1303:1: ( rule__ForeignKey__TableNameAssignment_1 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1303:2: rule__ForeignKey__TableNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ForeignKey__TableNameAssignment_1_in_rule__ForeignKey__Group__1__Impl2600);
            rule__ForeignKey__TableNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getTableNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__2"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1313:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1317:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1318:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__2__Impl_in_rule__ForeignKey__Group__22630);
            rule__ForeignKey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForeignKey__Group__3_in_rule__ForeignKey__Group__22633);
            rule__ForeignKey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2"


    // $ANTLR start "rule__ForeignKey__Group__2__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1325:1: rule__ForeignKey__Group__2__Impl : ( '.' ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1329:1: ( ( '.' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1330:1: ( '.' )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1330:1: ( '.' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1331:1: '.'
            {
             before(grammarAccess.getForeignKeyAccess().getFullStopKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ForeignKey__Group__2__Impl2661); 
             after(grammarAccess.getForeignKeyAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2__Impl"


    // $ANTLR start "rule__ForeignKey__Group__3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1344:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1348:1: ( rule__ForeignKey__Group__3__Impl )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1349:2: rule__ForeignKey__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__3__Impl_in_rule__ForeignKey__Group__32692);
            rule__ForeignKey__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3"


    // $ANTLR start "rule__ForeignKey__Group__3__Impl"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1355:1: rule__ForeignKey__Group__3__Impl : ( ( rule__ForeignKey__AttributeNameAssignment_3 ) ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1359:1: ( ( ( rule__ForeignKey__AttributeNameAssignment_3 ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1360:1: ( ( rule__ForeignKey__AttributeNameAssignment_3 ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1360:1: ( ( rule__ForeignKey__AttributeNameAssignment_3 ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1361:1: ( rule__ForeignKey__AttributeNameAssignment_3 )
            {
             before(grammarAccess.getForeignKeyAccess().getAttributeNameAssignment_3()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1362:1: ( rule__ForeignKey__AttributeNameAssignment_3 )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1362:2: rule__ForeignKey__AttributeNameAssignment_3
            {
            pushFollow(FOLLOW_rule__ForeignKey__AttributeNameAssignment_3_in_rule__ForeignKey__Group__3__Impl2719);
            rule__ForeignKey__AttributeNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForeignKeyAccess().getAttributeNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3__Impl"


    // $ANTLR start "rule__Database__NameAssignment_1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1381:1: rule__Database__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1385:1: ( ( RULE_ID ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1386:1: ( RULE_ID )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1386:1: ( RULE_ID )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1387:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__NameAssignment_12762); 
             after(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__NameAssignment_1"


    // $ANTLR start "rule__Database__TableAssignment_3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1396:1: rule__Database__TableAssignment_3 : ( ruleTable ) ;
    public final void rule__Database__TableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1400:1: ( ( ruleTable ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1401:1: ( ruleTable )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1401:1: ( ruleTable )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1402:1: ruleTable
            {
             before(grammarAccess.getDatabaseAccess().getTableTableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Database__TableAssignment_32793);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getTableTableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__TableAssignment_3"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1411:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1415:1: ( ( RULE_ID ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1416:1: ( RULE_ID )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1416:1: ( RULE_ID )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1417:1: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Table__NameAssignment_12824); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__AttributeAssignment_3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1426:1: rule__Table__AttributeAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Table__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1430:1: ( ( ruleAttribute ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1431:1: ( ruleAttribute )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1431:1: ( ruleAttribute )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1432:1: ruleAttribute
            {
             before(grammarAccess.getTableAccess().getAttributeAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Table__AttributeAssignment_32855);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTableAccess().getAttributeAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__AttributeAssignment_3"


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1441:1: rule__Attribute__AttributeNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1445:1: ( ( RULE_ID ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1446:1: ( RULE_ID )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1446:1: ( RULE_ID )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1447:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__AttributeNameAssignment_02886); 
             after(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeNameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1456:1: rule__Attribute__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1460:1: ( ( ruleType ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1461:1: ( ruleType )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1461:1: ( ruleType )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1462:1: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Attribute__TypeAssignment_22917);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__PropertyAssignment_3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1471:1: rule__Attribute__PropertyAssignment_3 : ( ruleProperty ) ;
    public final void rule__Attribute__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1475:1: ( ( ruleProperty ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1476:1: ( ruleProperty )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1476:1: ( ruleProperty )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1477:1: ruleProperty
            {
             before(grammarAccess.getAttributeAccess().getPropertyPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Attribute__PropertyAssignment_32948);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getPropertyPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__PropertyAssignment_3"


    // $ANTLR start "rule__Integer__IntegerAssignment_0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1486:1: rule__Integer__IntegerAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__Integer__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1490:1: ( ( ( 'integer' ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1491:1: ( ( 'integer' ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1491:1: ( ( 'integer' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1492:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerAccess().getIntegerIntegerKeyword_0_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1493:1: ( 'integer' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1494:1: 'integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerIntegerKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Integer__IntegerAssignment_02984); 
             after(grammarAccess.getIntegerAccess().getIntegerIntegerKeyword_0_0()); 

            }

             after(grammarAccess.getIntegerAccess().getIntegerIntegerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__IntegerAssignment_0"


    // $ANTLR start "rule__Integer__LengthAssignment_1_1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1509:1: rule__Integer__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Integer__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1513:1: ( ( RULE_INT ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1514:1: ( RULE_INT )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1514:1: ( RULE_INT )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1515:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Integer__LengthAssignment_1_13023); 
             after(grammarAccess.getIntegerAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__LengthAssignment_1_1"


    // $ANTLR start "rule__Varchar__VarcharAssignment_0"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1524:1: rule__Varchar__VarcharAssignment_0 : ( ( 'varchar' ) ) ;
    public final void rule__Varchar__VarcharAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1528:1: ( ( ( 'varchar' ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1529:1: ( ( 'varchar' ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1529:1: ( ( 'varchar' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1530:1: ( 'varchar' )
            {
             before(grammarAccess.getVarcharAccess().getVarcharVarcharKeyword_0_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1531:1: ( 'varchar' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1532:1: 'varchar'
            {
             before(grammarAccess.getVarcharAccess().getVarcharVarcharKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Varchar__VarcharAssignment_03059); 
             after(grammarAccess.getVarcharAccess().getVarcharVarcharKeyword_0_0()); 

            }

             after(grammarAccess.getVarcharAccess().getVarcharVarcharKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__VarcharAssignment_0"


    // $ANTLR start "rule__Varchar__LengthAssignment_1_1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1547:1: rule__Varchar__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Varchar__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1551:1: ( ( RULE_INT ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1552:1: ( RULE_INT )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1552:1: ( RULE_INT )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1553:1: RULE_INT
            {
             before(grammarAccess.getVarcharAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Varchar__LengthAssignment_1_13098); 
             after(grammarAccess.getVarcharAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varchar__LengthAssignment_1_1"


    // $ANTLR start "rule__Text__TextAssignment"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1562:1: rule__Text__TextAssignment : ( ( 'text' ) ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1566:1: ( ( ( 'text' ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1567:1: ( ( 'text' ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1567:1: ( ( 'text' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1568:1: ( 'text' )
            {
             before(grammarAccess.getTextAccess().getTextTextKeyword_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1569:1: ( 'text' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1570:1: 'text'
            {
             before(grammarAccess.getTextAccess().getTextTextKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Text__TextAssignment3134); 
             after(grammarAccess.getTextAccess().getTextTextKeyword_0()); 

            }

             after(grammarAccess.getTextAccess().getTextTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment"


    // $ANTLR start "rule__DateTime__DateAssignment"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1585:1: rule__DateTime__DateAssignment : ( ( 'datetime' ) ) ;
    public final void rule__DateTime__DateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1589:1: ( ( ( 'datetime' ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1590:1: ( ( 'datetime' ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1590:1: ( ( 'datetime' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1591:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimeAccess().getDateDatetimeKeyword_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1592:1: ( 'datetime' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1593:1: 'datetime'
            {
             before(grammarAccess.getDateTimeAccess().getDateDatetimeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DateTime__DateAssignment3178); 
             after(grammarAccess.getDateTimeAccess().getDateDatetimeKeyword_0()); 

            }

             after(grammarAccess.getDateTimeAccess().getDateDatetimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTime__DateAssignment"


    // $ANTLR start "rule__PrimaryKey__PrimaryKeyAssignment"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1608:1: rule__PrimaryKey__PrimaryKeyAssignment : ( ( 'primary_key' ) ) ;
    public final void rule__PrimaryKey__PrimaryKeyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1612:1: ( ( ( 'primary_key' ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1613:1: ( ( 'primary_key' ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1613:1: ( ( 'primary_key' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1614:1: ( 'primary_key' )
            {
             before(grammarAccess.getPrimaryKeyAccess().getPrimaryKeyPrimary_keyKeyword_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1615:1: ( 'primary_key' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1616:1: 'primary_key'
            {
             before(grammarAccess.getPrimaryKeyAccess().getPrimaryKeyPrimary_keyKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__PrimaryKey__PrimaryKeyAssignment3222); 
             after(grammarAccess.getPrimaryKeyAccess().getPrimaryKeyPrimary_keyKeyword_0()); 

            }

             after(grammarAccess.getPrimaryKeyAccess().getPrimaryKeyPrimary_keyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryKey__PrimaryKeyAssignment"


    // $ANTLR start "rule__AutoIncrement__AutoIncrementAssignment"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1631:1: rule__AutoIncrement__AutoIncrementAssignment : ( ( 'auto_increment' ) ) ;
    public final void rule__AutoIncrement__AutoIncrementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1635:1: ( ( ( 'auto_increment' ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1636:1: ( ( 'auto_increment' ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1636:1: ( ( 'auto_increment' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1637:1: ( 'auto_increment' )
            {
             before(grammarAccess.getAutoIncrementAccess().getAutoIncrementAuto_incrementKeyword_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1638:1: ( 'auto_increment' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1639:1: 'auto_increment'
            {
             before(grammarAccess.getAutoIncrementAccess().getAutoIncrementAuto_incrementKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__AutoIncrement__AutoIncrementAssignment3266); 
             after(grammarAccess.getAutoIncrementAccess().getAutoIncrementAuto_incrementKeyword_0()); 

            }

             after(grammarAccess.getAutoIncrementAccess().getAutoIncrementAuto_incrementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoIncrement__AutoIncrementAssignment"


    // $ANTLR start "rule__Nullable__NullableAssignment"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1654:1: rule__Nullable__NullableAssignment : ( ( 'nullable' ) ) ;
    public final void rule__Nullable__NullableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1658:1: ( ( ( 'nullable' ) ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1659:1: ( ( 'nullable' ) )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1659:1: ( ( 'nullable' ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1660:1: ( 'nullable' )
            {
             before(grammarAccess.getNullableAccess().getNullableNullableKeyword_0()); 
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1661:1: ( 'nullable' )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1662:1: 'nullable'
            {
             before(grammarAccess.getNullableAccess().getNullableNullableKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Nullable__NullableAssignment3310); 
             after(grammarAccess.getNullableAccess().getNullableNullableKeyword_0()); 

            }

             after(grammarAccess.getNullableAccess().getNullableNullableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nullable__NullableAssignment"


    // $ANTLR start "rule__ForeignKey__TableNameAssignment_1"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1677:1: rule__ForeignKey__TableNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForeignKey__TableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1681:1: ( ( RULE_ID ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1682:1: ( RULE_ID )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1682:1: ( RULE_ID )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1683:1: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getTableNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeignKey__TableNameAssignment_13349); 
             after(grammarAccess.getForeignKeyAccess().getTableNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__TableNameAssignment_1"


    // $ANTLR start "rule__ForeignKey__AttributeNameAssignment_3"
    // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1692:1: rule__ForeignKey__AttributeNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ForeignKey__AttributeNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1696:1: ( ( RULE_ID ) )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1697:1: ( RULE_ID )
            {
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1697:1: ( RULE_ID )
            // ../com.dsdl.DSDL.ui/src-gen/com/dsdl/ui/contentassist/antlr/internal/InternalDSDL.g:1698:1: RULE_ID
            {
             before(grammarAccess.getForeignKeyAccess().getAttributeNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeignKey__AttributeNameAssignment_33380); 
             after(grammarAccess.getForeignKeyAccess().getAttributeNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__AttributeNameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0_in_ruleDatabase94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarchar_in_entryRuleVarchar421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarchar428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__Group__0_in_ruleVarchar454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__TextAssignment_in_ruleText514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTime_in_entryRuleDateTime541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTime548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTime__DateAssignment_in_ruleDateTime574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryKey608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryKey__PrimaryKeyAssignment_in_rulePrimaryKey634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutoIncrement_in_entryRuleAutoIncrement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutoIncrement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AutoIncrement__AutoIncrementAssignment_in_ruleAutoIncrement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullable_in_entryRuleNullable721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullable728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nullable__NullableAssignment_in_ruleNullable754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__0_in_ruleForeignKey814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Type__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarchar_in_rule__Type__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Type__Alternatives884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTime_in_rule__Type__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_rule__Property__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutoIncrement_in_rule__Property__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullable_in_rule__Property__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_rule__Property__Alternatives984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__0__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11076 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameAssignment_1_in_rule__Database__Group__1__Impl1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21136 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Database__Group__3_in_rule__Database__Group__21139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Database__Group__2__Impl1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__31198 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Database__Group__4_in_rule__Database__Group__31201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__TableAssignment_3_in_rule__Database__Group__3__Impl1228 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__41259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Database__Group__4__Impl1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__01328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__01331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Table__Group__0__Impl1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__11390 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__21450 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__21453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Table__Group__2__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__31512 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__31515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__AttributeAssignment_3_in_rule__Table__Group__3__Impl1542 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__41573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Table__Group__4__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01642 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttributeNameAssignment_0_in_rule__Attribute__Group__0__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11702 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Attribute__Group__1__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21764 = new BitSet(new long[]{0x0000000007040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__21767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__31824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PropertyAssignment_3_in_rule__Attribute__Group__3__Impl1851 = new BitSet(new long[]{0x0000000007040002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__01890 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__01893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__IntegerAssignment_0_in_rule__Integer__Group__0__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__11950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__0_in_rule__Integer__Group__1__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__0__Impl_in_rule__Integer__Group_1__02012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__1_in_rule__Integer__Group_1__02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Integer__Group_1__0__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__1__Impl_in_rule__Integer__Group_1__12074 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__2_in_rule__Integer__Group_1__12077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__LengthAssignment_1_1_in_rule__Integer__Group_1__1__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group_1__2__Impl_in_rule__Integer__Group_1__22134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Integer__Group_1__2__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__Group__0__Impl_in_rule__Varchar__Group__02199 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Varchar__Group__1_in_rule__Varchar__Group__02202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__VarcharAssignment_0_in_rule__Varchar__Group__0__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__Group__1__Impl_in_rule__Varchar__Group__12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__Group_1__0_in_rule__Varchar__Group__1__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__Group_1__0__Impl_in_rule__Varchar__Group_1__02321 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Varchar__Group_1__1_in_rule__Varchar__Group_1__02324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Varchar__Group_1__0__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__Group_1__1__Impl_in_rule__Varchar__Group_1__12383 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Varchar__Group_1__2_in_rule__Varchar__Group_1__12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__LengthAssignment_1_1_in_rule__Varchar__Group_1__1__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Varchar__Group_1__2__Impl_in_rule__Varchar__Group_1__22443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Varchar__Group_1__2__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__0__Impl_in_rule__ForeignKey__Group__02508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__1_in_rule__ForeignKey__Group__02511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ForeignKey__Group__0__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__1__Impl_in_rule__ForeignKey__Group__12570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__2_in_rule__ForeignKey__Group__12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__TableNameAssignment_1_in_rule__ForeignKey__Group__1__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__2__Impl_in_rule__ForeignKey__Group__22630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__3_in_rule__ForeignKey__Group__22633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ForeignKey__Group__2__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__3__Impl_in_rule__ForeignKey__Group__32692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__AttributeNameAssignment_3_in_rule__ForeignKey__Group__3__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__NameAssignment_12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Database__TableAssignment_32793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Table__NameAssignment_12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Table__AttributeAssignment_32855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__AttributeNameAssignment_02886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Attribute__TypeAssignment_22917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Attribute__PropertyAssignment_32948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Integer__IntegerAssignment_02984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__LengthAssignment_1_13023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Varchar__VarcharAssignment_03059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Varchar__LengthAssignment_1_13098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Text__TextAssignment3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DateTime__DateAssignment3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimaryKey__PrimaryKeyAssignment3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AutoIncrement__AutoIncrementAssignment3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Nullable__NullableAssignment3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeignKey__TableNameAssignment_13349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeignKey__AttributeNameAssignment_33380 = new BitSet(new long[]{0x0000000000000002L});

}