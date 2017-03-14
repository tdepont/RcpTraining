package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class RentalAgencies {
	
	RentalProvider myProvider;
	
	@PostConstruct
	public void createUi(Composite parent, RentalAgency a){
		
		myProvider = new RentalProvider();
		
		TreeViewer tv = new TreeViewer(parent);
		tv.setContentProvider(myProvider);
		tv.setLabelProvider(myProvider);
		
		Collection<RentalAgency> agencies = new ArrayList<>();
		agencies.add(a);
		
		tv.setInput(agencies);
		tv.expandAll();
	}
}
