package testNg.Phase2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parametertest {

	WebDriver driver;
	
	@Test
	@Parameters({"Url","Firstname","lastName","Email","Password"})
	public void Parameters(String Url, String FirstName, String LastName, String Email, String Password) {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");

		 driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Url);
		
		
		driver.findElement(By.xpath("//input[@name='FirstName']")).clear();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(FirstName); // first name
		
		driver.findElement(By.xpath("//input[@name='LastName']")).clear();
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(LastName); // Last name
		
		driver.findElement(By.xpath("//input[@name='Email']")).clear();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(Email); // Email
		
		driver.findElement(By.xpath("//input[@name='Password']")).clear();
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password); //Password
		
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(Password); 
		
		
	}
	
}