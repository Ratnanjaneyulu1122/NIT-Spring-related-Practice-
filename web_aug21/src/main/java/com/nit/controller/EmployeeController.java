package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.dao.EmployeeDao;
import com.nit.model.Employee;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/getAllEmployees")
	public String getAllEmployees(Model model){
		List<Employee> emps = employeeDao.getAllEmployees();
		model.addAttribute("emps", emps);
		return "show_employees";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(HttpServletRequest request){
		String name  =request.getParameter("emp_name");
		String address  =request.getParameter("emp_address");
		String salary  =request.getParameter("emp_salary");
		Employee emp = new Employee(name, address, Double.valueOf(salary));
		employeeDao.saveEmpoloyee(emp);
		return "redirect:/getAllEmployees";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployee(HttpServletRequest request){
		String id  =request.getParameter("emp_id");
		String name  =request.getParameter("emp_name");
		String address  =request.getParameter("emp_address");
		String salary  =request.getParameter("emp_salary");
		Employee emp = new Employee(Integer.valueOf(id),name, address, Double.valueOf(salary));
		employeeDao.updateEmpoloyee(emp);
		return "redirect:/getAllEmployees";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(){	
		return "add_employee";
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest request){	
		String id = request.getParameter("emp_id");
		employeeDao.deleteEmployee(Integer.valueOf(id));
		return "redirect:/getAllEmployees";
	}
	
	
	@RequestMapping("/editEmployee")
	public String editEmployee(HttpServletRequest request, Model model){	
		String id = request.getParameter("emp_id");
		Employee emp = employeeDao.getEmployee(Integer.valueOf(id));
		model.addAttribute("emp", emp);
		return "update_employee";
	}
	
	
	
	
	
	
	
	
	
	
	
}
