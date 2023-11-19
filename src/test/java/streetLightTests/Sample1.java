package streetLightTests;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.core.sym.Name;
import com.github.dockerjava.api.model.Driver;

public class Sample1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		Sample1 sample1 = new Sample1();
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files//chromedriver_win32/chromedriver-win64/chromedriver.exe");
		System.out.println("Main");

		 driver = new ChromeDriver();

		Actions act = new Actions(driver);

		driver.get("https://stlpricing-prod.azurewebsites.net"); // https://jqueryui.com/droppable/

		Thread.sleep(2500);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class='form-control mt-1']")).sendKeys("Test");

		driver.findElement(By.xpath("//*[@placeholder='Enter password']")).sendKeys("Jacobs123#");

		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@type='text' and @class = 'mapboxgl-ctrl-geocoder--input']"))
				.sendKeys("Los Angles");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-lg rounded-0 mx-2 btn-outline-dark']")).click();

		driver.findElement(By.id("r11")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='options-toggle']")).click();

		driver.findElement(By.id("Counties")).click();

		// Map - Next button
		driver.findElement(
				By.xpath("//button[@class='btn btn-lg rounded-0 mx-2 btn-outline-dark' and contains(text(),'Next')]"))
				.click();

		
		sample1.solution();
		
	}

	public void solution() {
		
		Scanner name = new Scanner(System.in);
		
		String val= name.next();
		
		String s0 = "Active Transportation";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s4 = "";
		String s5 = "";
		String s6 = "";
		String s7 = "";
		String s8 = "";
		String s9 = "";
		String s10 = "";
		String s11 = "";
		String s12= "";
		
		if (s0.contains(val)) {
		driver.findElement(By.id("subscription-check-0")).click();
		}
		
		driver.findElement(By.id("subscription-check-1"));
		driver.findElement(By.id("subscription-check-2"));
		driver.findElement(By.id("subscription-check-3"));
		driver.findElement(By.id("subscription-check-4"));
		driver.findElement(By.id("subscription-check-5"));
		driver.findElement(By.id("subscription-check-6"));
		driver.findElement(By.id("subscription-check-7"));
		driver.findElement(By.id("subscription-check-8"));
		driver.findElement(By.id("subscription-check-9"));
		
		driver.findElement(By.id("subscription-check-10"));
		driver.findElement(By.id("subscription-check-11"));
		driver.findElement(By.id("subscription-check-12"));



	}

	public void mode() {

	}
}
