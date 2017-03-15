package com.sii.rental.eap.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;

public class copyCustomer {

	@Execute
	public void copyExe(@Named(IServiceConstants.ACTIVE_SELECTION) Customer c) {
		Clipboard clipboard = new Clipboard(Display.getCurrent());
		
		
			String textData = c.getDisplayName();
			String rtfData = "{\\rtf1\\b\\i" + textData + "}";
			TextTransfer textTransfer = TextTransfer.getInstance();
			RTFTransfer rtfTransfer = RTFTransfer.getInstance();
			Transfer[] transfers = new Transfer[]{textTransfer, rtfTransfer};
			Object[] data = new Object[]{textData, rtfData};
			clipboard.setContents(data, transfers);
			clipboard.dispose();	
	}
	
	@CanExecute
	public boolean isok(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {
		return o instanceof Customer;
	}

}
