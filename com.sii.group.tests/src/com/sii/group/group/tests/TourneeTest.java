/**
 */
package com.sii.group.group.tests;

import com.sii.group.group.GroupFactory;
import com.sii.group.group.Tournee;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tournee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TourneeTest extends TestCase {

	/**
	 * The fixture for this Tournee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tournee fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TourneeTest.class);
	}

	/**
	 * Constructs a new Tournee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TourneeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tournee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tournee fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tournee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tournee getFixture() {
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
		setFixture(GroupFactory.eINSTANCE.createTournee());
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

} //TourneeTest
