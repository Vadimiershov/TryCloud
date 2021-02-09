package pageObjects;

import base.PageGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FilePage extends PageGenerator {
    public WebElement getPlusSignButton() {
        return plusSignButton;
    }

    @FindBy(how = How.XPATH, using = "span[class='icon icon-add']")
     WebElement plusSignButton;
}
