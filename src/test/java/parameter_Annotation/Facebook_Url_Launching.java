package parameter_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Facebook_Url_Launching {
	
	//wanted to run facebook url on both browsers like:- Chrome and Firefox
	
	@Parameters("Browser")          //we use @parameters annotation for run our same test on different browsers
	@Test
	public void facebookloginpage(String URL) throws InterruptedException
	{
	  if(URL.equals("Chrome"))
	  {  
		  
		
	   WebDriver driver = new ChromeDriver();
   	   driver.get("https://en-gb.facebook.com/reg/");
   	   driver.manage().window().maximize();
   	   driver.manage().deleteAllCookies();
   	   Thread.sleep(2000);

	   System.out.println("Chrome browser title: "  +driver.getTitle());
	       
	   driver.close();
	   
	
	  }
	  
	  else if(URL.equals("Firefox"))
	  {  
		  
		
	   WebDriver driver = new FirefoxDriver();
   	   driver.get("https://en-gb.facebook.com/reg/");
   	   driver.manage().window().maximize();
   	   driver.manage().deleteAllCookies();
   	   Thread.sleep(2000);

	   System.out.println("Firefox browser title: "  +driver.getTitle());
	       
	   driver.close();
	    
	  }
	
	
	
	
	}	

}
