package streetLightTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class GMAPS {

	static WebDriver driver;
	static GMAPS gmaps;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		 gmaps = new GMAPS();

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files//chromedriver_win32//chrome-win32/chrome.exe");
		System.out.println("Main");

		driver = new ChromeDriver();

		Actions act = new Actions(driver);
		driver.get("https://www.google.com/maps/");
		Thread.sleep(2500);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='eYqqWd']")).click();
		Thread.sleep(2000);

		gmaps.locationName();

	}

	public void locationName() throws InterruptedException, AWTException {

		// Starting
		driver.findElement(By.xpath("//*[@class='tactile-searchbox-input' and  "
				+ "@placeholder= 'Choose starting point, or click on the map...']")).clear();
		driver.findElement(By.xpath("//*[@class='tactile-searchbox-input' and "
				+ " @placeholder= 'Choose starting point, or click on the map...']")).sendKeys("nellore");

		Thread.sleep(2000);
		// Destination
		driver.findElement(
				By.xpath("//*[@class= 'tactile-searchbox-input' and @aria-controls = 'sbsg52']"))
				.clear();
		driver.findElement(
				By.xpath("//*[@class= 'tactile-searchbox-input' and @aria-controls = 'sbsg52']"))
				.sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		gmaps.TransportList();
  

	}
	
	public void TransportList() {
		
		driver.findElement(
				By.xpath("//*[@id='section-directions-trip-0']")).click();
		
	}

}
