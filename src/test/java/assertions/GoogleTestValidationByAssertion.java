package assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestValidationByAssertion {

	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google","title is not matched");       //for validation of result
	}
	
	@Test
	public void googleLogoTest()
	{
		boolean logo = driver.findElement(By.xpath("//img[@class = 'lnXdpd']")).isDisplayed();
		
		Assert.assertTrue(logo);
		
	}
	
	@Test
	public void googleLinkTest()
	{
		boolean link = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		
	    Assert.assertEquals(link, true);	
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
}
