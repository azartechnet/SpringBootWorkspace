package com.example.ASpringBootExample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class HomeController {

	
	@RequestMapping("/api")
	public ResponseEntity<String> sayHello()
	{
		return new ResponseEntity<String>("HelloWorld",HttpStatus.OK);
	}
	
}
