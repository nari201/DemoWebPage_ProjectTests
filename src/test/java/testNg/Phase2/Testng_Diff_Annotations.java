package testNg.Phase2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Diff_Annotations {

	static WebDriver driver;

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

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void Beforemethod() {

		System.out.println("Before Method");

	}

	@Test(priority = 1, groups = { "G1" }) // Failed
	public void Test1() {

		System.out.println("Test1 & Priority 1");

		int n = 10;

		System.out.println(n / 0);

	}

	@Test(priority = 3, groups = { "G1" })
	public void Test2() {

		System.out.println("Priority 3 & Test2");
	}

	@Test(priority = 2, groups = { "G2" })
	public void Test4() throws InterruptedException {

		System.out.println("Priority =2 & Test4");

		System.out.println("Open URL");
		driver.get("https://www.hubspot.com/products/crm");
		Thread.sleep(2000);
	}

	@Test(priority = 2, dependsOnGroups = { "G1" }, groups = { "G2" })
	public void Test3() {

		System.out.println("Priority =2 2 & Test3");
	}

	@Test(priority = 4, dependsOnMethods = { "Test2" }, groups = { "G2" })
	public void BTest3() {

		System.out.println("Pripority 4 & BTest3");

	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("After mehod");
	}

	@AfterClass
	public void Afterclass() {

		System.out.println("After class ");

		driver.close();
		driver.quit();

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
