/*
 * generated by Xtext
 */
grammar InternalDSDL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.dsdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDatabase
entryRuleDatabase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDatabaseRule()); }
	 iv_ruleDatabase=ruleDatabase 
	 { $current=$iv_ruleDatabase.current; } 
	 EOF 
;

// Rule Database
ruleDatabase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='database' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getDatabaseKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDatabaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDatabaseAccess().getTableTableParserRuleCall_3_0()); 
	    }
		lv_table_3_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDatabaseRule());
	        }
       		add(
       			$current, 
       			"table",
        		lv_table_3_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	 iv_ruleTable=ruleTable 
	 { $current=$iv_ruleTable.current; } 
	 EOF 
;

// Rule Table
ruleTable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='table' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTableAccess().getAttributeAttributeParserRuleCall_3_0()); 
	    }
		lv_attribute_3_0=ruleAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableRule());
	        }
       		add(
       			$current, 
       			"attribute",
        		lv_attribute_3_0, 
        		"Attribute");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	 iv_ruleAttribute=ruleAttribute 
	 { $current=$iv_ruleAttribute.current; } 
	 EOF 
;

// Rule Attribute
ruleAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_attributeName_0_0=RULE_ID
		{
			newLeafNode(lv_attributeName_0_0, grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"attributeName",
        		lv_attributeName_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getPropertyPropertyParserRuleCall_3_0()); 
	    }
		lv_property_3_0=ruleProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		add(
       			$current, 
       			"property",
        		lv_property_3_0, 
        		"Property");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getIntegerParserRuleCall_0()); 
    }
    this_Integer_0=ruleInteger
    { 
        $current = $this_Integer_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getVarcharParserRuleCall_1()); 
    }
    this_Varchar_1=ruleVarchar
    { 
        $current = $this_Varchar_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getTextParserRuleCall_2()); 
    }
    this_Text_2=ruleText
    { 
        $current = $this_Text_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getDateTimeParserRuleCall_3()); 
    }
    this_DateTime_3=ruleDateTime
    { 
        $current = $this_DateTime_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current; } 
	 EOF 
;

// Rule Property
ruleProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getPrimaryKeyParserRuleCall_0()); 
    }
    this_PrimaryKey_0=rulePrimaryKey
    { 
        $current = $this_PrimaryKey_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getAutoIncrementParserRuleCall_1()); 
    }
    this_AutoIncrement_1=ruleAutoIncrement
    { 
        $current = $this_AutoIncrement_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getNullableParserRuleCall_2()); 
    }
    this_Nullable_2=ruleNullable
    { 
        $current = $this_Nullable_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getForeignKeyParserRuleCall_3()); 
    }
    this_ForeignKey_3=ruleForeignKey
    { 
        $current = $this_ForeignKey_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleInteger
entryRuleInteger returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	 iv_ruleInteger=ruleInteger 
	 { $current=$iv_ruleInteger.current; } 
	 EOF 
;

// Rule Integer
ruleInteger returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_integer_0_0=	'integer' 
    {
        newLeafNode(lv_integer_0_0, grammarAccess.getIntegerAccess().getIntegerIntegerKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerRule());
	        }
       		setWithLastConsumed($current, "integer", lv_integer_0_0, "integer");
	    }

)
)(	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getLeftParenthesisKeyword_1_0());
    }
(
(
		lv_length_2_0=RULE_INT
		{
			newLeafNode(lv_length_2_0, grammarAccess.getIntegerAccess().getLengthINTTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"length",
        		lv_length_2_0, 
        		"INT");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIntegerAccess().getRightParenthesisKeyword_1_2());
    }
)?)
;





// Entry rule entryRuleVarchar
entryRuleVarchar returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarcharRule()); }
	 iv_ruleVarchar=ruleVarchar 
	 { $current=$iv_ruleVarchar.current; } 
	 EOF 
;

// Rule Varchar
ruleVarchar returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_varchar_0_0=	'varchar' 
    {
        newLeafNode(lv_varchar_0_0, grammarAccess.getVarcharAccess().getVarcharVarcharKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarcharRule());
	        }
       		setWithLastConsumed($current, "varchar", lv_varchar_0_0, "varchar");
	    }

)
)(	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVarcharAccess().getLeftParenthesisKeyword_1_0());
    }
