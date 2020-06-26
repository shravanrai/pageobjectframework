package com.hldoc.pages;

import com.hldoc.helper.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.Logger;

public class SearchResults extends TestBase {
    public static WebDriver driver;
    Logger logger = Logger.getLogger(SearchResults.class.getName());
    WebElement resultToBeProceededWith = null;

    @FindBy(xpath = "//table/tbody/tr[@class='bustr1']")
    List<WebElement> results;

    @FindBy(xpath = "//input[@type='button'][@class='seatproceed']")
    WebElement btnproceed;


    @FindBy(xpath = "//*[@id='content']//div[contains(text(),'Estimated Trip Duration ')]")
    WebElement estimatedTripDuration;

    public SearchResults(WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        logger.info("initializing.." + getClass().getName());
        if (!driver.getTitle().contains("BusOnlineTicket.com")) {
            throw new IllegalStateException("This is not | BusOnlineTicket.com" +
                    " current page is: " + driver.getTitle());
        }

    }

    public Passanger_details findMinimumPricePricedBusAndSelect() {
        logger.info("results.size()" + results.size());
        double minPrice = Double.MAX_VALUE;
        WebElement minPricedBusResult = null;

        for (WebElement result : results
        ) {

            //Find price Column
            String text = result.findElement(By.xpath("//td/div[1]/div[1]")).getText();
            String[] split = text.split("\\s");
            double currentPrice = Double.parseDouble(split[1]);
            if (minPrice > currentPrice) {
                minPrice = currentPrice;
                minPricedBusResult = result;
            }
        }

        //select minimumPricedBus
        minPricedBusResult.findElement(By.xpath("//td/a[@class='btn btn-orange selectseatbutton']")).click();

        //select6SeatsOrAllSeatsIfAvailableSeatsAreLesserThan6
        List<WebElement> availableSeats = minPricedBusResult.findElements(By.xpath("//following::tbody/tr/td/div[@class='seat_available']"));

        for (int i = 0; i < Math.min(6, availableSeats.size()); i++) {
            availableSeats.get(i).click();
        }

        btnproceed.click();
        return new Passanger_details(driver);
    }


}
