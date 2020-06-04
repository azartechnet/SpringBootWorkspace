package com.xyz.springbootcrudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.springbootcrudexample.model.Books;
import com.xyz.springbootcrudexample.service.BooksService;

//mark class as controller
@RestController
public class BooksController {

	//autowire the BookService class
	@Autowired
	BooksService bookService;
	
	//Creating a get Mapping that retrieves all the books details from the db
	@GetMapping("/book")
	private List<Books>getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	//Creating a get mapping that retrieves the detail of a specific book
	
	@GetMapping("/book/{bookid}")
	private Books getBooks(@PathVariable("bookid")int bookid)
	{
		return bookService.getBooksById(bookid);
	}
	//Creating a delete mapping that deletes a specfic book
	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid")int bookid)
	{
		
		bookService.delete(bookid);
		
	}
	
	//Creating post mapping that post the book details in the database
	
	@PostMapping("/books")
	private int saveBook(@RequestBody Books books)
	{
		bookService.saveOrUpdate(books);
		return books.getBookid();
	}
	
	//Creating put mapping that update the book details
	
	@PutMapping("/books")
	private Books update(@RequestBody Books books)
	{
		bookService.saveOrUpdate(books);
		return books;
	}

	
}
