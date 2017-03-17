/**
 */
package com.sii.group.group;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Musicien Instrument</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.sii.group.group.GroupPackage#getMusicienInstrument()
 * @model
 * @generated
 */
public enum MusicienInstrument implements Enumerator {
	/**
	 * The '<em><b>Guitare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUITARE_VALUE
	 * @generated
	 * @ordered
	 */
	GUITARE(0, "Guitare", "MUSICIENINSTRUMENT_0"),

	/**
	 * The '<em><b>Batterie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERIE_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERIE(1, "Batterie", "MUSICIENTINSTRUMENT_1"),

	/**
	 * The '<em><b>Basse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASSE_VALUE
	 * @generated
	 * @ordered
	 */
	BASSE(2, "Basse", "MUSICIENINSTRUMENT_2"),

	/**
	 * The '<em><b>Micro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO_VALUE
	 * @generated
	 * @ordered
	 */
	MICRO(3, "Micro", "MUSICIENINSTRUMENT_3");

	/**
	 * The '<em><b>Guitare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guitare</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUITARE
	 * @model name="Guitare" literal="MUSICIENINSTRUMENT_0"
	 * @generated
	 * @ordered
	 */
	public static final int GUITARE_VALUE = 0;

	/**
	 * The '<em><b>Batterie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Batterie</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATTERIE
	 * @model name="Batterie" literal="MUSICIENTINSTRUMENT_1"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERIE_VALUE = 1;

	/**
	 * The '<em><b>Basse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASSE
	 * @model name="Basse" literal="MUSICIENINSTRUMENT_2"
	 * @generated
	 * @ordered
	 */
	public static final int BASSE_VALUE = 2;

	/**
	 * The '<em><b>Micro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Micro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICRO
	 * @model name="Micro" literal="MUSICIENINSTRUMENT_3"
	 * @generated
	 * @ordered
	 */
	public static final int MICRO_VALUE = 3;

	/**
	 * An array of all the '<em><b>Musicien Instrument</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MusicienInstrument[] VALUES_ARRAY =
		new MusicienInstrument[] {
			GUITARE,
			BATTERIE,
			BASSE,
			MICRO,
		};

	/**
	 * A public read-only list of all the '<em><b>Musicien Instrument</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MusicienInstrument> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Musicien Instrument</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MusicienInstrument get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MusicienInstrument result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Musicien Instrument</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MusicienInstrument getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MusicienInstrument result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Musicien Instrument</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MusicienInstrument get(int value) {
		switch (value) {
			case GUITARE_VALUE: return GUITARE;
			case BATTERIE_VALUE: return BATTERIE;
			case BASSE_VALUE: return BASSE;
			case MICRO_VALUE: return MICRO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MusicienInstrument(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MusicienInstrument
