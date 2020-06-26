package com.hldoc.helper;

import org.openqa.selenium.WebDriver;

// advantage: client wont be able to see driver implementation class
public class shravan1BrowserFactory {
    public static WebDriver getBrowser(String browserName) {
        // SingletonDriver singletonDriver = new SingletonDriver();

        switch (browserName) {
            case "firefox":
                return SingletonDriver.getSingletonFirefoxDriver();
            case "ie":
                return SingletonDriver.getSingletonIEDriver();
            case "remote":
                return SingletonDriver.getSingletonRemoteWebDriver();
            default:
                return SingletonDriver.getSingletonChromeDriver();
        }
    }

}
