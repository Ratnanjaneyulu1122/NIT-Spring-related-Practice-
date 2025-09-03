package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.dao.EmployeeDao;
import com.nit.entity.Employee;

public class SpringHibernateTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao = ctx.getBean("dao", EmployeeDao.class);
		// Employee emp = new Employee("Murty12345","Napally",12000D);
		// dao.saveEmployee(emp);
		// System.out.println("Insertion is successful!!!");
		/*
		 * Employee emp = dao.getEmoployee(152L); System.out.println(emp);
		 * emp.setName("ABCDEFGHIJK"); dao.updateEmployee(emp); emp =
		 * dao.getEmoployee(152L); System.out.println(emp);
		 */
		// dao.deleteEmployee(152L);
		// System.out.println("Deletion is successful!!!");
		/*
		 * for(Employee emp : dao.getAllEmoployees()) System.out.println(emp);
		 */
		dao.getAllEmoployees().forEach(emp -> System.out.println(emp));

	}

}
