package Naukri.com;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.NaukriApplyJobsPage;
import Pages.NaukriPage;
import TestBase.TestBase;

public class NaukriTest extends TestBase {

	@Test(priority = 1)
	public void LoginTest() throws ClassNotFoundException, InterruptedException {

		launchTestSuite();
		NaukriPage page = new NaukriPage();

		page.launchNaukri();
		page.loginNaukri();

		assertNotNull(driver.getTitle());
	}

	@Test(priority = 2, dependsOnMethods = "LoginTest()")
	public void UpdateResumeTest() throws ClassNotFoundException, InterruptedException {
		NaukriPage page = new NaukriPage();

		page.updateResume();
		
	//	assertEquals(page.ResumeTitle(),"NareshSettipalli_JACOBS_CV.pdf");
	//	page.Logout();
	}
	
	@Test (priority = 3,dependsOnMethods = "LoginTest()")
	public void ApplyForJobs() throws InterruptedException {
		NaukriApplyJobsPage jobsPage = new NaukriApplyJobsPage();
		
		jobsPage.NaukriJobsList() ;
	}
}
