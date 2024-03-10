package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageBase.PageClass;

public class CodilityTaskPage extends PageClass {

	public void launchSearchPage() {

		driver.get(
				"https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

	}

	public WebElement searchInput() {
		return driver.findElement(By.id("search-input"));
	}

	public WebElement searchButton() {
		return driver.findElement(By.id("search-button"));
	}

}
