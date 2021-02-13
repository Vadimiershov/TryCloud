package tests.US2_TC1_MainModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;
import java.util.Properties;

public class AccessMainModules extends LogInPage {
    // WebDriverFactory.navigateToURL(ConfigurationReader.getProperties("environment3"));
    @BeforeClass
    public void setUpDriver() {
        WebDriverFactory.setUpDriver();
        WebDriverFactory.navigateToURL("http://qa3.trycloud.net");

    }

    @Test
    public void TC1() {
        // 1. Login as a User
        LogInPage logInPage = new LogInPage();
        logInPage.UserLogIn.sendKeys("User26");
        logInPage.UserPassword.sendKeys("Userpass123");
        logInPage.LoginBtn.click();
    }

    @Test
    public void fileModule() {
        //Verify the user see the modules File:
       WebElement filesLink = WebDriverFactory.getDriver().findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
       Assert.assertTrue(filesLink.isDisplayed());
       BrowserUtils.sleep(1);


       //BrowserUtils.hoover(filesLink);
       // String expectedFilePageTitle = "Files";

     //  Assert.assertTrue(WebDriverFactory.getDriver().getTitle().contains(expectedFilePageTitle));






    }
}






