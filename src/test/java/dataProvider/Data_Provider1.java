package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider1 {

	private static final String dataProvider = null;
	WebDriver driver;      //global variable
	
	@BeforeMethod
	public void Setup() throws InterruptedException
	{
		
		driver = new ChromeDriver();
		driver.get("https://login.wordpress.org/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
	}
	
	@Test (dataProvider = "TestData")
	public void login(String user, String Passwrd) throws InterruptedException
	{
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
		username.sendKeys(user);
		username.clear();
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
		password.sendKeys(Passwrd);
		password.clear();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		submit.click();
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name = "TestData")
	public String [] [] getData()
	{
		
		String [] [] d1 = {{"JasonSmith","json1234"},{"RyanRicks","ryan123"},{"CanYaman","cany1234"},{"ChrisHemsworth","chrishems12"}};
		
		return d1;
		
		
	}
	
	@AfterMethod
	public void Teardown()
	{
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
