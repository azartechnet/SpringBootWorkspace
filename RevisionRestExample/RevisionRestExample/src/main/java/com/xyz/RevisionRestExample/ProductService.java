package com.xyz.RevisionRestExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService 
{

	@Override
	public List<Product> findAll() 
	{
	   //Creating an Object of ArrayList
		ArrayList<Product> products=new ArrayList<Product>();
		//Adding products to the list
		
		products.add(new Product(100,"mobile1","motoe4",10000,6));
		products.add(new Product(101,"mobile2","motoe5",30000,3));
		products.add(new Product(102,"mobile3","motoe6",20000,5));
		products.add(new Product(103,"mobile4","motoe7",40000,4));
		
		//Return the list of products
		return products;
	}

	
	
}
