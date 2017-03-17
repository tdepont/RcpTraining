/**
 */
package com.sii.group.group;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sii.group.group.GroupFactory
 * @model kind="package"
 * @generated
 */
public interface GroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "group";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.sii/group/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "group";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupPackage eINSTANCE = com.sii.group.group.impl.GroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sii.group.group.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.group.group.impl.GroupImpl
	 * @see com.sii.group.group.impl.GroupPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 0;

	/**
	 * The feature id for the '<em><b>Musiciens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MUSICIENS = 0;

	/**
	 * The feature id for the '<em><b>Album</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ALBUM = 1;

	/**
	 * The feature id for the '<em><b>Tournee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TOURNEE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 3;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LOGO = 4;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.group.group.impl.MusiciensImpl <em>Musiciens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.group.group.impl.MusiciensImpl
	 * @see com.sii.group.group.impl.GroupPackageImpl#getMusiciens()
	 * @generated
	 */
	int MUSICIENS = 1;

	/**
	 * The feature id for the '<em><b>Pseudonyme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSICIENS__PSEUDONYME = 0;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSICIENS__INSTRUMENT = 1;

	/**
	 * The number of structural features of the '<em>Musiciens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSICIENS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Musiciens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSICIENS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.group.group.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.group.group.impl.AlbumImpl
	 * @see com.sii.group.group.impl.GroupPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 2;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Visuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__VISUEL = 1;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.group.group.impl.TourneeImpl <em>Tournee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.group.group.impl.TourneeImpl
	 * @see com.sii.group.group.impl.GroupPackageImpl#getTournee()
	 * @generated
	 */
	int TOURNEE = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNEE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNEE__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNEE__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNEE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Tournee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNEE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tournee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.group.group.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.group.group.impl.DateImpl
	 * @see com.sii.group.group.impl.GroupPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 4;

	/**
	 * The feature id for the '<em><b>Salle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__SALLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Ville</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VILLE = 2;

	/**
	 * The feature id for the '<em><b>Salle Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__SALLE_ADRESSE = 3;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.group.group.impl.VilleImpl <em>Ville</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.group.group.impl.VilleImpl
	 * @see com.sii.group.group.impl.GroupPackageImpl#getVille()
	 * @generated
	 */
	int VILLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__PAYS = 1;

	/**
	 * The number of structural features of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.group.group.MusicienInstrument <em>Musicien Instrument</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.group.group.MusicienInstrument
	 * @see com.sii.group.group.impl.GroupPackageImpl#getMusicienInstrument()
	 * @generated
	 */
	int MUSICIEN_INSTRUMENT = 6;

	/**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see com.sii.group.group.impl.GroupPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;


	/**
	 * Returns the meta object for class '{@link com.sii.group.group.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see com.sii.group.group.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.group.group.Group#getMusiciens <em>Musiciens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Musiciens</em>'.
	 * @see com.sii.group.group.Group#getMusiciens()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Musiciens();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.group.group.Group#getAlbum <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Album</em>'.
	 * @see com.sii.group.group.Group#getAlbum()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Album();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.group.group.Group#getTournee <em>Tournee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tournee</em>'.
	 * @see com.sii.group.group.Group#getTournee()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Tournee();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.group.group.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Group#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see com.sii.group.group.Group#getLogo()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Logo();

	/**
	 * Returns the meta object for class '{@link com.sii.group.group.Musiciens <em>Musiciens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Musiciens</em>'.
	 * @see com.sii.group.group.Musiciens
	 * @generated
	 */
	EClass getMusiciens();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Musiciens#getPseudonyme <em>Pseudonyme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudonyme</em>'.
	 * @see com.sii.group.group.Musiciens#getPseudonyme()
	 * @see #getMusiciens()
	 * @generated
	 */
	EAttribute getMusiciens_Pseudonyme();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Musiciens#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument</em>'.
	 * @see com.sii.group.group.Musiciens#getInstrument()
	 * @see #getMusiciens()
	 * @generated
	 */
	EAttribute getMusiciens_Instrument();

	/**
	 * Returns the meta object for class '{@link com.sii.group.group.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see com.sii.group.group.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Album#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see com.sii.group.group.Album#getTitre()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Titre();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Album#getVisuel <em>Visuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visuel</em>'.
	 * @see com.sii.group.group.Album#getVisuel()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Visuel();

	/**
	 * Returns the meta object for class '{@link com.sii.group.group.Tournee <em>Tournee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournee</em>'.
	 * @see com.sii.group.group.Tournee
	 * @generated
	 */
	EClass getTournee();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.group.group.Tournee#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see com.sii.group.group.Tournee#getDate()
	 * @see #getTournee()
	 * @generated
	 */
	EReference getTournee_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Tournee#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see com.sii.group.group.Tournee#getStartDate()
	 * @see #getTournee()
	 * @generated
	 */
	EAttribute getTournee_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Tournee#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.sii.group.group.Tournee#getEndDate()
	 * @see #getTournee()
	 * @generated
	 */
	EAttribute getTournee_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Tournee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.group.group.Tournee#getName()
	 * @see #getTournee()
	 * @generated
	 */
	EAttribute getTournee_Name();

	/**
	 * Returns the meta object for class '{@link com.sii.group.group.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see com.sii.group.group.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Date#getSalleName <em>Salle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salle Name</em>'.
	 * @see com.sii.group.group.Date#getSalleName()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_SalleName();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Date#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.sii.group.group.Date#getDate()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Date();

	/**
	 * Returns the meta object for the containment reference '{@link com.sii.group.group.Date#getVille <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ville</em>'.
	 * @see com.sii.group.group.Date#getVille()
	 * @see #getDate()
	 * @generated
	 */
	EReference getDate_Ville();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Date#getSalleAdresse <em>Salle Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salle Adresse</em>'.
	 * @see com.sii.group.group.Date#getSalleAdresse()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_SalleAdresse();

	/**
	 * Returns the meta object for class '{@link com.sii.group.group.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ville</em>'.
	 * @see com.sii.group.group.Ville
	 * @generated
	 */
	EClass getVille();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Ville#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.group.group.Ville#getName()
	 * @see #getVille()
	 * @generated
	 */
	EAttribute getVille_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.group.group.Ville#getPays <em>Pays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pays</em>'.
	 * @see com.sii.group.group.Ville#getPays()
	 * @see #getVille()
	 * @generated
	 */
	EAttribute getVille_Pays();

	/**
	 * Returns the meta object for enum '{@link com.sii.group.group.MusicienInstrument <em>Musicien Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Musicien Instrument</em>'.
	 * @see com.sii.group.group.MusicienInstrument
	 * @generated
	 */
	EEnum getMusicienInstrument();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupFactory getGroupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sii.group.group.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.group.group.impl.GroupImpl
		 * @see com.sii.group.group.impl.GroupPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Musiciens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MUSICIENS = eINSTANCE.getGroup_Musiciens();

		/**
		 * The meta object literal for the '<em><b>Album</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ALBUM = eINSTANCE.getGroup_Album();

		/**
		 * The meta object literal for the '<em><b>Tournee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__TOURNEE = eINSTANCE.getGroup_Tournee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__LOGO = eINSTANCE.getGroup_Logo();

		/**
		 * The meta object literal for the '{@link com.sii.group.group.impl.MusiciensImpl <em>Musiciens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.group.group.impl.MusiciensImpl
		 * @see com.sii.group.group.impl.GroupPackageImpl#getMusiciens()
		 * @generated
		 */
		EClass MUSICIENS = eINSTANCE.getMusiciens();

		/**
		 * The meta object literal for the '<em><b>Pseudonyme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSICIENS__PSEUDONYME = eINSTANCE.getMusiciens_Pseudonyme();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSICIENS__INSTRUMENT = eINSTANCE.getMusiciens_Instrument();

		/**
		 * The meta object literal for the '{@link com.sii.group.group.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.group.group.impl.AlbumImpl
		 * @see com.sii.group.group.impl.GroupPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__TITRE = eINSTANCE.getAlbum_Titre();

		/**
		 * The meta object literal for the '<em><b>Visuel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__VISUEL = eINSTANCE.getAlbum_Visuel();

		/**
		 * The meta object literal for the '{@link com.sii.group.group.impl.TourneeImpl <em>Tournee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.group.group.impl.TourneeImpl
		 * @see com.sii.group.group.impl.GroupPackageImpl#getTournee()
		 * @generated
		 */
		EClass TOURNEE = eINSTANCE.getTournee();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNEE__DATE = eINSTANCE.getTournee_Date();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNEE__START_DATE = eINSTANCE.getTournee_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNEE__END_DATE = eINSTANCE.getTournee_EndDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNEE__NAME = eINSTANCE.getTournee_Name();

		/**
		 * The meta object literal for the '{@link com.sii.group.group.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.group.group.impl.DateImpl
		 * @see com.sii.group.group.impl.GroupPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Salle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__SALLE_NAME = eINSTANCE.getDate_SalleName();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DATE = eINSTANCE.getDate_Date();

		/**
		 * The meta object literal for the '<em><b>Ville</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE__VILLE = eINSTANCE.getDate_Ville();

		/**
		 * The meta object literal for the '<em><b>Salle Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__SALLE_ADRESSE = eINSTANCE.getDate_SalleAdresse();

		/**
		 * The meta object literal for the '{@link com.sii.group.group.impl.VilleImpl <em>Ville</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.group.group.impl.VilleImpl
		 * @see com.sii.group.group.impl.GroupPackageImpl#getVille()
		 * @generated
		 */
		EClass VILLE = eINSTANCE.getVille();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VILLE__NAME = eINSTANCE.getVille_Name();

		/**
		 * The meta object literal for the '<em><b>Pays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VILLE__PAYS = eINSTANCE.getVille_Pays();

		/**
		 * The meta object literal for the '{@link com.sii.group.group.MusicienInstrument <em>Musicien Instrument</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.group.group.MusicienInstrument
		 * @see com.sii.group.group.impl.GroupPackageImpl#getMusicienInstrument()
		 * @generated
		 */
		EEnum MUSICIEN_INSTRUMENT = eINSTANCE.getMusicienInstrument();

		/**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see com.sii.group.group.impl.GroupPackageImpl#getImage()
		 * @generated
		 */
		EDataType IMAGE = eINSTANCE.getImage();

	}

} //GroupPackage
