package com.xyz.springboottestexample;





import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestExampleApplicationTests {

	@Test
	void contextLoads() 
	{
   
	}
	@Test
	public void testFindSquareroot() {
		Arithmetic instance = new Arithmetic();
		double expResult = 2.5;
		double result = instance.findSquareroot(6.25); 
		//assertEquals("**",expResult, result,0.0);
		assertEquals("**",expResult,result,0.0);
		
		
		}

}
