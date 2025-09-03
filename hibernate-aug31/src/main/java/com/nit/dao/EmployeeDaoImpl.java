package com.nit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
		sess.save(emp);
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

	@Override
	public List<Employee> getAllEmployees() {
		Query<Employee> query = sess.createQuery("from Employee");
		List<Employee> emps = query.getResultList();
		return emps;

	}

	@Override
	public List<Employee> getAllEmployeesBasedOnSalary(Double salary) {
		Query<Employee> query = sess.createQuery("from Employee");
		List<Employee> emps = query.getResultList();

		return emps;
	}

	@Override
	public Long getEmployeeCount() {
		Query<Employee> query = sess.createQuery("select count(*)  from Employee");
		Long empCount = query.getResultCount();
		return empCount;
	}

	@Override
	public Double getMaxSalary() {
		Query<Double> query = sess.createQuery("select max(salary) from Employee");
		Double maxSalary = query.getSingleResultOrNull();
		return maxSalary;
	}

	@Override
	public List<Employee> getAllEmployeesUsingNativeQuery() {
		Query<Employee> query = sess.createNativeQuery("SELECT * FROM employee").addEntity(Employee.class);
		List<Employee> emps = query.getResultList();
		return emps;
	}

	@Override
	public List<Employee> getAllEmployeesUsingNativeQueryBasedOnSalary(Double salary) {
		Query<Employee> query = sess.createNativeQuery("SELECT * FROM employee where salary <= :salary").addEntity(Employee.class);
		query.setParameter("salary", salary);
		List<Employee> emps = query.getResultList();
		return emps;
	}

	@Override
	public List<Object[]> getAllEmployeeswithAttributesSQL() {
		Query<Object[]> query = sess.createNativeQuery("SELECT name,salary,id FROM employee");
		List<Object[]> result = query.list();
		return result;
	}

	@Override
	public List<Object[]> getAllEmployeeswithAttributesHQL() {
		Query<Object[]> query = sess.createQuery("SELECT id, salary FROM Employee");
		List<Object[]> result = query.list();
		return result;
	}

}
