package tests.US3_TC5_UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

public class UploadFile {

    @BeforeClass
    public void setUpDriver() {
        WebDriverFactory.setUpDriver();
        WebDriverFactory.navigateToURL(ConfigurationReader.getProperties("environment3"));
       // WebDriverFactory.navigateToURL("http://qa3.trycloud.net");
    }


    @Test(description = "Verify users can upload a file directly to the homepage")
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

        // 2. Click the "+" icon on top
        WebElement plusButton = WebDriverFactory.getDriver().findElement(By.xpath("//a[@class='button new']"));
        // @FindBy(how = How.XPATH, using = "a[class='button new']")
        //  public WebElement plusButton;
        // plusButton.click();

        // 3. Click "upload file"
        String path = "C:\\Users\\Polina\\Desktop\\text document.txt";

        WebElement uploadFile = WebDriverFactory.getDriver().findElement(By.xpath("//input[@type='file']"));
        // @FindBy(how = How.XPATH, using = "//span[.='Upload file']")
        //  public WebElement uploadFile;

        // 4. Upload a file
        uploadFile.sendKeys(path);

        // 5. Verify the file is displayed on the page
        WebElement fileUploaded = WebDriverFactory.getDriver().findElement(By.xpath("//*[contains(text(), 'text document')]"));
        Assert.assertTrue(fileUploaded.isDisplayed(), "File is NOT displayed on the page");
        WebDriverFactory.implicitWait();

    }
/*
    @AfterClass
    public void tearDown() {
        WebDriverFactory.killDriver();
    }*/



}
