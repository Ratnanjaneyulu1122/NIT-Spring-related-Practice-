package com.nit.test;

import com.nit.dao.EmployeeDao;
import com.nit.dao.EmployeeDaoImpl;
import com.nit.entity.Employee;

public class HibernateTest {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee emp = new Employee("vamsi", "Nampally", 70000d);
		dao.saveEmployee(emp);
		System.out.println("save employee is successful");
	}
}
