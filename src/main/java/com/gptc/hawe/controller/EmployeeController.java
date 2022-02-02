package com.gptc.hawe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gptc.hawe.model.Employee;
import com.gptc.hawe.service.EmployeeService;

//create controller to display the result
// steps for calling class in the app is as follows
//1st= controller/web layer 2nd = service/business layer 3rd= repository/persistence layer 4th = DB layer/data call(connect)

@RestController
public class EmployeeController {
	
	@Autowired//marks and implicitly injects the variables for which needs to find the correct matching object
	private EmployeeService employeeService;//Using the Dependency Injection
	// private EmployeeService employeeService = new EmployeeService(); // with out the Dependency Injection
	
	
	@GetMapping("/Employee")    //Open the browser and invoke the URL http://localhost:8080/Employee
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/EmployeeB")
	public List<Employee> getAllEmployeeStartsWithB(){
		return employeeService.getAllEmployeeStartsWithB();
		
	}

}
