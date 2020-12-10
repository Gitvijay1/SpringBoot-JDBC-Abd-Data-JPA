package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class JdbcRunner implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jt;

	@Override
	public void run(String... args) throws Exception {

		//static data
		//String sql="insert into product2 values(25,'kook',78.9)";
		//int count =jt.update(sql);
		//System.out.println("row"+count);
		
		//dinemic data
		
		//  String sql="insert into product2 values(?,?,?)"; int
		  //count=jt.update(sql,78,"ola",89); 
		  //System.out.println("row"+count);
		//update data
		/*String sql="update product2 set pname='pillo',cost=90 where pid=24";
		int count=jt.update(sql);
		System.out.println("result  "+count);
		 */
		
		//dinemic data
		/*String sql="update product2 set pname=?,cost=? where pid=25";
		int count=jt.update(sql,"sooj",35);
		System.out.println("result "+count);
		*/
		//delete record
		/*String sql="delete from product2 where pid=24";
		int count=jt.update(sql);
		System.out.println("result "+count);
		*/
		
		//delete with dynemic data
		String sql="delete from product2 where pid=?";
		int count=jt.update(sql,25);
		System.out.println("result "+count);
		
	}

}
