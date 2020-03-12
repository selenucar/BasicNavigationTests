package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com",
                                        "https://wayfair.com/",
                                        "https://walmart.com",
                                        "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for ( String url : urls){

            driver.get(url);

            if (url.contains(driver.getTitle())){
                System.out.println("TEST PASSED!");
            }else {
                System.out.println("TEST FAILED!");
                System.out.println(url);
                System.out.println(driver.getTitle());
            }

            driver.quit();

        }
    }
}
