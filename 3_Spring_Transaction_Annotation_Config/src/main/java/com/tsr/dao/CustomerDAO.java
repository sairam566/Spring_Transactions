package com.tsr.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.tsr.bo.CustomerBO;

@Repository
public class CustomerDAO {
	
	private final String SAVE_CUSTOMER = "insert into customer(name, dob, gender) values(?,?,?)";
	
	private JdbcTemplate jdbcTemplate;

	public CustomerDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveCustomer(CustomerBO customerBO) {
		KeyHolder holder = null;
		
		holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				PreparedStatement ps = con.prepareStatement(SAVE_CUSTOMER, new String[] {"CustomerNo"});
				ps.setString(1, customerBO.getName());
				ps.setDate(2, new Date(customerBO.getDob().getTime()));
				ps.setString(3, customerBO.getGender());
				return ps;
			}
		},holder);
		return holder.getKey().intValue();
	}
}
