package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

public class LoginFunctionality {

    //@BeforeMethod
    public void setUpTestCase() {
        WebDriverFactory.setUpDriver();
        String url = ConfigurationReader.getProperties("environment");
        WebDriverFactory.navigateToURL(url);
    }

    //@Test(description = "Validate user is able to login with valid credential")
    public void testLogin() {
        LogInPage logInPage = new LogInPage();
        logInPage.UserLogIn.sendKeys("User26");
        logInPage.UserPassword.sendKeys("Userpass123");
        logInPage.LoginBtn.click();
    }
}


