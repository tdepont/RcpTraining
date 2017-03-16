package com.sii.rental.ui.views;

import java.util.Collection;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.Palette;
import com.sii.rental.ui.RentalUIConstants;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider, RentalUIConstants {

	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;
	private IPreferenceStore pref;
	
	@PostConstruct
	public void init() {
		pref = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");
	}
		
	@Override
	public Object[] getElements(Object inputElement) {
		
		if(inputElement instanceof Collection<?>)
			return ((Collection) inputElement).toArray(); 
		return null;	
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof RentalAgency)
		{
			RentalAgency a = (RentalAgency) parentElement;
				return new Node[] {new Node(Node.CUSTOMER, a),
					new Node(Node.LOCATIONS, a),
					new Node(Node.OBJECTS_À_LOUER, a)};
		}
		if(parentElement instanceof Node)
		{
			return ((Node) parentElement).getChildren();
		}
			return null;
	}
	
	@Override
	public Object getParent(Object element) {
		//if(element instanceof EObject)
		//	return (EObject) element.eContainer();
		//else
			return null;
	}
	
	@Override
	public boolean hasChildren(Object element) {
		return element instanceof RentalAgency || element instanceof Node;
	}
	
	@Override
	public String getText(Object element) {
		if(element instanceof RentalAgency)
			return ((RentalAgency) element).getName();
		else if (element instanceof Customer)
			return ((Customer) element).getDisplayName();
		else if (element instanceof RentalObject)
			return ((RentalObject) element).getName();
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof RentalAgency)
			return registry.get(IMG_AGENCY);
		if (element instanceof Customer)
			return registry.get(IMG_CUSTOMER);
		else if (element instanceof RentalObject)
			return registry.get(IMG_RENTAL_OBJECT);
		else if (element instanceof Rental)
			return registry.get(IMG_RENTAL);
		return null;
	}
	
	
	@Inject @Named(PALETTE_MANAGER)
	private Map<String, Palette> palettes;
	@Override
	public Color getForeground(Object element) {
		
		String palId = pref.getString(PREF_PALETTE);
		
		Palette p = palettes.get(palId);
		return p.getProvider().getForeground(element);
		}

	@Override
	public Color getBackground(Object element) {
String palId = pref.getString(PREF_PALETTE);
		
		Palette p = palettes.get(palId);
		return p.getProvider().getBackground(element);
	}
	

		
	class Node {
		
		private static final String OBJECTS_À_LOUER = "Objects à louer";
		private static final String LOCATIONS = "Locations";
		private static final String CUSTOMER = "Customer";
		private String title; 
		private RentalAgency a;
		
		public Node(String title, RentalAgency a) {
			super();
			this.title = title;
			this.a = a;
		}
		
		public Object[] getChildren() {
			if(title == CUSTOMER)
				return a.getCustomers().toArray();
			if(title == LOCATIONS)
				return a.getRentals().toArray();
			if(title == OBJECTS_À_LOUER)
				return a.getObjectsToRent().toArray();
			return null;
		}
		
		@Override
		public String toString() {return title;}

		private RentalProvider getOuterType() {
			return RentalProvider.this;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((a == null) ? 0 : a.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (a == null) {
				if (other.a != null)
					return false;
			} else if (!a.equals(other.a))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
	}
}
