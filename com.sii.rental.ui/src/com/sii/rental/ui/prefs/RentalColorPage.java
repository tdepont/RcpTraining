package com.sii.rental.ui.prefs;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;

import com.sii.rental.ui.RentalUIConstants;

public class RentalColorPage extends FieldEditorPreferencePage implements RentalUIConstants{

	public RentalColorPage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "cusotmer : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Rental : ", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Object : ", getFieldEditorParent()));
	}
}
