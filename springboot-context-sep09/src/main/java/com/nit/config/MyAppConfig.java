package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.model.Employee;

@Configuration
public class MyAppConfig {

	@Bean("emp2")
	public Employee emp() {
		Employee emp = new Employee();
		emp.setName("Murty");
		return emp;
	}
}
