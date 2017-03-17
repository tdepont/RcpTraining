/**
 */
package com.sii.group.group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.Date#getSalleName <em>Salle Name</em>}</li>
 *   <li>{@link com.sii.group.group.Date#getDate <em>Date</em>}</li>
 *   <li>{@link com.sii.group.group.Date#getVille <em>Ville</em>}</li>
 *   <li>{@link com.sii.group.group.Date#getSalleAdresse <em>Salle Adresse</em>}</li>
 * </ul>
 *
 * @see com.sii.group.group.GroupPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject {
	/**
	 * Returns the value of the '<em><b>Salle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle Name</em>' attribute.
	 * @see #setSalleName(String)
	 * @see com.sii.group.group.GroupPackage#getDate_SalleName()
	 * @model required="true"
	 * @generated
	 */
	String getSalleName();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Date#getSalleName <em>Salle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle Name</em>' attribute.
	 * @see #getSalleName()
	 * @generated
	 */
	void setSalleName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(java.util.Date)
	 * @see com.sii.group.group.GroupPackage#getDate_Date()
	 * @model required="true"
	 * @generated
	 */
	java.util.Date getDate();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Date#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(java.util.Date value);

	/**
	 * Returns the value of the '<em><b>Ville</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ville</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville</em>' containment reference.
	 * @see #setVille(Ville)
	 * @see com.sii.group.group.GroupPackage#getDate_Ville()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Ville getVille();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Date#getVille <em>Ville</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville</em>' containment reference.
	 * @see #getVille()
	 * @generated
	 */
	void setVille(Ville value);

	/**
	 * Returns the value of the '<em><b>Salle Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salle Adresse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle Adresse</em>' attribute.
	 * @see #setSalleAdresse(String)
	 * @see com.sii.group.group.GroupPackage#getDate_SalleAdresse()
	 * @model required="true"
	 * @generated
	 */
	String getSalleAdresse();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Date#getSalleAdresse <em>Salle Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle Adresse</em>' attribute.
	 * @see #getSalleAdresse()
	 * @generated
	 */
	void setSalleAdresse(String value);

} // Date
