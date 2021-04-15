package org.xtext.example.health.typing;

import com.google.inject.Provider;
import org.eclipse.xsemantics.runtime.ErrorInformation;
import org.eclipse.xsemantics.runtime.Result;
import org.eclipse.xsemantics.runtime.RuleApplicationTrace;
import org.eclipse.xsemantics.runtime.RuleEnvironment;
import org.eclipse.xsemantics.runtime.RuleFailedException;
import org.eclipse.xsemantics.runtime.XsemanticsProvider;
import org.eclipse.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.xtext.example.myhealth.health.AgeStatement;
import org.xtext.example.myhealth.health.InputValue;
import org.xtext.example.myhealth.health.IntValue;
import org.xtext.example.myhealth.health.RealValue;
import org.xtext.example.myhealth.typing.HealthType;

@SuppressWarnings("all")
public class HealthTypeSystem extends XsemanticsRuntimeSystem {
  public static final String TINTLIT = "org.xtext.example.health.typing.TIntLit";
  
  public static final String TREALLIT = "org.xtext.example.health.typing.TRealLit";
  
  public static final String SUBTYPING = "org.xtext.example.health.typing.Subtyping";
  
  private PolymorphicDispatcher<Result<HealthType>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> subtypeDispatcher;
  
  public HealthTypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    subtypeDispatcher = buildPolymorphicDispatcher1(
    	"subtypeImpl", 4, "|-", "<:");
  }
  
  public Result<HealthType> type(final InputValue age) {
    return type(new RuleEnvironment(), null, age);
  }
  
  public Result<HealthType> type(final RuleEnvironment _environment_, final InputValue age) {
    return type(_environment_, null, age);
  }
  
  public Result<HealthType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final InputValue age) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<HealthType>>(_environment_, _trace_) {
    		public Result<HealthType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, age);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, age);
  }
  
  public Result<Boolean> subtype(final HealthType left, final HealthType right) {
    return subtype(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> subtype(final RuleEnvironment _environment_, final HealthType left, final HealthType right) {
    return subtype(_environment_, null, left, right);
  }
  
  public Result<Boolean> subtype(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final HealthType left, final HealthType right) {
    try {
    	return subtypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_subtype) {
    	return resultForFailure(_e_subtype);
    }
  }
  
  public Boolean subtypeSucceeded(final HealthType left, final HealthType right) {
    return subtypeSucceeded(new RuleEnvironment(), null, left, right);
  }
  
  public Boolean subtypeSucceeded(final RuleEnvironment _environment_, final HealthType left, final HealthType right) {
    return subtypeSucceeded(_environment_, null, left, right);
  }
  
  public Boolean subtypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final HealthType left, final HealthType right) {
    try {
    	subtypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_subtype) {
    	return false;
    }
  }
  
  public Result<Boolean> checkage(final AgeStatement stmt) {
    return checkage(null, stmt);
  }
  
  public Result<Boolean> checkage(final RuleApplicationTrace _trace_, final AgeStatement stmt) {
    try {
    	return checkageInternal(_trace_, stmt);
    } catch (Exception _e_checkage) {
    	return resultForFailure(_e_checkage);
    }
  }
  
  protected Result<Boolean> checkageInternal(final RuleApplicationTrace _trace_, final AgeStatement stmt) throws RuleFailedException {
    /* empty |- stmt.age : var HealthType stepType */
    InputValue _age = stmt.getAge();
    HealthType stepType = null;
    Result<HealthType> result = typeInternal(emptyEnvironment(), _trace_, _age);
    checkAssignableTo(result.getFirst(), HealthType.class);
    stepType = (HealthType) result.getFirst();
    
    /* empty |- stepType <:HealthType.INT */
    subtypeInternal(emptyEnvironment(), _trace_, stepType, HealthType.INT);
    return new Result<Boolean>(true);
  }
  
  protected Result<HealthType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final InputValue age) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<HealthType>>(_environment_, _trace_) {
    		public Result<HealthType> doGet() {
    			try {
    				checkParamsNotNull(age);
    				return typeDispatcher.invoke(_environment_, _trace_, age);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, age);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final InputValue age, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(age);
    String _plus = ("Cannot type" + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Boolean> subtypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final HealthType left, final HealthType right) {
    try {
    	checkParamsNotNull(left, right);
    	return subtypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_subtype) {
    	sneakyThrowRuleFailedException(_e_subtype);
    	return null;
    }
  }
  
  protected void subtypeThrowException(final String _error, final String _issue, final Exception _ex, final HealthType left, final HealthType right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(left);
    String _plus = (_stringRep + " is not a subtype of ");
    String _stringRep_1 = this.stringRep(right);
    String _plus_1 = (_plus + _stringRep_1);
    String error = _plus_1;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<HealthType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntValue exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<HealthType> _result_ = applyRuleTIntLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTIntLit) {
    	typeThrowException(ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "HealthType",
    		TINTLIT,
    		e_applyRuleTIntLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<HealthType> applyRuleTIntLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntValue exp) throws RuleFailedException {
    
    return new Result<HealthType>(_applyRuleTIntLit_1(G, exp));
  }
  
  private HealthType _applyRuleTIntLit_1(final RuleEnvironment G, final IntValue exp) throws RuleFailedException {
    return HealthType.INT;
  }
  
  protected Result<HealthType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealValue exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<HealthType> _result_ = applyRuleTRealLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTRealLit) {
    	typeThrowException(ruleName("TRealLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "HealthType",
    		TREALLIT,
    		e_applyRuleTRealLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<HealthType> applyRuleTRealLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final RealValue exp) throws RuleFailedException {
    
    return new Result<HealthType>(_applyRuleTRealLit_1(G, exp));
  }
  
  private HealthType _applyRuleTRealLit_1(final RuleEnvironment G, final RealValue exp) throws RuleFailedException {
    return HealthType.REAL;
  }
  
  protected Result<Boolean> subtypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final HealthType left, final HealthType right) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<Boolean> _result_ = applyRuleSubtyping(G, _subtrace_, left, right);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("Subtyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleSubtyping) {
    	subtypeThrowException(ruleName("Subtyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right),
    		SUBTYPING,
    		e_applyRuleSubtyping, left, right, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected Result<Boolean> applyRuleSubtyping(final RuleEnvironment G, final RuleApplicationTrace _trace_, final HealthType left, final HealthType right) throws RuleFailedException {
    /* right===HealthType.REAL or left===right */
    {
      RuleFailedException previousFailure = null;
      try {
        /* right===HealthType.REAL */
        if (!(right == HealthType.REAL)) {
          sneakyThrowRuleFailedException("right===HealthType.REAL");
        }
      } catch (Exception e) {
        previousFailure = extractRuleFailedException(e);
        /* left===right */
        if (!(left == right)) {
          sneakyThrowRuleFailedException("left===right");
        }
      }
    }
    return new Result<Boolean>(true);
  }
}
