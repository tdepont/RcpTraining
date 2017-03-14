package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class RentalAgencies {
	
	@PostConstruct
	public void createUi(Composite parent, RentalAgency a, IEclipseContext ctx){
		
		RentalProvider myProvider = ContextInjectionFactory.make(RentalProvider.class, ctx);
		TreeViewer tv = new TreeViewer(parent);
		tv.setContentProvider(myProvider);
		tv.setLabelProvider(myProvider);
		
		Collection<RentalAgency> agencies = new ArrayList<>();
		agencies.add(a);
		
		tv.setInput(agencies);
		tv.expandAll();
	}
}
