package googleTests;

import org.openqa.selenium.devtools.v117.page.Page;
import org.testng.annotations.Test;

import PageBase.PageClass;
import Pages.GmailPage;
import Pages.LaunchGooglePage;
import TestBase.TestBase;

public class Google_Tests extends TestBase {

	@Test
	public void launchGoogleTest() throws ClassNotFoundException {

		launchTestSuite();
		LaunchGooglePage launch = new LaunchGooglePage();

		launch.launchGoogle();
		launch.launchTextBook();
	}
	
	
	public void launchTestBook() throws ClassNotFoundException {

		launchTestSuite();
		LaunchGooglePage launch = new LaunchGooglePage();

		launch.launchTextBook();
	}
}
