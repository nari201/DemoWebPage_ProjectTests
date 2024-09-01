package googleTests;

import org.testng.annotations.Test;

import PageBase.PageClass;
import Pages.LaunchPage;
import TestBase.TestBase;

public class Google_Tests extends TestBase {

	@Test
	public void launchGoogleTest() throws ClassNotFoundException {

		launchTestSuite();
		LaunchPage launch = new LaunchPage();

		launch.launchGoogle();
		launch.launchTextBook();
	}

	public void launchTestBook() throws ClassNotFoundException {

		launchTestSuite();
		LaunchPage launch = new LaunchPage();

		launch.launchTextBook();
	}
}
