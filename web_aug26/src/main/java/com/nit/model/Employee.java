package com.nit.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Integer id;
	@NotEmpty
	@Size(min = 5, max = 50)
	private String name;
	@NotEmpty
	@Size(min = 5, max = 50)
	private String address;
	@Email
	private String email;
	@Positive
	private Double salary;

	public Employee(String name, String address, Double salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

}
