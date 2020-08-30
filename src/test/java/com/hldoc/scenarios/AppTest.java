package com.hldoc.scenarios;

import com.hldoc.helper.shravan1BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class AppTest {

    Logger logger = LoggerFactory.getLogger(AppTest.class);
    private WebDriver driver;


/*
    @BeforeClass
    @Parameters("browser")
    public void setup(String browser) {
        ThreadLocal<WebDriver> WebDriver = new ThreadLocal<>();
        WebDriver.set(new shravan1BrowserFactory().getBrowser(browser));
        driver = WebDriver.get();
        //   driver=new ChromeDriver();
    }

*//*
    public static void checkException(String[] args) {
        new FileNotFoundException();
        try {
            logger.info("");
            new IOException();
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            logger.info("args = " + args);
        }
    }
*//*

    @AfterClass
    public void tearDown() {
        driver.close();
    }

    @Test()
    public void test1() throws InterruptedException {
        logger.info("AppTest.test1");
        logger.info(String.valueOf(Thread.currentThread().getId()));
        logger.info(System.getProperty("user.dir"));
        driver.get("http://exotel.com");
        //Thread.sleep(3000l);
        logger.info(driver.getTitle());
    }

    @Test
    public void test2() throws InterruptedException {
        logger.info("AppTest.test2");
        logger.info(String.valueOf(Thread.currentThread().getId()));
        driver.get("http://seleniumhq.org");
        //Thread.sleep(3000l);
        logger.info(driver.getTitle());

    }

    @Test
    public void test3() throws InterruptedException {
        logger.info("AppTest.test3");
        logger.info(String.valueOf(Thread.currentThread().getId()));
        driver.get("http://busonlineticket.com");
        //Thread.sleep(3000l);
        logger.info(driver.getTitle());

    }*/

}
