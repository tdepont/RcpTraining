/**
 */
package com.sii.group.group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ville</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.Ville#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.group.group.Ville#getPays <em>Pays</em>}</li>
 * </ul>
 *
 * @see com.sii.group.group.GroupPackage#getVille()
 * @model
 * @generated
 */
public interface Ville extends EObject {
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
	 * @see com.sii.group.group.GroupPackage#getVille_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Ville#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pays</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pays</em>' attribute.
	 * @see #setPays(String)
	 * @see com.sii.group.group.GroupPackage#getVille_Pays()
	 * @model required="true"
	 * @generated
	 */
	String getPays();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Ville#getPays <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pays</em>' attribute.
	 * @see #getPays()
	 * @generated
	 */
	void setPays(String value);

} // Ville
