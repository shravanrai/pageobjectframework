package com.hldoc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageBase {

    public static WebDriver driver;
    public Logger log;
    public WebDriverWait webDriverWait;

    public PageBase(WebDriver driver) {
        this.driver=driver;
        log = LoggerFactory.getLogger(this.getClass());
        log.info("Initializing Page: {}", this.getClass().getName());
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 3000);
    }


}
