package com.sii.rental.ui;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;

public class RentalUiAddon implements RentalUIConstants {

	private Map<String, Palette> paletteManager = new HashMap<>();

	@PostConstruct
	public void initContext(IEclipseContext ctx) {
		ctx.set(RentalAgency.class, RentalCoreActivator.getAgency());
		ctx.set(RENTAL_UI_IMG_REGISTRY, geLocalImageRegistry());
		ctx.set(PALETTE_MANAGER, paletteManager);
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
	private void readPaletteExtension(IExtensionRegistry ext) {

		for (IConfigurationElement lconf : ext.getConfigurationElementsFor("com.sii.rental.ui.palette")) {
			if (lconf.getName().equals("palette")) {
				try {
					Palette p = new Palette();
					p.setId(lconf.getAttribute("id"));
					p.setName(lconf.getAttribute("name"));
					p.setProvider((IColorProvider) lconf.createExecutableExtension("palette"));
					System.out.println("palette lue : " + p.getName());
					paletteManager.put(p.getId(), p);
				} catch (InvalidRegistryObjectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
