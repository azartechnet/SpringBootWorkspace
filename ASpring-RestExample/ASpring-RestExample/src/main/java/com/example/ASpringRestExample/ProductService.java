package com.example.ASpringRestExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService 
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product>products=new ArrayList<>();
		
		products.add(new Product(100,"mobile1","motoe4",100.00,6));
		products.add(new Product(101,"mobile2","motoe5",200.00,6));
		return products;
	}

}
