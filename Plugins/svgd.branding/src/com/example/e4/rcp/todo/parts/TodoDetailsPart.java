package com.example.e4.rcp.todo.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TodoDetailsPart {
	public TodoDetailsPart() {
		System.out.println("TodoDetailsPart");
	}

	

	@PostConstruct
	public void createUi(Composite parent, EMenuService service) {
		final Text text = new Text(parent, SWT.BORDER);
		text.setText("Hello"); 
		// Make use to use the correct ID
		// from the application model 
		MPopupMenu registerContextMenu = service.registerContextMenu(text,
				"svgd.branding.popupmenu.table");
	}



	@PreDestroy
	public void dispose() {

	}
}
