/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.myhealth.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class HealthGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class HealthProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.HealthProgram");
		private final Assignment cStatementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_0 = (RuleCall)cStatementsAssignment.eContents().get(0);
		
		//HealthProgram:
		//	statements+=Statement*;
		@Override public ParserRule getRule() { return rule; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment() { return cStatementsAssignment; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_0() { return cStatementsStatementParserRuleCall_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPeopleStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cHeightStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cWeightStatementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAgeStatementParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cGenderStatementParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cIngestStatementParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cExerciseStatementParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cAdviceStatementParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//Statement:
		//	PeopleStatement | HeightStatement | WeightStatement | AgeStatement | GenderStatement | IngestStatement |
		//	ExerciseStatement | AdviceStatement;
		@Override public ParserRule getRule() { return rule; }
		
		//PeopleStatement | HeightStatement | WeightStatement | AgeStatement | GenderStatement | IngestStatement |
		//ExerciseStatement | AdviceStatement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PeopleStatement
		public RuleCall getPeopleStatementParserRuleCall_0() { return cPeopleStatementParserRuleCall_0; }
		
		//HeightStatement
		public RuleCall getHeightStatementParserRuleCall_1() { return cHeightStatementParserRuleCall_1; }
		
		//WeightStatement
		public RuleCall getWeightStatementParserRuleCall_2() { return cWeightStatementParserRuleCall_2; }
		
		//AgeStatement
		public RuleCall getAgeStatementParserRuleCall_3() { return cAgeStatementParserRuleCall_3; }
		
		//GenderStatement
		public RuleCall getGenderStatementParserRuleCall_4() { return cGenderStatementParserRuleCall_4; }
		
		//IngestStatement
		public RuleCall getIngestStatementParserRuleCall_5() { return cIngestStatementParserRuleCall_5; }
		
		//ExerciseStatement
		public RuleCall getExerciseStatementParserRuleCall_6() { return cExerciseStatementParserRuleCall_6; }
		
		//AdviceStatement
		public RuleCall getAdviceStatementParserRuleCall_7() { return cAdviceStatementParserRuleCall_7; }
	}
	public class PeopleStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.PeopleStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//PeopleStatement:
		//	'my' 'name' 'is' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'my' 'name' 'is' name=ID
		public Group getGroup() { return cGroup; }
		
		//'my'
		public Keyword getMyKeyword_0() { return cMyKeyword_0; }
		
		//'name'
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
	}
	public class HeightStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.HeightStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cHeightKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cHeightAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHeightInputValueParserRuleCall_3_0 = (RuleCall)cHeightAssignment_3.eContents().get(0);
		private final Keyword cCentimetersKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//HeightStatement:
		//	'add' 'height' 'as' height=InputValue 'centimeters';
		@Override public ParserRule getRule() { return rule; }
		
		//'add' 'height' 'as' height=InputValue 'centimeters'
		public Group getGroup() { return cGroup; }
		
		//'add'
		public Keyword getAddKeyword_0() { return cAddKeyword_0; }
		
		//'height'
		public Keyword getHeightKeyword_1() { return cHeightKeyword_1; }
		
		//'as'
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }
		
		//height=InputValue
		public Assignment getHeightAssignment_3() { return cHeightAssignment_3; }
		
		//InputValue
		public RuleCall getHeightInputValueParserRuleCall_3_0() { return cHeightInputValueParserRuleCall_3_0; }
		
		//'centimeters'
		public Keyword getCentimetersKeyword_4() { return cCentimetersKeyword_4; }
	}
	public class WeightStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.WeightStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cWeightKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWeightAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWeightInputValueParserRuleCall_3_0 = (RuleCall)cWeightAssignment_3.eContents().get(0);
		private final Keyword cKilogramsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//WeightStatement:
		//	'add' 'weight' 'as' weight=InputValue 'kilograms';
		@Override public ParserRule getRule() { return rule; }
		
		//'add' 'weight' 'as' weight=InputValue 'kilograms'
		public Group getGroup() { return cGroup; }
		
		//'add'
		public Keyword getAddKeyword_0() { return cAddKeyword_0; }
		
		//'weight'
		public Keyword getWeightKeyword_1() { return cWeightKeyword_1; }
		
		//'as'
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }
		
		//weight=InputValue
		public Assignment getWeightAssignment_3() { return cWeightAssignment_3; }
		
		//InputValue
		public RuleCall getWeightInputValueParserRuleCall_3_0() { return cWeightInputValueParserRuleCall_3_0; }
		
		//'kilograms'
		public Keyword getKilogramsKeyword_4() { return cKilogramsKeyword_4; }
	}
	public class AgeStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.AgeStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAgeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAgeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAgeInputValueParserRuleCall_3_0 = (RuleCall)cAgeAssignment_3.eContents().get(0);
		
		//AgeStatement:
		//	'add' 'age' 'as' age=InputValue;
		@Override public ParserRule getRule() { return rule; }
		
		//'add' 'age' 'as' age=InputValue
		public Group getGroup() { return cGroup; }
		
		//'add'
		public Keyword getAddKeyword_0() { return cAddKeyword_0; }
		
		//'age'
		public Keyword getAgeKeyword_1() { return cAgeKeyword_1; }
		
		//'as'
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }
		
		//age=InputValue
		public Assignment getAgeAssignment_3() { return cAgeAssignment_3; }
		
		//InputValue
		public RuleCall getAgeInputValueParserRuleCall_3_0() { return cAgeInputValueParserRuleCall_3_0; }
	}
	public class GenderStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.GenderStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGenderKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGenderAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGenderGenderEnumRuleCall_3_0 = (RuleCall)cGenderAssignment_3.eContents().get(0);
		
		//GenderStatement:
		//	'my' 'gender' 'is' gender=Gender;
		@Override public ParserRule getRule() { return rule; }
		
		//'my' 'gender' 'is' gender=Gender
		public Group getGroup() { return cGroup; }
		
		//'my'
		public Keyword getMyKeyword_0() { return cMyKeyword_0; }
		
		//'gender'
		public Keyword getGenderKeyword_1() { return cGenderKeyword_1; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//gender=Gender
		public Assignment getGenderAssignment_3() { return cGenderAssignment_3; }
		
		//Gender
		public RuleCall getGenderGenderEnumRuleCall_3_0() { return cGenderGenderEnumRuleCall_3_0; }
	}
	public class IngestStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.IngestStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cHaveKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNutritiontypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNutritiontypeNutritionEnumRuleCall_2_0 = (RuleCall)cNutritiontypeAssignment_2.eContents().get(0);
		private final Assignment cAmountAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAmountInputValueParserRuleCall_3_0 = (RuleCall)cAmountAssignment_3.eContents().get(0);
		private final Keyword cGKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//IngestStatement:
		//	'I' 'have' nutritiontype=nutrition amount=InputValue 'g';
		@Override public ParserRule getRule() { return rule; }
		
		//'I' 'have' nutritiontype=nutrition amount=InputValue 'g'
		public Group getGroup() { return cGroup; }
		
		//'I'
		public Keyword getIKeyword_0() { return cIKeyword_0; }
		
		//'have'
		public Keyword getHaveKeyword_1() { return cHaveKeyword_1; }
		
		//nutritiontype=nutrition
		public Assignment getNutritiontypeAssignment_2() { return cNutritiontypeAssignment_2; }
		
		//nutrition
		public RuleCall getNutritiontypeNutritionEnumRuleCall_2_0() { return cNutritiontypeNutritionEnumRuleCall_2_0; }
		
		//amount=InputValue
		public Assignment getAmountAssignment_3() { return cAmountAssignment_3; }
		
		//InputValue
		public RuleCall getAmountInputValueParserRuleCall_3_0() { return cAmountInputValueParserRuleCall_3_0; }
		
		//'g'
		public Keyword getGKeyword_4() { return cGKeyword_4; }
	}
	public class ExerciseStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.ExerciseStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExerciseTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExerciseTypeExerciseTypeEnumRuleCall_1_0 = (RuleCall)cExerciseTypeAssignment_1.eContents().get(0);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTimeInputValueParserRuleCall_3_0 = (RuleCall)cTimeAssignment_3.eContents().get(0);
		private final Keyword cHourKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ExerciseStatement:
		//	'I' ExerciseType=ExerciseType 'for' time=InputValue 'hour';
		@Override public ParserRule getRule() { return rule; }
		
		//'I' ExerciseType=ExerciseType 'for' time=InputValue 'hour'
		public Group getGroup() { return cGroup; }
		
		//'I'
		public Keyword getIKeyword_0() { return cIKeyword_0; }
		
		//ExerciseType=ExerciseType
		public Assignment getExerciseTypeAssignment_1() { return cExerciseTypeAssignment_1; }
		
		//ExerciseType
		public RuleCall getExerciseTypeExerciseTypeEnumRuleCall_1_0() { return cExerciseTypeExerciseTypeEnumRuleCall_1_0; }
		
		//'for'
		public Keyword getForKeyword_2() { return cForKeyword_2; }
		
		//time=InputValue
		public Assignment getTimeAssignment_3() { return cTimeAssignment_3; }
		
		//InputValue
		public RuleCall getTimeInputValueParserRuleCall_3_0() { return cTimeInputValueParserRuleCall_3_0; }
		
		//'hour'
		public Keyword getHourKeyword_4() { return cHourKeyword_4; }
	}
	public class AdviceStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.AdviceStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAdviceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cOnKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAdAdviceTypeEnumRuleCall_4_0 = (RuleCall)cAdAssignment_4.eContents().get(0);
		
		//AdviceStatement:
		//	'give' 'me' 'advice' 'on' ad=AdviceType;
		@Override public ParserRule getRule() { return rule; }
		
		//'give' 'me' 'advice' 'on' ad=AdviceType
		public Group getGroup() { return cGroup; }
		
		//'give'
		public Keyword getGiveKeyword_0() { return cGiveKeyword_0; }
		
		//'me'
		public Keyword getMeKeyword_1() { return cMeKeyword_1; }
		
		//'advice'
		public Keyword getAdviceKeyword_2() { return cAdviceKeyword_2; }
		
		//'on'
		public Keyword getOnKeyword_3() { return cOnKeyword_3; }
		
		//ad=AdviceType
		public Assignment getAdAssignment_4() { return cAdAssignment_4; }
		
		//AdviceType
		public RuleCall getAdAdviceTypeEnumRuleCall_4_0() { return cAdAdviceTypeEnumRuleCall_4_0; }
	}
	public class InputValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.InputValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRealValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//InputValue:
		//	IntValue | RealValue;
		@Override public ParserRule getRule() { return rule; }
		
		//IntValue | RealValue
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IntValue
		public RuleCall getIntValueParserRuleCall_0() { return cIntValueParserRuleCall_0; }
		
		//RealValue
		public RuleCall getRealValueParserRuleCall_1() { return cRealValueParserRuleCall_1; }
	}
	public class IntValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.IntValue");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_0 = (RuleCall)cValAssignment.eContents().get(0);
		
		//IntValue:
		//	val=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//val=INT
		public Assignment getValAssignment() { return cValAssignment; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_0() { return cValINTTerminalRuleCall_0; }
	}
	public class RealValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.RealValue");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValREALParserRuleCall_0 = (RuleCall)cValAssignment.eContents().get(0);
		
		//RealValue:
		//	val=REAL;
		@Override public ParserRule getRule() { return rule; }
		
		//val=REAL
		public Assignment getValAssignment() { return cValAssignment; }
		
		//REAL
		public RuleCall getValREALParserRuleCall_0() { return cValREALParserRuleCall_0; }
	}
	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//REAL ecore::EFloat hidden():
		//	INT? "." INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT? "." INT
		public Group getGroup() { return cGroup; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	
	public class GenderElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.Gender");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMaleEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMaleMaleKeyword_0_0 = (Keyword)cMaleEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFemaleEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFemaleFemaleKeyword_1_0 = (Keyword)cFemaleEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Gender:
		//	Male | Female;
		public EnumRule getRule() { return rule; }
		
		//Male | Female
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Male
		public EnumLiteralDeclaration getMaleEnumLiteralDeclaration_0() { return cMaleEnumLiteralDeclaration_0; }
		
		//"Male"
		public Keyword getMaleMaleKeyword_0_0() { return cMaleMaleKeyword_0_0; }
		
		//Female
		public EnumLiteralDeclaration getFemaleEnumLiteralDeclaration_1() { return cFemaleEnumLiteralDeclaration_1; }
		
		//"Female"
		public Keyword getFemaleFemaleKeyword_1_0() { return cFemaleFemaleKeyword_1_0; }
	}
	public class NutritionElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.nutrition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cProteinEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cProteinProteinKeyword_0_0 = (Keyword)cProteinEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFatEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFatFatKeyword_1_0 = (Keyword)cFatEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCarbohydrateEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCarbohydrateCarbohydrateKeyword_2_0 = (Keyword)cCarbohydrateEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum nutrition:
		//	protein | fat | carbohydrate;
		public EnumRule getRule() { return rule; }
		
		//protein | fat | carbohydrate
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//protein
		public EnumLiteralDeclaration getProteinEnumLiteralDeclaration_0() { return cProteinEnumLiteralDeclaration_0; }
		
		//"protein"
		public Keyword getProteinProteinKeyword_0_0() { return cProteinProteinKeyword_0_0; }
		
		//fat
		public EnumLiteralDeclaration getFatEnumLiteralDeclaration_1() { return cFatEnumLiteralDeclaration_1; }
		
		//"fat"
		public Keyword getFatFatKeyword_1_0() { return cFatFatKeyword_1_0; }
		
		//carbohydrate
		public EnumLiteralDeclaration getCarbohydrateEnumLiteralDeclaration_2() { return cCarbohydrateEnumLiteralDeclaration_2; }
		
		//"carbohydrate"
		public Keyword getCarbohydrateCarbohydrateKeyword_2_0() { return cCarbohydrateCarbohydrateKeyword_2_0; }
	}
	public class AdviceTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.AdviceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEatingEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEatingEatingKeyword_0_0 = (Keyword)cEatingEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSportEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSportSportKeyword_1_0 = (Keyword)cSportEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum AdviceType:
		//	Eating | Sport;
		public EnumRule getRule() { return rule; }
		
		//Eating | Sport
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Eating
		public EnumLiteralDeclaration getEatingEnumLiteralDeclaration_0() { return cEatingEnumLiteralDeclaration_0; }
		
		//"Eating"
		public Keyword getEatingEatingKeyword_0_0() { return cEatingEatingKeyword_0_0; }
		
		//Sport
		public EnumLiteralDeclaration getSportEnumLiteralDeclaration_1() { return cSportEnumLiteralDeclaration_1; }
		
		//"Sport"
		public Keyword getSportSportKeyword_1_0() { return cSportSportKeyword_1_0; }
	}
	public class ExerciseTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.myhealth.Health.ExerciseType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cWalkEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cWalkWalkKeyword_0_0 = (Keyword)cWalkEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRunEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRunRunKeyword_1_0 = (Keyword)cRunEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSwimEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSwimSwimKeyword_2_0 = (Keyword)cSwimEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ExerciseType:
		//	walk | run | swim;
		public EnumRule getRule() { return rule; }
		
		//walk | run | swim
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//walk
		public EnumLiteralDeclaration getWalkEnumLiteralDeclaration_0() { return cWalkEnumLiteralDeclaration_0; }
		
		//"walk"
		public Keyword getWalkWalkKeyword_0_0() { return cWalkWalkKeyword_0_0; }
		
		//run
		public EnumLiteralDeclaration getRunEnumLiteralDeclaration_1() { return cRunEnumLiteralDeclaration_1; }
		
		//"run"
		public Keyword getRunRunKeyword_1_0() { return cRunRunKeyword_1_0; }
		
		//swim
		public EnumLiteralDeclaration getSwimEnumLiteralDeclaration_2() { return cSwimEnumLiteralDeclaration_2; }
		
		//"swim"
		public Keyword getSwimSwimKeyword_2_0() { return cSwimSwimKeyword_2_0; }
	}
	
	private final HealthProgramElements pHealthProgram;
	private final StatementElements pStatement;
	private final PeopleStatementElements pPeopleStatement;
	private final HeightStatementElements pHeightStatement;
	private final WeightStatementElements pWeightStatement;
	private final AgeStatementElements pAgeStatement;
	private final GenderStatementElements pGenderStatement;
	private final GenderElements eGender;
	private final IngestStatementElements pIngestStatement;
	private final NutritionElements eNutrition;
	private final ExerciseStatementElements pExerciseStatement;
	private final AdviceStatementElements pAdviceStatement;
	private final AdviceTypeElements eAdviceType;
	private final ExerciseTypeElements eExerciseType;
	private final InputValueElements pInputValue;
	private final IntValueElements pIntValue;
	private final RealValueElements pRealValue;
	private final REALElements pREAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public HealthGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pHealthProgram = new HealthProgramElements();
		this.pStatement = new StatementElements();
		this.pPeopleStatement = new PeopleStatementElements();
		this.pHeightStatement = new HeightStatementElements();
		this.pWeightStatement = new WeightStatementElements();
		this.pAgeStatement = new AgeStatementElements();
		this.pGenderStatement = new GenderStatementElements();
		this.eGender = new GenderElements();
		this.pIngestStatement = new IngestStatementElements();
		this.eNutrition = new NutritionElements();
		this.pExerciseStatement = new ExerciseStatementElements();
		this.pAdviceStatement = new AdviceStatementElements();
		this.eAdviceType = new AdviceTypeElements();
		this.eExerciseType = new ExerciseTypeElements();
		this.pInputValue = new InputValueElements();
		this.pIntValue = new IntValueElements();
		this.pRealValue = new RealValueElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.myhealth.Health".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//HealthProgram:
	//	statements+=Statement*;
	public HealthProgramElements getHealthProgramAccess() {
		return pHealthProgram;
	}
	
	public ParserRule getHealthProgramRule() {
		return getHealthProgramAccess().getRule();
	}
	
	//Statement:
	//	PeopleStatement | HeightStatement | WeightStatement | AgeStatement | GenderStatement | IngestStatement |
	//	ExerciseStatement | AdviceStatement;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//PeopleStatement:
	//	'my' 'name' 'is' name=ID;
	public PeopleStatementElements getPeopleStatementAccess() {
		return pPeopleStatement;
	}
	
	public ParserRule getPeopleStatementRule() {
		return getPeopleStatementAccess().getRule();
	}
	
	//HeightStatement:
	//	'add' 'height' 'as' height=InputValue 'centimeters';
	public HeightStatementElements getHeightStatementAccess() {
		return pHeightStatement;
	}
	
	public ParserRule getHeightStatementRule() {
		return getHeightStatementAccess().getRule();
	}
	
	//WeightStatement:
	//	'add' 'weight' 'as' weight=InputValue 'kilograms';
	public WeightStatementElements getWeightStatementAccess() {
		return pWeightStatement;
	}
	
	public ParserRule getWeightStatementRule() {
		return getWeightStatementAccess().getRule();
	}
	
	//AgeStatement:
	//	'add' 'age' 'as' age=InputValue;
	public AgeStatementElements getAgeStatementAccess() {
		return pAgeStatement;
	}
	
	public ParserRule getAgeStatementRule() {
		return getAgeStatementAccess().getRule();
	}
	
	//GenderStatement:
	//	'my' 'gender' 'is' gender=Gender;
	public GenderStatementElements getGenderStatementAccess() {
		return pGenderStatement;
	}
	
	public ParserRule getGenderStatementRule() {
		return getGenderStatementAccess().getRule();
	}
	
	//enum Gender:
	//	Male | Female;
	public GenderElements getGenderAccess() {
		return eGender;
	}
	
	public EnumRule getGenderRule() {
		return getGenderAccess().getRule();
	}
	
	//IngestStatement:
	//	'I' 'have' nutritiontype=nutrition amount=InputValue 'g';
	public IngestStatementElements getIngestStatementAccess() {
		return pIngestStatement;
	}
	
	public ParserRule getIngestStatementRule() {
		return getIngestStatementAccess().getRule();
	}
	
	//enum nutrition:
	//	protein | fat | carbohydrate;
	public NutritionElements getNutritionAccess() {
		return eNutrition;
	}
	
	public EnumRule getNutritionRule() {
		return getNutritionAccess().getRule();
	}
	
	//ExerciseStatement:
	//	'I' ExerciseType=ExerciseType 'for' time=InputValue 'hour';
	public ExerciseStatementElements getExerciseStatementAccess() {
		return pExerciseStatement;
	}
	
	public ParserRule getExerciseStatementRule() {
		return getExerciseStatementAccess().getRule();
	}
	
	//AdviceStatement:
	//	'give' 'me' 'advice' 'on' ad=AdviceType;
	public AdviceStatementElements getAdviceStatementAccess() {
		return pAdviceStatement;
	}
	
	public ParserRule getAdviceStatementRule() {
		return getAdviceStatementAccess().getRule();
	}
	
	//enum AdviceType:
	//	Eating | Sport;
	public AdviceTypeElements getAdviceTypeAccess() {
		return eAdviceType;
	}
	
	public EnumRule getAdviceTypeRule() {
		return getAdviceTypeAccess().getRule();
	}
	
	//enum ExerciseType:
	//	walk | run | swim;
	public ExerciseTypeElements getExerciseTypeAccess() {
		return eExerciseType;
	}
	
	public EnumRule getExerciseTypeRule() {
		return getExerciseTypeAccess().getRule();
	}
	
	//InputValue:
	//	IntValue | RealValue;
	public InputValueElements getInputValueAccess() {
		return pInputValue;
	}
	
	public ParserRule getInputValueRule() {
		return getInputValueAccess().getRule();
	}
	
	//IntValue:
	//	val=INT;
	public IntValueElements getIntValueAccess() {
		return pIntValue;
	}
	
	public ParserRule getIntValueRule() {
		return getIntValueAccess().getRule();
	}
	
	//RealValue:
	//	val=REAL;
	public RealValueElements getRealValueAccess() {
		return pRealValue;
	}
	
	public ParserRule getRealValueRule() {
		return getRealValueAccess().getRule();
	}
	
	//REAL ecore::EFloat hidden():
	//	INT? "." INT;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
