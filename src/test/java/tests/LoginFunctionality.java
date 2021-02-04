package tests;

import base.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.WebDriverFactory;

public class LoginFunctionality {

    @BeforeMethod
    public void setUpTestCase(){
        WebDriverFactory.setUpDriver();
        WebDriverFactory.navigateToURL("http://qa.trycloud.net/index.php/login?clear=1");
    }

    @Test(description = "Validate user is able to login with valid credential")
    public void testLogin(){
        LogInPage logInPage = new LogInPage();
        logInPage.UserLogIn.sendKeys("User26");
        logInPage.UserPassword.sendKeys("Userpass123");
        logInPage.LoginBtn.click();

        String actual =WebDriverFactory.getDriver().getCurrentUrl();
        String expectedUrl = "http://qa.trycloud.net/index.php/login";
        Assert.assertEquals(actual,expectedUrl, "If you see this message, it failed "); // per Asiya's instructions, needs to be in base package

    }

    @AfterMethod
    public void tearDown(){
        WebDriverFactory.killDriver();
    }
}
