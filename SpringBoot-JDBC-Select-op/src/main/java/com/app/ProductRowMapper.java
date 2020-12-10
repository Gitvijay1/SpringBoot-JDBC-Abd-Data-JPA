package com.app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.app.model.product;

@Component
public class ProductRowMapper implements RowMapper<product>{

	@Override
	public product mapRow(ResultSet rs, int rowNum) throws SQLException {
        product p=new product();
        p.setPid(rs.getInt("pid"));
        p.setPname(rs.getString("pname"));
        p.setCost(rs.getDouble("cost"));
		
		return p;
	}

}
