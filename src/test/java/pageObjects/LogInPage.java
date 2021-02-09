package pageObjects;

import base.PageGenerator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigurationReader;

public class LogInPage extends PageGenerator {

    @FindBy(how = How.CSS,using = "#user")
    public WebElement UserLogIn;

    @FindBy(how = How.CSS,using = "#password")
    public WebElement UserPassword;

    @FindBy(how = How.XPATH,using = "//input[@id=\"submit-form\"]")
    public WebElement LoginBtn;


    @FindBy(how = How.XPATH,using = "//li[@data-id=\"logout\"]")
    public WebElement LogoutButton;

    public void login(String user) {
        String userName = "";
        if (user.equalsIgnoreCase("user1")) {
            userName = ConfigurationReader.getProperties("user1");
        }else if (user.equalsIgnoreCase("user2")) {
            userName = ConfigurationReader.getProperties("user2");
        }else if (user.equalsIgnoreCase("user3")) {
            userName = ConfigurationReader.getProperties("user3");
        }else if (user.equalsIgnoreCase("user4")) {
            userName = ConfigurationReader.getProperties("user4");
        } else {
            System.err.println("User doesn't exist!!!");
        }
        String password = ConfigurationReader.getProperties("password");
        UserLogIn.sendKeys(userName);
        UserPassword.sendKeys(password, Keys.RETURN);
    }

    public void logout() {
        HomePageHeader header = new HomePageHeader();
        header.settingsBtn.click();
        LogoutButton.click();
    }
}
