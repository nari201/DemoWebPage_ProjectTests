package Pages;

import java.util.concurrent.TimeUnit;
import PageBase.PageClass;

public class LaunchGooglePage extends PageClass {

	public void launchGoogle() {

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void launchTextBook() {
		
		driver.get("https://testbook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
}
