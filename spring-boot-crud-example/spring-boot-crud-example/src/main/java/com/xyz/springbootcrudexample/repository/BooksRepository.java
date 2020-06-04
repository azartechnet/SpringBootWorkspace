package com.xyz.springbootcrudexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.springbootcrudexample.model.Books;

public interface BooksRepository extends CrudRepository<Books,Integer>
{

}
