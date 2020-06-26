package com.hldoc.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TestBase {

    //intialize webdriver
    public static WebDriver driver;
    Logger logger = Logger.getLogger(String.valueOf(TestBase.class));
    private BrowserFactory browserFactory;

    /*  @BeforeClass
      @Parameters({"browserName"})*/
    public void startApp(String browserName, boolean isRemoteDriver) throws Exception {
/*       BrowserFactory browserFactory = new BrowserFactory();
       ThreadLocal<WebDriver> WebDriver = new ThreadLocal<>();
       WebDriver.set(browserFactory.getBrowser(browserName));
       driver = WebDriver.get();*/

        browserFactory = BrowserFactory.getInstance();
        browserFactory.setDriver(browserName, isRemoteDriver);
        //  driver = browserFactory.getDriver();
        // logger.info(driver.toString());
        logger.info(String.valueOf(Thread.currentThread().getId()));

        //driver = browserFactory.getBrowser(browserName);
        // driver = browserFactory.getDriver();

        browserFactory.getDriver().get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
        // driver.manage().window().maximize();
        browserFactory.getDriver().manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
        //  driver.manage().window().maximize();
        logger.info("launched Application..");
        WebDriverWait wait = new WebDriverWait(browserFactory.getDriver(), 10l);

    }


    /*    //close
        @AfterClass*/
    public void tearDown() {
        browserFactory.getDriver().quit();
    }
}
