package com.xyz.KrrSpringBootCrudExample.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.KrrSpringBootCrudExample.model.Books;

public interface BooksRepository extends CrudRepository<Books,Integer> 
{

}
