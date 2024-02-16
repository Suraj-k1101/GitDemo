package testNgBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	//its proper way to write our test cases
	
	WebDriver driver;       //global variable
	
	@BeforeMethod
	public void Setup()
	{
		driver = new ChromeDriver();    //launch Browser
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void googleLogoTest()
	{
		boolean logo = driver.findElement(By.xpath("//img[@class = 'lnXdpd']")).isDisplayed();
		
		
	}
	
	@Test
	public void mailLinkTest()
	{
		
		boolean gmail = driver.findElement(By.xpath("//a[text() = 'Gmail']")).isDisplayed();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
