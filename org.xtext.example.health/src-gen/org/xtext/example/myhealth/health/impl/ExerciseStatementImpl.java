/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.myhealth.health.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.myhealth.health.ExerciseStatement;
import org.xtext.example.myhealth.health.ExerciseType;
import org.xtext.example.myhealth.health.HealthPackage;
import org.xtext.example.myhealth.health.InputValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exercise Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myhealth.health.impl.ExerciseStatementImpl#getExerciseType <em>Exercise Type</em>}</li>
 *   <li>{@link org.xtext.example.myhealth.health.impl.ExerciseStatementImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExerciseStatementImpl extends StatementImpl implements ExerciseStatement
{
  /**
   * The default value of the '{@link #getExerciseType() <em>Exercise Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExerciseType()
   * @generated
   * @ordered
   */
  protected static final ExerciseType EXERCISE_TYPE_EDEFAULT = ExerciseType.WALK;

  /**
   * The cached value of the '{@link #getExerciseType() <em>Exercise Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExerciseType()
   * @generated
   * @ordered
   */
  protected ExerciseType exerciseType = EXERCISE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected InputValue time;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExerciseStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HealthPackage.Literals.EXERCISE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExerciseType getExerciseType()
  {
    return exerciseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExerciseType(ExerciseType newExerciseType)
  {
    ExerciseType oldExerciseType = exerciseType;
    exerciseType = newExerciseType == null ? EXERCISE_TYPE_EDEFAULT : newExerciseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HealthPackage.EXERCISE_STATEMENT__EXERCISE_TYPE, oldExerciseType, exerciseType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputValue getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(InputValue newTime, NotificationChain msgs)
  {
    InputValue oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HealthPackage.EXERCISE_STATEMENT__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTime(InputValue newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HealthPackage.EXERCISE_STATEMENT__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HealthPackage.EXERCISE_STATEMENT__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HealthPackage.EXERCISE_STATEMENT__TIME, newTime, newTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HealthPackage.EXERCISE_STATEMENT__TIME:
        return basicSetTime(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HealthPackage.EXERCISE_STATEMENT__EXERCISE_TYPE:
        return getExerciseType();
      case HealthPackage.EXERCISE_STATEMENT__TIME:
        return getTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HealthPackage.EXERCISE_STATEMENT__EXERCISE_TYPE:
        setExerciseType((ExerciseType)newValue);
        return;
      case HealthPackage.EXERCISE_STATEMENT__TIME:
        setTime((InputValue)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HealthPackage.EXERCISE_STATEMENT__EXERCISE_TYPE:
        setExerciseType(EXERCISE_TYPE_EDEFAULT);
        return;
      case HealthPackage.EXERCISE_STATEMENT__TIME:
        setTime((InputValue)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HealthPackage.EXERCISE_STATEMENT__EXERCISE_TYPE:
        return exerciseType != EXERCISE_TYPE_EDEFAULT;
      case HealthPackage.EXERCISE_STATEMENT__TIME:
        return time != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (ExerciseType: ");
    result.append(exerciseType);
    result.append(')');
    return result.toString();
  }

} //ExerciseStatementImpl
