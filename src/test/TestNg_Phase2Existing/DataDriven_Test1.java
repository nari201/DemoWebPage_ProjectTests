package testNg.Phase2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDriven_Test1 {
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void beforeMethod() {
	
	System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
	
	driver = new ChromeDriver();		
	
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	

	Boolean radio=	driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
	
	if (radio=true) { 
		System.out.println("Male is selected");
	}
		else {
		
		 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		}
	
	}
	
	
	@Test
	public void Tes1(String firstname, String lastname, String email, String password)
	{
		System.out.println("Test1");
		
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname); // first name
	
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastname); // Last name
	
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email); // Email
	
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password); //Password
	
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(password); //Confirm Password
	
	}
	
	@AfterMethod
	public void afterMethod() {
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		driver.close();
		
	}
}
