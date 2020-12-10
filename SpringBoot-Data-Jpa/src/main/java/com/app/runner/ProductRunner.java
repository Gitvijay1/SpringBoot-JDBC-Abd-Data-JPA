package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;
@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
           Product p=new Product();
           p.setPid(84);
           p.setPname("byke");
           p.setCost(58.0);
          /* repo.save(p);
          System.out.println("DONE");
          
          //fatch all record 
          List<Product> list = repo.findAll();
          for(Product p1:list)
          {
        	  System.out.println(p1);
          }
          //delete record
          repo.deleteById(78);
          System.out.println("DELETE DONE");
          */
          //update record
          repo.save(p);
          repo.save(p);
          System.out.println("update done");
          
		
	}

}
