/**
 */
package com.sii.group.group.impl;

import com.sii.group.group.Date;
import com.sii.group.group.GroupPackage;
import com.sii.group.group.Ville;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.impl.DateImpl#getSalleName <em>Salle Name</em>}</li>
 *   <li>{@link com.sii.group.group.impl.DateImpl#getDate <em>Date</em>}</li>
 *   <li>{@link com.sii.group.group.impl.DateImpl#getVille <em>Ville</em>}</li>
 *   <li>{@link com.sii.group.group.impl.DateImpl#getSalleAdresse <em>Salle Adresse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateImpl extends MinimalEObjectImpl.Container implements Date {
	/**
	 * The default value of the '{@link #getSalleName() <em>Salle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SALLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalleName() <em>Salle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalleName()
	 * @generated
	 * @ordered
	 */
	protected String salleName = SALLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final java.util.Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected java.util.Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVille() <em>Ville</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected Ville ville;

	/**
	 * The default value of the '{@link #getSalleAdresse() <em>Salle Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalleAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String SALLE_ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalleAdresse() <em>Salle Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalleAdresse()
	 * @generated
	 * @ordered
	 */
	protected String salleAdresse = SALLE_ADRESSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.DATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalleName() {
		return salleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalleName(String newSalleName) {
		String oldSalleName = salleName;
		salleName = newSalleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.DATE__SALLE_NAME, oldSalleName, salleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java.util.Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(java.util.Date newDate) {
		java.util.Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.DATE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ville getVille() {
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVille(Ville newVille, NotificationChain msgs) {
		Ville oldVille = ville;
		ville = newVille;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroupPackage.DATE__VILLE, oldVille, newVille);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVille(Ville newVille) {
		if (newVille != ville) {
			NotificationChain msgs = null;
			if (ville != null)
				msgs = ((InternalEObject)ville).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroupPackage.DATE__VILLE, null, msgs);
			if (newVille != null)
				msgs = ((InternalEObject)newVille).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroupPackage.DATE__VILLE, null, msgs);
			msgs = basicSetVille(newVille, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.DATE__VILLE, newVille, newVille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalleAdresse() {
		return salleAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalleAdresse(String newSalleAdresse) {
		String oldSalleAdresse = salleAdresse;
		salleAdresse = newSalleAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.DATE__SALLE_ADRESSE, oldSalleAdresse, salleAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroupPackage.DATE__VILLE:
				return basicSetVille(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupPackage.DATE__SALLE_NAME:
				return getSalleName();
			case GroupPackage.DATE__DATE:
				return getDate();
			case GroupPackage.DATE__VILLE:
				return getVille();
			case GroupPackage.DATE__SALLE_ADRESSE:
				return getSalleAdresse();
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
			case GroupPackage.DATE__SALLE_NAME:
				setSalleName((String)newValue);
				return;
			case GroupPackage.DATE__DATE:
				setDate((java.util.Date)newValue);
				return;
			case GroupPackage.DATE__VILLE:
				setVille((Ville)newValue);
				return;
			case GroupPackage.DATE__SALLE_ADRESSE:
				setSalleAdresse((String)newValue);
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
			case GroupPackage.DATE__SALLE_NAME:
				setSalleName(SALLE_NAME_EDEFAULT);
				return;
			case GroupPackage.DATE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case GroupPackage.DATE__VILLE:
				setVille((Ville)null);
				return;
			case GroupPackage.DATE__SALLE_ADRESSE:
				setSalleAdresse(SALLE_ADRESSE_EDEFAULT);
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
			case GroupPackage.DATE__SALLE_NAME:
				return SALLE_NAME_EDEFAULT == null ? salleName != null : !SALLE_NAME_EDEFAULT.equals(salleName);
			case GroupPackage.DATE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case GroupPackage.DATE__VILLE:
				return ville != null;
			case GroupPackage.DATE__SALLE_ADRESSE:
				return SALLE_ADRESSE_EDEFAULT == null ? salleAdresse != null : !SALLE_ADRESSE_EDEFAULT.equals(salleAdresse);
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
		result.append(" (salleName: ");
		result.append(salleName);
		result.append(", date: ");
		result.append(date);
		result.append(", salleAdresse: ");
		result.append(salleAdresse);
		result.append(')');
		return result.toString();
	}

} //DateImpl
