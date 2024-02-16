package groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest {

	

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
	
	@Test(groups = "TitleTest")
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(groups = "LogoTest")
	public void googleLogoTest()
	{
		boolean logo = driver.findElement(By.xpath("//img[@class = 'lnXdpd']")).isDisplayed();
		
		
	}
	
	@Test(groups = "LinkTest")
	public void mailLinkTest()
	{
		
		boolean gmail = driver.findElement(By.xpath("//a[text() = 'Gmail']")).isDisplayed();
		
	}
	
	@Test(groups = "Test")
	public void test1()
	{
		
		System.out.println("test1");
		
	}
	
	@Test(groups = "Test")
	public void test2()
	{
		
		System.out.println("test2");
		
	}
	
	@Test(groups = "Test")
	public void test3()
	{
		
		System.out.println("test3");
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
}
