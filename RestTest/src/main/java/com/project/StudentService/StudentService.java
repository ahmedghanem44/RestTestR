package com.project.StudentService;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.Student;
import com.project.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;
	
	public Student getStudentById(int id) {
		try {
			return (Student) repo.findById(id).get();
		}catch(Exception e) {
			System.out.println("No Student has been found");
			return new Student();
		}
	}
	public void deleteStudent(int id) {
		repo.deleteById(id);
		
	}
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	public List<Student> getAll(){
		return (List<Student>)repo.findAll();
	}
	
//	Criterion cr = Restrictions.gt("mark",30);
//	Criterion cr1 = Restrictions.like("fname","a%");
//	
//	LogicalExpression le = Restrictions.or(cr,cr1);
	
}
