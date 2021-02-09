package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    //private WebDriverFactory(){}

    private static WebDriver driver;
    private static final String driverType = ConfigurationReader.getProperties("driver");
    public static void setUpDriver() {
        switch (driverType.toLowerCase()){
            case "chrome": WebDriverManager.chromedriver().setup();
            driver  = new ChromeDriver();
            break;
            case "ff": WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
        }
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void navigateToURL(String url) {
        getDriver().get(url);
    }
    public static void killDriver() {
        driver.quit();
    }

    public static void implicitWait (){

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void setImplicitWait(int sec) {
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }
}
