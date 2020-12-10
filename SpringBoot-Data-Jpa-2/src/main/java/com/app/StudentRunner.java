package com.app;

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
		repo.save(new Student(101,"raja","java",700.0));
		repo.save(new Student(102,"pooja","python",800.0));
		repo.save(new Student(103,"rukhi","php",900.0));
		repo.save(new Student(104,"kaushal","html",500.0));
		System.out.println("save done");




	}

}
