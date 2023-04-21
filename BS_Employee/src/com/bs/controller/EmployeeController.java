package com.bs.controller;

import com.bs.model.service.EmployeeService;
import com.bs.view.MainView;

public class EmployeeController {

	private EmployeeService service=new EmployeeService();
	private MainView view=new MainView();
	
	public void mainMenu() {
		view.MainMenu();
	}
}
