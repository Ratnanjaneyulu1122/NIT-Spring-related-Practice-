package com.nit.dao;

import java.util.List;

import com.nit.entity.Employee;

public interface EmployeeDao {
	void saveEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void deleteEmployee(Long id);

	Employee getEmployee(Long id);

	List<Employee> getAllEmployees();

	List<Employee> getAllEmployeesBasedOnSalary(Double salary);

	Long getEmployeeCount();

	Double getMaxSalary();

	List<Employee> getAllEmployeesUsingNativeQuery();

	List<Employee> getAllEmployeesUsingNativeQueryBasedOnSalary(Double salary);

	List<Object[]> getAllEmployeeswithAttributesSQL();

	List<Object[]> getAllEmployeeswithAttributesHQL();

}
