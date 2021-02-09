package tests.US3_TC6_CreateFolder;

import org.testng.annotations.Test;
import pageObjects.LogInPage;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

import java.util.HashMap;
import java.util.Map;

public class CreateFolder {
    @Test
    public void createFolder() {
        WebDriverFactory.navigateToURL(ConfigurationReader.getProperties("environment3"));
        LogInPage logIn = new LogInPage();
        logIn.login("user1");


        logIn.logout();
    }
}

