package com.hldoc.scenarios;

import com.hldoc.helper.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JavsScripterTest extends TestBase {

    private WebDriver driver;

    @Test
    public void testName() {
        // To initialize the JS object.
        JavascriptExecutor JS = (JavascriptExecutor) driver;
// To get the site title.
        String title = (String)JS.executeScript("return document.title");
        System.out.println("Title of the webpage : " + title);

        //String title = (String)JS.executeScript("return document");



    }

}

