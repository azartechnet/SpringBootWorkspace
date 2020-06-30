package com.xyz.Revisionspringbootcrudexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.Revisionspringbootcrudexample.model.Books;

public interface BooksRepository extends CrudRepository<Books,Integer>
{

}
