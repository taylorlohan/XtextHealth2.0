/*
 * generated by Xtext 2.24.0
 */
grammar InternalHealth;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.myhealth.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.myhealth.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.myhealth.services.HealthGrammarAccess;

}

@parser::members {

 	private HealthGrammarAccess grammarAccess;

    public InternalHealthParser(TokenStream input, HealthGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "HealthProgram";
   	}

   	@Override
   	protected HealthGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleHealthProgram
entryRuleHealthProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHealthProgramRule()); }
	iv_ruleHealthProgram=ruleHealthProgram
	{ $current=$iv_ruleHealthProgram.current; }
	EOF;

// Rule HealthProgram
ruleHealthProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getHealthProgramAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getHealthProgramRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"org.xtext.example.myhealth.Health.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getPeopleStatementParserRuleCall_0());
		}
		this_PeopleStatement_0=rulePeopleStatement
		{
			$current = $this_PeopleStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getHeightStatementParserRuleCall_1());
		}
		this_HeightStatement_1=ruleHeightStatement
		{
			$current = $this_HeightStatement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getWeightStatementParserRuleCall_2());
		}
		this_WeightStatement_2=ruleWeightStatement
		{
			$current = $this_WeightStatement_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getAgeStatementParserRuleCall_3());
		}
		this_AgeStatement_3=ruleAgeStatement
		{
			$current = $this_AgeStatement_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getGenderStatementParserRuleCall_4());
		}
		this_GenderStatement_4=ruleGenderStatement
		{
			$current = $this_GenderStatement_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getIngestStatementParserRuleCall_5());
		}
		this_IngestStatement_5=ruleIngestStatement
		{
			$current = $this_IngestStatement_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getExerciseStatementParserRuleCall_6());
		}
		this_ExerciseStatement_6=ruleExerciseStatement
		{
			$current = $this_ExerciseStatement_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getAdviceStatementParserRuleCall_7());
		}
		this_AdviceStatement_7=ruleAdviceStatement
		{
			$current = $this_AdviceStatement_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePeopleStatement
entryRulePeopleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPeopleStatementRule()); }
	iv_rulePeopleStatement=rulePeopleStatement
	{ $current=$iv_rulePeopleStatement.current; }
	EOF;

// Rule PeopleStatement
rulePeopleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='my'
		{
			newLeafNode(otherlv_0, grammarAccess.getPeopleStatementAccess().getMyKeyword_0());
		}
		otherlv_1='name'
		{
			newLeafNode(otherlv_1, grammarAccess.getPeopleStatementAccess().getNameKeyword_1());
		}
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getPeopleStatementAccess().getIsKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getPeopleStatementAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPeopleStatementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleHeightStatement
entryRuleHeightStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeightStatementRule()); }
	iv_ruleHeightStatement=ruleHeightStatement
	{ $current=$iv_ruleHeightStatement.current; }
	EOF;

// Rule HeightStatement
ruleHeightStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeightStatementAccess().getAddKeyword_0());
		}
		otherlv_1='height'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeightStatementAccess().getHeightKeyword_1());
		}
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getHeightStatementAccess().getAsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeightStatementAccess().getHeightInputValueParserRuleCall_3_0());
				}
				lv_height_3_0=ruleInputValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeightStatementRule());
					}
					set(
						$current,
						"height",
						lv_height_3_0,
						"org.xtext.example.myhealth.Health.InputValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='centimeters'
		{
			newLeafNode(otherlv_4, grammarAccess.getHeightStatementAccess().getCentimetersKeyword_4());
		}
	)
;

// Entry rule entryRuleWeightStatement
entryRuleWeightStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWeightStatementRule()); }
	iv_ruleWeightStatement=ruleWeightStatement
	{ $current=$iv_ruleWeightStatement.current; }
	EOF;

// Rule WeightStatement
ruleWeightStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getWeightStatementAccess().getAddKeyword_0());
		}
		otherlv_1='weight'
		{
			newLeafNode(otherlv_1, grammarAccess.getWeightStatementAccess().getWeightKeyword_1());
		}
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getWeightStatementAccess().getAsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWeightStatementAccess().getWeightInputValueParserRuleCall_3_0());
				}
				lv_weight_3_0=ruleInputValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWeightStatementRule());
					}
					set(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.myhealth.Health.InputValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='kilograms'
		{
			newLeafNode(otherlv_4, grammarAccess.getWeightStatementAccess().getKilogramsKeyword_4());
		}
	)
