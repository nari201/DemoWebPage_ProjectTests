package AquaDNATests;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import ConfigData.ConfigData;
import Pages.AquaDNAPages.HomePage;
import TestBase.TestBase;

public class HomePageTests extends TestBase {
	
	@Test
	public void HomePageCountTest() throws InterruptedException, SQLException, ClassNotFoundException {
		
		launchTestSuite() ;
		
		HomePage homePage =new HomePage();
		ConfigData config = new ConfigData();
		
		
		homePage.launchADNA();
		homePage.loginADNAPage();
		
		System.out.println(homePage.getHomepageGreetingActual());
		
		System.out.println("Get UserId: "+ Query1());
		Assert.assertEquals( homePage.getHomepageGreetingActual(),config.dbHomePageGreeting()," Name is not matching with Actual name ");
		
	}
	private String homepageGreetingExpected()
    {
        Date userZoneTime = getCurrentTimeOfUserTimeZone();

        String greetingMessage = "";
        if (userZoneTime.toString().contains("PM"))
        {
            if (userZoneTime.getHours() >= 17)
            {
                greetingMessage = "Good Evening";
            }
            else
            {
                greetingMessage = "Good Afternoon";
            }
        }
        else if (userZoneTime.toString().contains("AM"))
        {
            greetingMessage = "Good Morning";
        }
        return greetingMessage;
    }
	public String Query1() throws SQLException {
		
	//	 Statement statement = dbConnection.createStatement();

         // Execute a SQL query
		 String userID=""; 
         
         String sqlQuery = "select ObjectID as UserID from dtUser where email ="+ ADNAUsername;
     /*    ResultSet resultSet = statement.executeQuery(sqlQuery);
         while (resultSet.next()) {
        	 
        	 userID= resultSet.getString(1);
             System.out.println("UserID : " + userID);

             // Add more columns as needed
         }
         */
         return userID;
	}
}
