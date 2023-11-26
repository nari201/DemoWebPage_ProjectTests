package testNg.Phase2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_annotations {

	 WebDriver driver;
	
	 
	 public static void main(String[] args) {
		 
		 System.out.println("Main Method");
		 
	 }

	/**
	 * 
@BeforeSuite--set up sysytem property for chrome
@BeforeTest-- launch Browser
@BeforeClass-- login to app

@BeforeMethod-- enter URL
@Test-- Google title tests
@AfterMethod-- logout from app

@BeforeMethod-- enter URL
@Test-- Search test 2
@AfterMethod-- logout from app

@BeforeMethod-- enter URL
@Test -- Search test 3
@AfterMethod-- logout from app

@AfterClass-- Close browser
@AfterTest-- deleteAllCookies
	 */
	
	//
	
	@BeforeSuite
	public void Beforsuite() {
		System.out.println("Before Suite");
		
	}
	
	@BeforeTest
	public void Befortest() {
		System.out.println("Before test");
		
	}
	
	
	
	@BeforeClass
	public void Beforeclass() {
		
		System.out.println("Before Class");
		

		System.setProperty("webdriver.chrome.driver", "D://Selenium_Files//chromedriver_win32/chromedriver.exe");
			
		 driver = new ChromeDriver();		
		
		driver.get("https://www.hubspot.com/products/crm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	
	
	}
	
	@BeforeMethod
	public void Beforemethod() {
		
		System.out.println("Before Method");
	

		
	}
	
	
	@Test
	public void Test1() {
		
		System.out.println("Test1");
	}
	

	@Test
	public void Test2() {
		
		System.out.println("Test2");
	}
	

	@Test
	public void Test4() {
		
		System.out.println("Test4");
	}
	

	@Test
	public void Test3() {
		
		System.out.println("Test3");
	}
	

	@Test
	public void BTest3() {
		
		System.out.println("BTest3");

	
	}

	
	@AfterMethod
	public void Aftermethod() {
	System.out.println("After mehod");
	}
	

	@AfterClass
	public void Afterclass() {

	System.out.println("After class "+driver.getClass());
	
	driver.close();
	
	}
	

	@AfterTest
	public void Aftertest() {
	
		System.out.println("After test");
	}
	

	@AfterSuite
	public void Aftersuite() {
	
		System.out.println("After Suite");
	}
	
	
	
	

	
}
