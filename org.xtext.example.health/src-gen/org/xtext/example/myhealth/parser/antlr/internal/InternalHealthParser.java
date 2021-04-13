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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHealthParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'my'", "'name'", "'is'", "'add'", "'height'", "'as'", "'centimeters'", "'weight'", "'kilograms'", "'age'", "'gender'", "'I'", "'have'", "'g'", "'for'", "'hour'", "'give'", "'me'", "'advice'", "'on'", "'.'", "'Male'", "'Female'", "'protein'", "'fat'", "'carbohydrate'", "'Eating'", "'Sport'", "'walk'", "'run'", "'swim'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHealthParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHealthParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHealthParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHealth.g"; }



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




    // $ANTLR start "entryRuleHealthProgram"
    // InternalHealth.g:65:1: entryRuleHealthProgram returns [EObject current=null] : iv_ruleHealthProgram= ruleHealthProgram EOF ;
    public final EObject entryRuleHealthProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthProgram = null;


        try {
            // InternalHealth.g:65:54: (iv_ruleHealthProgram= ruleHealthProgram EOF )
            // InternalHealth.g:66:2: iv_ruleHealthProgram= ruleHealthProgram EOF
            {
             newCompositeNode(grammarAccess.getHealthProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthProgram=ruleHealthProgram();

            state._fsp--;

             current =iv_ruleHealthProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHealthProgram"


    // $ANTLR start "ruleHealthProgram"
    // InternalHealth.g:72:1: ruleHealthProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleHealthProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalHealth.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalHealth.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||LA1_0==22||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHealth.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalHealth.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalHealth.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getHealthProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getHealthProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.myhealth.Health.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleHealthProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalHealth.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalHealth.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalHealth.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalHealth.g:108:1: ruleStatement returns [EObject current=null] : (this_PeopleStatement_0= rulePeopleStatement | this_HeightStatement_1= ruleHeightStatement | this_WeightStatement_2= ruleWeightStatement | this_AgeStatement_3= ruleAgeStatement | this_GenderStatement_4= ruleGenderStatement | this_IngestStatement_5= ruleIngestStatement | this_ExerciseStatement_6= ruleExerciseStatement | this_AdviceStatement_7= ruleAdviceStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_PeopleStatement_0 = null;

        EObject this_HeightStatement_1 = null;

        EObject this_WeightStatement_2 = null;

        EObject this_AgeStatement_3 = null;

        EObject this_GenderStatement_4 = null;

        EObject this_IngestStatement_5 = null;

        EObject this_ExerciseStatement_6 = null;

        EObject this_AdviceStatement_7 = null;



        	enterRule();

        try {
            // InternalHealth.g:114:2: ( (this_PeopleStatement_0= rulePeopleStatement | this_HeightStatement_1= ruleHeightStatement | this_WeightStatement_2= ruleWeightStatement | this_AgeStatement_3= ruleAgeStatement | this_GenderStatement_4= ruleGenderStatement | this_IngestStatement_5= ruleIngestStatement | this_ExerciseStatement_6= ruleExerciseStatement | this_AdviceStatement_7= ruleAdviceStatement ) )
            // InternalHealth.g:115:2: (this_PeopleStatement_0= rulePeopleStatement | this_HeightStatement_1= ruleHeightStatement | this_WeightStatement_2= ruleWeightStatement | this_AgeStatement_3= ruleAgeStatement | this_GenderStatement_4= ruleGenderStatement | this_IngestStatement_5= ruleIngestStatement | this_ExerciseStatement_6= ruleExerciseStatement | this_AdviceStatement_7= ruleAdviceStatement )
            {
            // InternalHealth.g:115:2: (this_PeopleStatement_0= rulePeopleStatement | this_HeightStatement_1= ruleHeightStatement | this_WeightStatement_2= ruleWeightStatement | this_AgeStatement_3= ruleAgeStatement | this_GenderStatement_4= ruleGenderStatement | this_IngestStatement_5= ruleIngestStatement | this_ExerciseStatement_6= ruleExerciseStatement | this_AdviceStatement_7= ruleAdviceStatement )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalHealth.g:116:3: this_PeopleStatement_0= rulePeopleStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPeopleStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PeopleStatement_0=rulePeopleStatement();

                    state._fsp--;


                    			current = this_PeopleStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHealth.g:125:3: this_HeightStatement_1= ruleHeightStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getHeightStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeightStatement_1=ruleHeightStatement();

                    state._fsp--;


                    			current = this_HeightStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHealth.g:134:3: this_WeightStatement_2= ruleWeightStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWeightStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WeightStatement_2=ruleWeightStatement();

                    state._fsp--;


                    			current = this_WeightStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHealth.g:143:3: this_AgeStatement_3= ruleAgeStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAgeStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AgeStatement_3=ruleAgeStatement();

                    state._fsp--;


                    			current = this_AgeStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHealth.g:152:3: this_GenderStatement_4= ruleGenderStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGenderStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GenderStatement_4=ruleGenderStatement();

                    state._fsp--;


                    			current = this_GenderStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalHealth.g:161:3: this_IngestStatement_5= ruleIngestStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIngestStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_IngestStatement_5=ruleIngestStatement();

                    state._fsp--;


                    			current = this_IngestStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalHealth.g:170:3: this_ExerciseStatement_6= ruleExerciseStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExerciseStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExerciseStatement_6=ruleExerciseStatement();

                    state._fsp--;


                    			current = this_ExerciseStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalHealth.g:179:3: this_AdviceStatement_7= ruleAdviceStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAdviceStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdviceStatement_7=ruleAdviceStatement();

                    state._fsp--;


                    			current = this_AdviceStatement_7;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePeopleStatement"
    // InternalHealth.g:191:1: entryRulePeopleStatement returns [EObject current=null] : iv_rulePeopleStatement= rulePeopleStatement EOF ;
    public final EObject entryRulePeopleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeopleStatement = null;


        try {
            // InternalHealth.g:191:56: (iv_rulePeopleStatement= rulePeopleStatement EOF )
            // InternalHealth.g:192:2: iv_rulePeopleStatement= rulePeopleStatement EOF
            {
             newCompositeNode(grammarAccess.getPeopleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeopleStatement=rulePeopleStatement();

            state._fsp--;

             current =iv_rulePeopleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePeopleStatement"


    // $ANTLR start "rulePeopleStatement"
    // InternalHealth.g:198:1: rulePeopleStatement returns [EObject current=null] : (otherlv_0= 'my' otherlv_1= 'name' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePeopleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalHealth.g:204:2: ( (otherlv_0= 'my' otherlv_1= 'name' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalHealth.g:205:2: (otherlv_0= 'my' otherlv_1= 'name' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalHealth.g:205:2: (otherlv_0= 'my' otherlv_1= 'name' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalHealth.g:206:3: otherlv_0= 'my' otherlv_1= 'name' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPeopleStatementAccess().getMyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPeopleStatementAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPeopleStatementAccess().getIsKeyword_2());
            		
            // InternalHealth.g:218:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalHealth.g:219:4: (lv_name_3_0= RULE_ID )
            {
            // InternalHealth.g:219:4: (lv_name_3_0= RULE_ID )
            // InternalHealth.g:220:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPeopleStatementAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPeopleStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulePeopleStatement"


    // $ANTLR start "entryRuleHeightStatement"
    // InternalHealth.g:240:1: entryRuleHeightStatement returns [EObject current=null] : iv_ruleHeightStatement= ruleHeightStatement EOF ;
    public final EObject entryRuleHeightStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeightStatement = null;


        try {
            // InternalHealth.g:240:56: (iv_ruleHeightStatement= ruleHeightStatement EOF )
            // InternalHealth.g:241:2: iv_ruleHeightStatement= ruleHeightStatement EOF
            {
             newCompositeNode(grammarAccess.getHeightStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeightStatement=ruleHeightStatement();

            state._fsp--;

             current =iv_ruleHeightStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeightStatement"


    // $ANTLR start "ruleHeightStatement"
    // InternalHealth.g:247:1: ruleHeightStatement returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'height' otherlv_2= 'as' ( (lv_height_3_0= ruleInputValue ) ) otherlv_4= 'centimeters' ) ;
    public final EObject ruleHeightStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_height_3_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:253:2: ( (otherlv_0= 'add' otherlv_1= 'height' otherlv_2= 'as' ( (lv_height_3_0= ruleInputValue ) ) otherlv_4= 'centimeters' ) )
            // InternalHealth.g:254:2: (otherlv_0= 'add' otherlv_1= 'height' otherlv_2= 'as' ( (lv_height_3_0= ruleInputValue ) ) otherlv_4= 'centimeters' )
            {
            // InternalHealth.g:254:2: (otherlv_0= 'add' otherlv_1= 'height' otherlv_2= 'as' ( (lv_height_3_0= ruleInputValue ) ) otherlv_4= 'centimeters' )
            // InternalHealth.g:255:3: otherlv_0= 'add' otherlv_1= 'height' otherlv_2= 'as' ( (lv_height_3_0= ruleInputValue ) ) otherlv_4= 'centimeters'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getHeightStatementAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getHeightStatementAccess().getHeightKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getHeightStatementAccess().getAsKeyword_2());
            		
            // InternalHealth.g:267:3: ( (lv_height_3_0= ruleInputValue ) )
            // InternalHealth.g:268:4: (lv_height_3_0= ruleInputValue )
            {
            // InternalHealth.g:268:4: (lv_height_3_0= ruleInputValue )
            // InternalHealth.g:269:5: lv_height_3_0= ruleInputValue
            {

            					newCompositeNode(grammarAccess.getHeightStatementAccess().getHeightInputValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_height_3_0=ruleInputValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeightStatementRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_3_0,
            						"org.xtext.example.myhealth.Health.InputValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHeightStatementAccess().getCentimetersKeyword_4());
            		

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
    // $ANTLR end "ruleHeightStatement"


    // $ANTLR start "entryRuleWeightStatement"
    // InternalHealth.g:294:1: entryRuleWeightStatement returns [EObject current=null] : iv_ruleWeightStatement= ruleWeightStatement EOF ;
    public final EObject entryRuleWeightStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeightStatement = null;


        try {
            // InternalHealth.g:294:56: (iv_ruleWeightStatement= ruleWeightStatement EOF )
            // InternalHealth.g:295:2: iv_ruleWeightStatement= ruleWeightStatement EOF
            {
             newCompositeNode(grammarAccess.getWeightStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeightStatement=ruleWeightStatement();

            state._fsp--;

             current =iv_ruleWeightStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWeightStatement"


    // $ANTLR start "ruleWeightStatement"
    // InternalHealth.g:301:1: ruleWeightStatement returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'weight' otherlv_2= 'as' ( (lv_weight_3_0= ruleInputValue ) ) otherlv_4= 'kilograms' ) ;
    public final EObject ruleWeightStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_weight_3_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:307:2: ( (otherlv_0= 'add' otherlv_1= 'weight' otherlv_2= 'as' ( (lv_weight_3_0= ruleInputValue ) ) otherlv_4= 'kilograms' ) )
            // InternalHealth.g:308:2: (otherlv_0= 'add' otherlv_1= 'weight' otherlv_2= 'as' ( (lv_weight_3_0= ruleInputValue ) ) otherlv_4= 'kilograms' )
            {
            // InternalHealth.g:308:2: (otherlv_0= 'add' otherlv_1= 'weight' otherlv_2= 'as' ( (lv_weight_3_0= ruleInputValue ) ) otherlv_4= 'kilograms' )
            // InternalHealth.g:309:3: otherlv_0= 'add' otherlv_1= 'weight' otherlv_2= 'as' ( (lv_weight_3_0= ruleInputValue ) ) otherlv_4= 'kilograms'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWeightStatementAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWeightStatementAccess().getWeightKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWeightStatementAccess().getAsKeyword_2());
            		
            // InternalHealth.g:321:3: ( (lv_weight_3_0= ruleInputValue ) )
            // InternalHealth.g:322:4: (lv_weight_3_0= ruleInputValue )
            {
            // InternalHealth.g:322:4: (lv_weight_3_0= ruleInputValue )
            // InternalHealth.g:323:5: lv_weight_3_0= ruleInputValue
            {

            					newCompositeNode(grammarAccess.getWeightStatementAccess().getWeightInputValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_weight_3_0=ruleInputValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeightStatementRule());
            					}
            					set(
            						current,
            						"weight",
            						lv_weight_3_0,
            						"org.xtext.example.myhealth.Health.InputValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWeightStatementAccess().getKilogramsKeyword_4());
            		

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
    // $ANTLR end "ruleWeightStatement"


    // $ANTLR start "entryRuleAgeStatement"
    // InternalHealth.g:348:1: entryRuleAgeStatement returns [EObject current=null] : iv_ruleAgeStatement= ruleAgeStatement EOF ;
    public final EObject entryRuleAgeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgeStatement = null;


        try {
            // InternalHealth.g:348:53: (iv_ruleAgeStatement= ruleAgeStatement EOF )
            // InternalHealth.g:349:2: iv_ruleAgeStatement= ruleAgeStatement EOF
            {
             newCompositeNode(grammarAccess.getAgeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgeStatement=ruleAgeStatement();

            state._fsp--;

             current =iv_ruleAgeStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAgeStatement"


    // $ANTLR start "ruleAgeStatement"
    // InternalHealth.g:355:1: ruleAgeStatement returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'age' otherlv_2= 'as' ( (lv_age_3_0= ruleInputValue ) ) ) ;
    public final EObject ruleAgeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_age_3_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:361:2: ( (otherlv_0= 'add' otherlv_1= 'age' otherlv_2= 'as' ( (lv_age_3_0= ruleInputValue ) ) ) )
            // InternalHealth.g:362:2: (otherlv_0= 'add' otherlv_1= 'age' otherlv_2= 'as' ( (lv_age_3_0= ruleInputValue ) ) )
            {
            // InternalHealth.g:362:2: (otherlv_0= 'add' otherlv_1= 'age' otherlv_2= 'as' ( (lv_age_3_0= ruleInputValue ) ) )
            // InternalHealth.g:363:3: otherlv_0= 'add' otherlv_1= 'age' otherlv_2= 'as' ( (lv_age_3_0= ruleInputValue ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAgeStatementAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAgeStatementAccess().getAgeKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAgeStatementAccess().getAsKeyword_2());
            		
            // InternalHealth.g:375:3: ( (lv_age_3_0= ruleInputValue ) )
            // InternalHealth.g:376:4: (lv_age_3_0= ruleInputValue )
            {
            // InternalHealth.g:376:4: (lv_age_3_0= ruleInputValue )
            // InternalHealth.g:377:5: lv_age_3_0= ruleInputValue
            {

            					newCompositeNode(grammarAccess.getAgeStatementAccess().getAgeInputValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_age_3_0=ruleInputValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAgeStatementRule());
            					}
            					set(
            						current,
            						"age",
            						lv_age_3_0,
            						"org.xtext.example.myhealth.Health.InputValue");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAgeStatement"


    // $ANTLR start "entryRuleGenderStatement"
    // InternalHealth.g:398:1: entryRuleGenderStatement returns [EObject current=null] : iv_ruleGenderStatement= ruleGenderStatement EOF ;
    public final EObject entryRuleGenderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenderStatement = null;


        try {
            // InternalHealth.g:398:56: (iv_ruleGenderStatement= ruleGenderStatement EOF )
            // InternalHealth.g:399:2: iv_ruleGenderStatement= ruleGenderStatement EOF
            {
             newCompositeNode(grammarAccess.getGenderStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenderStatement=ruleGenderStatement();

            state._fsp--;

             current =iv_ruleGenderStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenderStatement"


    // $ANTLR start "ruleGenderStatement"
    // InternalHealth.g:405:1: ruleGenderStatement returns [EObject current=null] : (otherlv_0= 'my' otherlv_1= 'gender' otherlv_2= 'is' ( (lv_gender_3_0= ruleGender ) ) ) ;
    public final EObject ruleGenderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_gender_3_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:411:2: ( (otherlv_0= 'my' otherlv_1= 'gender' otherlv_2= 'is' ( (lv_gender_3_0= ruleGender ) ) ) )
            // InternalHealth.g:412:2: (otherlv_0= 'my' otherlv_1= 'gender' otherlv_2= 'is' ( (lv_gender_3_0= ruleGender ) ) )
            {
            // InternalHealth.g:412:2: (otherlv_0= 'my' otherlv_1= 'gender' otherlv_2= 'is' ( (lv_gender_3_0= ruleGender ) ) )
            // InternalHealth.g:413:3: otherlv_0= 'my' otherlv_1= 'gender' otherlv_2= 'is' ( (lv_gender_3_0= ruleGender ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getGenderStatementAccess().getMyKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGenderStatementAccess().getGenderKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getGenderStatementAccess().getIsKeyword_2());
            		
            // InternalHealth.g:425:3: ( (lv_gender_3_0= ruleGender ) )
            // InternalHealth.g:426:4: (lv_gender_3_0= ruleGender )
            {
            // InternalHealth.g:426:4: (lv_gender_3_0= ruleGender )
            // InternalHealth.g:427:5: lv_gender_3_0= ruleGender
            {

            					newCompositeNode(grammarAccess.getGenderStatementAccess().getGenderGenderEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_gender_3_0=ruleGender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenderStatementRule());
            					}
            					set(
            						current,
            						"gender",
            						lv_gender_3_0,
            						"org.xtext.example.myhealth.Health.Gender");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleGenderStatement"


    // $ANTLR start "entryRuleIngestStatement"
    // InternalHealth.g:448:1: entryRuleIngestStatement returns [EObject current=null] : iv_ruleIngestStatement= ruleIngestStatement EOF ;
    public final EObject entryRuleIngestStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngestStatement = null;


        try {
            // InternalHealth.g:448:56: (iv_ruleIngestStatement= ruleIngestStatement EOF )
            // InternalHealth.g:449:2: iv_ruleIngestStatement= ruleIngestStatement EOF
            {
             newCompositeNode(grammarAccess.getIngestStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngestStatement=ruleIngestStatement();

            state._fsp--;

             current =iv_ruleIngestStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIngestStatement"


    // $ANTLR start "ruleIngestStatement"
    // InternalHealth.g:455:1: ruleIngestStatement returns [EObject current=null] : (otherlv_0= 'I' otherlv_1= 'have' ( (lv_nutritiontype_2_0= rulenutrition ) ) ( (lv_amount_3_0= ruleInputValue ) ) otherlv_4= 'g' ) ;
    public final EObject ruleIngestStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_nutritiontype_2_0 = null;

        EObject lv_amount_3_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:461:2: ( (otherlv_0= 'I' otherlv_1= 'have' ( (lv_nutritiontype_2_0= rulenutrition ) ) ( (lv_amount_3_0= ruleInputValue ) ) otherlv_4= 'g' ) )
            // InternalHealth.g:462:2: (otherlv_0= 'I' otherlv_1= 'have' ( (lv_nutritiontype_2_0= rulenutrition ) ) ( (lv_amount_3_0= ruleInputValue ) ) otherlv_4= 'g' )
            {
            // InternalHealth.g:462:2: (otherlv_0= 'I' otherlv_1= 'have' ( (lv_nutritiontype_2_0= rulenutrition ) ) ( (lv_amount_3_0= ruleInputValue ) ) otherlv_4= 'g' )
            // InternalHealth.g:463:3: otherlv_0= 'I' otherlv_1= 'have' ( (lv_nutritiontype_2_0= rulenutrition ) ) ( (lv_amount_3_0= ruleInputValue ) ) otherlv_4= 'g'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIngestStatementAccess().getIKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIngestStatementAccess().getHaveKeyword_1());
            		
            // InternalHealth.g:471:3: ( (lv_nutritiontype_2_0= rulenutrition ) )
            // InternalHealth.g:472:4: (lv_nutritiontype_2_0= rulenutrition )
            {
            // InternalHealth.g:472:4: (lv_nutritiontype_2_0= rulenutrition )
            // InternalHealth.g:473:5: lv_nutritiontype_2_0= rulenutrition
            {

            					newCompositeNode(grammarAccess.getIngestStatementAccess().getNutritiontypeNutritionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_nutritiontype_2_0=rulenutrition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestStatementRule());
            					}
            					set(
            						current,
            						"nutritiontype",
            						lv_nutritiontype_2_0,
            						"org.xtext.example.myhealth.Health.nutrition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHealth.g:490:3: ( (lv_amount_3_0= ruleInputValue ) )
            // InternalHealth.g:491:4: (lv_amount_3_0= ruleInputValue )
            {
            // InternalHealth.g:491:4: (lv_amount_3_0= ruleInputValue )
            // InternalHealth.g:492:5: lv_amount_3_0= ruleInputValue
            {

            					newCompositeNode(grammarAccess.getIngestStatementAccess().getAmountInputValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_amount_3_0=ruleInputValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestStatementRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_3_0,
            						"org.xtext.example.myhealth.Health.InputValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIngestStatementAccess().getGKeyword_4());
            		

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
    // $ANTLR end "ruleIngestStatement"


    // $ANTLR start "entryRuleExerciseStatement"
    // InternalHealth.g:517:1: entryRuleExerciseStatement returns [EObject current=null] : iv_ruleExerciseStatement= ruleExerciseStatement EOF ;
    public final EObject entryRuleExerciseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExerciseStatement = null;


        try {
            // InternalHealth.g:517:58: (iv_ruleExerciseStatement= ruleExerciseStatement EOF )
            // InternalHealth.g:518:2: iv_ruleExerciseStatement= ruleExerciseStatement EOF
            {
             newCompositeNode(grammarAccess.getExerciseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExerciseStatement=ruleExerciseStatement();

            state._fsp--;

             current =iv_ruleExerciseStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExerciseStatement"


    // $ANTLR start "ruleExerciseStatement"
    // InternalHealth.g:524:1: ruleExerciseStatement returns [EObject current=null] : (otherlv_0= 'I' ( (lv_ExerciseType_1_0= ruleExerciseType ) ) otherlv_2= 'for' ( (lv_time_3_0= ruleInputValue ) ) otherlv_4= 'hour' ) ;
    public final EObject ruleExerciseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_ExerciseType_1_0 = null;

        EObject lv_time_3_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:530:2: ( (otherlv_0= 'I' ( (lv_ExerciseType_1_0= ruleExerciseType ) ) otherlv_2= 'for' ( (lv_time_3_0= ruleInputValue ) ) otherlv_4= 'hour' ) )
            // InternalHealth.g:531:2: (otherlv_0= 'I' ( (lv_ExerciseType_1_0= ruleExerciseType ) ) otherlv_2= 'for' ( (lv_time_3_0= ruleInputValue ) ) otherlv_4= 'hour' )
            {
            // InternalHealth.g:531:2: (otherlv_0= 'I' ( (lv_ExerciseType_1_0= ruleExerciseType ) ) otherlv_2= 'for' ( (lv_time_3_0= ruleInputValue ) ) otherlv_4= 'hour' )
            // InternalHealth.g:532:3: otherlv_0= 'I' ( (lv_ExerciseType_1_0= ruleExerciseType ) ) otherlv_2= 'for' ( (lv_time_3_0= ruleInputValue ) ) otherlv_4= 'hour'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getExerciseStatementAccess().getIKeyword_0());
            		
            // InternalHealth.g:536:3: ( (lv_ExerciseType_1_0= ruleExerciseType ) )
            // InternalHealth.g:537:4: (lv_ExerciseType_1_0= ruleExerciseType )
            {
            // InternalHealth.g:537:4: (lv_ExerciseType_1_0= ruleExerciseType )
            // InternalHealth.g:538:5: lv_ExerciseType_1_0= ruleExerciseType
            {

            					newCompositeNode(grammarAccess.getExerciseStatementAccess().getExerciseTypeExerciseTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_ExerciseType_1_0=ruleExerciseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExerciseStatementRule());
            					}
            					set(
            						current,
            						"ExerciseType",
            						lv_ExerciseType_1_0,
            						"org.xtext.example.myhealth.Health.ExerciseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExerciseStatementAccess().getForKeyword_2());
            		
            // InternalHealth.g:559:3: ( (lv_time_3_0= ruleInputValue ) )
            // InternalHealth.g:560:4: (lv_time_3_0= ruleInputValue )
            {
            // InternalHealth.g:560:4: (lv_time_3_0= ruleInputValue )
            // InternalHealth.g:561:5: lv_time_3_0= ruleInputValue
            {

            					newCompositeNode(grammarAccess.getExerciseStatementAccess().getTimeInputValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_time_3_0=ruleInputValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExerciseStatementRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_3_0,
            						"org.xtext.example.myhealth.Health.InputValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExerciseStatementAccess().getHourKeyword_4());
            		

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
    // $ANTLR end "ruleExerciseStatement"


    // $ANTLR start "entryRuleAdviceStatement"
    // InternalHealth.g:586:1: entryRuleAdviceStatement returns [EObject current=null] : iv_ruleAdviceStatement= ruleAdviceStatement EOF ;
    public final EObject entryRuleAdviceStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdviceStatement = null;


        try {
            // InternalHealth.g:586:56: (iv_ruleAdviceStatement= ruleAdviceStatement EOF )
            // InternalHealth.g:587:2: iv_ruleAdviceStatement= ruleAdviceStatement EOF
            {
             newCompositeNode(grammarAccess.getAdviceStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdviceStatement=ruleAdviceStatement();

            state._fsp--;

             current =iv_ruleAdviceStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdviceStatement"


    // $ANTLR start "ruleAdviceStatement"
    // InternalHealth.g:593:1: ruleAdviceStatement returns [EObject current=null] : (otherlv_0= 'give' otherlv_1= 'me' otherlv_2= 'advice' otherlv_3= 'on' ( (lv_ad_4_0= ruleAdviceType ) ) ) ;
    public final EObject ruleAdviceStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_ad_4_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:599:2: ( (otherlv_0= 'give' otherlv_1= 'me' otherlv_2= 'advice' otherlv_3= 'on' ( (lv_ad_4_0= ruleAdviceType ) ) ) )
            // InternalHealth.g:600:2: (otherlv_0= 'give' otherlv_1= 'me' otherlv_2= 'advice' otherlv_3= 'on' ( (lv_ad_4_0= ruleAdviceType ) ) )
            {
            // InternalHealth.g:600:2: (otherlv_0= 'give' otherlv_1= 'me' otherlv_2= 'advice' otherlv_3= 'on' ( (lv_ad_4_0= ruleAdviceType ) ) )
            // InternalHealth.g:601:3: otherlv_0= 'give' otherlv_1= 'me' otherlv_2= 'advice' otherlv_3= 'on' ( (lv_ad_4_0= ruleAdviceType ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAdviceStatementAccess().getGiveKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAdviceStatementAccess().getMeKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAdviceStatementAccess().getAdviceKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAdviceStatementAccess().getOnKeyword_3());
            		
            // InternalHealth.g:617:3: ( (lv_ad_4_0= ruleAdviceType ) )
            // InternalHealth.g:618:4: (lv_ad_4_0= ruleAdviceType )
            {
            // InternalHealth.g:618:4: (lv_ad_4_0= ruleAdviceType )
            // InternalHealth.g:619:5: lv_ad_4_0= ruleAdviceType
            {

            					newCompositeNode(grammarAccess.getAdviceStatementAccess().getAdAdviceTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_ad_4_0=ruleAdviceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdviceStatementRule());
            					}
            					set(
            						current,
            						"ad",
            						lv_ad_4_0,
            						"org.xtext.example.myhealth.Health.AdviceType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAdviceStatement"


    // $ANTLR start "entryRuleInputValue"
    // InternalHealth.g:640:1: entryRuleInputValue returns [EObject current=null] : iv_ruleInputValue= ruleInputValue EOF ;
    public final EObject entryRuleInputValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValue = null;


        try {
            // InternalHealth.g:640:51: (iv_ruleInputValue= ruleInputValue EOF )
            // InternalHealth.g:641:2: iv_ruleInputValue= ruleInputValue EOF
            {
             newCompositeNode(grammarAccess.getInputValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputValue=ruleInputValue();

            state._fsp--;

             current =iv_ruleInputValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputValue"


    // $ANTLR start "ruleInputValue"
    // InternalHealth.g:647:1: ruleInputValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue ) ;
    public final EObject ruleInputValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_RealValue_1 = null;



        	enterRule();

        try {
            // InternalHealth.g:653:2: ( (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue ) )
            // InternalHealth.g:654:2: (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue )
            {
            // InternalHealth.g:654:2: (this_IntValue_0= ruleIntValue | this_RealValue_1= ruleRealValue )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==31) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==11||LA3_1==14||LA3_1==17||LA3_1==19||LA3_1==22||LA3_1==24||(LA3_1>=26 && LA3_1<=27)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHealth.g:655:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getInputValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHealth.g:664:3: this_RealValue_1= ruleRealValue
                    {

                    			newCompositeNode(grammarAccess.getInputValueAccess().getRealValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealValue_1=ruleRealValue();

                    state._fsp--;


                    			current = this_RealValue_1;
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
    // $ANTLR end "ruleInputValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalHealth.g:676:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalHealth.g:676:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalHealth.g:677:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalHealth.g:683:1: ruleIntValue returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalHealth.g:689:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalHealth.g:690:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalHealth.g:690:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalHealth.g:691:3: (lv_val_0_0= RULE_INT )
            {
            // InternalHealth.g:691:3: (lv_val_0_0= RULE_INT )
            // InternalHealth.g:692:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleRealValue"
    // InternalHealth.g:711:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // InternalHealth.g:711:50: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalHealth.g:712:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalHealth.g:718:1: ruleRealValue returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalHealth.g:724:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalHealth.g:725:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalHealth.g:725:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalHealth.g:726:3: (lv_val_0_0= ruleREAL )
            {
            // InternalHealth.g:726:3: (lv_val_0_0= ruleREAL )
            // InternalHealth.g:727:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealValueAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealValueRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.xtext.example.myhealth.Health.REAL");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleREAL"
    // InternalHealth.g:747:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalHealth.g:749:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalHealth.g:750:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalHealth.g:759:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalHealth.g:766:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalHealth.g:767:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalHealth.g:767:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalHealth.g:768:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalHealth.g:768:3: (this_INT_0= RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHealth.g:769:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_26); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleGender"
    // InternalHealth.g:796:1: ruleGender returns [Enumerator current=null] : ( (enumLiteral_0= 'Male' ) | (enumLiteral_1= 'Female' ) ) ;
    public final Enumerator ruleGender() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalHealth.g:802:2: ( ( (enumLiteral_0= 'Male' ) | (enumLiteral_1= 'Female' ) ) )
            // InternalHealth.g:803:2: ( (enumLiteral_0= 'Male' ) | (enumLiteral_1= 'Female' ) )
            {
            // InternalHealth.g:803:2: ( (enumLiteral_0= 'Male' ) | (enumLiteral_1= 'Female' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHealth.g:804:3: (enumLiteral_0= 'Male' )
                    {
                    // InternalHealth.g:804:3: (enumLiteral_0= 'Male' )
                    // InternalHealth.g:805:4: enumLiteral_0= 'Male'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:812:3: (enumLiteral_1= 'Female' )
                    {
                    // InternalHealth.g:812:3: (enumLiteral_1= 'Female' )
                    // InternalHealth.g:813:4: enumLiteral_1= 'Female'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleGender"


    // $ANTLR start "rulenutrition"
    // InternalHealth.g:823:1: rulenutrition returns [Enumerator current=null] : ( (enumLiteral_0= 'protein' ) | (enumLiteral_1= 'fat' ) | (enumLiteral_2= 'carbohydrate' ) ) ;
    public final Enumerator rulenutrition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHealth.g:829:2: ( ( (enumLiteral_0= 'protein' ) | (enumLiteral_1= 'fat' ) | (enumLiteral_2= 'carbohydrate' ) ) )
            // InternalHealth.g:830:2: ( (enumLiteral_0= 'protein' ) | (enumLiteral_1= 'fat' ) | (enumLiteral_2= 'carbohydrate' ) )
            {
            // InternalHealth.g:830:2: ( (enumLiteral_0= 'protein' ) | (enumLiteral_1= 'fat' ) | (enumLiteral_2= 'carbohydrate' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHealth.g:831:3: (enumLiteral_0= 'protein' )
                    {
                    // InternalHealth.g:831:3: (enumLiteral_0= 'protein' )
                    // InternalHealth.g:832:4: enumLiteral_0= 'protein'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getNutritionAccess().getProteinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNutritionAccess().getProteinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:839:3: (enumLiteral_1= 'fat' )
                    {
                    // InternalHealth.g:839:3: (enumLiteral_1= 'fat' )
                    // InternalHealth.g:840:4: enumLiteral_1= 'fat'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getNutritionAccess().getFatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNutritionAccess().getFatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHealth.g:847:3: (enumLiteral_2= 'carbohydrate' )
                    {
                    // InternalHealth.g:847:3: (enumLiteral_2= 'carbohydrate' )
                    // InternalHealth.g:848:4: enumLiteral_2= 'carbohydrate'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getNutritionAccess().getCarbohydrateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNutritionAccess().getCarbohydrateEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "rulenutrition"


    // $ANTLR start "ruleAdviceType"
    // InternalHealth.g:858:1: ruleAdviceType returns [Enumerator current=null] : ( (enumLiteral_0= 'Eating' ) | (enumLiteral_1= 'Sport' ) ) ;
    public final Enumerator ruleAdviceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalHealth.g:864:2: ( ( (enumLiteral_0= 'Eating' ) | (enumLiteral_1= 'Sport' ) ) )
            // InternalHealth.g:865:2: ( (enumLiteral_0= 'Eating' ) | (enumLiteral_1= 'Sport' ) )
            {
            // InternalHealth.g:865:2: ( (enumLiteral_0= 'Eating' ) | (enumLiteral_1= 'Sport' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHealth.g:866:3: (enumLiteral_0= 'Eating' )
                    {
                    // InternalHealth.g:866:3: (enumLiteral_0= 'Eating' )
                    // InternalHealth.g:867:4: enumLiteral_0= 'Eating'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAdviceTypeAccess().getEatingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdviceTypeAccess().getEatingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:874:3: (enumLiteral_1= 'Sport' )
                    {
                    // InternalHealth.g:874:3: (enumLiteral_1= 'Sport' )
                    // InternalHealth.g:875:4: enumLiteral_1= 'Sport'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getAdviceTypeAccess().getSportEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdviceTypeAccess().getSportEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleAdviceType"


    // $ANTLR start "ruleExerciseType"
    // InternalHealth.g:885:1: ruleExerciseType returns [Enumerator current=null] : ( (enumLiteral_0= 'walk' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'swim' ) ) ;
    public final Enumerator ruleExerciseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHealth.g:891:2: ( ( (enumLiteral_0= 'walk' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'swim' ) ) )
            // InternalHealth.g:892:2: ( (enumLiteral_0= 'walk' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'swim' ) )
            {
            // InternalHealth.g:892:2: ( (enumLiteral_0= 'walk' ) | (enumLiteral_1= 'run' ) | (enumLiteral_2= 'swim' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case 40:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHealth.g:893:3: (enumLiteral_0= 'walk' )
                    {
                    // InternalHealth.g:893:3: (enumLiteral_0= 'walk' )
                    // InternalHealth.g:894:4: enumLiteral_0= 'walk'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getExerciseTypeAccess().getWalkEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExerciseTypeAccess().getWalkEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:901:3: (enumLiteral_1= 'run' )
                    {
                    // InternalHealth.g:901:3: (enumLiteral_1= 'run' )
                    // InternalHealth.g:902:4: enumLiteral_1= 'run'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getExerciseTypeAccess().getRunEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExerciseTypeAccess().getRunEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHealth.g:909:3: (enumLiteral_2= 'swim' )
                    {
                    // InternalHealth.g:909:3: (enumLiteral_2= 'swim' )
                    // InternalHealth.g:910:4: enumLiteral_2= 'swim'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getExerciseTypeAccess().getSwimEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getExerciseTypeAccess().getSwimEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleExerciseType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\13\1\14\1\17\1\27\10\uffff";
    static final String dfa_3s = "\1\33\1\25\1\24\1\51\10\uffff";
    static final String dfa_4s = "\4\uffff\1\10\1\1\1\5\1\4\1\3\1\2\1\6\1\7";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\7\uffff\1\3\4\uffff\1\4",
            "\1\5\10\uffff\1\6",
            "\1\11\2\uffff\1\10\1\uffff\1\7",
            "\1\12\17\uffff\3\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:2: (this_PeopleStatement_0= rulePeopleStatement | this_HeightStatement_1= ruleHeightStatement | this_WeightStatement_2= ruleWeightStatement | this_AgeStatement_3= ruleAgeStatement | this_GenderStatement_4= ruleGenderStatement | this_IngestStatement_5= ruleIngestStatement | this_ExerciseStatement_6= ruleExerciseStatement | this_AdviceStatement_7= ruleAdviceStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008404802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});

}