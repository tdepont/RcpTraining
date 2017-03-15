package com.sii.rental.eap.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldHandler {
	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Hello world", "Hello world");
	}
}
