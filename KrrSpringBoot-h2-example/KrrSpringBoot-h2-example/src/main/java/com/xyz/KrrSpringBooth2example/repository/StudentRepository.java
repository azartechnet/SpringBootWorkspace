package com.xyz.KrrSpringBooth2example.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.KrrSpringBooth2example.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> 
{

}
