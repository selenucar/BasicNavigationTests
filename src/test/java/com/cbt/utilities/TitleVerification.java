package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                        "http://practice.cybertekschool.com/dropdown",
                                        "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");


        driver.get(urls.get(0));
        String title0 = driver.getTitle();
        String url0 = driver.getCurrentUrl();

        if (url0.startsWith("http://practice.cybertekschool.com")){
            System.out.println("TEST PASSED!");
        }else {
            System.out.println("TEST FAILED!");
        }
        driver.quit();


        driver.get(urls.get(1));
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();

        if (url1.startsWith("http://practice.cybertekschool.com")){
            System.out.println("TEST PASSED!");
        }else {
            System.out.println("TEST FAILED!");
        }
        driver.quit();


        driver.get(urls.get(2));
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();

        if (url2.startsWith("http://practice.cybertekschool.com")){
            System.out.println("TEST PASSED!");
        }else {
            System.out.println("TEST FAILED!");
        }
        driver.quit();

        StringUtilities.verifyEquals(title0,title1);
        StringUtilities.verifyEquals(title0,title2);
        StringUtilities.verifyEquals(title2,title1);


    }
}
