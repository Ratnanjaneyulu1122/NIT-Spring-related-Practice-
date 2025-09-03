package com.nit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.nit.entity.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	@Transactional(rollbackForClassName = { "java.lang.Exception" })
	public void saveEmployee(Employee emp) throws Exception {
		getHibernateTemplate().save(emp);
		throw new Exception();

	}

	@Override
	@Transactional(rollbackForClassName = { "java.lang.Exception" })
	public void updateEmployee(Employee emp) {
		getHibernateTemplate().update(emp);
	}

	@Override
	@Transactional(rollbackForClassName = { "java.lang.Exception" })
	public void deleteEmployee(Long id) {
		Employee emp = getEmoployee(id);
		getHibernateTemplate().delete(emp);
	}

	@Override
	public Employee getEmoployee(Long id) {
		Employee emp = getHibernateTemplate().get(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> getAllEmoployees() {
		Session sess = getHibernateTemplate().getSessionFactory().openSession();
		Query<Employee> query = sess.createQuery("from Employee");
		List<Employee> empList = query.getResultList();
		return empList;
	}

}
