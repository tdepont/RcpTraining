
package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPart {

	private Label rentedObjectLabel, customerLabel, startDateEntry, endDateEntry;
	private Group dateGroup;
	
	@Inject
	private ESelectionService localSelectionService;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	@Inject 
	public void RentalPart(Composite parent, RentalAgency a) {
		parent.setLayout(new GridLayout(1, false));
		
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2, false));
		GridData gd = new GridData();
		gd.horizontalAlignment = SWT.FILL;
		gd.grabExcessHorizontalSpace = true;
		infoGroup.setLayoutData(gd);
		
		rentedObjectLabel = new Label(infoGroup, SWT.NONE);
		 gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		gd.grabExcessHorizontalSpace = true;
		rentedObjectLabel.setLayoutData(gd);
		rentedObjectLabel.setText("toto");
		
		customerLabel = new Label(infoGroup, SWT.NONE);
		customerLabel.setText("tata");
		customerLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
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
	}
	
	public void setRental(Rental r)
	{
		customerLabel.setText(r.getCustomer().getDisplayName());
		rentedObjectLabel.setText(r.getRentedObject().getName());
		startDateEntry.setText(r.getStartDate().toString());
		endDateEntry.setText(r.getEndDate().toString());
	}
	
	@Inject @Optional
	public void receivedSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Rental r)
	{
		if(r != null)
			this.setRental(r);
	}

	@Focus
	public void onFocus() {
		if(rentedObjectLabel != null)
			rentedObjectLabel.setFocus();
	}
}