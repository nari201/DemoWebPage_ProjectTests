package PageBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import ConfigData.ConfigData;
import Pages.GmailPage;
import TestBase.TestBase;

public class PageClass extends TestBase {
	protected static WebDriver driver = TestBase.driver;

	public void LoginPage() throws InterruptedException {
		
		ConfigData config =new ConfigData();
		
		GmailPage page = new GmailPage();
		
		page.signIn(config.getUsername(), config.getPassword());
	}

	public void launchWebPage() {

		String gmailLink = "https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=AVQVeyz-fPMdyHjA0jN5bJLuqc5NtKuoEJaH-WRi7qCuItG2bcCpEkH2dCViyJ3hCGmmqODgpN6wqA&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S319061877%3A1700129936618848&theme=glif";
		
		driver.get(gmailLink);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
}
