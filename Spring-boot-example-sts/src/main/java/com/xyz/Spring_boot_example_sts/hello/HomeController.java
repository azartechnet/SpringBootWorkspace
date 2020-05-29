package com.xyz.Spring_boot_example_sts.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String sayHi()
	{
		return "hai";
	}
}
