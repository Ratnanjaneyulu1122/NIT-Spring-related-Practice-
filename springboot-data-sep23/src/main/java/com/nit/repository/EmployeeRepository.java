package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findBySalary(Double salary);

	List<Employee> findByNameAndSalary(String name, Double salary);

	@Query("select e from Employee e where e.salary <=10000")
	List<Employee> getLessSalariedEmployees();

	@Query("select e from Employee e where e.salary <= :sal")
	List<Employee> getLessSalariedEmployeesWithParamas(@Param("sal") Double salary);

	@Query(value = "select * from employee where salary <=10000", nativeQuery = true)
	List<Employee> getSalariedEmployees();

	@Query("select max(salary) from Employee")
	Double getMaxSalary();
}