(
(
		lv_length_2_0=RULE_INT
		{
			newLeafNode(lv_length_2_0, grammarAccess.getVarcharAccess().getLengthINTTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarcharRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"length",
        		lv_length_2_0, 
        		"INT");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getVarcharAccess().getRightParenthesisKeyword_1_2());
    }
)?)
;





// Entry rule entryRuleText
entryRuleText returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextRule()); }
	 iv_ruleText=ruleText 
	 { $current=$iv_ruleText.current; } 
	 EOF 
;

// Rule Text
ruleText returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_text_0_0=	'text' 
    {
        newLeafNode(lv_text_0_0, grammarAccess.getTextAccess().getTextTextKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextRule());
	        }
       		setWithLastConsumed($current, "text", lv_text_0_0, "text");
	    }

)
)
;





// Entry rule entryRuleDateTime
entryRuleDateTime returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDateTimeRule()); }
	 iv_ruleDateTime=ruleDateTime 
	 { $current=$iv_ruleDateTime.current; } 
	 EOF 
;

// Rule DateTime
ruleDateTime returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_date_0_0=	'datetime' 
    {
        newLeafNode(lv_date_0_0, grammarAccess.getDateTimeAccess().getDateDatetimeKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDateTimeRule());
	        }
       		setWithLastConsumed($current, "date", lv_date_0_0, "datetime");
	    }

)
)
;





// Entry rule entryRulePrimaryKey
entryRulePrimaryKey returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryKeyRule()); }
	 iv_rulePrimaryKey=rulePrimaryKey 
	 { $current=$iv_rulePrimaryKey.current; } 
	 EOF 
;

// Rule PrimaryKey
rulePrimaryKey returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_primaryKey_0_0=	'primary_key' 
    {
        newLeafNode(lv_primaryKey_0_0, grammarAccess.getPrimaryKeyAccess().getPrimaryKeyPrimary_keyKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryKeyRule());
	        }
       		setWithLastConsumed($current, "primaryKey", true, "primary_key");
	    }

)
)
;





// Entry rule entryRuleAutoIncrement
entryRuleAutoIncrement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAutoIncrementRule()); }
	 iv_ruleAutoIncrement=ruleAutoIncrement 
	 { $current=$iv_ruleAutoIncrement.current; } 
	 EOF 
;

// Rule AutoIncrement
ruleAutoIncrement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_autoIncrement_0_0=	'auto_increment' 
    {
        newLeafNode(lv_autoIncrement_0_0, grammarAccess.getAutoIncrementAccess().getAutoIncrementAuto_incrementKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAutoIncrementRule());
	        }
       		setWithLastConsumed($current, "autoIncrement", true, "auto_increment");
	    }

)
)
;





// Entry rule entryRuleNullable
entryRuleNullable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNullableRule()); }
	 iv_ruleNullable=ruleNullable 
	 { $current=$iv_ruleNullable.current; } 
	 EOF 
;

// Rule Nullable
ruleNullable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_nullable_0_0=	'nullable' 
    {
        newLeafNode(lv_nullable_0_0, grammarAccess.getNullableAccess().getNullableNullableKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNullableRule());
	        }
       		setWithLastConsumed($current, "nullable", true, "nullable");
	    }

)
)
;





// Entry rule entryRuleForeignKey
entryRuleForeignKey returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getForeignKeyRule()); }
	 iv_ruleForeignKey=ruleForeignKey 
	 { $current=$iv_ruleForeignKey.current; } 
	 EOF 
;

// Rule ForeignKey
ruleForeignKey returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='refer_to' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getForeignKeyAccess().getRefer_toKeyword_0());
    }
(
(
		lv_tableName_1_0=RULE_ID
		{
			newLeafNode(lv_tableName_1_0, grammarAccess.getForeignKeyAccess().getTableNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getForeignKeyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"tableName",
        		lv_tableName_1_0, 
        		"ID");
	    }

)
)	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getFullStopKeyword_2());
    }
(
(
		lv_attributeName_3_0=RULE_ID
		{
			newLeafNode(lv_attributeName_3_0, grammarAccess.getForeignKeyAccess().getAttributeNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getForeignKeyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"attributeName",
        		lv_attributeName_3_0, 
        		"ID");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


