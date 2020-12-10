package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Student;
import com.app.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {

         //List<Student> list = repo.findByScource("java");
         //list.forEach(System.out::println);

		
		//List<Student> list = repo.findByScourceLike("%java%");
         //list.forEach(System.out::println);
		
		//List<Student> list = repo.findByScourceNotLike("%java%");
       // list.forEach(System.out::println);
		
		//List<Student> list = repo.findByFeeLessThan(900.0);
		//list.forEach(System.out::println);
		
		
		
		Object[] data =(Object[])repo.getData(103);
		System.out.println(data[0]+" "+data[1]);
	}

}
