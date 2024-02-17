package sample1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void Registration() {
	  
	  System.out.println("test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  System.out.println("before method");
	  System.out.println("before method will excecute before each and every method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  System.out.println("after method");
	  System.out.println("after method will excecute after each and every method");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("before class");
	  System.out.println("before class will excecute before each and every class");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("after class"); 
	  System.out.println("after class will excecute after each and every class");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("before test"); 
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("after test");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("before suite");
	  
	  
  }
  
  @Test
  public void login()
  {
	 
	  System.out.println("Login");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("after suite");
	  
  }

}
