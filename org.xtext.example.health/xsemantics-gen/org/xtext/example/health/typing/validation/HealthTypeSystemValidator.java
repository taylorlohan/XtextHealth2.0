package org.xtext.example.health.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.health.typing.HealthTypeSystem;
import org.xtext.example.myhealth.health.AgeStatement;
import org.xtext.example.myhealth.validation.AbstractHealthValidator;

@SuppressWarnings("all")
public class HealthTypeSystemValidator extends AbstractHealthValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected HealthTypeSystem xsemanticsSystem;
  
  protected HealthTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
  
  @Check
  public void checkage(final AgeStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkage(stmt),
    		stmt);
  }
}
