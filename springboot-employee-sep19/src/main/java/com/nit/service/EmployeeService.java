package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.EmployeeDao;
import com.nit.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void deletelEmployee(Long id){
		employeeDao.deleteEmpoloyee(id);
	}
}
