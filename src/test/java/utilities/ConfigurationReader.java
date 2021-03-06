package utilities;

import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // reason of reader class - to be able to read from configuration properties 

    private static final Properties properties = new Properties();
    private static final String path = "configuration.properties";
    //public static void readProperty() {
static {
        try {
            FileInputStream inputStream = new FileInputStream(path);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperties(String key){
        return properties.getProperty(key);




    }
}
