package applicationRunner;

import org.testng.annotations.BeforeSuite;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

public class SuitStarter extends ConfigurationReader{

    @BeforeSuite
    public void suitStarter() {
     String env =   ConfigurationReader.getProperties("environment");





    }
}
