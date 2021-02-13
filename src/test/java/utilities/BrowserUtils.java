package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {
    public static void hoover(WebElement element) {
        Actions actions = new Actions(WebDriverFactory.getDriver());
        actions.moveToElement(element).perform();
    }
}



//