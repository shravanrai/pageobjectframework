package com.hldoc.helper;

import com.mysql.jdbc.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.logging.Logger;

public class Helper {
    Logger logger=Logger.getLogger(Helper.class.getName());

    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    public FluentWait<WebDriver> fluentWait;

    public Helper(WebDriver driver) {
        this.driver = driver;
      //  webDriverWait= new WebDriverWait(driver,10);
     //  actions = new Actions(driver);
    }

    public WebElement waitForElementToBeClickable(WebElement ele)  {
        return webDriverWait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void hoverOverElement(WebElement ele) throws InterruptedException {
        actions = new Actions(driver);
        for (int i = 0; i <5 ; i++) {
            actions.moveToElement(ele).moveToElement(ele).perform();
            Thread.sleep(100l);
        }
        }

    public void takeElementScreenshot(WebElement ele) throws IOException {
        File screenshotAs = ele.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs, new File("/"+ele.getAttribute("text")+".png"));
    }

    public void takePageVisibleScreenshot() throws IOException {

        File screenshotAs = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String format = simpleDateFormat.format(date);

       // FileUtils.copyFile(screenshotAs, new File("user.dir"+"/"+format+".png"));
        FileHandler.copy(screenshotAs, new File(System.getProperty("user.dir")+"/"+format+".png"));

    }

    public void takeFullScreenScreenshot(WebElement ele) throws IOException {

        File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs, new File("/"+ele.getAttribute("text")+".png"));
    }
    public void useFluentWait(WebElement ele){
        fluentWait = new FluentWait<>(driver);
        fluentWait.ignoring(NoSuchElementException.class).pollingEvery(Duration.ofSeconds(5)).withTimeout(Duration.ofSeconds(30));

        WebElement until = fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return ele; //generally we pass xpaht directly
            }
        });


    }

    public void highlightElement(WebElement ele) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        for (int i = 0; i <4 ; i++) {
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
            Thread.sleep(100l);
            js.executeScript("arguments[0].setAttribute('style', '');", ele);
        }
      }

      //AutoId
      public void updaloadFile() throws IOException {
          Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\Uploadfile.exe");
      }

      public void downloadFile(){

      }


    public void connectToNySQLDB(String sqlQuery) throws SQLException {
        Driver mysqlDriver  = new Driver();
        DriverManager.registerDriver(mysqlDriver);
        Connection connection = DriverManager.getConnection("10.3.43.22", "root", "passwd");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

    }


    public void setChomeDesiredCapabilities(){
/*        DesiredCapabilities desiredCapabilities = new DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(Capabilities.);



        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("disable-infobars");*/

    }



}
