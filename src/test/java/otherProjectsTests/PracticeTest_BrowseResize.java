package otherProjectsTests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class PracticeTest_BrowseResize {

	public static WebDriver driver =new ChromeDriver();
	
	@Test
	public void BrowserResize() {
		/*
		 * 1. We know that we can maximize or minimize the browser window. However, we need to test the responsiveness of the UAT in different browser screen sizes. Can this be done in Selenium?
		   A).Yes, this can be done in Selenium. We can resize the browser window to a particular dimension using the setSize() method. We can customize the screen size by bypassing the desired width and height of the screen size in the parameters.

		 */
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/old/chromedriver.exe");
	
		int width = 1000;
		int height = 1200;
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
		
		//method and capability commands can also be used to achieve the same result. Use windows.resizeTo() method along with Javascript executor.
		
		((JavascriptExecutor)driver).executeScript("window.resizeTo(600,400);");
	}
	
	@Test
	public void ALT_SHIFT_KEYS() {
		
		Actions actions = new Actions(driver);
		
		driver.manage().window().maximize();
		
		actions.keyDown(Keys.ALT).keyDown(Keys.SHIFT).keyDown(Keys.CONTROL);
		
	}
	@AfterClass
	public void CloseTestSite() {

		 driver.close();
		 driver.quit();
	}
}
