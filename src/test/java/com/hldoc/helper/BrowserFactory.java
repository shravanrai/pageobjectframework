package com.hldoc.helper;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BrowserFactory {
    private static BrowserFactory instance = null;
    private final Logger logger;
    private String BS_URL;
    WebDriver webDriver;

    public  String BS_USERNAME = "shravanrai1";
    public  String BS_AUTOMATE_KEY = "WrxW19XGynPLsq7BqrbF";

    private String BS_BROWSER_NAME = "Safari";;
    private String BS_BROWSER_VERSION = "13.1";;
    private String BS_OS= "OS X";;
    private String BS_OS_VERSION= "Catalina";;

    private String PROJECT_NAME= "pageobjectframework";;
    private String BUILD_NAME= "1";;
    private String SESSION_NAME= "busbookingbrowserstack1";;
    private String SELENIUM_VERSION = "3.141.59";;

    private String ZALENIUM_URL="http://localhost:4444/wd/hub";
    private String ZALENIUM_FF_TEST_NAME = "myFFTestName";
    private String ZALENIUM_FF_BUILD_NAME= "myTestBuild";
    private String ZALENIUM_FF_RESOLUTION = "1280x720";

    private BrowserFactory()  {
        logger = LoggerFactory.getLogger(BrowserFactory.class);
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("src/test/resources/resource.properties")));
            BS_BROWSER_NAME = properties.getProperty("BS_BROWSER_NAME");
            BS_BROWSER_VERSION = properties.getProperty("BS_BROWSER_VERSION");
            BS_OS= properties.getProperty("BS_OS");
            BS_OS_VERSION=properties.getProperty("BS_OS_VERSION");
            BS_USERNAME =properties.getProperty("BS_USERNAME");
            BS_AUTOMATE_KEY = properties.getProperty("BS_AUTOMATE_KEY");
            BS_URL = String.format(properties.getProperty("BS_URL"), BS_USERNAME, BS_AUTOMATE_KEY);
            PROJECT_NAME= "pageobjectframework";;
            BUILD_NAME= "1";;
            SESSION_NAME= "busbookingbrowserstack1";;
            SELENIUM_VERSION = "3.141.59";;
            ZALENIUM_URL= properties.getProperty("ZALENIUM_URL");
            ZALENIUM_FF_TEST_NAME = "myFFTestName";;
            ZALENIUM_FF_BUILD_NAME= "myTestBuild";;
            ZALENIUM_FF_RESOLUTION = "1280x720";;

        } catch (IOException e) {
                e.printStackTrace();
        }
    }

    synchronized public static BrowserFactory getInstance() {
        if (instance == null) {
            instance = new BrowserFactory();
        }
        return instance;
    }

    public final void setDriver(String browser, boolean isRemoteDriver) throws Exception {
        DesiredCapabilities caps = null;
        String port = "4444";
        switch (browser) {
            case "browserstack":
                caps = new DesiredCapabilities();
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                caps.setCapability("browserName", BS_BROWSER_NAME);
                caps.setCapability("browserVersion", BS_BROWSER_VERSION);
                browserstackOptions.put("os", BS_OS);
                browserstackOptions.put("osVersion", BS_OS_VERSION);
                browserstackOptions.put("projectName", PROJECT_NAME);
                browserstackOptions.put("buildName", BUILD_NAME);
                browserstackOptions.put("sessionName", SESSION_NAME);
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", SELENIUM_VERSION);
                browserstackOptions.put("userName", BS_USERNAME);
                browserstackOptions.put("accessKey", BS_AUTOMATE_KEY);
                caps.setCapability("bstack:options", browserstackOptions);
                logger.info(BS_URL);
                //webDriver.set(new RemoteWebDriver(new URL(BS_URL), caps));
                webDriver=new RemoteWebDriver(new URL(BS_URL), caps);
                break;
            case "chrome":
                caps = new DesiredCapabilities();
                ChromeOptions chOptions = new ChromeOptions();
                Map<String, Object> chromePrefs = new HashMap<String, Object>();
                chromePrefs.put("credentials_enable_service", false);
                chOptions.setExperimentalOption("prefs", chromePrefs);
                chOptions.addArguments("--disable-plugins", "--disable-extensions",
                        "--disable-popup-blocking");
                caps.setCapability("applicationCacheEnabled", false);
                caps.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
                caps.setBrowserName(BrowserType.CHROME);
                caps.setCapability("name", "myChromeTestName");
                caps.merge(chOptions);

                if (isRemoteDriver) {
                  //  webDriver.set(new RemoteWebDriver(new URL(ZALENIUM_URL), caps));
                } else {
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_linux64/75/chromedriver");

                    //webDriver.set( ThreadGuard.protect(new ChromeDriver()));
                    webDriver=ThreadGuard.protect(new ChromeDriver());
                }
                break;

            case "firefox":
                caps = new DesiredCapabilities();
                FirefoxOptions ffOptions = new FirefoxOptions();
                //Map<String, Object> ffPrefs = new HashMap<String, Object>();
                //ffPrefs.put("credentials_enable_service", false);
                //ffOptions.addPreference("prefs", String.valueOf(ffPrefs));
                ffOptions.addArguments("--disable-plugins", "--disable-extensions",
                        "--disable-popup-blocking");
                //caps.setCapability(FirefoxOptions.FIREFOX_OPTIONS,ffOptions);
                // caps.setCapability("applicationCacheEnabled", false);
                caps.setBrowserName(BrowserType.FIREFOX);
                caps.setCapability("name", ZALENIUM_FF_TEST_NAME);
                caps.setCapability("build", ZALENIUM_FF_BUILD_NAME);
                caps.setCapability("screenResolution", ZALENIUM_FF_RESOLUTION);
                caps.setCapability("tz", "Asia/Calcutta");
                caps.merge(ffOptions);
                if (isRemoteDriver) {
                    //webDriver.set(new RemoteWebDriver(new URL(ZALENIUM_URL), caps));
                } else {
                    System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver-v0.26.0-linux64/geckodriver");
                   // webDriver.set( ThreadGuard.protect(new FirefoxDriver()));
                    webDriver=ThreadGuard.protect(new FirefoxDriver());

                }
                break;

            case "opera":
                caps = new DesiredCapabilities();
                caps.setBrowserName(BrowserType.OPERA);
                OperaOptions operaOptions = new OperaOptions();
                caps.merge(operaOptions);
                //webDriver.set(new RemoteWebDriver(new URL(ZALENIUM_URL), caps));
                break;
        }
        logger.info("browserName : " + caps.getBrowserName());
        logger.info("browserVersion : " + caps.getVersion());
    }

    public WebDriver getDriver() {
       // return webDriver.get();
        return webDriver;
    }
}
