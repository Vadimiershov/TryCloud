package tests.US3_TC4_RemoveFileFromFavorites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.WebDriverFactory;

public class RemoveFileFromFavorites {

    @BeforeClass
    public void setUpDriver() {
        WebDriverFactory.setUpDriver();
        // WebDriverFactory.navigateToURL(ConfigurationReader.getProperties("environment"));
        WebDriverFactory.navigateToURL("http://qa3.trycloud.net");
    }

    @Test(description = "Verify that the file is removed from Favorites sub-module's table.")
    public void uploadFile() {

        // 1. Login as a User
        LogInPage logInPage = new LogInPage();
        logInPage.UserLogIn.sendKeys("User26");
        logInPage.UserPassword.sendKeys("Userpass123");
        logInPage.LoginBtn.click();

        WebElement files = WebDriverFactory.getDriver().findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        // @FindBy(how = How.XPATH, using = "//a[@href='/index.php/apps/files/']")
        //    public WebElement filesLink; !!!
        files.click();
        WebDriverFactory.implicitWait();

        // 2.Click action-icon from any file on the page
       // WebElement actionIcon = WebDriverFactory.getDriver().findElement(By.xpath("//*[contains(text(), 'Actions')]"));
       // actionIcon.click();

        // 3. Click "Remove from Favorites" option
        WebElement removeFromFavorites = WebDriverFactory.getDriver().findElement(By.xpath("//span[.='Remove from favorites']"));
        removeFromFavorites.click();

        // 4. Verify that the file is removed from Favorites sub-module's table.

        // (Pre-condition: these should be at least 1 file is added to favorites table )


    }



/*
    @AfterClass
    public void tearDown() {
        WebDriverFactory.killDriver();
    }*/


}