package Pages;

import java.awt.Scrollbar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageBase.PageClass;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class NaukriApplyJobsPage extends PageClass {

	WebDriverWait wait;

	public String SearchJobs() throws InterruptedException {

		System.out.println(driver.getCurrentUrl());

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter Job Skills in String: ");
		Thread.sleep(2000);
		// String skill=scanner.nextLine();

		searchJobSkills().click();
		Thread.sleep(2000);

		WebElement jobSkills = driver
				.findElement(By.xpath("//input[@placeholder = 'Enter keyword / designation / companies']"));

		jobSkills.sendKeys("Manual Testing, API Testing, Functional Testing, SOAP, REST");

		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);

		String parentWindow = driver.getWindowHandle();
		System.out.println(" Parent Title: " + parentWindow);

		return parentWindow;

	}

	public void NaukriJobsList() throws InterruptedException {

		String parentWindow = SearchJobs();
		Thread.sleep(2000);

		List<WebElement> jobsList = driver
				.findElements(By.xpath("//div[@class ='cust-job-tuple layout-wrapper lay-2 sjw__tuple ']"));
		List<WebElement> rowList = driver.findElements(By.xpath("//div[@class=' row1']//a"));

		for (int i = 0; i < jobsList.size(); i++) {
			WebElement jobCard = jobsList.get(i);

			String jobTitle = rowList.get(i).getText();
			if (jobTitle.contains("Manual") || jobTitle.contains("API")) {

				Thread.sleep(1000);

				jobCard.click();

				Set<String> handles = driver.getWindowHandles();
				List<String> hlist = new ArrayList<String>(handles);

				for (String ChildWindow : hlist) {

					driver.switchTo().window(ChildWindow);
				}
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].scrollIntoView();", keySkills());
				// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

				if (ApplyButton().getText().equals("Apply")) {

					ApplyButton().click();
					System.out.println("Clicked for Apply");

					Thread.sleep(1000);
				} else {
					System.out.println("Apply form Company Portal");
				}
				driver.switchTo().window(parentWindow);

				Thread.sleep(1000);
			}
		}

		System.out.println(jobsList);
	}

	public WebElement searchJobSkills() {

		return driver.findElement(By.xpath("//span[contains(text(),'Search jobs')]"));
	}

	public WebElement keySkills() {

		return driver.findElement(By.xpath("//span[contains(text(),'Report this job')]"));
	}

	public WebElement ApplyButton() {

		return driver
				.findElement(By.xpath("//div[@class='styles_jh__right__vRLn9']//button[contains(text(),'Apply')]"));

	}

	public WebElement ApplyFirstButton() {

		return driver
				.findElement(By.xpath("//button[text()='Save']//following-sibling::button[contains(text(),'Apply')]"));
	}

	public WebElement experencsRange() {

		return driver.findElement(By.xpath("//div[@class='inside']//span[contains(text(),'8')]"));
	}

	public WebElement crossIcon() {

		return driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']"));
	}

	public WebElement appliedElement() {

		return driver.findElement(
				By.xpath("//div[@class='styles_jhc__apply-button-container__5Bqnb']//span[text()='Applied']"));
	}
}
