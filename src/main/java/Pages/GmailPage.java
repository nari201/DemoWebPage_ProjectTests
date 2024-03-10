package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import ConfigData.ConfigData;
import PageBase.PageClass;

public class GmailPage extends PageClass {

	private WebElement asEmail = driver.findElement(By.xpath("//input[@type ='email']"));
	private WebElement asPassword = driver.findElement(By.xpath("//input[@type='password']"));
	private WebElement nextButton = driver.findElement(By.xpath("//button//span[contains(text(),'Next')]")); //// span[text()='Next']
	private static WebElement signInTitle = driver.findElement(By.xpath("//span[text()='Sign in']"));

	public static void launchGmailPage() throws InterruptedException {

		while (signInTitle.getText().equals("Sign in")) {

			Assert.assertEquals(signInTitle.getText(), "Sign in");
			break;
		}

	}

	public void signIn() throws InterruptedException {
		
		ConfigData config =new ConfigData();
		
		String userName = config.getLoginUser();
		String password = config.getLoginPassword();
		
		asEmail.sendKeys(userName);
		nextButton.click();
		
	//	Thread.sleep(3000);
	//	asPassword.sendKeys(password);
	//	nextButton.click();

	}

}
