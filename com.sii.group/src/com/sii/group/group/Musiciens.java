/**
 */
package com.sii.group.group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Musiciens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.Musiciens#getPseudonyme <em>Pseudonyme</em>}</li>
 *   <li>{@link com.sii.group.group.Musiciens#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @see com.sii.group.group.GroupPackage#getMusiciens()
 * @model
 * @generated
 */
public interface Musiciens extends EObject {
	/**
	 * Returns the value of the '<em><b>Pseudonyme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudonyme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudonyme</em>' attribute.
	 * @see #setPseudonyme(String)
	 * @see com.sii.group.group.GroupPackage#getMusiciens_Pseudonyme()
	 * @model required="true"
	 * @generated
	 */
	String getPseudonyme();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Musiciens#getPseudonyme <em>Pseudonyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudonyme</em>' attribute.
	 * @see #getPseudonyme()
	 * @generated
	 */
	void setPseudonyme(String value);

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' attribute.
	 * The literals are from the enumeration {@link com.sii.group.group.MusicienInstrument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instrument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' attribute.
	 * @see com.sii.group.group.MusicienInstrument
	 * @see #setInstrument(MusicienInstrument)
	 * @see com.sii.group.group.GroupPackage#getMusiciens_Instrument()
	 * @model required="true"
	 * @generated
	 */
	MusicienInstrument getInstrument();

	/**
	 * Sets the value of the '{@link com.sii.group.group.Musiciens#getInstrument <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' attribute.
	 * @see com.sii.group.group.MusicienInstrument
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(MusicienInstrument value);

} // Musiciens
