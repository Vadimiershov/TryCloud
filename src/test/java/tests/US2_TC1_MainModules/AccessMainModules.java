package tests.US2_TC1_MainModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePageHeader;
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
        //1. Verify the user see the modules File:
       WebElement filesLink = WebDriverFactory.getDriver().findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
       Assert.assertTrue(filesLink.isDisplayed());
      //  WebDriverFactory.implicitWait();
       // filesLink.click();

      //  //2. Get text from module Expect Result "File"
     //   String expectedFilePageTitle = "Files";
    //    Assert.assertTrue(WebDriverFactory.getDriver().getTitle().contains(expectedFilePageTitle));
    }
        @Test
        //1. Verify the user see the gallery module:
        public void galleryModule(){
            WebElement photosLink = WebDriverFactory.getDriver().findElement(By.xpath("(//a[@aria-label='Photos'])[1]"));
            Assert.assertTrue(photosLink.isDisplayed());
          //  WebDriverFactory.implicitWait();
    }
    @Test
    //1. Verify the user see the activityModule:
    public void activityModule(){
        WebElement activityLink = WebDriverFactory.getDriver().findElement(By.xpath("(//a[@aria-label='Activity'])[1]"));
        Assert.assertTrue(activityLink.isDisplayed());
      //  WebDriverFactory.implicitWait();

    }

    @Test
    //1. Verify the user see the talk  modules :
    public void talkModule(){
        WebElement talkLink = WebDriverFactory.getDriver().findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
        Assert.assertTrue(talkLink.isDisplayed());
      //  WebDriverFactory.implicitWait();
    }
    @Test
    //1. Verify the user see the contacts modules :
    public void contactsModule(){
        WebElement contactLink = WebDriverFactory.getDriver().findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        Assert.assertTrue(contactLink.isDisplayed());
      //  WebDriverFactory.implicitWait();
    }
    @Test
    //1. Verify the user see the calender modules :
    public void calenderModule(){
        WebElement calendarLink = WebDriverFactory.getDriver().findElement(By.xpath("(//a[@aria-label='Calendar'])[1]"));
        Assert.assertTrue(calendarLink.isDisplayed());
       // WebDriverFactory.implicitWait();

    }
  //  @Test
//    public void noteModule(){
     //   WebElement notesLink = WebDriverFactory.getDriver().findElement(By.xpath("(//a[@aria-label='Notes'])[1]"));
    //    Assert.assertTrue(notesLink.isDisplayed());
    //    WebDriverFactory.implicitWait();
    //
    }








