package com.xyz.springbooth2example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.springbooth2example.model.Student;
import com.xyz.springbooth2example.service.StudentService;


@RestController
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	//Creating a get mapping retrieve all the student details
	
	@GetMapping("/student")
	private List<Student>getAllStudent()
	{
		return studentService.getAllStudent();
	}
	//Creating a getMapping that retrieves the details of a specific student
		@GetMapping("/student/{id}")
		private Student getStudent(@PathVariable("id")int id)
		{
			return studentService.getStudentById(id);
		}
	@PostMapping("/student")
	private int saveStudent(@RequestBody Student student)
	{
		studentService.saveOrUpdate(student);
		return student.getId();
	}
	
}
