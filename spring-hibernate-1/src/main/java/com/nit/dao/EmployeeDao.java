package com.nit.dao;

import java.util.List;

import com.nit.entity.Employee;

public interface EmployeeDao {
	void saveEmployee(Employee emp) throws Exception;

	void updateEmployee(Employee emp);

	void deleteEmployee(Long id);

	Employee getEmoployee(Long id);

	List<Employee> getAllEmoployees();
}
