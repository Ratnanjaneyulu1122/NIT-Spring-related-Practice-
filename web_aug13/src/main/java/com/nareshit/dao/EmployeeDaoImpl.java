package com.nareshit.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nareshit.model.Employee;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{

	private String GET_ALL="select * from student.employee";
	private RowMapper<Employee> rowMapper;
	
	public void setRowMapper(RowMapper<Employee> rowMapper) {
		this.rowMapper = rowMapper;
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return getJdbcTemplate().query(GET_ALL,rowMapper);
	}

}
