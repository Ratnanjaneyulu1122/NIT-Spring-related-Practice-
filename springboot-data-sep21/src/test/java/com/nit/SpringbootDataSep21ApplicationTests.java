package com.nit;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.entity.Employee;
import com.nit.repositary.EmployeeRepository;

@SpringBootTest
class SpringbootDataSep21ApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	//@Test
	void testGetAllEmployees() {
		List<Employee> emps = employeeRepository.findAll();
		emps.forEach(e -> System.out.println(e));
		Assertions.assertEquals(2, emps.size());
	}

	@Test
	void testSaveEmployee() {
		Employee emp = new Employee("Murty", "Ameerpet", 25000d, "murty@test.com");
		emp = employeeRepository.save(emp);
		Assertions.assertNotNull(emp.getId());
		Assertions.assertTrue(emp.getId() > 0);
	}

	// @Test
	void testGetEmployee() {
		Optional<Employee> optEmp = employeeRepository.findById(3L);
		Employee emp = null;
		if (optEmp.isPresent())
			emp = optEmp.get();
		System.out.println(emp);
		Assertions.assertNotNull(emp);
	}

	//@Test
	void testUpdateEmployee() {
		Optional<Employee> optEmp = employeeRepository.findById(3L);
		Employee emp = null;
		if (optEmp.isPresent()) {
			emp = optEmp.get();
			emp.setEmail("murty@nareshit.com");
		}
		emp = employeeRepository.save(emp);
		System.out.println(emp);
		Assertions.assertEquals("murty@nareshit.com", emp.getEmail());
	}
	//@Test
	void testDeleteEmployee() {
		employeeRepository.deleteById(3L);
		System.out.println("Deletion is successful!!");
	}
}
