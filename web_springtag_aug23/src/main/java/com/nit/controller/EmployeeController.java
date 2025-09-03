package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/showEmployee")
	public String showEmployeePage(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		return "add_employee";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee emp, Model model) {
		model.addAttribute("emp", emp);
		return "success";
	}
}
