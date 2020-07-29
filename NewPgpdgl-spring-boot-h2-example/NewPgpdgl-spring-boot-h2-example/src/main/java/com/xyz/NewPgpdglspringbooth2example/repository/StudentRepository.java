package com.xyz.NewPgpdglspringbooth2example.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.NewPgpdglspringbooth2example.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{

}
