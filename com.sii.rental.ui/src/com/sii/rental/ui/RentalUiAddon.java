package com.sii.rental.ui;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;

public class RentalUiAddon implements RentalUIConstants {

	@PostConstruct
	public void initContext(IEclipseContext ctx) {
		ctx.set(RentalAgency.class,  RentalCoreActivator.getAgency());
		ctx.set(RENTAL_UI_IMG_REGISTRY, geLocalImageRegistry());
	}
	
	ImageRegistry geLocalImageRegistry() {
		
		Bundle b = FrameworkUtil.getBundle(getClass());
		
		ImageRegistry reg = new ImageRegistry();
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		reg.put(IMG_RENTAL, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL)));
		reg.put(IMG_RENTAL_OBJECT, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL_OBJECT)));
		reg.put(IMG_AGENCY, ImageDescriptor.createFromURL(b.getEntry(IMG_AGENCY)));
		
		return reg;
	}
	
	@Inject
	@Optional
	private void print(@UIEventTopic(EVENT_CUSTOMER) Customer c) {
		System.out.println("Copie du client : " + c.getDisplayName());
	}
	
	@Inject
	private void printExtension(IExtensionRegistry ext) {
				
		for(IConfigurationElement lconf : ext.getConfigurationElementsFor("org.eclipse.e4.workbench.model")) {
			if(lconf.getName().equals("fragment"))
			{
				String value = lconf.getAttribute("uri");
				System.out.println("in : " + lconf.getNamespaceIdentifier() + value);	
			}else if(lconf.getName().equals("processor"))
			{
				String value = lconf.getAttribute("class");
				System.out.println("in : " + lconf.getNamespaceIdentifier() + " " + value);	
			}
		}
	}
}
