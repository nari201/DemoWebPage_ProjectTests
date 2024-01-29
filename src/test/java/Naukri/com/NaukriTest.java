package Naukri.com;

import org.testng.annotations.Test;

import Pages.NaukriPage;
import TestBase.TestBase;

public class NaukriTest extends TestBase {

	@Test
	public void LoginTest() throws ClassNotFoundException, InterruptedException {
	
		launchTestSuite();
		
		NaukriPage page = new NaukriPage();
		
		page.launchNaukri();
		page.loginNaukri();
		
		
	}
}
