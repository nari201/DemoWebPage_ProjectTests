package Pages.AquaDNAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ConfigData.ConfigData;
import PageBase.PageClass;

public class HomePage extends PageClass {

	public void launchADNA() throws InterruptedException {

	//	driver.get("https://sww-web-staging.azurewebsites.net/");
		driver.get("https://lacsd-web-staging.azurewebsites.net/");

		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		Thread.sleep(2000);
	}

	public void loginADNAPage() throws InterruptedException {
		ConfigData config =new ConfigData();
		
		getUserName().sendKeys(config.getADNAUsername());
		loginButton().click();
		Thread.sleep(2000);
		userPassword().sendKeys(config.getADNAPassword());
		loginButton().click();
		Thread.sleep(3000);
		skipButton().click();
		
		Thread.sleep(2000);
	}

	protected WebElement getUserName() {

		return driver.findElement(By.xpath("//input[@id='inputEmail']"));
	}

	protected WebElement userPassword() {

		return driver.findElement(By.xpath("//input[@id ='inputPassword']"));

	}

	protected WebElement loginButton() {

		return driver.findElement(By.xpath("//span[@class ='button-text' and contains(text(),'Log In')]"));
	}
	
	protected WebElement skipButton() {
		return driver.findElement(By.xpath("//span[@class ='button-text' and contains(text(),'Skip')]"));
	}
	 public String getHomepageGreetingActual()
     {
		 WebElement homepageGreeting = driver.findElement(By.xpath("//div[@class='page-content dashboard']//b"));

         return homepageGreeting.getText();
     }

}
