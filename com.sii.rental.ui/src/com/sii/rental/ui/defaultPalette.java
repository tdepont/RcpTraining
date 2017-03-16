package com.sii.rental.ui;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;

public class defaultPalette implements IColorProvider, RentalUIConstants {

	private IPreferenceStore pref;
	
	public defaultPalette() {
		// TODO Auto-generated constructor stub
		pref = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");
	}

	@Override
	public Color getForeground(Object element) {
		
		if(element instanceof Customer)
			//return  Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
			return this.getAColor(pref.getString(PREF_CUSTOMER_COLOR));
		if(element instanceof RentalObject)
			//return  Display.getCurrent().getSystemColor(SWT.COLOR_DARK_BLUE);
			return this.getAColor(pref.getString(PREF_RENTAL_OBJECT_COLOR));
		if(element instanceof Rental)
			//return  Display.getCurrent().getSystemColor(SWT.COLOR_CYAN);
			return this.getAColor(pref.getString(PREF_RENTAL_COLOR));
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		return  Display.getCurrent().getSystemColor(SWT.COLOR_INFO_BACKGROUND);
	}
	
	private Color getAColor(String rgbKey) {
		ColorRegistry colorRegistry = JFaceResources.getColorRegistry();
		
		Color col = colorRegistry.get(rgbKey);
		if(col == null)
		{
			colorRegistry.put(rgbKey, StringConverter.asRGB(rgbKey));
			col = colorRegistry.get(rgbKey);
		}
		
		return col;
	}
}
