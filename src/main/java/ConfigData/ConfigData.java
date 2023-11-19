package ConfigData;

public class ConfigData {

     public String testEnvironment ="staging" ;
     public String testBrowser = "edge";
     public String gmailUser = "settipalli.naresh201@gmail.com";
     public String gmailPassword ="ns@May08";
     
    // environment URLs
    // public String stagingURL ;
	
     // Getter and setter methods for testEnvironment
     public String getTestEnvironment() {
         return testEnvironment;
     }

     public void setTestEnvironment(String testEnvironment) {
         this.testEnvironment = testEnvironment;
     }

     // Getter and setter methods for testBrowser
     public String getTestBrowser() {
         return testBrowser;
     }

     public void setTestBrowser(String testBrowser) {
         this.testBrowser = testBrowser;
     }
     public String getUsername() {
         return gmailUser;
     }

     public void setUsername(String user) {
         this.gmailUser = user;
     }
     public String getPassword() {
         return gmailPassword;
     }

     public void setPassword(String password) {
         this.gmailPassword = password;
     }
}
