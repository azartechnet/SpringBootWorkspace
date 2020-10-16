package com.xyz.Springbootexamplecrudnew.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.Springbootexamplecrudnew.model.Books;

public interface BooksRepository extends CrudRepository<Books,Integer> 
{

}
