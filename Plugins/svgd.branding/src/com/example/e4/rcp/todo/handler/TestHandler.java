package com.example.e4.rcp.todo.handler;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

public class TestHandler {
	
	@Execute
	  public void execute() {
	    System.out.println("TestHandler Called");
	  }


} 