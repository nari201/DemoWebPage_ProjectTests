package otherProjectsTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class UploadFileTest {

	public static WebDriver driver;
	
	@BeforeClass
	public void launchDriver() {
		
		 driver =  new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void fileUpload() throws InterruptedException {
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		
		Thread.sleep(5000);
		
		String path ="C:/Users/SETTIPN/AquaDNA/Test_Results/22827-Subcomponent name Issue_Retest Pass_Results.jpg";
		
		  // Find the element using its ID
        WebElement elementToWaitFor = driver.findElement(By.xpath("//input[@type='file']"));
        WebElement fileInput = driver.findElement(By.name("uploadfile_0"));

        // Set up FluentWait with a timeout of 30 seconds and polling interval of 2 seconds
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        fileInput.sendKeys(path);
        
     //   driver.navigate().refresh();
        // Use the until() method along with ExpectedConditions to wait for the element to be visible
        WebElement result = wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));

        Thread.sleep(5000);
        // Perform actions on the element after it becomes visible
  //      elementToWaitFor.click();
        
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		
	}


	@AfterClass
	public void CloseTestSite() {

		 driver.close();
		 driver.quit();
	}
	
}
