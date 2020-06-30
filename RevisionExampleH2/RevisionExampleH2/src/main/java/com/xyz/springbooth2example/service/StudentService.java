package com.xyz.springbooth2example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.springbooth2example.model.Student;
import com.xyz.springbooth2example.repository.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	StudentRepository studentRepository;
	
	//getting all Student records
	
	public List<Student>getAllStudent()
	{
		List<Student>students=new ArrayList<Student>();
		studentRepository.findAll().forEach(student->students.add(student));
		return students;
	}
	
	//getting a specific record
	
		public Student getStudentById(int id)
		{
			return studentRepository.findById(id).get();
		}
		public void saveOrUpdate(Student student)
		{
			studentRepository.save(student);
		}
}