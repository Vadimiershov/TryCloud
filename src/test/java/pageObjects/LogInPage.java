package pageObjects;

import base.PageGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage extends PageGenerator {

    @FindBy(how = How.CSS,using = "#user")
    public WebElement UserLogIn;

    @FindBy(how = How.CSS,using = "#password")
    public WebElement UserPassword;

    @FindBy(how = How.XPATH,using = "//input[@id=\"submit-form\"]")
    public WebElement LoginBtn;

}
