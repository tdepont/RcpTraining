/**
 */
package com.sii.group.group.tests;

import com.sii.group.group.GroupFactory;
import com.sii.group.group.Musiciens;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Musiciens</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusiciensTest extends TestCase {

	/**
	 * The fixture for this Musiciens test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Musiciens fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MusiciensTest.class);
	}

	/**
	 * Constructs a new Musiciens test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusiciensTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Musiciens test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Musiciens fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Musiciens test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Musiciens getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GroupFactory.eINSTANCE.createMusiciens());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MusiciensTest
