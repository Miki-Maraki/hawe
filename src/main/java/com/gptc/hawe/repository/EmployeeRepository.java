package com.gptc.hawe.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gptc.hawe.model.Employee;

@Repository
public class EmployeeRepository {  // repository class
	
	private List<Employee> employeeFromDatabase = Arrays.asList(new Employee(10, "King", 6500), new Employee(11, "Bob", 4500),
			              new Employee(15, "Black", 4200), new Employee(16, "Dani", 5500), new Employee(17, "George", 5000),
			               new Employee(12, "Bolton", 4000), new Employee(13, "Abe", 6000), new Employee(14, "Mike", 5700));
	
	public List<Employee> getAllEmployee(){ // method
		return employeeFromDatabase;
	}
	
	public List<Employee> getAllEmployeeStartsWithB(){
		return employeeFromDatabase;
	}
	
	List<Double> salaryFromDatabase;
	public List<Double> getAllSalary(){
		return salaryFromDatabase;
	}
	
	public List<Double> getAllSalaryLessThan5000(){
		return salaryFromDatabase;
	}

}
