package tests.US3_TC8a_Delete_Comment_File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LogInPage;
import tests.LoginFunctionality;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

public class Delete_File_Folder {


    @BeforeMethod(description = "setup driver for test case 8a")

    public void setUpTestCase(){
        WebDriverFactory.setUpDriver();
        WebDriverFactory.navigateToURL("http://qa3.trycloud.net/index.php/login?clear=1");
    }

    @Test(description ="delete file, preconditions: ")
    public void deleteFile_Folder_8a() {
        LoginFunctionality login = new LoginFunctionality();
        login.testLogin();




    }


  //  @AfterMethod
 //   public void tearDown(){
   //     WebDriverFactory.killDriver();
    }




