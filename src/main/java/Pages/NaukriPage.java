package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageBase.PageClass;

public class NaukriPage extends PageClass {

	public void launchNaukri() throws InterruptedException {

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();

		Thread.sleep(3000);
	}

	public void loginNaukri() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='login_Layer']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='head' and contains(text(),'Login')]")));

		passNaukriUsername();
		passNaukriPassword();

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void passNaukriUsername() {

		WebDriverWait wait = new WebDriverWait(driver, null);

		WebElement username = driver
				.findElement(By.xpath("//label[@class='label' and contains(text(),'Email ID / Username')]"));
		username.sendKeys("settipalli.naresh201@gmail.com");

	}

	public void passNaukriPassword() {

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("ns@May08");

	}
}
