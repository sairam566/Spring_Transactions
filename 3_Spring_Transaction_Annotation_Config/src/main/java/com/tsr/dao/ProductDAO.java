package com.tsr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.tsr.bo.ProductBO;

@Repository
public class ProductDAO {
	
private final String SAVE_PRODUCT = "insert into products(name, price) values(?,?)";
	
	private JdbcTemplate jdbcTemplate;

	public ProductDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveProduct(ProductBO productBO) {
		KeyHolder holder = null;
		
		holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				PreparedStatement ps = con.prepareStatement(SAVE_PRODUCT, new String[] {"id"});
				ps.setString(1, productBO.getName());
				ps.setInt(2, productBO.getPrice());
				return ps;
			}
		},holder);
//		if(true) {
//			throw new NullPointerException();
//		}
		
		return holder.getKey().intValue();
	}
}
