
package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.sii.rental.core.RentalCoreActivator;

public class RentalPart {

	private Label rentedObjectLabel, customerLabel, startDateLabel,endDateLabel;
	
	@PostConstruct
	public void createUi(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2, false));
		
		rentedObjectLabel = new Label(infoGroup, SWT.BORDER);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);
		rentedObjectLabel.setText("toto");
		
		customerLabel = new Label(infoGroup, SWT.BORDER);
		customerLabel.setText("tata");
		
		this.setRental(RentalCoreActivator.getAgency().getRentals().get(0));	
	}
	
	public void setRental(Rental r)
	{
		customerLabel.setText(r.getCustomer().getDisplayName());
		rentedObjectLabel.setText(r.getRentedObject().getName());
	}

	@Focus
	public void onFocus() {
		rentedObjectLabel.setFocus();
	}
}