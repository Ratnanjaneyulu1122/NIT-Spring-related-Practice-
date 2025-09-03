package com.nareshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.dao.EmployeeDao;
import com.nareshit.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/getAllEmployees")
	public String getAllEmployees(Model model) {
		List<Employee> employees = employeeDao.getAllEmployees();
		model.addAttribute("emps", employees);
		return "show_employees";
	}
}
