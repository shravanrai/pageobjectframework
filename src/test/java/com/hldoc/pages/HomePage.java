package com.hldoc.pages;

import com.hldoc.helper.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class HomePage {
    private final WebDriverWait webDriverWait;
    Logger logger=Logger.getLogger(Helper.class.getName());

    public static WebDriver driver;
    Helper helper=null;

    @FindBy(id = "ContentPlaceHolder1_txtDepartDate")
    private WebElement txtDepartDate;

    @FindBy(id = "txtOrigin")
    private WebElement txtOrigin;
    @FindBy(xpath = "//*[@id='divSearchResultFrom']/ul/li[1]/ul/li[1]")
    private WebElement txtOriginOption;

    @FindBy(id = "txtDestination")
    private WebElement txtDestination;
    @FindBy(xpath = "(//*[@id='divSearchResultTo']/ul/li/ul/li/div)[1]")
    private WebElement txtDestinationOption;

    @FindBy(id = "btnBusSearchNew")
    public WebElement btnBusSearchNew;  //temporarily made public to test hlper hover

    public HomePage(WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        if (!driver.getTitle().equals("Bus Online Booking Services at BusOnlineTicket.com Malaysia & Singapore")) {
            throw new IllegalStateException("This is not Bus Online Booking Services at BusOnlineTicket.com Malaysia & Singapore" +
                    " current page is: " + driver.getCurrentUrl());
        }
         webDriverWait = new WebDriverWait(driver, 5);
    }


    public SearchResults seachBus(String txtDepartDate, String txtOrigin, String txtDestination) throws Exception {
        settxtDepartDate(txtDepartDate);
        settxtOriginOption(txtOrigin);
        settxtDestinationOption(txtDestination);
        this.btnBusSearchNew.click();
        return new SearchResults(driver);
    }

    public void settxtDestinationOption(String txtDestination) throws InterruptedException {
        this.txtDestination.clear();
        this.txtDestination.sendKeys(txtDestination);
        webDriverWait.until(ExpectedConditions.visibilityOf(txtDestinationOption)).click();
    }

    public void settxtOriginOption(String txtOrigin) throws InterruptedException {
        this.txtOrigin.clear();
        this.txtOrigin.sendKeys(txtOrigin);
        if(!this.txtOrigin.getText().equalsIgnoreCase(txtOrigin)){
            this.txtOrigin.clear();
            this.txtOrigin.sendKeys(txtOrigin);
        }
        webDriverWait.until(ExpectedConditions.visibilityOf(txtOriginOption)).click();
    }

    public void settxtDepartDate(String txtDepartDate) {
        this.txtDepartDate.clear();
        this.txtDepartDate.sendKeys(txtDepartDate);
        this.txtDepartDate.sendKeys(Keys.TAB);
    }
}
