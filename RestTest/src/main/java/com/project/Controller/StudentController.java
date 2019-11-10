package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.Student;
import com.project.StudentService.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/getAll")
	public @ResponseBody List<Student> getAllStuents(){
		return service.getAll();
	}
	
	@DeleteMapping("/delet/{id}")
	public @ResponseBody String remove(@PathVariable int id) {
		service.deleteStudent(id);
		return "The student has been deleted";
	}
	
	@PostMapping("/add")
	public @ResponseBody Student add(@RequestBody Student st) {
		return service.addStudent(st);
	}
	
	@GetMapping("/get/{id}")
	public @ResponseBody Student getstudent(@PathVariable int id) {
		return service.getStudentById(id);
	}

}
