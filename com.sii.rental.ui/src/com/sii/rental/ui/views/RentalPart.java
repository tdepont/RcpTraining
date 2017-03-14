
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
import org.eclipse.swt.widgets.DateTime;

public class RentalPart {

	private Label rentedObjectLabel, customerLabel, startDateLabel,endDateLabel, startDateEntry, endDateEntry;
	private Group dateGroup;
	
	@PostConstruct
	public void createUi(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2, false));
		
		rentedObjectLabel = new Label(infoGroup, SWT.NONE);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		rentedObjectLabel.setLayoutData(gd);
		rentedObjectLabel.setText("toto");
		
		customerLabel = new Label(infoGroup, SWT.NONE);
		customerLabel.setText("tata");
		new Label(infoGroup, SWT.NONE);
		
		dateGroup = new Group(parent, SWT.NONE);
		dateGroup.setText("Date");
		GridData gd_dateGroup = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_dateGroup.widthHint = 120;
		dateGroup.setLayoutData(gd_dateGroup);
		dateGroup.setLayout(new GridLayout(2, false));
		
		Label startDate = new Label(dateGroup, SWT.NONE);
		startDate.setBounds(0, 0, 55, 15);
		startDate.setText("du :");
		
		startDateEntry = new Label(dateGroup, SWT.NONE);
		startDateEntry.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		startDateEntry.setBounds(0, 0, 55, 15);
		
		Label endDate = new Label(dateGroup, SWT.NONE);
		endDate.setBounds(0, 0, 55, 15);
		endDate.setText("au :");
		
		endDateEntry = new Label(dateGroup, SWT.NONE);
		endDateEntry.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		endDateEntry.setBounds(0, 0, 55, 15);
		
		this.setRental(RentalCoreActivator.getAgency().getRentals().get(0));
	}
	
	public void setRental(Rental r)
	{
		customerLabel.setText(r.getCustomer().getDisplayName());
		rentedObjectLabel.setText(r.getRentedObject().getName());
		startDateEntry.setText(r.getStartDate().toString());
		endDateEntry.setText(r.getEndDate().toString());
	}

	@Focus
	public void onFocus() {
		rentedObjectLabel.setFocus();
	}
}