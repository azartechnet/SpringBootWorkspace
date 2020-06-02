package com.xyz.springbooth2example.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.springbooth2example.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

	
	
}
