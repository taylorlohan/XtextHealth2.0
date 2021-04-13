/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.myhealth.health;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exercise Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.myhealth.health.ExerciseStatement#getExerciseType <em>Exercise Type</em>}</li>
 *   <li>{@link org.xtext.example.myhealth.health.ExerciseStatement#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.myhealth.health.HealthPackage#getExerciseStatement()
 * @model
 * @generated
 */
public interface ExerciseStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Exercise Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.myhealth.health.ExerciseType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exercise Type</em>' attribute.
   * @see org.xtext.example.myhealth.health.ExerciseType
   * @see #setExerciseType(ExerciseType)
   * @see org.xtext.example.myhealth.health.HealthPackage#getExerciseStatement_ExerciseType()
   * @model
   * @generated
   */
  ExerciseType getExerciseType();

  /**
   * Sets the value of the '{@link org.xtext.example.myhealth.health.ExerciseStatement#getExerciseType <em>Exercise Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exercise Type</em>' attribute.
   * @see org.xtext.example.myhealth.health.ExerciseType
   * @see #getExerciseType()
   * @generated
   */
  void setExerciseType(ExerciseType value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(InputValue)
   * @see org.xtext.example.myhealth.health.HealthPackage#getExerciseStatement_Time()
   * @model containment="true"
   * @generated
   */
  InputValue getTime();

  /**
   * Sets the value of the '{@link org.xtext.example.myhealth.health.ExerciseStatement#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(InputValue value);

} // ExerciseStatement
