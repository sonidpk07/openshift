package com.sandbox.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sandbox.model.Employee;

@RestController
public class HomeController {

	ArrayList<Employee> emplist = new ArrayList<>();

	@RequestMapping("/")
	public String home() {
		return "Welcome to Spring Boot, Spring Rest with OpenShift application";
	}

	@RequestMapping(name = "/getAllEmployees", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {

		Employee emp1 = new Employee();
		emp1.setId("0");
		emp1.setFname("John");
		emp1.setLname("Oetting");
		emp1.setAge(33);
		emp1.setDepartment("Communications");
		emplist.add(emp1);

		Employee emp2 = new Employee();
		emp2.setId("1");
		emp2.setFname("Ken");
		emp2.setLname("Thompson");
		emp2.setAge(81);
		emp2.setDepartment("Computer Science");
		emplist.add(emp2);
		
		return emplist;
	}
}
