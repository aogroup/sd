package Tests;

import DriverFactory.Drivers;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Created by DELL on 11/12/2016.
 */
public class BaseTest {
    WebDriver driver ;

    @BeforeSuite
    public void setSuite() throws Exception {
         driver=Drivers.getDriver();


    }

    @AfterSuite
    public void afterSuite() throws Exception {
        driver.quit();

    }
}
