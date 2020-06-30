package com.xyz.KrrSpringBooth2example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.KrrSpringBooth2example.model.Student;
import com.xyz.KrrSpringBooth2example.service.StudentService;



@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	//Creating a get Mapping that retrieves all the students details from the database
	
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
	
	//Creating a delete mapping that deletes a specific student
	
	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id")int id)
	{
		studentService.delete(id);
	}
	
	//Creating post mapping that post the Student details in the database
	/*{
	 * "id":"001",
	 * "age":"23",
	 * "name":"azar",
	 * "email":"azar@gmail.com"
      }*/
	@PostMapping("/student")
	private int saveStudent(@RequestBody Student student)
	{
		studentService.saveOrUpdate(student);
		return student.getId();
	}
}
