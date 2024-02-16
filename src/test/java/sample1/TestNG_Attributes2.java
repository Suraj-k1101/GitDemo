package sample1;

import org.testng.annotations.Test;

public class TestNG_Attributes2 {

	
	@Test(priority = 3,dependsOnMethods= "Registration",alwaysRun=true)
	public void Homepage()
	{
		
		System.out.println("Homepage");
		
	}
	
	@Test(priority = 2,invocationCount=3)
	public void login()
	{
		
		System.out.println("login page");
		
	}
	
	@Test(priority = 1) 
	public void Registration()
	{
	      	
		System.out.println("Registration page");
		
	}
	
	@Test(enabled=false)
	public void logout()
	{
		
		System.out.println("Logout");
		
	}
	
	
}
