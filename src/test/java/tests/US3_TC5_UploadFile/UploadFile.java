package tests.US3_TC5_UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

public class UploadFile {
    @Test(description = "Verify users can upload a file directly to the homepage")
    public void uploadFile() {
        // 1. Login as a User
        WebDriverFactory.setUpDriver();
        WebDriverFactory.navigateToURL(ConfigurationReader.getProperties("environment"));
        //WebDriverFactory.navigateToURL("http://app.trycloud.net/index.php/login");

        LogInPage logInPage = new LogInPage();
        logInPage.UserLogIn.sendKeys("User26");
        logInPage.UserPassword.sendKeys("Userpass123");
        logInPage.LoginBtn.click();

        String path = "C:\\Users\\Polina\\Desktop\\Java Programming B21\\Study Materials\\String pool.png";

        WebElement plusButton = WebDriverFactory.getDriver().findElement(By.cssSelector("a[class='button new']"));
        // @FindBy(how = How.XPATH, using = "a[class='button new']")
        //    public WebElement plusButton;
        WebElement uploadFile = WebDriverFactory.getDriver().findElement(By.xpath("//span[.='Upload file']"));
        // @FindBy(how = How.XPATH, using = "//span[.='Upload file']")
        //    public WebElement uploadFile;

        // 2. Click the "+" icon on top
        // 3. Click "upload file"
        // 4. Upload a file
        plusButton.click();
        uploadFile.click();
        uploadFile.sendKeys(path);

        // 5. Verify the file is displayed on the page
        WebElement fileUploaded = WebDriverFactory.getDriver().findElement(By.xpath("//span[@class='nametext']"));
        Assert.assertTrue(fileUploaded.isDisplayed(), "File is not displayed on the page");

    }
}