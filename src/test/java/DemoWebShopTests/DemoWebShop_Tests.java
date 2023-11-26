package DemoWebShopTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LaunchDemoWebShop;
import TestBase.TestBase;

public class DemoWebShop_Tests extends TestBase {

	@Test
	public void launchDemoWebShop() {
		
		launchTestSuite();
		LaunchDemoWebShop demoWebShop = new LaunchDemoWebShop();
		demoWebShop.launchDemoWebShop();
	
		String expectedTitle = "Demo Web Shop";
		
		Assert.assertEquals(driver.getTitle(),expectedTitle, "Expected title is not matching with Actual title");
	
	}	
}
