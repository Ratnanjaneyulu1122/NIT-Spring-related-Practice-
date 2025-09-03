package com.nit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Session sess = null;

	static {
		Configuration config = new Configuration();
		config.configure("/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		sess = factory.openSession();

	}

	@Override
	public void saveEmployee(Employee emp) {
		Transaction tx = sess.beginTransaction();
		sess.persist(emp);
		tx.commit();
	}

	@Override
	public void updateEmployee(Employee emp) {
		Transaction tx = sess.beginTransaction();
		sess.persist(emp);
		tx.commit();
	}

	@Override
	public void deleteEmployee(Long id) {
		Transaction tx = sess.beginTransaction();
		Employee emp = getEmployee(id);
		sess.remove(emp);
		tx.commit();
	}

	@Override
	public Employee getEmployee(Long id) {
		Employee emp = sess.get(Employee.class, id);
		return emp;
	}

}
