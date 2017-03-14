package com.sii.rental.ui.views;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalProvider extends LabelProvider implements ITreeContentProvider {

	@PostConstruct
	public void init() {
		
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
	}
}
