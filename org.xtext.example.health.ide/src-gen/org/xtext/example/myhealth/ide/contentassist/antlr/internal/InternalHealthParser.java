package org.xtext.example.myhealth.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.myhealth.services.HealthGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHealthParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Male'", "'Female'", "'protein'", "'fat'", "'carbohydrate'", "'Eating'", "'Sport'", "'walk'", "'run'", "'swim'", "'my'", "'name'", "'is'", "'add'", "'height'", "'as'", "'centimeters'", "'weight'", "'kilograms'", "'age'", "'gender'", "'I'", "'have'", "'g'", "'for'", "'hour'", "'give'", "'me'", "'advice'", "'on'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(HealthGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleHealthProgram"
    // InternalHealth.g:53:1: entryRuleHealthProgram : ruleHealthProgram EOF ;
    public final void entryRuleHealthProgram() throws RecognitionException {
        try {
            // InternalHealth.g:54:1: ( ruleHealthProgram EOF )
            // InternalHealth.g:55:1: ruleHealthProgram EOF
            {
             before(grammarAccess.getHealthProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleHealthProgram();

            state._fsp--;

             after(grammarAccess.getHealthProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHealthProgram"


    // $ANTLR start "ruleHealthProgram"
    // InternalHealth.g:62:1: ruleHealthProgram : ( ( rule__HealthProgram__StatementsAssignment )* ) ;
    public final void ruleHealthProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:66:2: ( ( ( rule__HealthProgram__StatementsAssignment )* ) )
            // InternalHealth.g:67:2: ( ( rule__HealthProgram__StatementsAssignment )* )
            {
            // InternalHealth.g:67:2: ( ( rule__HealthProgram__StatementsAssignment )* )
            // InternalHealth.g:68:3: ( rule__HealthProgram__StatementsAssignment )*
            {
             before(grammarAccess.getHealthProgramAccess().getStatementsAssignment()); 
            // InternalHealth.g:69:3: ( rule__HealthProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21||LA1_0==24||LA1_0==32||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHealth.g:69:4: rule__HealthProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__HealthProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getHealthProgramAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleHealthProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalHealth.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalHealth.g:79:1: ( ruleStatement EOF )
            // InternalHealth.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalHealth.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalHealth.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalHealth.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalHealth.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalHealth.g:94:3: ( rule__Statement__Alternatives )
            // InternalHealth.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePeopleStatement"
    // InternalHealth.g:103:1: entryRulePeopleStatement : rulePeopleStatement EOF ;
    public final void entryRulePeopleStatement() throws RecognitionException {
        try {
            // InternalHealth.g:104:1: ( rulePeopleStatement EOF )
            // InternalHealth.g:105:1: rulePeopleStatement EOF
            {
             before(grammarAccess.getPeopleStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePeopleStatement();

            state._fsp--;

             after(grammarAccess.getPeopleStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePeopleStatement"


    // $ANTLR start "rulePeopleStatement"
    // InternalHealth.g:112:1: rulePeopleStatement : ( ( rule__PeopleStatement__Group__0 ) ) ;
    public final void rulePeopleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:116:2: ( ( ( rule__PeopleStatement__Group__0 ) ) )
            // InternalHealth.g:117:2: ( ( rule__PeopleStatement__Group__0 ) )
            {
            // InternalHealth.g:117:2: ( ( rule__PeopleStatement__Group__0 ) )
            // InternalHealth.g:118:3: ( rule__PeopleStatement__Group__0 )
            {
             before(grammarAccess.getPeopleStatementAccess().getGroup()); 
            // InternalHealth.g:119:3: ( rule__PeopleStatement__Group__0 )
            // InternalHealth.g:119:4: rule__PeopleStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PeopleStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeopleStatementAccess().getGroup()); 

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
    // $ANTLR end "rulePeopleStatement"


    // $ANTLR start "entryRuleHeightStatement"
    // InternalHealth.g:128:1: entryRuleHeightStatement : ruleHeightStatement EOF ;
    public final void entryRuleHeightStatement() throws RecognitionException {
        try {
            // InternalHealth.g:129:1: ( ruleHeightStatement EOF )
            // InternalHealth.g:130:1: ruleHeightStatement EOF
            {
             before(grammarAccess.getHeightStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleHeightStatement();

            state._fsp--;

             after(grammarAccess.getHeightStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeightStatement"


    // $ANTLR start "ruleHeightStatement"
    // InternalHealth.g:137:1: ruleHeightStatement : ( ( rule__HeightStatement__Group__0 ) ) ;
    public final void ruleHeightStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:141:2: ( ( ( rule__HeightStatement__Group__0 ) ) )
            // InternalHealth.g:142:2: ( ( rule__HeightStatement__Group__0 ) )
            {
            // InternalHealth.g:142:2: ( ( rule__HeightStatement__Group__0 ) )
            // InternalHealth.g:143:3: ( rule__HeightStatement__Group__0 )
            {
             before(grammarAccess.getHeightStatementAccess().getGroup()); 
            // InternalHealth.g:144:3: ( rule__HeightStatement__Group__0 )
            // InternalHealth.g:144:4: rule__HeightStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeightStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeightStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleHeightStatement"


    // $ANTLR start "entryRuleWeightStatement"
    // InternalHealth.g:153:1: entryRuleWeightStatement : ruleWeightStatement EOF ;
    public final void entryRuleWeightStatement() throws RecognitionException {
        try {
            // InternalHealth.g:154:1: ( ruleWeightStatement EOF )
            // InternalHealth.g:155:1: ruleWeightStatement EOF
            {
             before(grammarAccess.getWeightStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWeightStatement();

            state._fsp--;

             after(grammarAccess.getWeightStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWeightStatement"


    // $ANTLR start "ruleWeightStatement"
    // InternalHealth.g:162:1: ruleWeightStatement : ( ( rule__WeightStatement__Group__0 ) ) ;
    public final void ruleWeightStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:166:2: ( ( ( rule__WeightStatement__Group__0 ) ) )
            // InternalHealth.g:167:2: ( ( rule__WeightStatement__Group__0 ) )
            {
            // InternalHealth.g:167:2: ( ( rule__WeightStatement__Group__0 ) )
            // InternalHealth.g:168:3: ( rule__WeightStatement__Group__0 )
            {
             before(grammarAccess.getWeightStatementAccess().getGroup()); 
            // InternalHealth.g:169:3: ( rule__WeightStatement__Group__0 )
            // InternalHealth.g:169:4: rule__WeightStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WeightStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWeightStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleWeightStatement"


    // $ANTLR start "entryRuleAgeStatement"
    // InternalHealth.g:178:1: entryRuleAgeStatement : ruleAgeStatement EOF ;
    public final void entryRuleAgeStatement() throws RecognitionException {
        try {
            // InternalHealth.g:179:1: ( ruleAgeStatement EOF )
            // InternalHealth.g:180:1: ruleAgeStatement EOF
            {
             before(grammarAccess.getAgeStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAgeStatement();

            state._fsp--;

             after(grammarAccess.getAgeStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAgeStatement"


    // $ANTLR start "ruleAgeStatement"
    // InternalHealth.g:187:1: ruleAgeStatement : ( ( rule__AgeStatement__Group__0 ) ) ;
    public final void ruleAgeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:191:2: ( ( ( rule__AgeStatement__Group__0 ) ) )
            // InternalHealth.g:192:2: ( ( rule__AgeStatement__Group__0 ) )
            {
            // InternalHealth.g:192:2: ( ( rule__AgeStatement__Group__0 ) )
            // InternalHealth.g:193:3: ( rule__AgeStatement__Group__0 )
            {
             before(grammarAccess.getAgeStatementAccess().getGroup()); 
            // InternalHealth.g:194:3: ( rule__AgeStatement__Group__0 )
            // InternalHealth.g:194:4: rule__AgeStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AgeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgeStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleAgeStatement"


    // $ANTLR start "entryRuleGenderStatement"
    // InternalHealth.g:203:1: entryRuleGenderStatement : ruleGenderStatement EOF ;
    public final void entryRuleGenderStatement() throws RecognitionException {
        try {
            // InternalHealth.g:204:1: ( ruleGenderStatement EOF )
            // InternalHealth.g:205:1: ruleGenderStatement EOF
            {
             before(grammarAccess.getGenderStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleGenderStatement();

            state._fsp--;

             after(grammarAccess.getGenderStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenderStatement"


    // $ANTLR start "ruleGenderStatement"
    // InternalHealth.g:212:1: ruleGenderStatement : ( ( rule__GenderStatement__Group__0 ) ) ;
    public final void ruleGenderStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:216:2: ( ( ( rule__GenderStatement__Group__0 ) ) )
            // InternalHealth.g:217:2: ( ( rule__GenderStatement__Group__0 ) )
            {
            // InternalHealth.g:217:2: ( ( rule__GenderStatement__Group__0 ) )
            // InternalHealth.g:218:3: ( rule__GenderStatement__Group__0 )
            {
             before(grammarAccess.getGenderStatementAccess().getGroup()); 
            // InternalHealth.g:219:3: ( rule__GenderStatement__Group__0 )
            // InternalHealth.g:219:4: rule__GenderStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenderStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenderStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleGenderStatement"


    // $ANTLR start "entryRuleIngestStatement"
    // InternalHealth.g:228:1: entryRuleIngestStatement : ruleIngestStatement EOF ;
    public final void entryRuleIngestStatement() throws RecognitionException {
        try {
            // InternalHealth.g:229:1: ( ruleIngestStatement EOF )
            // InternalHealth.g:230:1: ruleIngestStatement EOF
            {
             before(grammarAccess.getIngestStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIngestStatement();

            state._fsp--;

             after(grammarAccess.getIngestStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIngestStatement"


    // $ANTLR start "ruleIngestStatement"
    // InternalHealth.g:237:1: ruleIngestStatement : ( ( rule__IngestStatement__Group__0 ) ) ;
    public final void ruleIngestStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:241:2: ( ( ( rule__IngestStatement__Group__0 ) ) )
            // InternalHealth.g:242:2: ( ( rule__IngestStatement__Group__0 ) )
            {
            // InternalHealth.g:242:2: ( ( rule__IngestStatement__Group__0 ) )
            // InternalHealth.g:243:3: ( rule__IngestStatement__Group__0 )
            {
             before(grammarAccess.getIngestStatementAccess().getGroup()); 
            // InternalHealth.g:244:3: ( rule__IngestStatement__Group__0 )
            // InternalHealth.g:244:4: rule__IngestStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IngestStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngestStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleIngestStatement"


    // $ANTLR start "entryRuleExerciseStatement"
    // InternalHealth.g:253:1: entryRuleExerciseStatement : ruleExerciseStatement EOF ;
    public final void entryRuleExerciseStatement() throws RecognitionException {
        try {
            // InternalHealth.g:254:1: ( ruleExerciseStatement EOF )
            // InternalHealth.g:255:1: ruleExerciseStatement EOF
            {
             before(grammarAccess.getExerciseStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleExerciseStatement();

            state._fsp--;

             after(grammarAccess.getExerciseStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExerciseStatement"


    // $ANTLR start "ruleExerciseStatement"
    // InternalHealth.g:262:1: ruleExerciseStatement : ( ( rule__ExerciseStatement__Group__0 ) ) ;
    public final void ruleExerciseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:266:2: ( ( ( rule__ExerciseStatement__Group__0 ) ) )
            // InternalHealth.g:267:2: ( ( rule__ExerciseStatement__Group__0 ) )
            {
            // InternalHealth.g:267:2: ( ( rule__ExerciseStatement__Group__0 ) )
            // InternalHealth.g:268:3: ( rule__ExerciseStatement__Group__0 )
            {
             before(grammarAccess.getExerciseStatementAccess().getGroup()); 
            // InternalHealth.g:269:3: ( rule__ExerciseStatement__Group__0 )
            // InternalHealth.g:269:4: rule__ExerciseStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExerciseStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleExerciseStatement"


    // $ANTLR start "entryRuleAdviceStatement"
    // InternalHealth.g:278:1: entryRuleAdviceStatement : ruleAdviceStatement EOF ;
    public final void entryRuleAdviceStatement() throws RecognitionException {
        try {
            // InternalHealth.g:279:1: ( ruleAdviceStatement EOF )
            // InternalHealth.g:280:1: ruleAdviceStatement EOF
            {
             before(grammarAccess.getAdviceStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAdviceStatement();

            state._fsp--;

             after(grammarAccess.getAdviceStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdviceStatement"


    // $ANTLR start "ruleAdviceStatement"
    // InternalHealth.g:287:1: ruleAdviceStatement : ( ( rule__AdviceStatement__Group__0 ) ) ;
    public final void ruleAdviceStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:291:2: ( ( ( rule__AdviceStatement__Group__0 ) ) )
            // InternalHealth.g:292:2: ( ( rule__AdviceStatement__Group__0 ) )
            {
            // InternalHealth.g:292:2: ( ( rule__AdviceStatement__Group__0 ) )
            // InternalHealth.g:293:3: ( rule__AdviceStatement__Group__0 )
            {
             before(grammarAccess.getAdviceStatementAccess().getGroup()); 
            // InternalHealth.g:294:3: ( rule__AdviceStatement__Group__0 )
            // InternalHealth.g:294:4: rule__AdviceStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdviceStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdviceStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleAdviceStatement"


    // $ANTLR start "entryRuleInputValue"
    // InternalHealth.g:303:1: entryRuleInputValue : ruleInputValue EOF ;
    public final void entryRuleInputValue() throws RecognitionException {
        try {
            // InternalHealth.g:304:1: ( ruleInputValue EOF )
            // InternalHealth.g:305:1: ruleInputValue EOF
            {
             before(grammarAccess.getInputValueRule()); 
            pushFollow(FOLLOW_1);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getInputValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputValue"


    // $ANTLR start "ruleInputValue"
    // InternalHealth.g:312:1: ruleInputValue : ( ( rule__InputValue__Alternatives ) ) ;
    public final void ruleInputValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:316:2: ( ( ( rule__InputValue__Alternatives ) ) )
            // InternalHealth.g:317:2: ( ( rule__InputValue__Alternatives ) )
            {
            // InternalHealth.g:317:2: ( ( rule__InputValue__Alternatives ) )
            // InternalHealth.g:318:3: ( rule__InputValue__Alternatives )
            {
             before(grammarAccess.getInputValueAccess().getAlternatives()); 
            // InternalHealth.g:319:3: ( rule__InputValue__Alternatives )
            // InternalHealth.g:319:4: rule__InputValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInputValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalHealth.g:328:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalHealth.g:329:1: ( ruleIntValue EOF )
            // InternalHealth.g:330:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalHealth.g:337:1: ruleIntValue : ( ( rule__IntValue__ValAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:341:2: ( ( ( rule__IntValue__ValAssignment ) ) )
            // InternalHealth.g:342:2: ( ( rule__IntValue__ValAssignment ) )
            {
            // InternalHealth.g:342:2: ( ( rule__IntValue__ValAssignment ) )
            // InternalHealth.g:343:3: ( rule__IntValue__ValAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValAssignment()); 
            // InternalHealth.g:344:3: ( rule__IntValue__ValAssignment )
            // InternalHealth.g:344:4: rule__IntValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValAssignment()); 

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleRealValue"
    // InternalHealth.g:353:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalHealth.g:354:1: ( ruleRealValue EOF )
            // InternalHealth.g:355:1: ruleRealValue EOF
            {
             before(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            ruleRealValue();

            state._fsp--;

             after(grammarAccess.getRealValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalHealth.g:362:1: ruleRealValue : ( ( rule__RealValue__ValAssignment ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:366:2: ( ( ( rule__RealValue__ValAssignment ) ) )
            // InternalHealth.g:367:2: ( ( rule__RealValue__ValAssignment ) )
            {
            // InternalHealth.g:367:2: ( ( rule__RealValue__ValAssignment ) )
            // InternalHealth.g:368:3: ( rule__RealValue__ValAssignment )
            {
             before(grammarAccess.getRealValueAccess().getValAssignment()); 
            // InternalHealth.g:369:3: ( rule__RealValue__ValAssignment )
            // InternalHealth.g:369:4: rule__RealValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealValueAccess().getValAssignment()); 

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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleREAL"
    // InternalHealth.g:378:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalHealth.g:382:1: ( ruleREAL EOF )
            // InternalHealth.g:383:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalHealth.g:393:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:398:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalHealth.g:399:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalHealth.g:399:2: ( ( rule__REAL__Group__0 ) )
            // InternalHealth.g:400:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalHealth.g:401:3: ( rule__REAL__Group__0 )
            // InternalHealth.g:401:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleGender"
    // InternalHealth.g:411:1: ruleGender : ( ( rule__Gender__Alternatives ) ) ;
    public final void ruleGender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:415:1: ( ( ( rule__Gender__Alternatives ) ) )
            // InternalHealth.g:416:2: ( ( rule__Gender__Alternatives ) )
            {
            // InternalHealth.g:416:2: ( ( rule__Gender__Alternatives ) )
            // InternalHealth.g:417:3: ( rule__Gender__Alternatives )
            {
             before(grammarAccess.getGenderAccess().getAlternatives()); 
            // InternalHealth.g:418:3: ( rule__Gender__Alternatives )
            // InternalHealth.g:418:4: rule__Gender__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Gender__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenderAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGender"


    // $ANTLR start "rulenutrition"
    // InternalHealth.g:427:1: rulenutrition : ( ( rule__Nutrition__Alternatives ) ) ;
    public final void rulenutrition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:431:1: ( ( ( rule__Nutrition__Alternatives ) ) )
            // InternalHealth.g:432:2: ( ( rule__Nutrition__Alternatives ) )
            {
            // InternalHealth.g:432:2: ( ( rule__Nutrition__Alternatives ) )
            // InternalHealth.g:433:3: ( rule__Nutrition__Alternatives )
            {
             before(grammarAccess.getNutritionAccess().getAlternatives()); 
            // InternalHealth.g:434:3: ( rule__Nutrition__Alternatives )
            // InternalHealth.g:434:4: rule__Nutrition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nutrition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNutritionAccess().getAlternatives()); 

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
    // $ANTLR end "rulenutrition"


    // $ANTLR start "ruleAdviceType"
    // InternalHealth.g:443:1: ruleAdviceType : ( ( rule__AdviceType__Alternatives ) ) ;
    public final void ruleAdviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:447:1: ( ( ( rule__AdviceType__Alternatives ) ) )
            // InternalHealth.g:448:2: ( ( rule__AdviceType__Alternatives ) )
            {
            // InternalHealth.g:448:2: ( ( rule__AdviceType__Alternatives ) )
            // InternalHealth.g:449:3: ( rule__AdviceType__Alternatives )
            {
             before(grammarAccess.getAdviceTypeAccess().getAlternatives()); 
            // InternalHealth.g:450:3: ( rule__AdviceType__Alternatives )
            // InternalHealth.g:450:4: rule__AdviceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdviceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdviceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAdviceType"


    // $ANTLR start "ruleExerciseType"
    // InternalHealth.g:459:1: ruleExerciseType : ( ( rule__ExerciseType__Alternatives ) ) ;
    public final void ruleExerciseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:463:1: ( ( ( rule__ExerciseType__Alternatives ) ) )
            // InternalHealth.g:464:2: ( ( rule__ExerciseType__Alternatives ) )
            {
            // InternalHealth.g:464:2: ( ( rule__ExerciseType__Alternatives ) )
            // InternalHealth.g:465:3: ( rule__ExerciseType__Alternatives )
            {
             before(grammarAccess.getExerciseTypeAccess().getAlternatives()); 
            // InternalHealth.g:466:3: ( rule__ExerciseType__Alternatives )
            // InternalHealth.g:466:4: rule__ExerciseType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExerciseTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExerciseType"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalHealth.g:474:1: rule__Statement__Alternatives : ( ( rulePeopleStatement ) | ( ruleHeightStatement ) | ( ruleWeightStatement ) | ( ruleAgeStatement ) | ( ruleGenderStatement ) | ( ruleIngestStatement ) | ( ruleExerciseStatement ) | ( ruleAdviceStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:478:1: ( ( rulePeopleStatement ) | ( ruleHeightStatement ) | ( ruleWeightStatement ) | ( ruleAgeStatement ) | ( ruleGenderStatement ) | ( ruleIngestStatement ) | ( ruleExerciseStatement ) | ( ruleAdviceStatement ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalHealth.g:479:2: ( rulePeopleStatement )
                    {
                    // InternalHealth.g:479:2: ( rulePeopleStatement )
                    // InternalHealth.g:480:3: rulePeopleStatement
                    {
                     before(grammarAccess.getStatementAccess().getPeopleStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePeopleStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPeopleStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:485:2: ( ruleHeightStatement )
                    {
                    // InternalHealth.g:485:2: ( ruleHeightStatement )
                    // InternalHealth.g:486:3: ruleHeightStatement
                    {
                     before(grammarAccess.getStatementAccess().getHeightStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHeightStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getHeightStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHealth.g:491:2: ( ruleWeightStatement )
                    {
                    // InternalHealth.g:491:2: ( ruleWeightStatement )
                    // InternalHealth.g:492:3: ruleWeightStatement
                    {
                     before(grammarAccess.getStatementAccess().getWeightStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWeightStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWeightStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHealth.g:497:2: ( ruleAgeStatement )
                    {
                    // InternalHealth.g:497:2: ( ruleAgeStatement )
                    // InternalHealth.g:498:3: ruleAgeStatement
                    {
                     before(grammarAccess.getStatementAccess().getAgeStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAgeStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAgeStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHealth.g:503:2: ( ruleGenderStatement )
                    {
                    // InternalHealth.g:503:2: ( ruleGenderStatement )
                    // InternalHealth.g:504:3: ruleGenderStatement
                    {
                     before(grammarAccess.getStatementAccess().getGenderStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGenderStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGenderStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHealth.g:509:2: ( ruleIngestStatement )
                    {
                    // InternalHealth.g:509:2: ( ruleIngestStatement )
                    // InternalHealth.g:510:3: ruleIngestStatement
                    {
                     before(grammarAccess.getStatementAccess().getIngestStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleIngestStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIngestStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHealth.g:515:2: ( ruleExerciseStatement )
                    {
                    // InternalHealth.g:515:2: ( ruleExerciseStatement )
                    // InternalHealth.g:516:3: ruleExerciseStatement
                    {
                     before(grammarAccess.getStatementAccess().getExerciseStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExerciseStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExerciseStatementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHealth.g:521:2: ( ruleAdviceStatement )
                    {
                    // InternalHealth.g:521:2: ( ruleAdviceStatement )
                    // InternalHealth.g:522:3: ruleAdviceStatement
                    {
                     before(grammarAccess.getStatementAccess().getAdviceStatementParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleAdviceStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAdviceStatementParserRuleCall_7()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__InputValue__Alternatives"
    // InternalHealth.g:531:1: rule__InputValue__Alternatives : ( ( ruleIntValue ) | ( ruleRealValue ) );
    public final void rule__InputValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:535:1: ( ( ruleIntValue ) | ( ruleRealValue ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==21||LA3_1==24||LA3_1==27||LA3_1==29||LA3_1==32||LA3_1==34||(LA3_1>=36 && LA3_1<=37)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==41) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==41) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHealth.g:536:2: ( ruleIntValue )
                    {
                    // InternalHealth.g:536:2: ( ruleIntValue )
                    // InternalHealth.g:537:3: ruleIntValue
                    {
                     before(grammarAccess.getInputValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getInputValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:542:2: ( ruleRealValue )
                    {
                    // InternalHealth.g:542:2: ( ruleRealValue )
                    // InternalHealth.g:543:3: ruleRealValue
                    {
                     before(grammarAccess.getInputValueAccess().getRealValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealValue();

                    state._fsp--;

                     after(grammarAccess.getInputValueAccess().getRealValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__InputValue__Alternatives"


    // $ANTLR start "rule__Gender__Alternatives"
    // InternalHealth.g:552:1: rule__Gender__Alternatives : ( ( ( 'Male' ) ) | ( ( 'Female' ) ) );
    public final void rule__Gender__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:556:1: ( ( ( 'Male' ) ) | ( ( 'Female' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHealth.g:557:2: ( ( 'Male' ) )
                    {
                    // InternalHealth.g:557:2: ( ( 'Male' ) )
                    // InternalHealth.g:558:3: ( 'Male' )
                    {
                     before(grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_0()); 
                    // InternalHealth.g:559:3: ( 'Male' )
                    // InternalHealth.g:559:4: 'Male'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:563:2: ( ( 'Female' ) )
                    {
                    // InternalHealth.g:563:2: ( ( 'Female' ) )
                    // InternalHealth.g:564:3: ( 'Female' )
                    {
                     before(grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1()); 
                    // InternalHealth.g:565:3: ( 'Female' )
                    // InternalHealth.g:565:4: 'Female'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Gender__Alternatives"


    // $ANTLR start "rule__Nutrition__Alternatives"
    // InternalHealth.g:573:1: rule__Nutrition__Alternatives : ( ( ( 'protein' ) ) | ( ( 'fat' ) ) | ( ( 'carbohydrate' ) ) );
    public final void rule__Nutrition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:577:1: ( ( ( 'protein' ) ) | ( ( 'fat' ) ) | ( ( 'carbohydrate' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHealth.g:578:2: ( ( 'protein' ) )
                    {
                    // InternalHealth.g:578:2: ( ( 'protein' ) )
                    // InternalHealth.g:579:3: ( 'protein' )
                    {
                     before(grammarAccess.getNutritionAccess().getProteinEnumLiteralDeclaration_0()); 
                    // InternalHealth.g:580:3: ( 'protein' )
                    // InternalHealth.g:580:4: 'protein'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNutritionAccess().getProteinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:584:2: ( ( 'fat' ) )
                    {
                    // InternalHealth.g:584:2: ( ( 'fat' ) )
                    // InternalHealth.g:585:3: ( 'fat' )
                    {
                     before(grammarAccess.getNutritionAccess().getFatEnumLiteralDeclaration_1()); 
                    // InternalHealth.g:586:3: ( 'fat' )
                    // InternalHealth.g:586:4: 'fat'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNutritionAccess().getFatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHealth.g:590:2: ( ( 'carbohydrate' ) )
                    {
                    // InternalHealth.g:590:2: ( ( 'carbohydrate' ) )
                    // InternalHealth.g:591:3: ( 'carbohydrate' )
                    {
                     before(grammarAccess.getNutritionAccess().getCarbohydrateEnumLiteralDeclaration_2()); 
                    // InternalHealth.g:592:3: ( 'carbohydrate' )
                    // InternalHealth.g:592:4: 'carbohydrate'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNutritionAccess().getCarbohydrateEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Nutrition__Alternatives"


    // $ANTLR start "rule__AdviceType__Alternatives"
    // InternalHealth.g:600:1: rule__AdviceType__Alternatives : ( ( ( 'Eating' ) ) | ( ( 'Sport' ) ) );
    public final void rule__AdviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:604:1: ( ( ( 'Eating' ) ) | ( ( 'Sport' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHealth.g:605:2: ( ( 'Eating' ) )
                    {
                    // InternalHealth.g:605:2: ( ( 'Eating' ) )
                    // InternalHealth.g:606:3: ( 'Eating' )
                    {
                     before(grammarAccess.getAdviceTypeAccess().getEatingEnumLiteralDeclaration_0()); 
                    // InternalHealth.g:607:3: ( 'Eating' )
                    // InternalHealth.g:607:4: 'Eating'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdviceTypeAccess().getEatingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:611:2: ( ( 'Sport' ) )
                    {
                    // InternalHealth.g:611:2: ( ( 'Sport' ) )
                    // InternalHealth.g:612:3: ( 'Sport' )
                    {
                     before(grammarAccess.getAdviceTypeAccess().getSportEnumLiteralDeclaration_1()); 
                    // InternalHealth.g:613:3: ( 'Sport' )
                    // InternalHealth.g:613:4: 'Sport'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdviceTypeAccess().getSportEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AdviceType__Alternatives"


    // $ANTLR start "rule__ExerciseType__Alternatives"
    // InternalHealth.g:621:1: rule__ExerciseType__Alternatives : ( ( ( 'walk' ) ) | ( ( 'run' ) ) | ( ( 'swim' ) ) );
    public final void rule__ExerciseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:625:1: ( ( ( 'walk' ) ) | ( ( 'run' ) ) | ( ( 'swim' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalHealth.g:626:2: ( ( 'walk' ) )
                    {
                    // InternalHealth.g:626:2: ( ( 'walk' ) )
                    // InternalHealth.g:627:3: ( 'walk' )
                    {
                     before(grammarAccess.getExerciseTypeAccess().getWalkEnumLiteralDeclaration_0()); 
                    // InternalHealth.g:628:3: ( 'walk' )
                    // InternalHealth.g:628:4: 'walk'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getExerciseTypeAccess().getWalkEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHealth.g:632:2: ( ( 'run' ) )
                    {
                    // InternalHealth.g:632:2: ( ( 'run' ) )
                    // InternalHealth.g:633:3: ( 'run' )
                    {
                     before(grammarAccess.getExerciseTypeAccess().getRunEnumLiteralDeclaration_1()); 
                    // InternalHealth.g:634:3: ( 'run' )
                    // InternalHealth.g:634:4: 'run'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getExerciseTypeAccess().getRunEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHealth.g:638:2: ( ( 'swim' ) )
                    {
                    // InternalHealth.g:638:2: ( ( 'swim' ) )
                    // InternalHealth.g:639:3: ( 'swim' )
                    {
                     before(grammarAccess.getExerciseTypeAccess().getSwimEnumLiteralDeclaration_2()); 
                    // InternalHealth.g:640:3: ( 'swim' )
                    // InternalHealth.g:640:4: 'swim'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getExerciseTypeAccess().getSwimEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ExerciseType__Alternatives"


    // $ANTLR start "rule__PeopleStatement__Group__0"
    // InternalHealth.g:648:1: rule__PeopleStatement__Group__0 : rule__PeopleStatement__Group__0__Impl rule__PeopleStatement__Group__1 ;
    public final void rule__PeopleStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:652:1: ( rule__PeopleStatement__Group__0__Impl rule__PeopleStatement__Group__1 )
            // InternalHealth.g:653:2: rule__PeopleStatement__Group__0__Impl rule__PeopleStatement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PeopleStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeopleStatement__Group__1();

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
    // $ANTLR end "rule__PeopleStatement__Group__0"


    // $ANTLR start "rule__PeopleStatement__Group__0__Impl"
    // InternalHealth.g:660:1: rule__PeopleStatement__Group__0__Impl : ( 'my' ) ;
    public final void rule__PeopleStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:664:1: ( ( 'my' ) )
            // InternalHealth.g:665:1: ( 'my' )
            {
            // InternalHealth.g:665:1: ( 'my' )
            // InternalHealth.g:666:2: 'my'
            {
             before(grammarAccess.getPeopleStatementAccess().getMyKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPeopleStatementAccess().getMyKeyword_0()); 

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
    // $ANTLR end "rule__PeopleStatement__Group__0__Impl"


    // $ANTLR start "rule__PeopleStatement__Group__1"
    // InternalHealth.g:675:1: rule__PeopleStatement__Group__1 : rule__PeopleStatement__Group__1__Impl rule__PeopleStatement__Group__2 ;
    public final void rule__PeopleStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:679:1: ( rule__PeopleStatement__Group__1__Impl rule__PeopleStatement__Group__2 )
            // InternalHealth.g:680:2: rule__PeopleStatement__Group__1__Impl rule__PeopleStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PeopleStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeopleStatement__Group__2();

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
    // $ANTLR end "rule__PeopleStatement__Group__1"


    // $ANTLR start "rule__PeopleStatement__Group__1__Impl"
    // InternalHealth.g:687:1: rule__PeopleStatement__Group__1__Impl : ( 'name' ) ;
    public final void rule__PeopleStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:691:1: ( ( 'name' ) )
            // InternalHealth.g:692:1: ( 'name' )
            {
            // InternalHealth.g:692:1: ( 'name' )
            // InternalHealth.g:693:2: 'name'
            {
             before(grammarAccess.getPeopleStatementAccess().getNameKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPeopleStatementAccess().getNameKeyword_1()); 

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
    // $ANTLR end "rule__PeopleStatement__Group__1__Impl"


    // $ANTLR start "rule__PeopleStatement__Group__2"
    // InternalHealth.g:702:1: rule__PeopleStatement__Group__2 : rule__PeopleStatement__Group__2__Impl rule__PeopleStatement__Group__3 ;
    public final void rule__PeopleStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:706:1: ( rule__PeopleStatement__Group__2__Impl rule__PeopleStatement__Group__3 )
            // InternalHealth.g:707:2: rule__PeopleStatement__Group__2__Impl rule__PeopleStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PeopleStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeopleStatement__Group__3();

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
    // $ANTLR end "rule__PeopleStatement__Group__2"


    // $ANTLR start "rule__PeopleStatement__Group__2__Impl"
    // InternalHealth.g:714:1: rule__PeopleStatement__Group__2__Impl : ( 'is' ) ;
    public final void rule__PeopleStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:718:1: ( ( 'is' ) )
            // InternalHealth.g:719:1: ( 'is' )
            {
            // InternalHealth.g:719:1: ( 'is' )
            // InternalHealth.g:720:2: 'is'
            {
             before(grammarAccess.getPeopleStatementAccess().getIsKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPeopleStatementAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__PeopleStatement__Group__2__Impl"


    // $ANTLR start "rule__PeopleStatement__Group__3"
    // InternalHealth.g:729:1: rule__PeopleStatement__Group__3 : rule__PeopleStatement__Group__3__Impl ;
    public final void rule__PeopleStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:733:1: ( rule__PeopleStatement__Group__3__Impl )
            // InternalHealth.g:734:2: rule__PeopleStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PeopleStatement__Group__3__Impl();

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
    // $ANTLR end "rule__PeopleStatement__Group__3"


    // $ANTLR start "rule__PeopleStatement__Group__3__Impl"
    // InternalHealth.g:740:1: rule__PeopleStatement__Group__3__Impl : ( ( rule__PeopleStatement__NameAssignment_3 ) ) ;
    public final void rule__PeopleStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:744:1: ( ( ( rule__PeopleStatement__NameAssignment_3 ) ) )
            // InternalHealth.g:745:1: ( ( rule__PeopleStatement__NameAssignment_3 ) )
            {
            // InternalHealth.g:745:1: ( ( rule__PeopleStatement__NameAssignment_3 ) )
            // InternalHealth.g:746:2: ( rule__PeopleStatement__NameAssignment_3 )
            {
             before(grammarAccess.getPeopleStatementAccess().getNameAssignment_3()); 
            // InternalHealth.g:747:2: ( rule__PeopleStatement__NameAssignment_3 )
            // InternalHealth.g:747:3: rule__PeopleStatement__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PeopleStatement__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPeopleStatementAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__PeopleStatement__Group__3__Impl"


    // $ANTLR start "rule__HeightStatement__Group__0"
    // InternalHealth.g:756:1: rule__HeightStatement__Group__0 : rule__HeightStatement__Group__0__Impl rule__HeightStatement__Group__1 ;
    public final void rule__HeightStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:760:1: ( rule__HeightStatement__Group__0__Impl rule__HeightStatement__Group__1 )
            // InternalHealth.g:761:2: rule__HeightStatement__Group__0__Impl rule__HeightStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__HeightStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeightStatement__Group__1();

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
    // $ANTLR end "rule__HeightStatement__Group__0"


    // $ANTLR start "rule__HeightStatement__Group__0__Impl"
    // InternalHealth.g:768:1: rule__HeightStatement__Group__0__Impl : ( 'add' ) ;
    public final void rule__HeightStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:772:1: ( ( 'add' ) )
            // InternalHealth.g:773:1: ( 'add' )
            {
            // InternalHealth.g:773:1: ( 'add' )
            // InternalHealth.g:774:2: 'add'
            {
             before(grammarAccess.getHeightStatementAccess().getAddKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHeightStatementAccess().getAddKeyword_0()); 

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
    // $ANTLR end "rule__HeightStatement__Group__0__Impl"


    // $ANTLR start "rule__HeightStatement__Group__1"
    // InternalHealth.g:783:1: rule__HeightStatement__Group__1 : rule__HeightStatement__Group__1__Impl rule__HeightStatement__Group__2 ;
    public final void rule__HeightStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:787:1: ( rule__HeightStatement__Group__1__Impl rule__HeightStatement__Group__2 )
            // InternalHealth.g:788:2: rule__HeightStatement__Group__1__Impl rule__HeightStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__HeightStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeightStatement__Group__2();

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
    // $ANTLR end "rule__HeightStatement__Group__1"


    // $ANTLR start "rule__HeightStatement__Group__1__Impl"
    // InternalHealth.g:795:1: rule__HeightStatement__Group__1__Impl : ( 'height' ) ;
    public final void rule__HeightStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:799:1: ( ( 'height' ) )
            // InternalHealth.g:800:1: ( 'height' )
            {
            // InternalHealth.g:800:1: ( 'height' )
            // InternalHealth.g:801:2: 'height'
            {
             before(grammarAccess.getHeightStatementAccess().getHeightKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHeightStatementAccess().getHeightKeyword_1()); 

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
    // $ANTLR end "rule__HeightStatement__Group__1__Impl"


    // $ANTLR start "rule__HeightStatement__Group__2"
    // InternalHealth.g:810:1: rule__HeightStatement__Group__2 : rule__HeightStatement__Group__2__Impl rule__HeightStatement__Group__3 ;
    public final void rule__HeightStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:814:1: ( rule__HeightStatement__Group__2__Impl rule__HeightStatement__Group__3 )
            // InternalHealth.g:815:2: rule__HeightStatement__Group__2__Impl rule__HeightStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__HeightStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeightStatement__Group__3();

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
    // $ANTLR end "rule__HeightStatement__Group__2"


    // $ANTLR start "rule__HeightStatement__Group__2__Impl"
    // InternalHealth.g:822:1: rule__HeightStatement__Group__2__Impl : ( 'as' ) ;
    public final void rule__HeightStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:826:1: ( ( 'as' ) )
            // InternalHealth.g:827:1: ( 'as' )
            {
            // InternalHealth.g:827:1: ( 'as' )
            // InternalHealth.g:828:2: 'as'
            {
             before(grammarAccess.getHeightStatementAccess().getAsKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHeightStatementAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__HeightStatement__Group__2__Impl"


    // $ANTLR start "rule__HeightStatement__Group__3"
    // InternalHealth.g:837:1: rule__HeightStatement__Group__3 : rule__HeightStatement__Group__3__Impl rule__HeightStatement__Group__4 ;
    public final void rule__HeightStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:841:1: ( rule__HeightStatement__Group__3__Impl rule__HeightStatement__Group__4 )
            // InternalHealth.g:842:2: rule__HeightStatement__Group__3__Impl rule__HeightStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__HeightStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeightStatement__Group__4();

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
    // $ANTLR end "rule__HeightStatement__Group__3"


    // $ANTLR start "rule__HeightStatement__Group__3__Impl"
    // InternalHealth.g:849:1: rule__HeightStatement__Group__3__Impl : ( ( rule__HeightStatement__HeightAssignment_3 ) ) ;
    public final void rule__HeightStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:853:1: ( ( ( rule__HeightStatement__HeightAssignment_3 ) ) )
            // InternalHealth.g:854:1: ( ( rule__HeightStatement__HeightAssignment_3 ) )
            {
            // InternalHealth.g:854:1: ( ( rule__HeightStatement__HeightAssignment_3 ) )
            // InternalHealth.g:855:2: ( rule__HeightStatement__HeightAssignment_3 )
            {
             before(grammarAccess.getHeightStatementAccess().getHeightAssignment_3()); 
            // InternalHealth.g:856:2: ( rule__HeightStatement__HeightAssignment_3 )
            // InternalHealth.g:856:3: rule__HeightStatement__HeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HeightStatement__HeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHeightStatementAccess().getHeightAssignment_3()); 

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
    // $ANTLR end "rule__HeightStatement__Group__3__Impl"


    // $ANTLR start "rule__HeightStatement__Group__4"
    // InternalHealth.g:864:1: rule__HeightStatement__Group__4 : rule__HeightStatement__Group__4__Impl ;
    public final void rule__HeightStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:868:1: ( rule__HeightStatement__Group__4__Impl )
            // InternalHealth.g:869:2: rule__HeightStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeightStatement__Group__4__Impl();

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
    // $ANTLR end "rule__HeightStatement__Group__4"


    // $ANTLR start "rule__HeightStatement__Group__4__Impl"
    // InternalHealth.g:875:1: rule__HeightStatement__Group__4__Impl : ( 'centimeters' ) ;
    public final void rule__HeightStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:879:1: ( ( 'centimeters' ) )
            // InternalHealth.g:880:1: ( 'centimeters' )
            {
            // InternalHealth.g:880:1: ( 'centimeters' )
            // InternalHealth.g:881:2: 'centimeters'
            {
             before(grammarAccess.getHeightStatementAccess().getCentimetersKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHeightStatementAccess().getCentimetersKeyword_4()); 

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
    // $ANTLR end "rule__HeightStatement__Group__4__Impl"


    // $ANTLR start "rule__WeightStatement__Group__0"
    // InternalHealth.g:891:1: rule__WeightStatement__Group__0 : rule__WeightStatement__Group__0__Impl rule__WeightStatement__Group__1 ;
    public final void rule__WeightStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:895:1: ( rule__WeightStatement__Group__0__Impl rule__WeightStatement__Group__1 )
            // InternalHealth.g:896:2: rule__WeightStatement__Group__0__Impl rule__WeightStatement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__WeightStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WeightStatement__Group__1();

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
    // $ANTLR end "rule__WeightStatement__Group__0"


    // $ANTLR start "rule__WeightStatement__Group__0__Impl"
    // InternalHealth.g:903:1: rule__WeightStatement__Group__0__Impl : ( 'add' ) ;
    public final void rule__WeightStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:907:1: ( ( 'add' ) )
            // InternalHealth.g:908:1: ( 'add' )
            {
            // InternalHealth.g:908:1: ( 'add' )
            // InternalHealth.g:909:2: 'add'
            {
             before(grammarAccess.getWeightStatementAccess().getAddKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWeightStatementAccess().getAddKeyword_0()); 

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
    // $ANTLR end "rule__WeightStatement__Group__0__Impl"


    // $ANTLR start "rule__WeightStatement__Group__1"
    // InternalHealth.g:918:1: rule__WeightStatement__Group__1 : rule__WeightStatement__Group__1__Impl rule__WeightStatement__Group__2 ;
    public final void rule__WeightStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:922:1: ( rule__WeightStatement__Group__1__Impl rule__WeightStatement__Group__2 )
            // InternalHealth.g:923:2: rule__WeightStatement__Group__1__Impl rule__WeightStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__WeightStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WeightStatement__Group__2();

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
    // $ANTLR end "rule__WeightStatement__Group__1"


    // $ANTLR start "rule__WeightStatement__Group__1__Impl"
    // InternalHealth.g:930:1: rule__WeightStatement__Group__1__Impl : ( 'weight' ) ;
    public final void rule__WeightStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:934:1: ( ( 'weight' ) )
            // InternalHealth.g:935:1: ( 'weight' )
            {
            // InternalHealth.g:935:1: ( 'weight' )
            // InternalHealth.g:936:2: 'weight'
            {
             before(grammarAccess.getWeightStatementAccess().getWeightKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWeightStatementAccess().getWeightKeyword_1()); 

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
    // $ANTLR end "rule__WeightStatement__Group__1__Impl"


    // $ANTLR start "rule__WeightStatement__Group__2"
    // InternalHealth.g:945:1: rule__WeightStatement__Group__2 : rule__WeightStatement__Group__2__Impl rule__WeightStatement__Group__3 ;
    public final void rule__WeightStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:949:1: ( rule__WeightStatement__Group__2__Impl rule__WeightStatement__Group__3 )
            // InternalHealth.g:950:2: rule__WeightStatement__Group__2__Impl rule__WeightStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__WeightStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WeightStatement__Group__3();

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
    // $ANTLR end "rule__WeightStatement__Group__2"


    // $ANTLR start "rule__WeightStatement__Group__2__Impl"
    // InternalHealth.g:957:1: rule__WeightStatement__Group__2__Impl : ( 'as' ) ;
    public final void rule__WeightStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:961:1: ( ( 'as' ) )
            // InternalHealth.g:962:1: ( 'as' )
            {
            // InternalHealth.g:962:1: ( 'as' )
            // InternalHealth.g:963:2: 'as'
            {
             before(grammarAccess.getWeightStatementAccess().getAsKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWeightStatementAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__WeightStatement__Group__2__Impl"


    // $ANTLR start "rule__WeightStatement__Group__3"
    // InternalHealth.g:972:1: rule__WeightStatement__Group__3 : rule__WeightStatement__Group__3__Impl rule__WeightStatement__Group__4 ;
    public final void rule__WeightStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:976:1: ( rule__WeightStatement__Group__3__Impl rule__WeightStatement__Group__4 )
            // InternalHealth.g:977:2: rule__WeightStatement__Group__3__Impl rule__WeightStatement__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__WeightStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WeightStatement__Group__4();

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
    // $ANTLR end "rule__WeightStatement__Group__3"


    // $ANTLR start "rule__WeightStatement__Group__3__Impl"
    // InternalHealth.g:984:1: rule__WeightStatement__Group__3__Impl : ( ( rule__WeightStatement__WeightAssignment_3 ) ) ;
    public final void rule__WeightStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:988:1: ( ( ( rule__WeightStatement__WeightAssignment_3 ) ) )
            // InternalHealth.g:989:1: ( ( rule__WeightStatement__WeightAssignment_3 ) )
            {
            // InternalHealth.g:989:1: ( ( rule__WeightStatement__WeightAssignment_3 ) )
            // InternalHealth.g:990:2: ( rule__WeightStatement__WeightAssignment_3 )
            {
             before(grammarAccess.getWeightStatementAccess().getWeightAssignment_3()); 
            // InternalHealth.g:991:2: ( rule__WeightStatement__WeightAssignment_3 )
            // InternalHealth.g:991:3: rule__WeightStatement__WeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WeightStatement__WeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWeightStatementAccess().getWeightAssignment_3()); 

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
    // $ANTLR end "rule__WeightStatement__Group__3__Impl"


    // $ANTLR start "rule__WeightStatement__Group__4"
    // InternalHealth.g:999:1: rule__WeightStatement__Group__4 : rule__WeightStatement__Group__4__Impl ;
    public final void rule__WeightStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1003:1: ( rule__WeightStatement__Group__4__Impl )
            // InternalHealth.g:1004:2: rule__WeightStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WeightStatement__Group__4__Impl();

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
    // $ANTLR end "rule__WeightStatement__Group__4"


    // $ANTLR start "rule__WeightStatement__Group__4__Impl"
    // InternalHealth.g:1010:1: rule__WeightStatement__Group__4__Impl : ( 'kilograms' ) ;
    public final void rule__WeightStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1014:1: ( ( 'kilograms' ) )
            // InternalHealth.g:1015:1: ( 'kilograms' )
            {
            // InternalHealth.g:1015:1: ( 'kilograms' )
            // InternalHealth.g:1016:2: 'kilograms'
            {
             before(grammarAccess.getWeightStatementAccess().getKilogramsKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWeightStatementAccess().getKilogramsKeyword_4()); 

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
    // $ANTLR end "rule__WeightStatement__Group__4__Impl"


    // $ANTLR start "rule__AgeStatement__Group__0"
    // InternalHealth.g:1026:1: rule__AgeStatement__Group__0 : rule__AgeStatement__Group__0__Impl rule__AgeStatement__Group__1 ;
    public final void rule__AgeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1030:1: ( rule__AgeStatement__Group__0__Impl rule__AgeStatement__Group__1 )
            // InternalHealth.g:1031:2: rule__AgeStatement__Group__0__Impl rule__AgeStatement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AgeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgeStatement__Group__1();

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
    // $ANTLR end "rule__AgeStatement__Group__0"


    // $ANTLR start "rule__AgeStatement__Group__0__Impl"
    // InternalHealth.g:1038:1: rule__AgeStatement__Group__0__Impl : ( 'add' ) ;
    public final void rule__AgeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1042:1: ( ( 'add' ) )
            // InternalHealth.g:1043:1: ( 'add' )
            {
            // InternalHealth.g:1043:1: ( 'add' )
            // InternalHealth.g:1044:2: 'add'
            {
             before(grammarAccess.getAgeStatementAccess().getAddKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAgeStatementAccess().getAddKeyword_0()); 

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
    // $ANTLR end "rule__AgeStatement__Group__0__Impl"


    // $ANTLR start "rule__AgeStatement__Group__1"
    // InternalHealth.g:1053:1: rule__AgeStatement__Group__1 : rule__AgeStatement__Group__1__Impl rule__AgeStatement__Group__2 ;
    public final void rule__AgeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1057:1: ( rule__AgeStatement__Group__1__Impl rule__AgeStatement__Group__2 )
            // InternalHealth.g:1058:2: rule__AgeStatement__Group__1__Impl rule__AgeStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AgeStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgeStatement__Group__2();

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
    // $ANTLR end "rule__AgeStatement__Group__1"


    // $ANTLR start "rule__AgeStatement__Group__1__Impl"
    // InternalHealth.g:1065:1: rule__AgeStatement__Group__1__Impl : ( 'age' ) ;
    public final void rule__AgeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1069:1: ( ( 'age' ) )
            // InternalHealth.g:1070:1: ( 'age' )
            {
            // InternalHealth.g:1070:1: ( 'age' )
            // InternalHealth.g:1071:2: 'age'
            {
             before(grammarAccess.getAgeStatementAccess().getAgeKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAgeStatementAccess().getAgeKeyword_1()); 

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
    // $ANTLR end "rule__AgeStatement__Group__1__Impl"


    // $ANTLR start "rule__AgeStatement__Group__2"
    // InternalHealth.g:1080:1: rule__AgeStatement__Group__2 : rule__AgeStatement__Group__2__Impl rule__AgeStatement__Group__3 ;
    public final void rule__AgeStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1084:1: ( rule__AgeStatement__Group__2__Impl rule__AgeStatement__Group__3 )
            // InternalHealth.g:1085:2: rule__AgeStatement__Group__2__Impl rule__AgeStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AgeStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AgeStatement__Group__3();

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
    // $ANTLR end "rule__AgeStatement__Group__2"


    // $ANTLR start "rule__AgeStatement__Group__2__Impl"
    // InternalHealth.g:1092:1: rule__AgeStatement__Group__2__Impl : ( 'as' ) ;
    public final void rule__AgeStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1096:1: ( ( 'as' ) )
            // InternalHealth.g:1097:1: ( 'as' )
            {
            // InternalHealth.g:1097:1: ( 'as' )
            // InternalHealth.g:1098:2: 'as'
            {
             before(grammarAccess.getAgeStatementAccess().getAsKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAgeStatementAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__AgeStatement__Group__2__Impl"


    // $ANTLR start "rule__AgeStatement__Group__3"
    // InternalHealth.g:1107:1: rule__AgeStatement__Group__3 : rule__AgeStatement__Group__3__Impl ;
    public final void rule__AgeStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1111:1: ( rule__AgeStatement__Group__3__Impl )
            // InternalHealth.g:1112:2: rule__AgeStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AgeStatement__Group__3__Impl();

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
    // $ANTLR end "rule__AgeStatement__Group__3"


    // $ANTLR start "rule__AgeStatement__Group__3__Impl"
    // InternalHealth.g:1118:1: rule__AgeStatement__Group__3__Impl : ( ( rule__AgeStatement__AgeAssignment_3 ) ) ;
    public final void rule__AgeStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1122:1: ( ( ( rule__AgeStatement__AgeAssignment_3 ) ) )
            // InternalHealth.g:1123:1: ( ( rule__AgeStatement__AgeAssignment_3 ) )
            {
            // InternalHealth.g:1123:1: ( ( rule__AgeStatement__AgeAssignment_3 ) )
            // InternalHealth.g:1124:2: ( rule__AgeStatement__AgeAssignment_3 )
            {
             before(grammarAccess.getAgeStatementAccess().getAgeAssignment_3()); 
            // InternalHealth.g:1125:2: ( rule__AgeStatement__AgeAssignment_3 )
            // InternalHealth.g:1125:3: rule__AgeStatement__AgeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AgeStatement__AgeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAgeStatementAccess().getAgeAssignment_3()); 

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
    // $ANTLR end "rule__AgeStatement__Group__3__Impl"


    // $ANTLR start "rule__GenderStatement__Group__0"
    // InternalHealth.g:1134:1: rule__GenderStatement__Group__0 : rule__GenderStatement__Group__0__Impl rule__GenderStatement__Group__1 ;
    public final void rule__GenderStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1138:1: ( rule__GenderStatement__Group__0__Impl rule__GenderStatement__Group__1 )
            // InternalHealth.g:1139:2: rule__GenderStatement__Group__0__Impl rule__GenderStatement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GenderStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenderStatement__Group__1();

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
    // $ANTLR end "rule__GenderStatement__Group__0"


    // $ANTLR start "rule__GenderStatement__Group__0__Impl"
    // InternalHealth.g:1146:1: rule__GenderStatement__Group__0__Impl : ( 'my' ) ;
    public final void rule__GenderStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1150:1: ( ( 'my' ) )
            // InternalHealth.g:1151:1: ( 'my' )
            {
            // InternalHealth.g:1151:1: ( 'my' )
            // InternalHealth.g:1152:2: 'my'
            {
             before(grammarAccess.getGenderStatementAccess().getMyKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGenderStatementAccess().getMyKeyword_0()); 

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
    // $ANTLR end "rule__GenderStatement__Group__0__Impl"


    // $ANTLR start "rule__GenderStatement__Group__1"
    // InternalHealth.g:1161:1: rule__GenderStatement__Group__1 : rule__GenderStatement__Group__1__Impl rule__GenderStatement__Group__2 ;
    public final void rule__GenderStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1165:1: ( rule__GenderStatement__Group__1__Impl rule__GenderStatement__Group__2 )
            // InternalHealth.g:1166:2: rule__GenderStatement__Group__1__Impl rule__GenderStatement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GenderStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenderStatement__Group__2();

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
    // $ANTLR end "rule__GenderStatement__Group__1"


    // $ANTLR start "rule__GenderStatement__Group__1__Impl"
    // InternalHealth.g:1173:1: rule__GenderStatement__Group__1__Impl : ( 'gender' ) ;
    public final void rule__GenderStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1177:1: ( ( 'gender' ) )
            // InternalHealth.g:1178:1: ( 'gender' )
            {
            // InternalHealth.g:1178:1: ( 'gender' )
            // InternalHealth.g:1179:2: 'gender'
            {
             before(grammarAccess.getGenderStatementAccess().getGenderKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGenderStatementAccess().getGenderKeyword_1()); 

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
    // $ANTLR end "rule__GenderStatement__Group__1__Impl"


    // $ANTLR start "rule__GenderStatement__Group__2"
    // InternalHealth.g:1188:1: rule__GenderStatement__Group__2 : rule__GenderStatement__Group__2__Impl rule__GenderStatement__Group__3 ;
    public final void rule__GenderStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1192:1: ( rule__GenderStatement__Group__2__Impl rule__GenderStatement__Group__3 )
            // InternalHealth.g:1193:2: rule__GenderStatement__Group__2__Impl rule__GenderStatement__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__GenderStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenderStatement__Group__3();

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
    // $ANTLR end "rule__GenderStatement__Group__2"


    // $ANTLR start "rule__GenderStatement__Group__2__Impl"
    // InternalHealth.g:1200:1: rule__GenderStatement__Group__2__Impl : ( 'is' ) ;
    public final void rule__GenderStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1204:1: ( ( 'is' ) )
            // InternalHealth.g:1205:1: ( 'is' )
            {
            // InternalHealth.g:1205:1: ( 'is' )
            // InternalHealth.g:1206:2: 'is'
            {
             before(grammarAccess.getGenderStatementAccess().getIsKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGenderStatementAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__GenderStatement__Group__2__Impl"


    // $ANTLR start "rule__GenderStatement__Group__3"
    // InternalHealth.g:1215:1: rule__GenderStatement__Group__3 : rule__GenderStatement__Group__3__Impl ;
    public final void rule__GenderStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1219:1: ( rule__GenderStatement__Group__3__Impl )
            // InternalHealth.g:1220:2: rule__GenderStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenderStatement__Group__3__Impl();

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
    // $ANTLR end "rule__GenderStatement__Group__3"


    // $ANTLR start "rule__GenderStatement__Group__3__Impl"
    // InternalHealth.g:1226:1: rule__GenderStatement__Group__3__Impl : ( ( rule__GenderStatement__GenderAssignment_3 ) ) ;
    public final void rule__GenderStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1230:1: ( ( ( rule__GenderStatement__GenderAssignment_3 ) ) )
            // InternalHealth.g:1231:1: ( ( rule__GenderStatement__GenderAssignment_3 ) )
            {
            // InternalHealth.g:1231:1: ( ( rule__GenderStatement__GenderAssignment_3 ) )
            // InternalHealth.g:1232:2: ( rule__GenderStatement__GenderAssignment_3 )
            {
             before(grammarAccess.getGenderStatementAccess().getGenderAssignment_3()); 
            // InternalHealth.g:1233:2: ( rule__GenderStatement__GenderAssignment_3 )
            // InternalHealth.g:1233:3: rule__GenderStatement__GenderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GenderStatement__GenderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGenderStatementAccess().getGenderAssignment_3()); 

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
    // $ANTLR end "rule__GenderStatement__Group__3__Impl"


    // $ANTLR start "rule__IngestStatement__Group__0"
    // InternalHealth.g:1242:1: rule__IngestStatement__Group__0 : rule__IngestStatement__Group__0__Impl rule__IngestStatement__Group__1 ;
    public final void rule__IngestStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1246:1: ( rule__IngestStatement__Group__0__Impl rule__IngestStatement__Group__1 )
            // InternalHealth.g:1247:2: rule__IngestStatement__Group__0__Impl rule__IngestStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__IngestStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestStatement__Group__1();

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
    // $ANTLR end "rule__IngestStatement__Group__0"


    // $ANTLR start "rule__IngestStatement__Group__0__Impl"
    // InternalHealth.g:1254:1: rule__IngestStatement__Group__0__Impl : ( 'I' ) ;
    public final void rule__IngestStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1258:1: ( ( 'I' ) )
            // InternalHealth.g:1259:1: ( 'I' )
            {
            // InternalHealth.g:1259:1: ( 'I' )
            // InternalHealth.g:1260:2: 'I'
            {
             before(grammarAccess.getIngestStatementAccess().getIKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIngestStatementAccess().getIKeyword_0()); 

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
    // $ANTLR end "rule__IngestStatement__Group__0__Impl"


    // $ANTLR start "rule__IngestStatement__Group__1"
    // InternalHealth.g:1269:1: rule__IngestStatement__Group__1 : rule__IngestStatement__Group__1__Impl rule__IngestStatement__Group__2 ;
    public final void rule__IngestStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1273:1: ( rule__IngestStatement__Group__1__Impl rule__IngestStatement__Group__2 )
            // InternalHealth.g:1274:2: rule__IngestStatement__Group__1__Impl rule__IngestStatement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__IngestStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestStatement__Group__2();

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
    // $ANTLR end "rule__IngestStatement__Group__1"


    // $ANTLR start "rule__IngestStatement__Group__1__Impl"
    // InternalHealth.g:1281:1: rule__IngestStatement__Group__1__Impl : ( 'have' ) ;
    public final void rule__IngestStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1285:1: ( ( 'have' ) )
            // InternalHealth.g:1286:1: ( 'have' )
            {
            // InternalHealth.g:1286:1: ( 'have' )
            // InternalHealth.g:1287:2: 'have'
            {
             before(grammarAccess.getIngestStatementAccess().getHaveKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIngestStatementAccess().getHaveKeyword_1()); 

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
    // $ANTLR end "rule__IngestStatement__Group__1__Impl"


    // $ANTLR start "rule__IngestStatement__Group__2"
    // InternalHealth.g:1296:1: rule__IngestStatement__Group__2 : rule__IngestStatement__Group__2__Impl rule__IngestStatement__Group__3 ;
    public final void rule__IngestStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1300:1: ( rule__IngestStatement__Group__2__Impl rule__IngestStatement__Group__3 )
            // InternalHealth.g:1301:2: rule__IngestStatement__Group__2__Impl rule__IngestStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__IngestStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestStatement__Group__3();

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
    // $ANTLR end "rule__IngestStatement__Group__2"


    // $ANTLR start "rule__IngestStatement__Group__2__Impl"
    // InternalHealth.g:1308:1: rule__IngestStatement__Group__2__Impl : ( ( rule__IngestStatement__NutritiontypeAssignment_2 ) ) ;
    public final void rule__IngestStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1312:1: ( ( ( rule__IngestStatement__NutritiontypeAssignment_2 ) ) )
            // InternalHealth.g:1313:1: ( ( rule__IngestStatement__NutritiontypeAssignment_2 ) )
            {
            // InternalHealth.g:1313:1: ( ( rule__IngestStatement__NutritiontypeAssignment_2 ) )
            // InternalHealth.g:1314:2: ( rule__IngestStatement__NutritiontypeAssignment_2 )
            {
             before(grammarAccess.getIngestStatementAccess().getNutritiontypeAssignment_2()); 
            // InternalHealth.g:1315:2: ( rule__IngestStatement__NutritiontypeAssignment_2 )
            // InternalHealth.g:1315:3: rule__IngestStatement__NutritiontypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IngestStatement__NutritiontypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngestStatementAccess().getNutritiontypeAssignment_2()); 

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
    // $ANTLR end "rule__IngestStatement__Group__2__Impl"


    // $ANTLR start "rule__IngestStatement__Group__3"
    // InternalHealth.g:1323:1: rule__IngestStatement__Group__3 : rule__IngestStatement__Group__3__Impl rule__IngestStatement__Group__4 ;
    public final void rule__IngestStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1327:1: ( rule__IngestStatement__Group__3__Impl rule__IngestStatement__Group__4 )
            // InternalHealth.g:1328:2: rule__IngestStatement__Group__3__Impl rule__IngestStatement__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__IngestStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestStatement__Group__4();

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
    // $ANTLR end "rule__IngestStatement__Group__3"


    // $ANTLR start "rule__IngestStatement__Group__3__Impl"
    // InternalHealth.g:1335:1: rule__IngestStatement__Group__3__Impl : ( ( rule__IngestStatement__AmountAssignment_3 ) ) ;
    public final void rule__IngestStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1339:1: ( ( ( rule__IngestStatement__AmountAssignment_3 ) ) )
            // InternalHealth.g:1340:1: ( ( rule__IngestStatement__AmountAssignment_3 ) )
            {
            // InternalHealth.g:1340:1: ( ( rule__IngestStatement__AmountAssignment_3 ) )
            // InternalHealth.g:1341:2: ( rule__IngestStatement__AmountAssignment_3 )
            {
             before(grammarAccess.getIngestStatementAccess().getAmountAssignment_3()); 
            // InternalHealth.g:1342:2: ( rule__IngestStatement__AmountAssignment_3 )
            // InternalHealth.g:1342:3: rule__IngestStatement__AmountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IngestStatement__AmountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIngestStatementAccess().getAmountAssignment_3()); 

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
    // $ANTLR end "rule__IngestStatement__Group__3__Impl"


    // $ANTLR start "rule__IngestStatement__Group__4"
    // InternalHealth.g:1350:1: rule__IngestStatement__Group__4 : rule__IngestStatement__Group__4__Impl ;
    public final void rule__IngestStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1354:1: ( rule__IngestStatement__Group__4__Impl )
            // InternalHealth.g:1355:2: rule__IngestStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IngestStatement__Group__4__Impl();

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
    // $ANTLR end "rule__IngestStatement__Group__4"


    // $ANTLR start "rule__IngestStatement__Group__4__Impl"
    // InternalHealth.g:1361:1: rule__IngestStatement__Group__4__Impl : ( 'g' ) ;
    public final void rule__IngestStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1365:1: ( ( 'g' ) )
            // InternalHealth.g:1366:1: ( 'g' )
            {
            // InternalHealth.g:1366:1: ( 'g' )
            // InternalHealth.g:1367:2: 'g'
            {
             before(grammarAccess.getIngestStatementAccess().getGKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIngestStatementAccess().getGKeyword_4()); 

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
    // $ANTLR end "rule__IngestStatement__Group__4__Impl"


    // $ANTLR start "rule__ExerciseStatement__Group__0"
    // InternalHealth.g:1377:1: rule__ExerciseStatement__Group__0 : rule__ExerciseStatement__Group__0__Impl rule__ExerciseStatement__Group__1 ;
    public final void rule__ExerciseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1381:1: ( rule__ExerciseStatement__Group__0__Impl rule__ExerciseStatement__Group__1 )
            // InternalHealth.g:1382:2: rule__ExerciseStatement__Group__0__Impl rule__ExerciseStatement__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ExerciseStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__Group__1();

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
    // $ANTLR end "rule__ExerciseStatement__Group__0"


    // $ANTLR start "rule__ExerciseStatement__Group__0__Impl"
    // InternalHealth.g:1389:1: rule__ExerciseStatement__Group__0__Impl : ( 'I' ) ;
    public final void rule__ExerciseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1393:1: ( ( 'I' ) )
            // InternalHealth.g:1394:1: ( 'I' )
            {
            // InternalHealth.g:1394:1: ( 'I' )
            // InternalHealth.g:1395:2: 'I'
            {
             before(grammarAccess.getExerciseStatementAccess().getIKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExerciseStatementAccess().getIKeyword_0()); 

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
    // $ANTLR end "rule__ExerciseStatement__Group__0__Impl"


    // $ANTLR start "rule__ExerciseStatement__Group__1"
    // InternalHealth.g:1404:1: rule__ExerciseStatement__Group__1 : rule__ExerciseStatement__Group__1__Impl rule__ExerciseStatement__Group__2 ;
    public final void rule__ExerciseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1408:1: ( rule__ExerciseStatement__Group__1__Impl rule__ExerciseStatement__Group__2 )
            // InternalHealth.g:1409:2: rule__ExerciseStatement__Group__1__Impl rule__ExerciseStatement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ExerciseStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__Group__2();

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
    // $ANTLR end "rule__ExerciseStatement__Group__1"


    // $ANTLR start "rule__ExerciseStatement__Group__1__Impl"
    // InternalHealth.g:1416:1: rule__ExerciseStatement__Group__1__Impl : ( ( rule__ExerciseStatement__ExerciseTypeAssignment_1 ) ) ;
    public final void rule__ExerciseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1420:1: ( ( ( rule__ExerciseStatement__ExerciseTypeAssignment_1 ) ) )
            // InternalHealth.g:1421:1: ( ( rule__ExerciseStatement__ExerciseTypeAssignment_1 ) )
            {
            // InternalHealth.g:1421:1: ( ( rule__ExerciseStatement__ExerciseTypeAssignment_1 ) )
            // InternalHealth.g:1422:2: ( rule__ExerciseStatement__ExerciseTypeAssignment_1 )
            {
             before(grammarAccess.getExerciseStatementAccess().getExerciseTypeAssignment_1()); 
            // InternalHealth.g:1423:2: ( rule__ExerciseStatement__ExerciseTypeAssignment_1 )
            // InternalHealth.g:1423:3: rule__ExerciseStatement__ExerciseTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__ExerciseTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExerciseStatementAccess().getExerciseTypeAssignment_1()); 

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
    // $ANTLR end "rule__ExerciseStatement__Group__1__Impl"


    // $ANTLR start "rule__ExerciseStatement__Group__2"
    // InternalHealth.g:1431:1: rule__ExerciseStatement__Group__2 : rule__ExerciseStatement__Group__2__Impl rule__ExerciseStatement__Group__3 ;
    public final void rule__ExerciseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1435:1: ( rule__ExerciseStatement__Group__2__Impl rule__ExerciseStatement__Group__3 )
            // InternalHealth.g:1436:2: rule__ExerciseStatement__Group__2__Impl rule__ExerciseStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ExerciseStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__Group__3();

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
    // $ANTLR end "rule__ExerciseStatement__Group__2"


    // $ANTLR start "rule__ExerciseStatement__Group__2__Impl"
    // InternalHealth.g:1443:1: rule__ExerciseStatement__Group__2__Impl : ( 'for' ) ;
    public final void rule__ExerciseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1447:1: ( ( 'for' ) )
            // InternalHealth.g:1448:1: ( 'for' )
            {
            // InternalHealth.g:1448:1: ( 'for' )
            // InternalHealth.g:1449:2: 'for'
            {
             before(grammarAccess.getExerciseStatementAccess().getForKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExerciseStatementAccess().getForKeyword_2()); 

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
    // $ANTLR end "rule__ExerciseStatement__Group__2__Impl"


    // $ANTLR start "rule__ExerciseStatement__Group__3"
    // InternalHealth.g:1458:1: rule__ExerciseStatement__Group__3 : rule__ExerciseStatement__Group__3__Impl rule__ExerciseStatement__Group__4 ;
    public final void rule__ExerciseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1462:1: ( rule__ExerciseStatement__Group__3__Impl rule__ExerciseStatement__Group__4 )
            // InternalHealth.g:1463:2: rule__ExerciseStatement__Group__3__Impl rule__ExerciseStatement__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ExerciseStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__Group__4();

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
    // $ANTLR end "rule__ExerciseStatement__Group__3"


    // $ANTLR start "rule__ExerciseStatement__Group__3__Impl"
    // InternalHealth.g:1470:1: rule__ExerciseStatement__Group__3__Impl : ( ( rule__ExerciseStatement__TimeAssignment_3 ) ) ;
    public final void rule__ExerciseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1474:1: ( ( ( rule__ExerciseStatement__TimeAssignment_3 ) ) )
            // InternalHealth.g:1475:1: ( ( rule__ExerciseStatement__TimeAssignment_3 ) )
            {
            // InternalHealth.g:1475:1: ( ( rule__ExerciseStatement__TimeAssignment_3 ) )
            // InternalHealth.g:1476:2: ( rule__ExerciseStatement__TimeAssignment_3 )
            {
             before(grammarAccess.getExerciseStatementAccess().getTimeAssignment_3()); 
            // InternalHealth.g:1477:2: ( rule__ExerciseStatement__TimeAssignment_3 )
            // InternalHealth.g:1477:3: rule__ExerciseStatement__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExerciseStatementAccess().getTimeAssignment_3()); 

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
    // $ANTLR end "rule__ExerciseStatement__Group__3__Impl"


    // $ANTLR start "rule__ExerciseStatement__Group__4"
    // InternalHealth.g:1485:1: rule__ExerciseStatement__Group__4 : rule__ExerciseStatement__Group__4__Impl ;
    public final void rule__ExerciseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1489:1: ( rule__ExerciseStatement__Group__4__Impl )
            // InternalHealth.g:1490:2: rule__ExerciseStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExerciseStatement__Group__4__Impl();

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
    // $ANTLR end "rule__ExerciseStatement__Group__4"


    // $ANTLR start "rule__ExerciseStatement__Group__4__Impl"
    // InternalHealth.g:1496:1: rule__ExerciseStatement__Group__4__Impl : ( 'hour' ) ;
    public final void rule__ExerciseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1500:1: ( ( 'hour' ) )
            // InternalHealth.g:1501:1: ( 'hour' )
            {
            // InternalHealth.g:1501:1: ( 'hour' )
            // InternalHealth.g:1502:2: 'hour'
            {
             before(grammarAccess.getExerciseStatementAccess().getHourKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExerciseStatementAccess().getHourKeyword_4()); 

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
    // $ANTLR end "rule__ExerciseStatement__Group__4__Impl"


    // $ANTLR start "rule__AdviceStatement__Group__0"
    // InternalHealth.g:1512:1: rule__AdviceStatement__Group__0 : rule__AdviceStatement__Group__0__Impl rule__AdviceStatement__Group__1 ;
    public final void rule__AdviceStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1516:1: ( rule__AdviceStatement__Group__0__Impl rule__AdviceStatement__Group__1 )
            // InternalHealth.g:1517:2: rule__AdviceStatement__Group__0__Impl rule__AdviceStatement__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AdviceStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdviceStatement__Group__1();

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
    // $ANTLR end "rule__AdviceStatement__Group__0"


    // $ANTLR start "rule__AdviceStatement__Group__0__Impl"
    // InternalHealth.g:1524:1: rule__AdviceStatement__Group__0__Impl : ( 'give' ) ;
    public final void rule__AdviceStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1528:1: ( ( 'give' ) )
            // InternalHealth.g:1529:1: ( 'give' )
            {
            // InternalHealth.g:1529:1: ( 'give' )
            // InternalHealth.g:1530:2: 'give'
            {
             before(grammarAccess.getAdviceStatementAccess().getGiveKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAdviceStatementAccess().getGiveKeyword_0()); 

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
    // $ANTLR end "rule__AdviceStatement__Group__0__Impl"


    // $ANTLR start "rule__AdviceStatement__Group__1"
    // InternalHealth.g:1539:1: rule__AdviceStatement__Group__1 : rule__AdviceStatement__Group__1__Impl rule__AdviceStatement__Group__2 ;
    public final void rule__AdviceStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1543:1: ( rule__AdviceStatement__Group__1__Impl rule__AdviceStatement__Group__2 )
            // InternalHealth.g:1544:2: rule__AdviceStatement__Group__1__Impl rule__AdviceStatement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__AdviceStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdviceStatement__Group__2();

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
    // $ANTLR end "rule__AdviceStatement__Group__1"


    // $ANTLR start "rule__AdviceStatement__Group__1__Impl"
    // InternalHealth.g:1551:1: rule__AdviceStatement__Group__1__Impl : ( 'me' ) ;
    public final void rule__AdviceStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1555:1: ( ( 'me' ) )
            // InternalHealth.g:1556:1: ( 'me' )
            {
            // InternalHealth.g:1556:1: ( 'me' )
            // InternalHealth.g:1557:2: 'me'
            {
             before(grammarAccess.getAdviceStatementAccess().getMeKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAdviceStatementAccess().getMeKeyword_1()); 

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
    // $ANTLR end "rule__AdviceStatement__Group__1__Impl"


    // $ANTLR start "rule__AdviceStatement__Group__2"
    // InternalHealth.g:1566:1: rule__AdviceStatement__Group__2 : rule__AdviceStatement__Group__2__Impl rule__AdviceStatement__Group__3 ;
    public final void rule__AdviceStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1570:1: ( rule__AdviceStatement__Group__2__Impl rule__AdviceStatement__Group__3 )
            // InternalHealth.g:1571:2: rule__AdviceStatement__Group__2__Impl rule__AdviceStatement__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__AdviceStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdviceStatement__Group__3();

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
    // $ANTLR end "rule__AdviceStatement__Group__2"


    // $ANTLR start "rule__AdviceStatement__Group__2__Impl"
    // InternalHealth.g:1578:1: rule__AdviceStatement__Group__2__Impl : ( 'advice' ) ;
    public final void rule__AdviceStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1582:1: ( ( 'advice' ) )
            // InternalHealth.g:1583:1: ( 'advice' )
            {
            // InternalHealth.g:1583:1: ( 'advice' )
            // InternalHealth.g:1584:2: 'advice'
            {
             before(grammarAccess.getAdviceStatementAccess().getAdviceKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAdviceStatementAccess().getAdviceKeyword_2()); 

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
    // $ANTLR end "rule__AdviceStatement__Group__2__Impl"


    // $ANTLR start "rule__AdviceStatement__Group__3"
    // InternalHealth.g:1593:1: rule__AdviceStatement__Group__3 : rule__AdviceStatement__Group__3__Impl rule__AdviceStatement__Group__4 ;
    public final void rule__AdviceStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1597:1: ( rule__AdviceStatement__Group__3__Impl rule__AdviceStatement__Group__4 )
            // InternalHealth.g:1598:2: rule__AdviceStatement__Group__3__Impl rule__AdviceStatement__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__AdviceStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdviceStatement__Group__4();

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
    // $ANTLR end "rule__AdviceStatement__Group__3"


    // $ANTLR start "rule__AdviceStatement__Group__3__Impl"
    // InternalHealth.g:1605:1: rule__AdviceStatement__Group__3__Impl : ( 'on' ) ;
    public final void rule__AdviceStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1609:1: ( ( 'on' ) )
            // InternalHealth.g:1610:1: ( 'on' )
            {
            // InternalHealth.g:1610:1: ( 'on' )
            // InternalHealth.g:1611:2: 'on'
            {
             before(grammarAccess.getAdviceStatementAccess().getOnKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAdviceStatementAccess().getOnKeyword_3()); 

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
    // $ANTLR end "rule__AdviceStatement__Group__3__Impl"


    // $ANTLR start "rule__AdviceStatement__Group__4"
    // InternalHealth.g:1620:1: rule__AdviceStatement__Group__4 : rule__AdviceStatement__Group__4__Impl ;
    public final void rule__AdviceStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1624:1: ( rule__AdviceStatement__Group__4__Impl )
            // InternalHealth.g:1625:2: rule__AdviceStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdviceStatement__Group__4__Impl();

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
    // $ANTLR end "rule__AdviceStatement__Group__4"


    // $ANTLR start "rule__AdviceStatement__Group__4__Impl"
    // InternalHealth.g:1631:1: rule__AdviceStatement__Group__4__Impl : ( ( rule__AdviceStatement__AdAssignment_4 ) ) ;
    public final void rule__AdviceStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1635:1: ( ( ( rule__AdviceStatement__AdAssignment_4 ) ) )
            // InternalHealth.g:1636:1: ( ( rule__AdviceStatement__AdAssignment_4 ) )
            {
            // InternalHealth.g:1636:1: ( ( rule__AdviceStatement__AdAssignment_4 ) )
            // InternalHealth.g:1637:2: ( rule__AdviceStatement__AdAssignment_4 )
            {
             before(grammarAccess.getAdviceStatementAccess().getAdAssignment_4()); 
            // InternalHealth.g:1638:2: ( rule__AdviceStatement__AdAssignment_4 )
            // InternalHealth.g:1638:3: rule__AdviceStatement__AdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AdviceStatement__AdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAdviceStatementAccess().getAdAssignment_4()); 

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
    // $ANTLR end "rule__AdviceStatement__Group__4__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalHealth.g:1647:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1651:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalHealth.g:1652:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

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
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalHealth.g:1659:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1663:1: ( ( ( RULE_INT )? ) )
            // InternalHealth.g:1664:1: ( ( RULE_INT )? )
            {
            // InternalHealth.g:1664:1: ( ( RULE_INT )? )
            // InternalHealth.g:1665:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalHealth.g:1666:2: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHealth.g:1666:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalHealth.g:1674:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1678:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalHealth.g:1679:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

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
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalHealth.g:1686:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1690:1: ( ( '.' ) )
            // InternalHealth.g:1691:1: ( '.' )
            {
            // InternalHealth.g:1691:1: ( '.' )
            // InternalHealth.g:1692:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalHealth.g:1701:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1705:1: ( rule__REAL__Group__2__Impl )
            // InternalHealth.g:1706:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

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
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalHealth.g:1712:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1716:1: ( ( RULE_INT ) )
            // InternalHealth.g:1717:1: ( RULE_INT )
            {
            // InternalHealth.g:1717:1: ( RULE_INT )
            // InternalHealth.g:1718:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__HealthProgram__StatementsAssignment"
    // InternalHealth.g:1728:1: rule__HealthProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__HealthProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1732:1: ( ( ruleStatement ) )
            // InternalHealth.g:1733:2: ( ruleStatement )
            {
            // InternalHealth.g:1733:2: ( ruleStatement )
            // InternalHealth.g:1734:3: ruleStatement
            {
             before(grammarAccess.getHealthProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getHealthProgramAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__HealthProgram__StatementsAssignment"


    // $ANTLR start "rule__PeopleStatement__NameAssignment_3"
    // InternalHealth.g:1743:1: rule__PeopleStatement__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PeopleStatement__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1747:1: ( ( RULE_ID ) )
            // InternalHealth.g:1748:2: ( RULE_ID )
            {
            // InternalHealth.g:1748:2: ( RULE_ID )
            // InternalHealth.g:1749:3: RULE_ID
            {
             before(grammarAccess.getPeopleStatementAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPeopleStatementAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__PeopleStatement__NameAssignment_3"


    // $ANTLR start "rule__HeightStatement__HeightAssignment_3"
    // InternalHealth.g:1758:1: rule__HeightStatement__HeightAssignment_3 : ( ruleInputValue ) ;
    public final void rule__HeightStatement__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1762:1: ( ( ruleInputValue ) )
            // InternalHealth.g:1763:2: ( ruleInputValue )
            {
            // InternalHealth.g:1763:2: ( ruleInputValue )
            // InternalHealth.g:1764:3: ruleInputValue
            {
             before(grammarAccess.getHeightStatementAccess().getHeightInputValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getHeightStatementAccess().getHeightInputValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__HeightStatement__HeightAssignment_3"


    // $ANTLR start "rule__WeightStatement__WeightAssignment_3"
    // InternalHealth.g:1773:1: rule__WeightStatement__WeightAssignment_3 : ( ruleInputValue ) ;
    public final void rule__WeightStatement__WeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1777:1: ( ( ruleInputValue ) )
            // InternalHealth.g:1778:2: ( ruleInputValue )
            {
            // InternalHealth.g:1778:2: ( ruleInputValue )
            // InternalHealth.g:1779:3: ruleInputValue
            {
             before(grammarAccess.getWeightStatementAccess().getWeightInputValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getWeightStatementAccess().getWeightInputValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WeightStatement__WeightAssignment_3"


    // $ANTLR start "rule__AgeStatement__AgeAssignment_3"
    // InternalHealth.g:1788:1: rule__AgeStatement__AgeAssignment_3 : ( ruleInputValue ) ;
    public final void rule__AgeStatement__AgeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1792:1: ( ( ruleInputValue ) )
            // InternalHealth.g:1793:2: ( ruleInputValue )
            {
            // InternalHealth.g:1793:2: ( ruleInputValue )
            // InternalHealth.g:1794:3: ruleInputValue
            {
             before(grammarAccess.getAgeStatementAccess().getAgeInputValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getAgeStatementAccess().getAgeInputValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AgeStatement__AgeAssignment_3"


    // $ANTLR start "rule__GenderStatement__GenderAssignment_3"
    // InternalHealth.g:1803:1: rule__GenderStatement__GenderAssignment_3 : ( ruleGender ) ;
    public final void rule__GenderStatement__GenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1807:1: ( ( ruleGender ) )
            // InternalHealth.g:1808:2: ( ruleGender )
            {
            // InternalHealth.g:1808:2: ( ruleGender )
            // InternalHealth.g:1809:3: ruleGender
            {
             before(grammarAccess.getGenderStatementAccess().getGenderGenderEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGender();

            state._fsp--;

             after(grammarAccess.getGenderStatementAccess().getGenderGenderEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__GenderStatement__GenderAssignment_3"


    // $ANTLR start "rule__IngestStatement__NutritiontypeAssignment_2"
    // InternalHealth.g:1818:1: rule__IngestStatement__NutritiontypeAssignment_2 : ( rulenutrition ) ;
    public final void rule__IngestStatement__NutritiontypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1822:1: ( ( rulenutrition ) )
            // InternalHealth.g:1823:2: ( rulenutrition )
            {
            // InternalHealth.g:1823:2: ( rulenutrition )
            // InternalHealth.g:1824:3: rulenutrition
            {
             before(grammarAccess.getIngestStatementAccess().getNutritiontypeNutritionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulenutrition();

            state._fsp--;

             after(grammarAccess.getIngestStatementAccess().getNutritiontypeNutritionEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__IngestStatement__NutritiontypeAssignment_2"


    // $ANTLR start "rule__IngestStatement__AmountAssignment_3"
    // InternalHealth.g:1833:1: rule__IngestStatement__AmountAssignment_3 : ( ruleInputValue ) ;
    public final void rule__IngestStatement__AmountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1837:1: ( ( ruleInputValue ) )
            // InternalHealth.g:1838:2: ( ruleInputValue )
            {
            // InternalHealth.g:1838:2: ( ruleInputValue )
            // InternalHealth.g:1839:3: ruleInputValue
            {
             before(grammarAccess.getIngestStatementAccess().getAmountInputValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getIngestStatementAccess().getAmountInputValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IngestStatement__AmountAssignment_3"


    // $ANTLR start "rule__ExerciseStatement__ExerciseTypeAssignment_1"
    // InternalHealth.g:1848:1: rule__ExerciseStatement__ExerciseTypeAssignment_1 : ( ruleExerciseType ) ;
    public final void rule__ExerciseStatement__ExerciseTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1852:1: ( ( ruleExerciseType ) )
            // InternalHealth.g:1853:2: ( ruleExerciseType )
            {
            // InternalHealth.g:1853:2: ( ruleExerciseType )
            // InternalHealth.g:1854:3: ruleExerciseType
            {
             before(grammarAccess.getExerciseStatementAccess().getExerciseTypeExerciseTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExerciseType();

            state._fsp--;

             after(grammarAccess.getExerciseStatementAccess().getExerciseTypeExerciseTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExerciseStatement__ExerciseTypeAssignment_1"


    // $ANTLR start "rule__ExerciseStatement__TimeAssignment_3"
    // InternalHealth.g:1863:1: rule__ExerciseStatement__TimeAssignment_3 : ( ruleInputValue ) ;
    public final void rule__ExerciseStatement__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1867:1: ( ( ruleInputValue ) )
            // InternalHealth.g:1868:2: ( ruleInputValue )
            {
            // InternalHealth.g:1868:2: ( ruleInputValue )
            // InternalHealth.g:1869:3: ruleInputValue
            {
             before(grammarAccess.getExerciseStatementAccess().getTimeInputValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputValue();

            state._fsp--;

             after(grammarAccess.getExerciseStatementAccess().getTimeInputValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExerciseStatement__TimeAssignment_3"


    // $ANTLR start "rule__AdviceStatement__AdAssignment_4"
    // InternalHealth.g:1878:1: rule__AdviceStatement__AdAssignment_4 : ( ruleAdviceType ) ;
    public final void rule__AdviceStatement__AdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1882:1: ( ( ruleAdviceType ) )
            // InternalHealth.g:1883:2: ( ruleAdviceType )
            {
            // InternalHealth.g:1883:2: ( ruleAdviceType )
            // InternalHealth.g:1884:3: ruleAdviceType
            {
             before(grammarAccess.getAdviceStatementAccess().getAdAdviceTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAdviceType();

            state._fsp--;

             after(grammarAccess.getAdviceStatementAccess().getAdAdviceTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__AdviceStatement__AdAssignment_4"


    // $ANTLR start "rule__IntValue__ValAssignment"
    // InternalHealth.g:1893:1: rule__IntValue__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1897:1: ( ( RULE_INT ) )
            // InternalHealth.g:1898:2: ( RULE_INT )
            {
            // InternalHealth.g:1898:2: ( RULE_INT )
            // InternalHealth.g:1899:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntValue__ValAssignment"


    // $ANTLR start "rule__RealValue__ValAssignment"
    // InternalHealth.g:1908:1: rule__RealValue__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHealth.g:1912:1: ( ( ruleREAL ) )
            // InternalHealth.g:1913:2: ( ruleREAL )
            {
            // InternalHealth.g:1913:2: ( ruleREAL )
            // InternalHealth.g:1914:3: ruleREAL
            {
             before(grammarAccess.getRealValueAccess().getValREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealValueAccess().getValREALParserRuleCall_0()); 

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
    // $ANTLR end "rule__RealValue__ValAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\25\1\26\1\31\1\22\10\uffff";
    static final String dfa_3s = "\1\45\1\37\1\36\1\41\10\uffff";
    static final String dfa_4s = "\4\uffff\1\10\1\1\1\5\1\2\1\4\1\3\1\7\1\6";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\7\uffff\1\3\4\uffff\1\4",
            "\1\5\10\uffff\1\6",
            "\1\7\2\uffff\1\11\1\uffff\1\10",
            "\3\12\14\uffff\1\13",
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
            return "474:1: rule__Statement__Alternatives : ( ( rulePeopleStatement ) | ( ruleHeightStatement ) | ( ruleWeightStatement ) | ( ruleAgeStatement ) | ( ruleGenderStatement ) | ( ruleIngestStatement ) | ( ruleExerciseStatement ) | ( ruleAdviceStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002101200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});

}