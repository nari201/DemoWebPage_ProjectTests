package TestBase;

import java.util.Date;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import ConfigData.ConfigData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestBase extends ConfigData {

	protected static WebDriver driver;
	public String currentUsername;
	public String currentUserPassword;

	public Connection dbConnection;
	public Connection dbConnection2;


	public enum testEnvironments {
		staging, release, special, production
	}

	public void launchTestSuite() throws ClassNotFoundException {

		String browser = getTestBrowser();
		
		loginAsDefaultUser();
		//connectToDB();
		
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C://Users//SETTIPN//Selenium_Files/chromedriver_win/chromedriver-win64/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "edge":
			System.setProperty("webdriver.chrome.driver",
					"C://Users//SETTIPN//Selenium_Files//edgedriver_win/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			throw new NotImplementedException("Browser not Supported");
		}
	}

	@AfterClass
	public void CloseTestSite() {

		 driver.close();
		 driver.quit();
	}

	public void loginAsDefaultUser() {
		ConfigData config = new ConfigData();

		this.currentUsername = config.getADNAUsername();
		this.currentUserPassword = config.getADNAPassword();

	}

	public void loginAsUser(String username, String password) {

	}

	protected void connectToDB() throws ClassNotFoundException {
		// TODO: The currently configured connection strings trigger an interactive
		// authentication. Is a change to the user settings (new automation specific
		// user?) required to get around this?
		String ConnectionString;
		ConfigData config = new ConfigData();

		switch (config.getTestEnvironment()) {
		case "staging":
			ConnectionString = config.stagingSWWDBConnection();
			break;
		case "release":
			ConnectionString = config.stagingSWWDBConnection();
			break;
		case "prod":
			ConnectionString = config.stagingSWWDBConnection();
			break;
		default:
			throw new NotImplementedException("Support for environment not implemented: {currentEnvironment}");
		}
		// string ConnectionString = @"Server=adna-sql.database.windows.net;
		// Authentication=Active Directory Interactive;
		// Database=ADNAStageUnitedUtilities";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// TODO: is anything required to properly dispose of this?
			//dbConnection = DriverManager.getConnection(ConnectionString);
			dbConnection  = DriverManager.getConnection(ConnectionString, UserID, Password);

			}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 protected void closeDBConnection() throws SQLException
     {
         dbConnection.close();
         
     }
	public Date getCurrentTimeOfUserTimeZone() {

		/*
		 * ConfigData config = new ConfigData();
		 * 
		 * String currentUsername = config.getADNAUsername(); HttpServerConnection
		 * dbConnection = getCurrentDBConnection();
		 * 
		 * String sqlCommand =
		 * "Select TimeZoneID from dbo.dtUsers inner join  [dbo].[dtUser] on dtUser.ObjectID =dtUsers.UserID where dtUser.Email ="
		 * +currentUsername;
		 * 
		 * String timeZoneId = Helpers.DBGet<string>(sqlCommand, dbConnection)??"";
		 * 
		 * Assert.That(timeZoneId, Is.Not.Empty,
		 * $"Expected to find timezone for current user from DB. UserName: {currentUsername}"
		 * );
		 * 
		 * DateTime currentTime; if (timeZoneId != "Coordinated Universal Time") {
		 * TimeZoneInfo timeZone = TimeZoneInfo.FindSystemTimeZoneById(timeZoneId);
		 * 
		 * // Get the current UTC time DateTime utcTime = DateTime.UtcNow;
		 * 
		 * // Convert the UTC time to the target time zone currentTime =
		 * TimeZoneInfo.ConvertTimeFromUtc(utcTime, timeZone); } else { currentTime =
		 * DateTime.UtcNow; } return currentTime; }
		 **/
		return null;
	}

}