package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {   // [:this is the DataDriven from textng.xml file]
	
    WebDriver driver;          //global variable
    
    @Test  
    @Parameters({"environment","Browser","url","emailId"})      //parameters like Browser,url,emailId (Environment variables/configuration variables)
    public void YahooLoginTest(String environment,String Browser,String url,String emailId)  //provided initialization in method argument
    {  
    	if(Browser.equals("Chrome")) {
    		
    	 driver = new ChromeDriver();                                      //we can provide "n" numbers of parameters
    	 driver.get(url);
    	 driver.manage().window().maximize();
    	 
    	}
    	
    	else if(Browser.equals("Firefox")) {
    
    	   driver = new FirefoxDriver();                                      //we can provide "n" numbers of parameters
    	   driver.get(url);
    	   driver.manage().window().maximize();
    	    	 	
    		
    	}
    	
    	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);  //enter email id
    	driver.findElement(By.xpath("//input[@id='login-signin']")).click();              //click on Next button
    	
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
