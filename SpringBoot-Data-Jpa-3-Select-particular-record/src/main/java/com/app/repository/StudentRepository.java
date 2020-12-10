package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Student;
import java.lang.String;
import java.util.List;
import java.lang.Double;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//select paticular record
	//select * from student2 where cource=?
	  //List<Student> findByScource(String scource);

	//select * from student2 where scource like ?
	//List<Student> findByScourceLike(String scource);
	
	//select * from student2 where scource Notlike ?
	//List<Student> findByScourceNotLike(String scource);

	//select number type
	//List<Student> findByFeeLessThan(Double fee);
	
	
	
	
	//write costmise query
	//select sname,scourc from studen2 where sid=?
	@Query("select sname,scource from student2 where sid=:id")
	Object[] getData(Integer id);

}
