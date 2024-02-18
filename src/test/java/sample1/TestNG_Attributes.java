package sample1;

import org.testng.annotations.Test;

public class TestNG_Attributes {

	@Test(priority = 3)
	public void Homepage()
	{
		
		System.out.println("Homepage");
		
	}
	
	@Test(priority = 2, description = "Mobile Number is Added")
	public void login()
	{
		
		System.out.println("login page");
		System.out.println("Its a login page");
		
		
		
		
	}
	
	@Test(priority = 1,timeOut = 2000) 
	public void Registration()
	{
		
		System.out.println("Registration page");
		System.out.println("It's Registration page");
		
	}
	
	@Test(priority = 4)
	public void logout()
	{
		
		System.out.println("Logout");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
