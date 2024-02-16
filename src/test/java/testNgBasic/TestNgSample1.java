package testNgBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSample1 {
	//its Standard way to write test cases
	//PreCondition Annotations---and its starts with @Before
	//each annotation should be associated with atleast one method
	
	@BeforeSuite     //(1st executed)
	public void setup()
	{
		
		System.out.println("@BeforeSuite----setup System property for chrome");
		
	}
	
	@BeforeTest       //(2nd executed)
	public void launchBrowser()
	{
		
		System.out.println("@BeforeTest------launch the Browser");
		
	}
	
	@BeforeClass       //(3rd executed) 
	public void login()
	{
		
		System.out.println("@BeforeClass----login to the application");
		
	}
	
	@BeforeMethod         //(4th executed)
	public void enterUrl()
	{
		
		System.out.println("@BeforeMethod----enter URL");
		
	}
	
//-----------------------------------------------------------------------------------------------------------------	
	//TEST CASES starting with @Test (so here we write only (one @Test annotation = 1 test case)
	
	@Test         //(testCase no - 1)
	public void googleTitleTest()
	{
		
		System.out.println("@Test----Google Title Test");
		
	}
	
	@Test      // (testCase no -2 )
	public void searchTest()
	{
		
		System.out.println("@Test----search test");
		
	}
	
	@Test      //(testCase no - 3)
	public void googlelogoTest()
	{
		
		System.out.println("@Test----Google logo test");
		
	}
	
	
//----------------------------------------------------------------------------------------------------------------
	
	//PostConditions Annotations starting with @After annotation
	
	@AfterMethod         //(6th executed)
	public void logout()
	{
		
		System.out.println("@AfterMethod------logout from the application");
		
	}
	
	@AfterClass           //(7nth executed)
	public void deleteALLCookies()
	{
		
		System.out.println("@AfterClass----delete all cookies");
		
	}
	
	@AfterTest           //(8th executed)
	public void closeBrowser()
	{
		
		System.out.println("@AfterTest----close the Browser");
		
	}
	
	@AfterSuite         //(9th executed)
	public void generateTestReport()
	{
		
		System.out.println("@AfterSuiteGenerate Test Report");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
