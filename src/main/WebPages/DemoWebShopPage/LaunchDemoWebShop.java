package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageBase.PageClass;

public class LaunchDemoWebShop extends PageClass {

	public void launchDemoWebShop() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
	
		
	}
	
	public String demoWebPageTitle() {
		
		WebElement demoWebPageTitle = driver.findElement(By.xpath("//img[@alt  ='Tricentis Demo Web Shop']"));
		
		return demoWebPageTitle.getText();
	}

	
}
