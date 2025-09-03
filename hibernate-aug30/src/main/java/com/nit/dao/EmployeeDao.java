package com.nit.dao;

import com.nit.entity.Employee;

public interface EmployeeDao {
	void saveEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void deleteEmployee(Long id);

	Employee getEmployee(Long id);

}
