package com.nit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.model.Employee;

@SpringBootTest
class SpringbootContextSep09ApplicationTests {

	@Autowired
	@Qualifier("emp2")
	private Employee emp;

	@Test
	void testTocreateWhetherObjectOrNot() {
		System.out.println(emp);
	}

}
