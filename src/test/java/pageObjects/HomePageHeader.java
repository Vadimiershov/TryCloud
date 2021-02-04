package pageObjects;

import base.PageGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageHeader extends PageGenerator {

    @FindBy(how = How.XPATH, using = "(//a[@class='active'])[1]")
    public WebElement filesLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Photos'])[1]")
    public WebElement photosLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Activity'])[1]")
    public WebElement activityLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Notes'])[1]")
    public WebElement notesLink;

    @FindBy(how = How.XPATH, using = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendarLink;

    @FindBy(how = How.XPATH, using = "//div[@class='header-menu unified-search']")
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Notifications']")
    public WebElement notificationBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactSearchLink;

    @FindBy(how = How.XPATH, using = "//div[@class='menutoggle']")
    public WebElement settingsBtn;











}
