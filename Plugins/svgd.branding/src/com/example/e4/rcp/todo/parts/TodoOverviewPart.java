package com.example.e4.rcp.todo.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class TodoOverviewPart {

	@Inject
	public TodoOverviewPart(Composite parent) {

		// Assuming that dependency injection works
		// parent will never be null
		System.out.println("Woh! Got Composite via DI.");

		// Does it have a layou manager?
		System.out.println("Layout: " + parent.getLayout().getClass());
	}

	// Declare a field label, required for @Focus
	Label label;

	@PostConstruct
	public void createControls(Composite parent) {
		label = new Label(parent, SWT.NONE);
		label.setText("A text....");
	}
	
	@Focus
	public void onFocus() {
		label.setFocus();
	}
	
	@PreDestroy
	public void dispose() {
		
	}
}
