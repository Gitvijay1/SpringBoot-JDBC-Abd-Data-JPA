package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.app.model.product;
@Component
public class ProductRunner implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jt;

	@Override
	public void run(String... args) throws Exception {
		//fatch all record
		/*String sql="SELECT* FROM PRODUCT2";
		ProductRowMapper mapper=new ProductRowMapper();

		List<product> list = jt.query(sql, mapper);
		for(product p:list) {
			System.out.println(p);
			*/
		
		//fatch one row
		/*String sql="select pid, pname, cost from product2 where pid=?";
		ProductRowMapper mapper=new ProductRowMapper();
		product queryForObject = jt.queryForObject(sql,mapper,79);
		System.out.println(queryForObject);
		*/
		
		//fatch all data by lamda expression
		/*String sql="SELECT * FROM PRODUCT2";
		List<product> list = jt.query(sql, (rs,count)->{
			product p=new product();
			p.setPid(rs.getInt("pid"));
			p.setPname(rs.getString("pname"));
			p.setCost(rs.getDouble("cost"));
			return p;
		});
		for(product p:list)
		{
			System.out.println(p);
		}*/
		
		//fatch one record by lamda expression
		String sql="select pid,pname,cost from product2 where pname=?";
		product queryForObject = jt.queryForObject(sql, (rs,count)->{
			  product p=new product();
			  p.setPid(rs.getInt("pid"));
			 p.setPname(rs.getString("pname"));
			 p.setCost(rs.getDouble("cost"));
			return p;
		},"pen");
		System.out.println(queryForObject);
		}
	}



