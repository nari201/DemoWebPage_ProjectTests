package TestBase;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

import ConfigData.ConfigData;
import PageBase.PageClass;
import Pages.GmailPage;

public class TestBase extends ConfigData {

	protected static WebDriver driver;
	public String currentUsername;
	public String currentUserPassword;

	String currentUser;
	String password;

	String testEnvURL;

	public void launchTestSuite() {
		
		String browser = getTestBrowser();

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "edge":
			System.setProperty("webdriver.chrome.driver",
					"C://Users//SETTIPN//Selenium_Files//edgedriver_win/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			throw new NotImplementedException("Browser not Supported");
		}
	}

	@AfterClass
	public void CloseTestSite() {

	//	driver.close();
	//	driver.quit();
	}

	/*
	 * public void afterClassTearDown() {
	 * 
	 * CloseTestSite();
	 * 
	 * // driver will be null if this is a backed test - no ui to capture (and
	 * possibly other scenarios?) /* if (driver != null &&
	 * TestContext.CurrentContext.Result.Outcome.Status == TestStatus.Failed) {
	 * captureScreenshot(TestContext.CurrentContext.Test.Name); }
	 * 
	 * if (driver != null) { CloseTestSite(); } }
	 **/
	/*
	 * final int siteLoadMaxTries = 3; int tryCount = 0; // String
	 * testEnvironmentUrl = testSiteURL();
	 * driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); while
	 * (tryCount < siteLoadMaxTries) { tryCount++; try {
	 * driver.navigate().to(testEnvURL); } catch (Exception e) { // TODO: handle
	 * exception } }
	 * driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS); //driver.Url
	 * = testEnvironmentUrl;
	 * 
	 * //LoginPage loginPage = CreatePage<LoginPage>();
	 * //loginPage.waitForDynamicContentLoad();
	 **/

	public void loginAsDefaultUser() {
		ConfigData config = new ConfigData();

		this.currentUsername = config.getUsername();
		this.currentUserPassword = config.getPassword();
	}

	public void loginAsUser(String username, String password) {

	}

}