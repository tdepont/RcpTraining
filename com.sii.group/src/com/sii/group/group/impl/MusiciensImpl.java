/**
 */
package com.sii.group.group.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.sii.group.group.GroupPackage;
import com.sii.group.group.MusicienInstrument;
import com.sii.group.group.Musiciens;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Musiciens</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.impl.MusiciensImpl#getPseudonyme <em>Pseudonyme</em>}</li>
 *   <li>{@link com.sii.group.group.impl.MusiciensImpl#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MusiciensImpl extends MinimalEObjectImpl.Container implements Musiciens {
	/**
	 * The default value of the '{@link #getPseudonyme() <em>Pseudonyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonyme()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDONYME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudonyme() <em>Pseudonyme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonyme()
	 * @generated
	 * @ordered
	 */
	protected String pseudonyme = PSEUDONYME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected static final MusicienInstrument INSTRUMENT_EDEFAULT = MusicienInstrument.GUITARE;

	/**
	 * The cached value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected MusicienInstrument instrument = INSTRUMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusiciensImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.MUSICIENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPseudonyme() {
		return pseudonyme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudonyme(String newPseudonyme) {
		String oldPseudonyme = pseudonyme;
		pseudonyme = newPseudonyme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.MUSICIENS__PSEUDONYME, oldPseudonyme, pseudonyme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicienInstrument getInstrument() {
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstrument(MusicienInstrument newInstrument) {
		MusicienInstrument oldInstrument = instrument;
		instrument = newInstrument == null ? INSTRUMENT_EDEFAULT : newInstrument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.MUSICIENS__INSTRUMENT, oldInstrument, instrument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupPackage.MUSICIENS__PSEUDONYME:
				return getPseudonyme();
			case GroupPackage.MUSICIENS__INSTRUMENT:
				return getInstrument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GroupPackage.MUSICIENS__PSEUDONYME:
				setPseudonyme((String)newValue);
				return;
			case GroupPackage.MUSICIENS__INSTRUMENT:
				setInstrument((MusicienInstrument)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GroupPackage.MUSICIENS__PSEUDONYME:
				setPseudonyme(PSEUDONYME_EDEFAULT);
				return;
			case GroupPackage.MUSICIENS__INSTRUMENT:
				setInstrument(INSTRUMENT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GroupPackage.MUSICIENS__PSEUDONYME:
				return PSEUDONYME_EDEFAULT == null ? pseudonyme != null : !PSEUDONYME_EDEFAULT.equals(pseudonyme);
			case GroupPackage.MUSICIENS__INSTRUMENT:
				return instrument != INSTRUMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pseudonyme: ");
		result.append(pseudonyme);
		result.append(", instrument: ");
		result.append(instrument);
		result.append(')');
		return result.toString();
	}

} //MusiciensImpl
