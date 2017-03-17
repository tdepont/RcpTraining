/**
 */
package com.sii.group.group;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.Group#getMusiciens <em>Musiciens</em>}</li>
 *   <li>{@link com.sii.group.group.Group#getAlbum <em>Album</em>}</li>
 *   <li>{@link com.sii.group.group.Group#getTournee <em>Tournee</em>}</li>
 *   <li>{@link com.sii.group.group.Group#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.group.group.Group#getLogo <em>Logo</em>}</li>
 * </ul>
 *
 * @see com.sii.group.group.GroupPackage#getGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkName'"
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Musiciens</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.group.group.Musiciens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Musiciens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musiciens</em>' containment reference list.
	 * @see com.sii.group.group.GroupPackage#getGroup_Musiciens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Musiciens> getMusiciens();

	/**
	 * Returns the value of the '<em><b>Album</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.group.group.Album}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Album</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Album</em>' containment reference list.
	 * @see com.sii.group.group.GroupPackage#getGroup_Album()
	 * @model containment="true"
	 * @generated
	 */
	EList<Album> getAlbum();

	/**
	 * Returns the value of the '<em><b>Tournee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tournee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournee</em>' containment reference.
	 * @see #setTournee(Tournee)
	 * @see com.sii.group.group.GroupPackage#getGroup_Tournee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tournee getTournee();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Group#getTournee <em>Tournee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournee</em>' containment reference.
	 * @see #getTournee()
	 * @generated
	 */
	void setTournee(Tournee value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see com.sii.group.group.GroupPackage#getGroup_Name()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link com.sii.group.group.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link com.sii.group.group.Group#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(Object)
	 * @see com.sii.group.group.GroupPackage#getGroup_Logo()
	 * @model dataType="com.sii.group.group.Image" required="true"
	 * @generated
	 */
	Object getLogo();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Group#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(Object value);

} // Group
