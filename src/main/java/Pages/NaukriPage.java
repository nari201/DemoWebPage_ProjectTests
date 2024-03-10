package Pages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageBase.PageClass;

public class NaukriPage extends PageClass {

	WebDriverWait wait;

	public void launchNaukri() throws InterruptedException {

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		
		Thread.sleep(2000);
	}

	public void loginNaukri() throws InterruptedException {

		loginButton().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='head' and contains(text(),'Login')]")));

		passNaukriUsername().sendKeys(getLoginUser());
		passNaukriPassword().sendKeys(getLoginPassword());
		submitButton().click();
		
		System.out.println(driver.getTitle());

	}

	public WebElement loginButton() {
		return driver.findElement(By.xpath("//*[@id='login_Layer']"));
	}

	public WebElement passNaukriUsername() {
		return driver.findElement(By.xpath("//div[@class='form-row']//input"));
	}

	public WebElement passNaukriPassword() {
		return driver.findElement(By.xpath("//input[@type='password']"));
	}

	public WebElement submitButton() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}

	public void updateResume() throws InterruptedException {

		clickOnProfile();

		By updateProfileElement = By
				.xpath("//a[@href='/mnjuser/profile?id=&altresid' and contains(text(),'View & Update Profile')]");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(updateProfileElement));
		
		driver.findElement(updateProfileElement).click();
		
		Thread.sleep(2000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='attachCV']"));

		// Provide the path of the file to be uploaded
		String filePath = "C:/Users/SETTIPN/NS Notes/My Docs/Venkatesh_Resume.docx";
		File file = new File(filePath);

		Assert.assertNotNull(filePath);
		
		fileInput.sendKeys(file.getAbsolutePath());
		
		System.out.println(driver.getCurrentUrl());
	}

	public void clickOnProfile() {

		By profileElement = By.xpath("//img[@alt='naukri user profile img']");

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(profileElement));

		driver.findElement(profileElement).click();
	}

	public String ResumeTitle() {
		
		return driver.findElement(By.xpath("//div[@title='NareshSettipalli_JACOBS_CV.pdf']")).getText();
	}
	public void Logout() throws InterruptedException {

		clickOnProfile();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@title='Logout' and contains(text(),'Logout')]")).click();

	}
}
