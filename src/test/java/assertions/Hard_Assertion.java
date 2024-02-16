package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {

	//definition Assertion :- Assertion nothing but the comparison between Actual result or output and expected result or output
	
	@Test 
	public void Sample()
	{
	  // 1st test:-	
		String a = "I Am Test Engineer";
		String b = "I Am Test Engineer";
		Assert.assertEquals(a, b);
		System.out.println("First hard assert");
		
	 //2nd test:-	
		String c = "Test Engineer";
		String d = "Developer";
		Assert.assertEquals(c, d);
		System.out.println("Second hard assert");
		
	//3rd test:-	
		String e = "Scrum Master";
		String f = "Scrum Master";
		Assert.assertEquals(e, f);
		System.out.println("Third hard assert");
		
		//in Hard Assert if any test case failed then the test cases which followed after that failed test case will not get executed
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
