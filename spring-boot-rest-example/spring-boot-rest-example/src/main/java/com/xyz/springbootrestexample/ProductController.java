package com.xyz.springbootrestexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	
	@Autowired
	private IProductService productService;
	//mapping the getProduct() method to /product
	
	@GetMapping(value="/product")
	public List<Product>getProduct()
	{
		//find all the Products
		List<Product>products=productService.findAll();
		//retrun the product list
		return products;
	}
	
}
