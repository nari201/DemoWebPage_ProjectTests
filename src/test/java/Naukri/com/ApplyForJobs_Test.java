package Naukri.com;

import org.testng.annotations.Test;

import Pages.NaukriApplyJobsPage;
import Pages.NaukriPage;
import TestBase.TestBase;

public class ApplyForJobs_Test extends TestBase {
	

	@Test 
	public void ApplyForJobs() throws InterruptedException, ClassNotFoundException {
		
		launchTestSuite();
		NaukriPage page = new NaukriPage();

		page.launchNaukri();
		page.loginNaukri();
		
		NaukriApplyJobsPage jobsPage = new NaukriApplyJobsPage();
		
		jobsPage.NaukriJobsList() ;
	}
}
