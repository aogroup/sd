package Tests;

import Pages.AfterLoginPage;
import Pages.BasePage;
import Pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;


/**
 * Created by DELL on 10/30/2016.
 */
public class MyTest extends BaseTest {
    LoginPage loginPage;
    AfterLoginPage afterLoginPage;


    @BeforeClass
    public void setUp() throws Exception {
        driver.get("https://mail.ru/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testName() throws Exception {
        String actual = loginPage.login(" andrey.underwood", "19942005z").userEmailText();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        wait.until((d)->d!=null ? loginPage.loginName :null);
        System.out.println(driver.getCurrentUrl());
        new Actions(driver).click().build().perform();
        //System.out.println(driver.getPageSource());
        Assert.assertEquals(actual, "andrey.underwood@mail.ru", "Error");
    }

//    @Test
//    public void runFromNonstsndartEdition(){
//        FirefoxBinary binary =new FirefoxBinary(new File("C:\\Program Files\\Firefox Developer Edition\\firefox.exe"));
//        FirefoxProfile profile = new FirefoxProfile();
//        FirefoxDriver driver = new FirefoxDriver(binary, profile);
//        driver.get("http://selenium2.ru");
//        driver.quit();
//    }
//
//    @Test
//    public void simpleRun() throws InterruptedException{
//        File file = new File("D:\\sd\\sd\\drivers\\phantomjs.exe");
//        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
//        PhantomJSDriver driver = new PhantomJSDriver();
//        driver.get("http://www.google.com");
//        String CurrentUrl = driver.getCurrentUrl();
//        System.out.println("------------------------------------------------------------------");
//        System.out.println("Page current url is: "+ CurrentUrl);
//        System.out.println("------------------------------------------------------------------");
//        driver.quit();
//    }

//    @Test
//    public void testSendEmail() throws Exception{
//        loginPage.login("andrey.underwood", "19942005z").userEmailText();
//
//
//    }


}