package base;

import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverFactory;

public class PageGenerator {

    public PageGenerator(){
        PageFactory.initElements(WebDriverFactory.getDriver(),this);
    }
}
