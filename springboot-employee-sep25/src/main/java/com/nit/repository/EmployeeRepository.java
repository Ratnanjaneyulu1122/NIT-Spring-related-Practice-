package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	// List<Employee> findByName(String empName);

	// List<Employee> getAllEmployeesOrderByAddress();
	List<Employee> findByName(String empName);

	List<Employee> findByNameStartingWith(String prefix);

	List<Employee> findByNameLike(String prefix);

	List<Employee> findByNameAndSalaryLessThan(String name, Double salary);

	List<Employee> findByNameOrSalaryLessThan(String name, Double salary);

	List<Employee> findBySalaryBetween(Double start, Double end);

	@Query("select e from Employee e order by e.address desc")
	List<Employee> getAllEmployeesOrderByAddress();

	@Query(value = "SELECT salary FROM employee WHERE salary = (SELECT MAX(salary) FROM employee emp WHERE salary < (SELECT MAX(salary) FROM employee))", nativeQuery = true)
	Double getSecondMaximumSalary();
}
