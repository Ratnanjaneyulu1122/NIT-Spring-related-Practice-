package com.nit.dao;

import java.util.List;

import com.nit.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	public void deleteEmpoloyee(Long id);
}
