package com.xyz.Revisionspringbootcrudexample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.Revisionspringbootcrudexample.model.Books;
import com.xyz.Revisionspringbootcrudexample.repository.BooksRepository;


@Service
public class BookService {
	@Autowired
	BooksRepository booksRepository;
	
	//getting all books record by using the method findAll() of crudrepository
	
	public List<Books>getAllBooks()
	{
		List<Books>books=new ArrayList<Books>();
		booksRepository.findAll().forEach(books1->books.add(books1));
		return books;
	}
	
	//getting a specific record by using the method findById() of crudrepo
	
	public Books getBooksById(int id)
	{
		return booksRepository.findById(id).get();
	}
	
	//saving a specific record by using the method save() of crudrepo
	
	public void saveOrUpdate(Books books)
	{
		booksRepository.save(books);
	}
	
	//deleting a specific record by using the methods deleteById() of crudrepo
	
	public void delete(int id)
	{
		booksRepository.deleteById(id);
	}
	
	//updating a record
	
	public void update(Books books,int bookid)
	{
		booksRepository.save(books);
	}
	
}
