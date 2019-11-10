package com.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{
	

}