;

// Entry rule entryRuleAgeStatement
entryRuleAgeStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAgeStatementRule()); }
	iv_ruleAgeStatement=ruleAgeStatement
	{ $current=$iv_ruleAgeStatement.current; }
	EOF;

// Rule AgeStatement
ruleAgeStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='add'
		{
			newLeafNode(otherlv_0, grammarAccess.getAgeStatementAccess().getAddKeyword_0());
		}
		otherlv_1='age'
		{
			newLeafNode(otherlv_1, grammarAccess.getAgeStatementAccess().getAgeKeyword_1());
		}
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getAgeStatementAccess().getAsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAgeStatementAccess().getAgeInputValueParserRuleCall_3_0());
				}
				lv_age_3_0=ruleInputValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAgeStatementRule());
					}
					set(
						$current,
						"age",
						lv_age_3_0,
						"org.xtext.example.myhealth.Health.InputValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleGenderStatement
entryRuleGenderStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGenderStatementRule()); }
	iv_ruleGenderStatement=ruleGenderStatement
	{ $current=$iv_ruleGenderStatement.current; }
	EOF;

// Rule GenderStatement
ruleGenderStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='my'
		{
			newLeafNode(otherlv_0, grammarAccess.getGenderStatementAccess().getMyKeyword_0());
		}
		otherlv_1='gender'
		{
			newLeafNode(otherlv_1, grammarAccess.getGenderStatementAccess().getGenderKeyword_1());
		}
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getGenderStatementAccess().getIsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGenderStatementAccess().getGenderGenderEnumRuleCall_3_0());
				}
				lv_gender_3_0=ruleGender
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGenderStatementRule());
					}
					set(
						$current,
						"gender",
						lv_gender_3_0,
						"org.xtext.example.myhealth.Health.Gender");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIngestStatement
entryRuleIngestStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIngestStatementRule()); }
	iv_ruleIngestStatement=ruleIngestStatement
	{ $current=$iv_ruleIngestStatement.current; }
	EOF;

// Rule IngestStatement
ruleIngestStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='I'
		{
			newLeafNode(otherlv_0, grammarAccess.getIngestStatementAccess().getIKeyword_0());
		}
		otherlv_1='have'
		{
			newLeafNode(otherlv_1, grammarAccess.getIngestStatementAccess().getHaveKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIngestStatementAccess().getNutritiontypeNutritionEnumRuleCall_2_0());
				}
				lv_nutritiontype_2_0=rulenutrition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIngestStatementRule());
					}
					set(
						$current,
						"nutritiontype",
						lv_nutritiontype_2_0,
						"org.xtext.example.myhealth.Health.nutrition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIngestStatementAccess().getAmountInputValueParserRuleCall_3_0());
				}
				lv_amount_3_0=ruleInputValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIngestStatementRule());
					}
					set(
						$current,
						"amount",
						lv_amount_3_0,
						"org.xtext.example.myhealth.Health.InputValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='g'
		{
			newLeafNode(otherlv_4, grammarAccess.getIngestStatementAccess().getGKeyword_4());
		}
	)
;

// Entry rule entryRuleExerciseStatement
entryRuleExerciseStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExerciseStatementRule()); }
	iv_ruleExerciseStatement=ruleExerciseStatement
	{ $current=$iv_ruleExerciseStatement.current; }
	EOF;

// Rule ExerciseStatement
ruleExerciseStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='I'
		{
			newLeafNode(otherlv_0, grammarAccess.getExerciseStatementAccess().getIKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExerciseStatementAccess().getExerciseTypeExerciseTypeEnumRuleCall_1_0());
				}
				lv_ExerciseType_1_0=ruleExerciseType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExerciseStatementRule());
					}
					set(
						$current,
						"ExerciseType",
						lv_ExerciseType_1_0,
						"org.xtext.example.myhealth.Health.ExerciseType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='for'
		{
			newLeafNode(otherlv_2, grammarAccess.getExerciseStatementAccess().getForKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExerciseStatementAccess().getTimeInputValueParserRuleCall_3_0());
				}
				lv_time_3_0=ruleInputValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExerciseStatementRule());
					}
					set(
						$current,
						"time",
						lv_time_3_0,
						"org.xtext.example.myhealth.Health.InputValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='hour'
		{
			newLeafNode(otherlv_4, grammarAccess.getExerciseStatementAccess().getHourKeyword_4());
		}
	)
