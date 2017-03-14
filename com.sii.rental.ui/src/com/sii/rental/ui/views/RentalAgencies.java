package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class RentalAgencies {
	
	@Inject
	private ESelectionService selectionService;
	
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
			
		// ajout d'un listener sur la selection au niveau du tree viewer
		// indique la sélection courante
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectionService.setSelection(sel.size() == 1 ? sel.getFirstElement() : sel.toArray());
			}
		});
		
		}
	}
