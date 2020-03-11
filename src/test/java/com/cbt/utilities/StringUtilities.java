package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class StringUtilities {
    public static void verifyEquals (String expected, String actual) {

        if (expected.equals(actual)) {
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED!");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }

    }
}
