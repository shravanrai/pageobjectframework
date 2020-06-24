package com.hldoc.helper;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SingletonDriver {

    static WebDriver driver;
    public static WebDriver getSingletonChromeDriver(){
        if(driver==null){
            Boolean setCapabilties=false;
            if (setCapabilties){
                ChromeOptions chromeOptions = new ChromeOptions();
 /*               chromeOptions.setCapability(CapabilityType.APPLICATION_NAME, "name");
                chromeOptions.setProxy(new Proxy().setHttpProxy("<HOST:PORT>"));
                chromeOptions.setAcceptInsecureCerts(false);
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
*/
            //chromeOptions.addArguments("--headless");
                //chromeOptions.addArguments("disable-infobars");
                //chromeOptions.addArguments("disable-images");
                //chromeOptions.addExtensions("");

                DesiredCapabilities desiredCapabilities = new DesiredCapabilities().chrome();
                // desiredCapabilities.setCapability(CapabilityType.);

                desiredCapabilities.setCapability(CapabilityType.APPLICATION_NAME, "");
                desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "");
                desiredCapabilities.setCapability(CapabilityType.BROWSER_VERSION, "");
                desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "");

                desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, "");
                desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "");

                desiredCapabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, "");
                desiredCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "");
                desiredCapabilities.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, "");

                //merging options and capabilities.
                desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                desiredCapabilities.merge(chromeOptions);

                driver = new ChromeDriver(chromeOptions);
            }else{
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    public  static WebDriver getSingletonFirefoxDriver(){
        if(driver==null){
            System.setProperty("webdriver.gecko.driver","/home/shravan/Documents/selenium4_browsers/geckodriver-v0.26.0-linux64/geckodriver");
            driver=new FirefoxDriver();
        }
        return driver;
    }

    public static WebDriver getSingletonIEDriver(){
        if(driver==null){
            //need to update the path
            System.setProperty("webdriver.ie.driver","/home/shravan/Documents/selenium4_browsers/geckodriver-v0.26.0-linux64/geckodriver");
            driver=new InternetExplorerDriver();
        }
        return driver;
    }

    public static WebDriver getSingletonRemoteWebDriver() {
        /**
         * java -jar selenium-server-standalone-2.45.0.jar -role h
         * java -jar lib/selenium-server-standalone-2.43.1.jar -role node  -hub http://localhost:4444/grid/register -port 5555
         *
         * java -jar lib/selenium-server-standalone-2.43.1.jar -role node  -hub http://localhost:4444/grid/register -port 6666
         *
         * java -jar lib/selenium-server-standalone-2.43.1.jar -role node  -hub http://localhost:4444/grid/register -port 7777
         */
        if(driver==null){
            try{
                URL remoteAddress = new URL("");
                Capabilities desiredCapabilities = new DesiredCapabilities();
                driver=new RemoteWebDriver(remoteAddress, desiredCapabilities);
            }catch (MalformedURLException e) {
                e.printStackTrace();
            }

        }
        return driver;
    }
}
