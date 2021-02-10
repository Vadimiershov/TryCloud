package tests.US2_TC1_MainModules;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;
import java.util.Properties;

public class AccessMainModules extends LogInPage{
    // WebDriverFactory.navigateToURL(ConfigurationReader.getProperties("environment3"));
    @BeforeClass
    public void setUpDriver() {
        WebDriverFactory.setUpDriver();
        WebDriverFactory.navigateToURL("http://qa3.trycloud.net");

}
@Test
    public void TC1(){


    }
}






