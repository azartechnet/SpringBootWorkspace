package com.xyz.NewPgpExampleP3REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	
	@Autowired
	private IProductService productService;
	
	@GetMapping(value="/product")
	public List<Product>getProduct()
	{
		//find all the Products
		List<Product>products=productService.findAll();
		//return the Product list
		return products;
	}
	
}
