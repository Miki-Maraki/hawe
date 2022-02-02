package com.gptc.hawe.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gptc.hawe.model.Employee;
import com.gptc.hawe.repository.EmployeeRepository;

//here create all methods

@Service  // used at class level
public class EmployeeService {

	@Autowired // enables automatic dependency injection
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmployee();
	}

	public List<Employee> getAllEmployeeStartsWithB() {
		List<Employee> employee = employeeRepository.getAllEmployee();
		List<Employee> employeeStartsWithB = employee.stream().filter(n -> n.getName().startsWith("B"))
				.collect(Collectors.toList());
		return employeeStartsWithB;
	}

	public List<Employee> getAllSalaryLessThan5000() {
		List<Employee> employee = employeeRepository.getAllEmployee();
		
		List<Double> salaryLessThan5000 = employee.stream().filter(e -> e.getSalary() < 5000)
				.map(e -> e.getSalary()).collect(Collectors.toList());
		System.out.println(salaryLessThan5000);
		
		List<Employee> employeeSalaryLessThan5000 = employee.stream().filter(e -> e.getSalary() < 5000)
				.collect(Collectors.toList());

		return employeeSalaryLessThan5000;
	}

}
