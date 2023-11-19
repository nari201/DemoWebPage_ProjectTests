
package otherProjectsTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {

	// WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Main");

		Browser b = new Browser();

		b.scan_read();
		
		//b.Aqua();

	}

	@Test
	public void scan_read() throws InterruptedException {

		Browser b = new Browser();

		Scanner sc = new Scanner(System.in);

		String Demo = "demo";
		String Flights = "flights";
		String youtube = "youtube";
		String Aqua = "Aqua";
		// String input
		System.out.println("Enter name as flights or demo or youtube or Aqua");

		String name = sc.nextLine();

		if (name.equals(Demo)) {

			System.out.println("Calling Demo methods...");

			b.Demo();

		} else if (name.equals(Flights)) {

			System.out.println("Calling Flights method....");

			b.Flights();

		} else if (name.equals(youtube)) {

			System.out.println("Calling youtube method....");
			b.youtube();

		} else if(name.equals(Aqua)){

			System.out.println("Call Aqua Method");

			b.Aqua();

		}

		// Character input
		// char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		// int age = sc.nextInt();
		// long mobileNo = sc.nextLong();
		// double cgpa = sc.nextDouble();

	}

	public void Flights() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mercurytravels.co.in/flights");

		driver.manage().window().maximize();

		// driver.wait();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		/*
		 * driver.findElement(By.name("userName")).sendKeys("mercury");
		 * 
		 * driver.findElement(By.name("password")).sendKeys("mercury");
		 **/

		// driver.findElement(By.linkText("Demo Account" )).click();

		// driver.switchTo().alert().accept();
		// driver.findElement(By.xpath("//*[@id=\"O-R-Trip\"]/div[1]/div[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"O-R-Trip\"]/div[1]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"dpf2\"]")).click();

		// driver.findElement(By.xpath("//*[@id=\"facebook\"]/body[1]/div[1]/div[1]/div[1]/div[1]/svg/path")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div/div/div/div")).click();

		// .sendKeys("Chennai, India - Madras International (MAA)");

		System.out.println("Flights");

	}

	public void Demo() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		long start = System.currentTimeMillis();

		System.out.println(java.time.LocalDateTime.now());

		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of 14.1-inch Laptop']")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of 14.1-inch Laptop']")).click();

		System.out.println("Demo webShop");

		long timeToLoad = (System.currentTimeMillis() - start);
		System.out.println("The page loaded in " + timeToLoad + " seconds.");

		// driver.quit();

	}

	public void youtube() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		System.out.println("You tube :)");

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

	}
	public void Aqua() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		System.out.println("You tube :)");

		driver.get("https://uu-web2-staging.azurewebsites.net/?SortBy=TimeStamp&SortByDescending=True");
		driver.manage().window().maximize();

		//input[@id='inputEmail']  --naresh.settipalli@jacobs.com
		
		//button[@id='btnLogin']
		
		//input[@id='inputPassword']
		
		//button[@id='btnLogin']
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("naresh.settipalli@jacobs.com");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Test@2023");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='button btn-Secondary  mr-3']")).click();
		
		Thread.sleep(5000);
		//settings
		 driver.findElement(By.xpath("div[@class='initials-text' and contains(text(),'NS')]")).click();
		//driver.findElement(By.xpath("//div[@class='user-image collapsed']//div//div//div")).click();
        ////div[@class='initials-text']
		 ////div[@class='initials-text' and contains(text(),'NS')]
		 Thread.sleep(5000);
         WebElement homeSettings = driver.findElement(By.xpath("//button[contains(@class, 'tab-title') and contains(text(), 'Home Settings')]"));
      
         homeSettings.click();

      //   WebElement dashboardHome = driver.findElement(By.xpath("//div[contains(@class ,'icon-container')]//div[@class ='icon icon-Dashboard background-NavIcon ']"));

        //IWebElement selectAllCheckbox = driver.FindElement(By.XPath("//input[contains(@id, 'b56caf6e-3702-4183-9a5c-e00f2dd5c813')]"));

      //   WebElement homeSettingsSelected = driver.findElement(By.xpath("//div[contains(@class,'tab-title-container')]//button[contains(@class,'tab-title depth0 selected ')]"));
       
      //   driver.findElement(By.xpath("//input[@id='25a98150-b7cb-4966-9432-418a8fc73365']")).click();
       
         //WebElement seleactAllCheckbox = driver.findElement(By.xpath("//input[@id='949b6c09-733c-434f-a3c1-cdaa2f34b5a6']"));

      //   WebElement selectedArea1 = driver.findElement(By.xpath("//input[@id='3b67a7fb-2e7e-4c59-8e15-737ac5635a17']"));
       //  homePageSettings();
         Thread.sleep(3000);
         String damAreaSelectedList = "";

         WebElement damSelectAllSelected = driver.findElement(By.xpath("//div[contains(@class,'tab-title-container')]//button[contains(@class,'tab-title depth0 selected ')]"));
         
         List<String> list = new ArrayList<String>();

      //  seleactAllCheckbox = driver.FindElement(By.XPath("//*[text()='DAM Area']//following-sibling::div/div["+index+"]"));

         //   selectedArea = driver.FindElement(By.XPath("//input[@id='3b67a7fb-2e7e-4c59-8e15-737ac5635a17']"));

         //for iterate
         //"//*[text()='DAM Area']//following-sibling::div/div[" + index + "]"

         //for check
         //*[text()='DAM Area']//following-sibling::div/div[1]/div/div[2]/label/b
         //*[text()='DAM Area']//following-sibling::div/div[\" + index + \"]"


         By locator = By.xpath("//*[text()='DAM Area']//following-sibling::div");
        List <WebElement> elementsList = driver.findElements(locator);

         for (int index =  1; index < elementsList.size(); index++)
         {
           //  ReadOnlyCollection <IWebElement> eachElementByIndex = driver.FindElements(By.XPath("//*[text()='DAM Area']//following-sibling::div/div[" + index + "]"));
            
             WebElement selectTypesName = driver.findElement(By.xpath(" //*[text()='DAM Area']//following-sibling::div/div[" + index + "]/div/div[2]/label/b"));

             if (selectTypesName.isDisplayed())
             {
            	 list.add(selectTypesName.getText());
             }
         }

         for (String appendList : list){

             damAreaSelectedList = damAreaSelectedList+","+ appendList;
         }

         System.out.println("Selected List"+damAreaSelectedList);
       
         if(list.isEmpty()) {
        	 System.out.println(" List is Empty");
         }

	}
}
