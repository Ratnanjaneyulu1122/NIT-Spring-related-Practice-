package com.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Employee;

public class HibernateTest {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		Employee emp = new Employee(1, "Prakash", "JNTU", 50000D);
		sess.save(emp);
		tx.commit();
		sess.close();

	}

}
