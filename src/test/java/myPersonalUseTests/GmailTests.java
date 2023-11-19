package myPersonalUseTests;

import org.testng.annotations.Test;

import PageBase.PageClass;
import Pages.GmailPage;
import TestBase.TestBase;

public class GmailTests extends TestBase {

	@Test
	public void gmailLoginTests() throws InterruptedException {

		launchTestSuite();

		PageClass page = new PageClass();
		page.launchWebPage();

		GmailPage gmailPage = new GmailPage();
		gmailPage.launchGmailPage();
		page.LoginPage();
		
	}
}
