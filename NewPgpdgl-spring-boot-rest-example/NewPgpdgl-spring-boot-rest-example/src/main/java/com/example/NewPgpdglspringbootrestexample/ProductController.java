package com.example.NewPgpdglspringbootrestexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	
	@Autowired
	private IProductService productService;
	//mapping the getProduct() method
	
	@GetMapping(value="/product")
	public List<Product>getProduct()
	{
		//find all the product
		List<Product>products=productService.findAll();
		//return the product list
		return products;
	}
}
