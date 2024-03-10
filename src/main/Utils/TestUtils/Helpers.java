package TestUtils;

import java.sql.Time;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.runtime.model.Timestamp;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.yaml.snakeyaml.scanner.Constant;

public class Helpers {

    private int shortWaitSeconds = 10;
    private int longWaitSeconds = 60;
    private int dbRequestTimeoutSeconds = 600;

    boolean noWait = false;

    public static boolean DoesElementExist(WebDriver driver, By locator)
    {
        Collection<WebElement> matchingElements = driver.findElements(locator);
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
