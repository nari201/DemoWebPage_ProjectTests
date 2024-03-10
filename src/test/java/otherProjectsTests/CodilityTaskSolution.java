package otherProjectsTests;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CodilityTaskPage;
import TestBase.TestBase;

public class CodilityTaskSolution extends TestBase {

	@Test(priority = 1)
	public void testSearchQueryAndSubmitButtonPresence() throws ClassNotFoundException {
		// Assuming WebDriver is already pointing at the page

		launchTestSuite();
		CodilityTaskPage page = new CodilityTaskPage();
		page.launchSearchPage();
		Assert.assertNotNull(page.searchInput());
		Assert.assertNotNull(page.searchButton());
	}

	@Test(priority = 2)
	public void testEmptyQueryError() throws ClassNotFoundException {
		// Assuming WebDriver is already pointing at the page

		CodilityTaskPage page = new CodilityTaskPage();

		page.searchButton().click(); // Submitting empty query
		WebElement emptyQueryError = driver.findElement(By.id("error-empty-query"));
		Assert.assertNotNull(emptyQueryError);
		Assert.assertEquals("Provide some query", emptyQueryError.getText());
	}

	@Test(priority = 3)
	public void testAtLeastOneIslandReturned() {
		// Assuming WebDriver is already pointing at the page

		CodilityTaskPage page = new CodilityTaskPage();

		page.searchInput().sendKeys("isla");
		page.searchButton().click();

		List<WebElement> resultList = driver.findElements(By.xpath("//ul[@id='search-results']"));
		List<String> addedList = new ArrayList<>();

		Assert.assertTrue(resultList.size() > 0);

		/*
		 * if(resultList.size() > 0) { for (WebElement webElement : resultList) {
		 * addedList.add(webElement.getText()); } } System.out.println(addedList);
		 * Assert.assertTrue(addedList.contains("Isla Cruces"));
		 */
	}

	@Test(priority = 4)
	public void testNoResultsFeedback() {

		CodilityTaskPage page = new CodilityTaskPage();

		page.searchInput().clear();
		page.searchInput().sendKeys("castle");
		page.searchButton().click();

		WebElement noResultsError = driver.findElement(By.id("error-no-results"));
		Assert.assertNotNull(noResultsError);
		Assert.assertEquals(noResultsError.getText(), "No results");
	}

	@Test(priority = 5)
	public void testResultsMatchingQuery() throws InterruptedException {

		CodilityTaskPage page = new CodilityTaskPage();

		page.searchInput().clear();
		page.searchInput().sendKeys("port");
		page.searchButton().click();
		
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//*[@id ='search-results']//li"));
		Assert.assertEquals(element.getText(),"Port Royal");
		}
}

