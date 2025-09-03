package com.nit.test;

import java.util.Iterator;

import com.nit.dao.EmployeeDao;
import com.nit.dao.EmployeeDaoImpl;
import com.nit.entity.Employee;

public class HibernateTest {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();

		// for (Employee emp : dao.getAllEmployees())
		// System.out.println(emp);

		// Employee emp = new Employee((long) 2,"Vamsi", "Nampally", 70000d);
		// dao.saveEmployee(emp);
		// System.out.println("Save is successful!!");
		// for (Employee emp : dao.getAllEmployeesUsingNativeQuery())
		// System.out.println(emp);
		/*
		 * Employee emp = dao.getEmoployee(138L); System.out.println(emp);
		 * emp.setName("Murty-12345"); dao.updateEmployee(emp); emp =
		 * dao.getEmoployee(138L); System.out.println(emp);
		 */
		// dao.deleteEmployee(138L);
		// System.out.println("Deletion is successful!!");
		// for (Employee emp : dao.getAllEmployees())
		// System.out.println(emp);
		// for(Employee emp : dao.getAllEmployeesBasedOnSalary(15000d))
		// System.out.println(emp);
		// System.out.println("Count is : " + dao.getEmployeeCount());
		// System.out.println("Max Salary is : " + dao.getMaxSalary());
		 for(Employee emp : dao.getAllEmployeesUsingNativeQuery())
		 System.out.println(emp);
		//for(Employee emp : dao.getAllEmployeesUsingNativeQueryBasedOnSalary(20000d))
		 //System.out.println(emp);

		// for(Object[] attribs : dao.getAllEmployeeswithAttributesSQL())
		// System.out.println(attribs[0]+"\t"+attribs[1]+"\t"+attribs[2]);
		// for (Object[] attribs : dao.getAllEmployeeswithAttributesHQL())
		// System.out.println(attribs[0] + "/" + attribs[1]);
	}

}
