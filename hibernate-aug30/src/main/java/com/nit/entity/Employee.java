package com.nit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Long id;
	private String name;
	private String address;
	private Double salary;

	// for giving this constructor to use without entering the id to store the data
	public Employee(String name, String address, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
}
