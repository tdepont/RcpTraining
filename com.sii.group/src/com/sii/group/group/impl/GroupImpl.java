/**
 */
package com.sii.group.group.impl;

import com.sii.group.group.Album;
import com.sii.group.group.Group;
import com.sii.group.group.GroupPackage;
import com.sii.group.group.Musiciens;
import com.sii.group.group.Tournee;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.group.group.impl.GroupImpl#getMusiciens <em>Musiciens</em>}</li>
 *   <li>{@link com.sii.group.group.impl.GroupImpl#getAlbum <em>Album</em>}</li>
 *   <li>{@link com.sii.group.group.impl.GroupImpl#getTournee <em>Tournee</em>}</li>
 *   <li>{@link com.sii.group.group.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.group.group.impl.GroupImpl#getLogo <em>Logo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
	/**
	 * The cached value of the '{@link #getMusiciens() <em>Musiciens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusiciens()
	 * @generated
	 * @ordered
	 */
	protected EList<Musiciens> musiciens;

	/**
	 * The cached value of the '{@link #getAlbum() <em>Album</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbum()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> album;

	/**
	 * The cached value of the '{@link #getTournee() <em>Tournee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournee()
	 * @generated
	 * @ordered
	 */
	protected Tournee tournee;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected Object logo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Musiciens> getMusiciens() {
		if (musiciens == null) {
			musiciens = new EObjectContainmentEList<Musiciens>(Musiciens.class, this, GroupPackage.GROUP__MUSICIENS);
		}
		return musiciens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Album> getAlbum() {
		if (album == null) {
			album = new EObjectContainmentEList<Album>(Album.class, this, GroupPackage.GROUP__ALBUM);
		}
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournee getTournee() {
		return tournee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournee(Tournee newTournee, NotificationChain msgs) {
		Tournee oldTournee = tournee;
		tournee = newTournee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroupPackage.GROUP__TOURNEE, oldTournee, newTournee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournee(Tournee newTournee) {
		if (newTournee != tournee) {
			NotificationChain msgs = null;
			if (tournee != null)
				msgs = ((InternalEObject)tournee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroupPackage.GROUP__TOURNEE, null, msgs);
			if (newTournee != null)
				msgs = ((InternalEObject)newTournee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroupPackage.GROUP__TOURNEE, null, msgs);
			msgs = basicSetTournee(newTournee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.GROUP__TOURNEE, newTournee, newTournee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.GROUP__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GroupPackage.GROUP__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLogo() {
		return logo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogo(Object newLogo) {
		Object oldLogo = logo;
		logo = newLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.GROUP__LOGO, oldLogo, logo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroupPackage.GROUP__MUSICIENS:
				return ((InternalEList<?>)getMusiciens()).basicRemove(otherEnd, msgs);
			case GroupPackage.GROUP__ALBUM:
				return ((InternalEList<?>)getAlbum()).basicRemove(otherEnd, msgs);
			case GroupPackage.GROUP__TOURNEE:
				return basicSetTournee(null, msgs);
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
			case GroupPackage.GROUP__MUSICIENS:
				return getMusiciens();
			case GroupPackage.GROUP__ALBUM:
				return getAlbum();
			case GroupPackage.GROUP__TOURNEE:
				return getTournee();
			case GroupPackage.GROUP__NAME:
				return getName();
			case GroupPackage.GROUP__LOGO:
				return getLogo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GroupPackage.GROUP__MUSICIENS:
				getMusiciens().clear();
				getMusiciens().addAll((Collection<? extends Musiciens>)newValue);
				return;
			case GroupPackage.GROUP__ALBUM:
				getAlbum().clear();
				getAlbum().addAll((Collection<? extends Album>)newValue);
				return;
			case GroupPackage.GROUP__TOURNEE:
				setTournee((Tournee)newValue);
				return;
			case GroupPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case GroupPackage.GROUP__LOGO:
				setLogo(newValue);
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
			case GroupPackage.GROUP__MUSICIENS:
				getMusiciens().clear();
				return;
			case GroupPackage.GROUP__ALBUM:
				getAlbum().clear();
				return;
			case GroupPackage.GROUP__TOURNEE:
				setTournee((Tournee)null);
				return;
			case GroupPackage.GROUP__NAME:
				unsetName();
				return;
			case GroupPackage.GROUP__LOGO:
				setLogo((Object)null);
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
			case GroupPackage.GROUP__MUSICIENS:
				return musiciens != null && !musiciens.isEmpty();
			case GroupPackage.GROUP__ALBUM:
				return album != null && !album.isEmpty();
			case GroupPackage.GROUP__TOURNEE:
				return tournee != null;
			case GroupPackage.GROUP__NAME:
				return isSetName();
			case GroupPackage.GROUP__LOGO:
				return logo != null;
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", logo: ");
		result.append(logo);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
