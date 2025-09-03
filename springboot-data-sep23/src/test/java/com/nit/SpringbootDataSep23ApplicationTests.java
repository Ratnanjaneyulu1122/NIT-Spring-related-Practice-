package com.nit;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.entity.Employee;
import com.nit.repository.EmployeeRepository;

@SpringBootTest
class SpringbootDataSep23ApplicationTests {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void testCase1() {
		List<Employee> emps = employeeRepository.findBySalary(25000d);
		emps.forEach(emp -> System.out.println(emp));
		Assertions.assertEquals(1, emps.size());
	}

	@Test
	void testCase2() {
		List<Employee> emps = employeeRepository.findByNameAndSalary("Ravi", 45000d);
		emps.forEach(emp -> System.out.println(emp));
		Assertions.assertEquals(2, emps.size());
	}

	@Test
	void testCase3() {
		List<Employee> emps = employeeRepository.getLessSalariedEmployees();
		emps.forEach(emp -> System.out.println(emp));
		Assertions.assertEquals(2, emps.size());
	}

	@Test
	void testCase4() {
		List<Employee> emps = employeeRepository.getLessSalariedEmployeesWithParamas(10000D);
		emps.forEach(emp -> System.out.println(emp));
		Assertions.assertEquals(2, emps.size());
	}

	@Test
	void testCase5() {
		List<Employee> emps = employeeRepository.getSalariedEmployees();
		emps.forEach(emp -> System.out.println(emp));
		Assertions.assertEquals(2, emps.size());
	}

	@Test
	void testCase6() {
		Double maxSsalary = employeeRepository.getMaxSalary();
		System.out.println("Max Salary : " + maxSsalary);
		Assertions.assertTrue(maxSsalary > 0);
	}

}
