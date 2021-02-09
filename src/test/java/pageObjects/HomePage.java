package pageObjects;

import base.PageGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageGenerator {

    @FindBy(how = How.XPATH, using = "(//a[@class='active'])[1]")
    public WebElement filesLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Activity'])[1]")
    public WebElement activityLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Gallery'])[1]")
    public WebElement galleryLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkLink;

    @FindBy(how = How.XPATH, using = "")
    public WebElement calendarLink;

    @FindBy(how = How.XPATH, using = "")
    public WebElement announcementLink;


}
