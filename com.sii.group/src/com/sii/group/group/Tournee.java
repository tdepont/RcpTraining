/**
 */
package com.sii.group.group;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.Tournee#getDate <em>Date</em>}</li>
 *   <li>{@link com.sii.group.group.Tournee#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.sii.group.group.Tournee#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.sii.group.group.Tournee#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.sii.group.group.GroupPackage#getTournee()
 * @model
 * @generated
 */
public interface Tournee extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.group.group.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see com.sii.group.group.GroupPackage#getTournee_Date()
	 * @model containment="true"
	 * @generated
	 */
	EList<Date> getDate();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(java.util.Date)
	 * @see com.sii.group.group.GroupPackage#getTournee_StartDate()
	 * @model required="true"
	 * @generated
	 */
	java.util.Date getStartDate();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Tournee#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(java.util.Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(java.util.Date)
	 * @see com.sii.group.group.GroupPackage#getTournee_EndDate()
	 * @model required="true"
	 * @generated
	 */
	java.util.Date getEndDate();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Tournee#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(java.util.Date value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.sii.group.group.GroupPackage#getTournee_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Tournee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Tournee
