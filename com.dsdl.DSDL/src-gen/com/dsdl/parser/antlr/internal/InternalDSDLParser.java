package com.dsdl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.dsdl.services.DSDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'{'", "'}'", "'table'", "':'", "'integer'", "'('", "')'", "'varchar'", "'text'", "'datetime'", "'primary_key'", "'auto_increment'", "'nullable'", "'refer_to'", "'.'"
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
    public String getGrammarFileName() { return "../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g"; }



     	private DSDLGrammarAccess grammarAccess;
     	
        public InternalDSDLParser(TokenStream input, DSDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Database";	
       	}
       	
       	@Override
       	protected DSDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDatabase"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:67:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:68:2: (iv_ruleDatabase= ruleDatabase EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:69:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase75);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:76:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )* otherlv_4= '}' ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_table_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:79:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )* otherlv_4= '}' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:80:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )* otherlv_4= '}' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:80:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )* otherlv_4= '}' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:80:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDatabase122); 

                	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getDatabaseKeyword_0());
                
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:85:1: (lv_name_1_0= RULE_ID )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDatabase156); 

                	newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:106:1: ( (lv_table_3_0= ruleTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:107:1: (lv_table_3_0= ruleTable )
            	    {
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:107:1: (lv_table_3_0= ruleTable )
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:108:3: lv_table_3_0= ruleTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatabaseAccess().getTableTableParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTable_in_ruleDatabase177);
            	    lv_table_3_0=ruleTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"table",
            	            		lv_table_3_0, 
            	            		"Table");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDatabase190); 

                	newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:136:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:137:2: (iv_ruleTable= ruleTable EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:138:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable226);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:145:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attribute_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:148:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:149:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:149:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:149:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTable273); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:154:1: (lv_name_1_0= RULE_ID )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTable290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTable307); 

                	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:175:1: ( (lv_attribute_3_0= ruleAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:176:1: (lv_attribute_3_0= ruleAttribute )
            	    {
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:176:1: (lv_attribute_3_0= ruleAttribute )
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:177:3: lv_attribute_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getAttributeAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleTable328);
            	    lv_attribute_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTable341); 

                	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleAttribute"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:205:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:206:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:207:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute377);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:214:1: ruleAttribute returns [EObject current=null] : ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_property_3_0= ruleProperty ) )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attributeName_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;

        EObject lv_property_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:217:28: ( ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_property_3_0= ruleProperty ) )* ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:218:1: ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_property_3_0= ruleProperty ) )* )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:218:1: ( ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_property_3_0= ruleProperty ) )* )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:218:2: ( (lv_attributeName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_property_3_0= ruleProperty ) )*
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:218:2: ( (lv_attributeName_0_0= RULE_ID ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:219:1: (lv_attributeName_0_0= RULE_ID )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:219:1: (lv_attributeName_0_0= RULE_ID )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:220:3: lv_attributeName_0_0= RULE_ID
            {
            lv_attributeName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute429); 

            			newLeafNode(lv_attributeName_0_0, grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAttribute446); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:240:1: ( (lv_type_2_0= ruleType ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:241:1: (lv_type_2_0= ruleType )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:241:1: (lv_type_2_0= ruleType )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:242:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAttribute467);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:258:2: ( (lv_property_3_0= ruleProperty ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=22 && LA3_0<=25)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:259:1: (lv_property_3_0= ruleProperty )
            	    {
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:259:1: (lv_property_3_0= ruleProperty )
            	    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:260:3: lv_property_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeAccess().getPropertyPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleAttribute488);
            	    lv_property_3_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"property",
            	            		lv_property_3_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:284:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:285:2: (iv_ruleType= ruleType EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:286:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType525);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:293:1: ruleType returns [EObject current=null] : (this_Integer_0= ruleInteger | this_Varchar_1= ruleVarchar | this_Text_2= ruleText | this_DateTime_3= ruleDateTime ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Integer_0 = null;

        EObject this_Varchar_1 = null;

        EObject this_Text_2 = null;

        EObject this_DateTime_3 = null;


         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:296:28: ( (this_Integer_0= ruleInteger | this_Varchar_1= ruleVarchar | this_Text_2= ruleText | this_DateTime_3= ruleDateTime ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:297:1: (this_Integer_0= ruleInteger | this_Varchar_1= ruleVarchar | this_Text_2= ruleText | this_DateTime_3= ruleDateTime )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:297:1: (this_Integer_0= ruleInteger | this_Varchar_1= ruleVarchar | this_Text_2= ruleText | this_DateTime_3= ruleDateTime )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:298:5: this_Integer_0= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInteger_in_ruleType582);
                    this_Integer_0=ruleInteger();

                    state._fsp--;

                     
                            current = this_Integer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:308:5: this_Varchar_1= ruleVarchar
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getVarcharParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVarchar_in_ruleType609);
                    this_Varchar_1=ruleVarchar();

                    state._fsp--;

                     
                            current = this_Varchar_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:318:5: this_Text_2= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTextParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleType636);
                    this_Text_2=ruleText();

                    state._fsp--;

                     
                            current = this_Text_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:328:5: this_DateTime_3= ruleDateTime
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDateTimeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDateTime_in_ruleType663);
                    this_DateTime_3=ruleDateTime();

                    state._fsp--;

                     
                            current = this_DateTime_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleProperty"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:344:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:345:2: (iv_ruleProperty= ruleProperty EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:346:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty698);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty708); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:353:1: ruleProperty returns [EObject current=null] : (this_PrimaryKey_0= rulePrimaryKey | this_AutoIncrement_1= ruleAutoIncrement | this_Nullable_2= ruleNullable | this_ForeignKey_3= ruleForeignKey ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryKey_0 = null;

        EObject this_AutoIncrement_1 = null;

        EObject this_Nullable_2 = null;

        EObject this_ForeignKey_3 = null;


         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:356:28: ( (this_PrimaryKey_0= rulePrimaryKey | this_AutoIncrement_1= ruleAutoIncrement | this_Nullable_2= ruleNullable | this_ForeignKey_3= ruleForeignKey ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:357:1: (this_PrimaryKey_0= rulePrimaryKey | this_AutoIncrement_1= ruleAutoIncrement | this_Nullable_2= ruleNullable | this_ForeignKey_3= ruleForeignKey )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:357:1: (this_PrimaryKey_0= rulePrimaryKey | this_AutoIncrement_1= ruleAutoIncrement | this_Nullable_2= ruleNullable | this_ForeignKey_3= ruleForeignKey )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:358:5: this_PrimaryKey_0= rulePrimaryKey
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getPrimaryKeyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimaryKey_in_ruleProperty755);
                    this_PrimaryKey_0=rulePrimaryKey();

                    state._fsp--;

                     
                            current = this_PrimaryKey_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:368:5: this_AutoIncrement_1= ruleAutoIncrement
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAutoIncrementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAutoIncrement_in_ruleProperty782);
                    this_AutoIncrement_1=ruleAutoIncrement();

                    state._fsp--;

                     
                            current = this_AutoIncrement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:378:5: this_Nullable_2= ruleNullable
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getNullableParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNullable_in_ruleProperty809);
                    this_Nullable_2=ruleNullable();

                    state._fsp--;

                     
                            current = this_Nullable_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:388:5: this_ForeignKey_3= ruleForeignKey
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getForeignKeyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleForeignKey_in_ruleProperty836);
                    this_ForeignKey_3=ruleForeignKey();

                    state._fsp--;

                     
                            current = this_ForeignKey_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleInteger"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:404:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:405:2: (iv_ruleInteger= ruleInteger EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:406:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger871);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger881); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:413:1: ruleInteger returns [EObject current=null] : ( ( (lv_integer_0_0= 'integer' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:416:28: ( ( ( (lv_integer_0_0= 'integer' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:417:1: ( ( (lv_integer_0_0= 'integer' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:417:1: ( ( (lv_integer_0_0= 'integer' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:417:2: ( (lv_integer_0_0= 'integer' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )?
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:417:2: ( (lv_integer_0_0= 'integer' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:418:1: (lv_integer_0_0= 'integer' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:418:1: (lv_integer_0_0= 'integer' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:419:3: lv_integer_0_0= 'integer'
            {
            lv_integer_0_0=(Token)match(input,16,FOLLOW_16_in_ruleInteger924); 

                    newLeafNode(lv_integer_0_0, grammarAccess.getIntegerAccess().getIntegerIntegerKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerRule());
            	        }
                   		setWithLastConsumed(current, "integer", lv_integer_0_0, "integer");
            	    

            }


            }

            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:432:2: (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:432:4: otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleInteger950); 

                        	newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:436:1: ( (lv_length_2_0= RULE_INT ) )
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:437:1: (lv_length_2_0= RULE_INT )
                    {
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:437:1: (lv_length_2_0= RULE_INT )
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:438:3: lv_length_2_0= RULE_INT
                    {
                    lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger967); 

                    			newLeafNode(lv_length_2_0, grammarAccess.getIntegerAccess().getLengthINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"length",
                            		lv_length_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleInteger984); 

                        	newLeafNode(otherlv_3, grammarAccess.getIntegerAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleVarchar"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:466:1: entryRuleVarchar returns [EObject current=null] : iv_ruleVarchar= ruleVarchar EOF ;
    public final EObject entryRuleVarchar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarchar = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:467:2: (iv_ruleVarchar= ruleVarchar EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:468:2: iv_ruleVarchar= ruleVarchar EOF
            {
             newCompositeNode(grammarAccess.getVarcharRule()); 
            pushFollow(FOLLOW_ruleVarchar_in_entryRuleVarchar1022);
            iv_ruleVarchar=ruleVarchar();

            state._fsp--;

             current =iv_ruleVarchar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarchar1032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarchar"


    // $ANTLR start "ruleVarchar"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:475:1: ruleVarchar returns [EObject current=null] : ( ( (lv_varchar_0_0= 'varchar' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleVarchar() throws RecognitionException {
        EObject current = null;

        Token lv_varchar_0_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:478:28: ( ( ( (lv_varchar_0_0= 'varchar' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:479:1: ( ( (lv_varchar_0_0= 'varchar' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:479:1: ( ( (lv_varchar_0_0= 'varchar' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )? )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:479:2: ( (lv_varchar_0_0= 'varchar' ) ) (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )?
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:479:2: ( (lv_varchar_0_0= 'varchar' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:480:1: (lv_varchar_0_0= 'varchar' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:480:1: (lv_varchar_0_0= 'varchar' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:481:3: lv_varchar_0_0= 'varchar'
            {
            lv_varchar_0_0=(Token)match(input,19,FOLLOW_19_in_ruleVarchar1075); 

                    newLeafNode(lv_varchar_0_0, grammarAccess.getVarcharAccess().getVarcharVarcharKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarcharRule());
            	        }
                   		setWithLastConsumed(current, "varchar", lv_varchar_0_0, "varchar");
            	    

            }


            }

            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:494:2: (otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:494:4: otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVarchar1101); 

                        	newLeafNode(otherlv_1, grammarAccess.getVarcharAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:498:1: ( (lv_length_2_0= RULE_INT ) )
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:499:1: (lv_length_2_0= RULE_INT )
                    {
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:499:1: (lv_length_2_0= RULE_INT )
                    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:500:3: lv_length_2_0= RULE_INT
                    {
                    lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVarchar1118); 

                    			newLeafNode(lv_length_2_0, grammarAccess.getVarcharAccess().getLengthINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarcharRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"length",
                            		lv_length_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVarchar1135); 

                        	newLeafNode(otherlv_3, grammarAccess.getVarcharAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarchar"


    // $ANTLR start "entryRuleText"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:528:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:529:2: (iv_ruleText= ruleText EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:530:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1173);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1183); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:537:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= 'text' ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:540:28: ( ( (lv_text_0_0= 'text' ) ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:541:1: ( (lv_text_0_0= 'text' ) )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:541:1: ( (lv_text_0_0= 'text' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:542:1: (lv_text_0_0= 'text' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:542:1: (lv_text_0_0= 'text' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:543:3: lv_text_0_0= 'text'
            {
            lv_text_0_0=(Token)match(input,20,FOLLOW_20_in_ruleText1225); 

                    newLeafNode(lv_text_0_0, grammarAccess.getTextAccess().getTextTextKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextRule());
            	        }
                   		setWithLastConsumed(current, "text", lv_text_0_0, "text");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleDateTime"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:564:1: entryRuleDateTime returns [EObject current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final EObject entryRuleDateTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTime = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:565:2: (iv_ruleDateTime= ruleDateTime EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:566:2: iv_ruleDateTime= ruleDateTime EOF
            {
             newCompositeNode(grammarAccess.getDateTimeRule()); 
            pushFollow(FOLLOW_ruleDateTime_in_entryRuleDateTime1273);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;

             current =iv_ruleDateTime; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTime1283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:573:1: ruleDateTime returns [EObject current=null] : ( (lv_date_0_0= 'datetime' ) ) ;
    public final EObject ruleDateTime() throws RecognitionException {
        EObject current = null;

        Token lv_date_0_0=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:576:28: ( ( (lv_date_0_0= 'datetime' ) ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:577:1: ( (lv_date_0_0= 'datetime' ) )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:577:1: ( (lv_date_0_0= 'datetime' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:578:1: (lv_date_0_0= 'datetime' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:578:1: (lv_date_0_0= 'datetime' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:579:3: lv_date_0_0= 'datetime'
            {
            lv_date_0_0=(Token)match(input,21,FOLLOW_21_in_ruleDateTime1325); 

                    newLeafNode(lv_date_0_0, grammarAccess.getDateTimeAccess().getDateDatetimeKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateTimeRule());
            	        }
                   		setWithLastConsumed(current, "date", lv_date_0_0, "datetime");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRulePrimaryKey"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:600:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:601:2: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:602:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey1373);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryKey1383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:609:1: rulePrimaryKey returns [EObject current=null] : ( (lv_primaryKey_0_0= 'primary_key' ) ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token lv_primaryKey_0_0=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:612:28: ( ( (lv_primaryKey_0_0= 'primary_key' ) ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:613:1: ( (lv_primaryKey_0_0= 'primary_key' ) )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:613:1: ( (lv_primaryKey_0_0= 'primary_key' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:614:1: (lv_primaryKey_0_0= 'primary_key' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:614:1: (lv_primaryKey_0_0= 'primary_key' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:615:3: lv_primaryKey_0_0= 'primary_key'
            {
            lv_primaryKey_0_0=(Token)match(input,22,FOLLOW_22_in_rulePrimaryKey1425); 

                    newLeafNode(lv_primaryKey_0_0, grammarAccess.getPrimaryKeyAccess().getPrimaryKeyPrimary_keyKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	        }
                   		setWithLastConsumed(current, "primaryKey", true, "primary_key");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleAutoIncrement"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:636:1: entryRuleAutoIncrement returns [EObject current=null] : iv_ruleAutoIncrement= ruleAutoIncrement EOF ;
    public final EObject entryRuleAutoIncrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoIncrement = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:637:2: (iv_ruleAutoIncrement= ruleAutoIncrement EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:638:2: iv_ruleAutoIncrement= ruleAutoIncrement EOF
            {
             newCompositeNode(grammarAccess.getAutoIncrementRule()); 
            pushFollow(FOLLOW_ruleAutoIncrement_in_entryRuleAutoIncrement1473);
            iv_ruleAutoIncrement=ruleAutoIncrement();

            state._fsp--;

             current =iv_ruleAutoIncrement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutoIncrement1483); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutoIncrement"


    // $ANTLR start "ruleAutoIncrement"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:645:1: ruleAutoIncrement returns [EObject current=null] : ( (lv_autoIncrement_0_0= 'auto_increment' ) ) ;
    public final EObject ruleAutoIncrement() throws RecognitionException {
        EObject current = null;

        Token lv_autoIncrement_0_0=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:648:28: ( ( (lv_autoIncrement_0_0= 'auto_increment' ) ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:649:1: ( (lv_autoIncrement_0_0= 'auto_increment' ) )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:649:1: ( (lv_autoIncrement_0_0= 'auto_increment' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:650:1: (lv_autoIncrement_0_0= 'auto_increment' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:650:1: (lv_autoIncrement_0_0= 'auto_increment' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:651:3: lv_autoIncrement_0_0= 'auto_increment'
            {
            lv_autoIncrement_0_0=(Token)match(input,23,FOLLOW_23_in_ruleAutoIncrement1525); 

                    newLeafNode(lv_autoIncrement_0_0, grammarAccess.getAutoIncrementAccess().getAutoIncrementAuto_incrementKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAutoIncrementRule());
            	        }
                   		setWithLastConsumed(current, "autoIncrement", true, "auto_increment");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutoIncrement"


    // $ANTLR start "entryRuleNullable"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:672:1: entryRuleNullable returns [EObject current=null] : iv_ruleNullable= ruleNullable EOF ;
    public final EObject entryRuleNullable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullable = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:673:2: (iv_ruleNullable= ruleNullable EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:674:2: iv_ruleNullable= ruleNullable EOF
            {
             newCompositeNode(grammarAccess.getNullableRule()); 
            pushFollow(FOLLOW_ruleNullable_in_entryRuleNullable1573);
            iv_ruleNullable=ruleNullable();

            state._fsp--;

             current =iv_ruleNullable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullable1583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullable"


    // $ANTLR start "ruleNullable"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:681:1: ruleNullable returns [EObject current=null] : ( (lv_nullable_0_0= 'nullable' ) ) ;
    public final EObject ruleNullable() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_0_0=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:684:28: ( ( (lv_nullable_0_0= 'nullable' ) ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:685:1: ( (lv_nullable_0_0= 'nullable' ) )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:685:1: ( (lv_nullable_0_0= 'nullable' ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:686:1: (lv_nullable_0_0= 'nullable' )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:686:1: (lv_nullable_0_0= 'nullable' )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:687:3: lv_nullable_0_0= 'nullable'
            {
            lv_nullable_0_0=(Token)match(input,24,FOLLOW_24_in_ruleNullable1625); 

                    newLeafNode(lv_nullable_0_0, grammarAccess.getNullableAccess().getNullableNullableKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNullableRule());
            	        }
                   		setWithLastConsumed(current, "nullable", true, "nullable");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullable"


    // $ANTLR start "entryRuleForeignKey"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:708:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:709:2: (iv_ruleForeignKey= ruleForeignKey EOF )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:710:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey1673);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey1683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:717:1: ruleForeignKey returns [EObject current=null] : (otherlv_0= 'refer_to' ( (lv_tableName_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_attributeName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tableName_1_0=null;
        Token otherlv_2=null;
        Token lv_attributeName_3_0=null;

         enterRule(); 
            
        try {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:720:28: ( (otherlv_0= 'refer_to' ( (lv_tableName_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_attributeName_3_0= RULE_ID ) ) ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:721:1: (otherlv_0= 'refer_to' ( (lv_tableName_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_attributeName_3_0= RULE_ID ) ) )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:721:1: (otherlv_0= 'refer_to' ( (lv_tableName_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_attributeName_3_0= RULE_ID ) ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:721:3: otherlv_0= 'refer_to' ( (lv_tableName_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_attributeName_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleForeignKey1720); 

                	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getRefer_toKeyword_0());
                
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:725:1: ( (lv_tableName_1_0= RULE_ID ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:726:1: (lv_tableName_1_0= RULE_ID )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:726:1: (lv_tableName_1_0= RULE_ID )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:727:3: lv_tableName_1_0= RULE_ID
            {
            lv_tableName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey1737); 

            			newLeafNode(lv_tableName_1_0, grammarAccess.getForeignKeyAccess().getTableNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignKeyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tableName",
                    		lv_tableName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleForeignKey1754); 

                	newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getFullStopKeyword_2());
                
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:747:1: ( (lv_attributeName_3_0= RULE_ID ) )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:748:1: (lv_attributeName_3_0= RULE_ID )
            {
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:748:1: (lv_attributeName_3_0= RULE_ID )
            // ../com.dsdl.DSDL/src-gen/com/dsdl/parser/antlr/internal/InternalDSDL.g:749:3: lv_attributeName_3_0= RULE_ID
            {
            lv_attributeName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForeignKey1771); 

            			newLeafNode(lv_attributeName_3_0, grammarAccess.getForeignKeyAccess().getAttributeNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForeignKeyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_3_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKey"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDatabase122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDatabase156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleTable_in_ruleDatabase177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleDatabase190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTable273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTable290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTable307 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleTable328 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleTable341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttribute446 = new BitSet(new long[]{0x0000000000390000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttribute467 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAttribute488 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleType582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarchar_in_ruleType609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleType636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTime_in_ruleType663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_ruleProperty755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutoIncrement_in_ruleProperty782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullable_in_ruleProperty809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_ruleProperty836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInteger924 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleInteger950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger967 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInteger984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarchar_in_entryRuleVarchar1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarchar1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVarchar1075 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleVarchar1101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVarchar1118 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVarchar1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleText1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTime_in_entryRuleDateTime1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTime1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDateTime1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryKey_in_entryRulePrimaryKey1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryKey1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimaryKey1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutoIncrement_in_entryRuleAutoIncrement1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutoIncrement1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAutoIncrement1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullable_in_entryRuleNullable1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullable1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNullable1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleForeignKey1720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey1737 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleForeignKey1754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForeignKey1771 = new BitSet(new long[]{0x0000000000000002L});

}