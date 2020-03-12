package com.cbt.tests;


import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtilities;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws Exception {
        chromeTest();
        Thread.sleep(2000);
        //fireFoxTest();
        Thread.sleep(2000);
        //safariTest();
        Thread.sleep(2000);


    }


    public static void chromeTest() throws Exception{
       WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtilities.verifyEquals(title3,title1);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtilities.verifyEquals(title4,title2);
        Thread.sleep(2000);
        driver.quit();

    }

    public static void fireFoxTest() throws Exception{
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        driver.navigate().back();
        String title2 = driver.getTitle();
        StringUtilities.verifyEquals(title2,title1);
        driver.navigate().forward();
        String title3 = driver.getTitle();
        StringUtilities.verifyEquals(title3,title2);
        Thread.sleep(2000);
        driver.quit();

    }

    public static void safariTest() throws Exception{
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("http://google.com");
        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        driver.navigate().back();
        String title2 = driver.getTitle();
        StringUtilities.verifyEquals(title2,title1);
        driver.navigate().forward();
        String title3 = driver.getTitle();
        StringUtilities.verifyEquals(title3,title2);
        Thread.sleep(2000);
        driver.quit();


    }
}
