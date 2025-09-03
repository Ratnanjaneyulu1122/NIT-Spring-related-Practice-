package com.nareshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.dao.EmployeeDao;
import com.nareshit.model.Employee;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/addEmployee")
	public String addEmployee() {
		return "add_employee";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(HttpServletRequest request) {
		String id  =request.getParameter("emp_id");
		String name  =request.getParameter("emp_name");
		String address  =request.getParameter("emp_address");
		String salary  =request.getParameter("emp_salary");
		Employee emp = new Employee(Integer.valueOf(id), name, address, Double.valueOf(salary));
		employeeDao.saveEmpoloyee(emp);
		return "success";
	}
	
}
