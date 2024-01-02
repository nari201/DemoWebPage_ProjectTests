package ConfigData;

public class ConfigData {

     public String testEnvironment ="staging" ;
     public String testBrowser = "edge";
     public String gmailUser = "settipalli.naresh201@gmail.com";
     public String gmailPassword ="ns@May08";
     
     public String ADNAUsername = "naresh.settipalli@jacobs.com";
     public String ADNAPassword =  "Test@May13";  
     public String stagingDBConnection =  "Server=adna-sql.database.windows.net; Authentication=Sql Password;User ID=automation;Password=x3*JG$$53Bu3&%%Y; Database=ADNAStageUnitedUtilities";
    
     public String stagingSWWDBConnection= "Server=sww-sql-server.database.windows.net:1433; Database=ADNASWWstaging";
     
    public String  UserID = "automation";
    public String  Password ="x3*JG$$53Bu3&%%Y";
     
     public String userName = "Naresh";
     
     // Getter and setter methods for testEnvironment
     public String getTestEnvironment() {
         return testEnvironment;
     }

     public void setTestEnvironment(String testEnvironment) {
         this.testEnvironment = testEnvironment;
     }
     public String getTestBrowser() {
         return testBrowser;
     }
     public String getUsername() {
         return gmailUser;
     }
     public String getPassword() {
         return gmailPassword;
     }
     
     public String getADNAUsername() {
         return ADNAUsername;
     }
     public String getADNAPassword() {
         return ADNAPassword;
     }
     public String userName() {
         return userName;
     }
     
     public String stagingDBConnection() {
         return stagingDBConnection;
     }
     
     public String stagingSWWDBConnection() {
         return stagingSWWDBConnection;
     }
     public String dbHomePageGreeting() {
 		
         return "Good Evening, Naresh";
     }
}
