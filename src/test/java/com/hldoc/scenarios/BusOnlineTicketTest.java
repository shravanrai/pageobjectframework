package com.hldoc.scenarios;

import com.hldoc.helper.BrowserFactory;
import com.hldoc.helper.Helper;
import com.hldoc.helper.TestBase;
import com.hldoc.pages.HomePage;
import com.hldoc.pages.Passanger_details;
import com.hldoc.pages.SearchResults;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class BusOnlineTicketTest {

    @Test()
    @Parameters({"browserName", "isRemoteDriver"})
    public void test_least_adult_cost_and_select_max_of_6_seats_or_all_seats_if_less_than_6(String browserName, Boolean isRemoteDriver) throws Exception {
        TestBase testBase = new TestBase();
        testBase.startApp(browserName, isRemoteDriver);
        Logger logger = LoggerFactory.getLogger(BusOnlineTicketTest.class);
        logger.info("executing test1...");
        logger.debug("debugging test1...");
        logger.warn("warning test1..");
        logger.debug("executing test1...");

        BrowserFactory instance = BrowserFactory.getInstance();
        WebDriver driver = instance.getDriver();
        SoftAssert softAssert = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Helper helper = new Helper(driver);
        HomePage homePage = new HomePage(driver);

        SearchResults searchResults = homePage.seachBus("2020-07-20", "Cameron Highlands", "Kuala Lumpur");
        helper.takePageVisibleScreenshot();

        Passanger_details passanger_details = searchResults.findMinimumPricePricedBusAndSelect();
        passanger_details.enterPassangerDetailsAndProceed("shravan", "1234567890", "shravanrai.bist@gmail.com", "shravanrai.bist@gmail.com");

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //Alert alert = driver.switchTo().alert();
        String text = alert.getText();

        softAssert.assertEquals(text, "Please select a payment method", "Alert message is not as expected.");
        alert.accept();
        softAssert.assertAll();
        testBase.tearDown();
    }
/*

    @Test()
    public void test_duplicate_least_adult_cost_and_select_max_of_6_seats_or_all_seats_if_less_than_6() throws Exception {
        Logger logger = LoggerFactory.getLogger(BusOnlineTicketTest.class);
        logger.info("executing test2...");
        logger.debug("executing test2...");

        SoftAssert softAssert = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Helper helper = new Helper(driver);
        HomePage homePage = new HomePage(driver);

        SearchResults searchResults = homePage.seachBus("2020-08-20", "Cameron Highlands", "Kuala Lumpur");
        helper.takePageVisibleScreenshot();

        Passanger_details passanger_details = searchResults.findMinimumPricePricedBusAndSelect();
        passanger_details.enterPassangerDetailsAndProceed("apurva", "0987654321", "aourva.bist@gmail.com", "apurva.bist@gmail.com");

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //Alert alert = driver.switchTo().alert();
        String text = alert.getText();

        softAssert.assertEquals(text, "Please select a payment method", "Alert message is not as expected.");
        alert.accept();
        softAssert.assertAll();
    }
*/

}
