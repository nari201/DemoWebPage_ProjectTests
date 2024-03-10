package TestUtils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helpers {

    private int shortWaitSeconds = 10;
    private int longWaitSeconds = 60;
    private int dbRequestTimeoutSeconds = 600;

    boolean noWait = false;

    public static boolean DoesElementExist(WebDriver driver, By locator)
    {
        List<WebElement> matchingElements = driver.findElements(locator);
        if (matchingElements.size() == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
