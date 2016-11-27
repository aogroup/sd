package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DELL on 11/12/2016.
 */
public class Drivers {

  public static WebDriver getDriver(){
        WebDriver driver;
        String nameDriver = System.getProperty("driver");
        switch (nameDriver){
            case "phantomjs":
                System.setProperty("phantomjs.binary.path","drivers\\phantomjs.exe");
                 driver = new PhantomJSDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver","drivers\\IEDriverServer.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
                driver = new ChromeDriver();

        }
        driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }



}
