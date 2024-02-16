package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {

	//WE NEED TO CREATE OBJECT OF SoftAssert compulsory while using soft assert assertion:-
	
	//definition Assertion :- Assertion nothing but the comparison between Actual result or output and expected result or output
	
	SoftAssert sa = new SoftAssert();
	
	
	@Test
	public void sample()
	{
		
	 //1st test:-	
		String a = "Test Engineer";
		String b = "Test Engineer";
		sa.assertEquals(a, b);
		System.out.println("First soft assert");
		
	
	 //2nd test:-
		String c = "Test Engineer";
		String d ="Developer";
		sa.assertEquals(c, d);
		System.out.println("Second soft assert");
		
		
	  //3rd test:-	
		String e = "Scrum Master";
		String f = "Scrum Master";
		sa.assertEquals(e, f);
		System.out.println("Third soft assert");
		
		
		//we need to use assertALL() method for getting exception/error in soft assertion:-
		sa.assertAll();
		
		//even if any test fails then test case followed by that failed test, that following test will still get executed in soft assertion
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
