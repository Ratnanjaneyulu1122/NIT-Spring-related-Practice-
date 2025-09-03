package com.nit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import static com.nit.constant.Constant.*;

import com.nit.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeeRowMapper employeeRowMapper;
	
	@Override
	public List<Employee> getAllEmployees() {
		log.info("Entered into getAllEmployees() method...");
		return jdbcTemplate.query(GET_ALL, employeeRowMapper);
	}

	@Override
	public void deleteEmpoloyee(Long id) {
		jdbcTemplate.update(DELETE,id);
		log.info("employee is successfully deleted...");
	}

}