;

// Entry rule entryRuleAdviceStatement
entryRuleAdviceStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdviceStatementRule()); }
	iv_ruleAdviceStatement=ruleAdviceStatement
	{ $current=$iv_ruleAdviceStatement.current; }
	EOF;

// Rule AdviceStatement
ruleAdviceStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='give'
		{
			newLeafNode(otherlv_0, grammarAccess.getAdviceStatementAccess().getGiveKeyword_0());
		}
		otherlv_1='me'
		{
			newLeafNode(otherlv_1, grammarAccess.getAdviceStatementAccess().getMeKeyword_1());
		}
		otherlv_2='advice'
		{
			newLeafNode(otherlv_2, grammarAccess.getAdviceStatementAccess().getAdviceKeyword_2());
		}
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getAdviceStatementAccess().getOnKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAdviceStatementAccess().getAdAdviceTypeEnumRuleCall_4_0());
				}
				lv_ad_4_0=ruleAdviceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAdviceStatementRule());
					}
					set(
						$current,
						"ad",
						lv_ad_4_0,
						"org.xtext.example.myhealth.Health.AdviceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInputValue
entryRuleInputValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputValueRule()); }
	iv_ruleInputValue=ruleInputValue
	{ $current=$iv_ruleInputValue.current; }
	EOF;

// Rule InputValue
ruleInputValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInputValueAccess().getIntValueParserRuleCall_0());
		}
		this_IntValue_0=ruleIntValue
		{
			$current = $this_IntValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInputValueAccess().getRealValueParserRuleCall_1());
		}
		this_RealValue_1=ruleRealValue
		{
			$current = $this_RealValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntValue
entryRuleIntValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	iv_ruleIntValue=ruleIntValue
	{ $current=$iv_ruleIntValue.current; }
	EOF;

// Rule IntValue
ruleIntValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_INT
			{
				newLeafNode(lv_val_0_0, grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntValueRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleRealValue
entryRuleRealValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealValueRule()); }
	iv_ruleRealValue=ruleRealValue
	{ $current=$iv_ruleRealValue.current; }
	EOF;

// Rule RealValue
ruleRealValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRealValueAccess().getValREALParserRuleCall_0());
			}
			lv_val_0_0=ruleREAL
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRealValueRule());
				}
				set(
					$current,
					"val",
					lv_val_0_0,
					"org.xtext.example.myhealth.Health.REAL");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getREALRule()); }
	iv_ruleREAL=ruleREAL
	{ $current=$iv_ruleREAL.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Rule Gender
ruleGender returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Male'
			{
				$current = grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Female'
			{
				$current = grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule nutrition
rulenutrition returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='protein'
			{
				$current = grammarAccess.getNutritionAccess().getProteinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getNutritionAccess().getProteinEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='fat'
			{
				$current = grammarAccess.getNutritionAccess().getFatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getNutritionAccess().getFatEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='carbohydrate'
			{
				$current = grammarAccess.getNutritionAccess().getCarbohydrateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getNutritionAccess().getCarbohydrateEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule AdviceType
ruleAdviceType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Eating'
			{
				$current = grammarAccess.getAdviceTypeAccess().getEatingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAdviceTypeAccess().getEatingEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Sport'
			{
				$current = grammarAccess.getAdviceTypeAccess().getSportEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAdviceTypeAccess().getSportEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ExerciseType
ruleExerciseType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='walk'
			{
				$current = grammarAccess.getExerciseTypeAccess().getWalkEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getExerciseTypeAccess().getWalkEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='run'
			{
				$current = grammarAccess.getExerciseTypeAccess().getRunEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getExerciseTypeAccess().getRunEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='swim'
			{
				$current = grammarAccess.getExerciseTypeAccess().getSwimEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getExerciseTypeAccess().getSwimEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
