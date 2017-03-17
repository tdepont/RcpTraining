/**
 */
package com.sii.group.group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.Album#getTitre <em>Titre</em>}</li>
 *   <li>{@link com.sii.group.group.Album#getVisuel <em>Visuel</em>}</li>
 * </ul>
 *
 * @see com.sii.group.group.GroupPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see com.sii.group.group.GroupPackage#getAlbum_Titre()
	 * @model required="true"
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Album#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Visuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visuel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visuel</em>' attribute.
	 * @see #setVisuel(Object)
	 * @see com.sii.group.group.GroupPackage#getAlbum_Visuel()
	 * @model id="true" dataType="com.sii.group.group.Image" required="true"
	 * @generated
	 */
	Object getVisuel();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Album#getVisuel <em>Visuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visuel</em>' attribute.
	 * @see #getVisuel()
	 * @generated
	 */
	void setVisuel(Object value);

} // Album
