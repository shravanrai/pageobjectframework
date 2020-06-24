package com.hldoc.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    private static BrowserFactory instance = null;
    ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    private BrowserFactory() {

    }

    synchronized public static BrowserFactory getInstance() {
        if (instance == null) {
            instance = new BrowserFactory();
        }
        return instance;
    }

    public final void setDriver(String browser, boolean isRemoteDriver) throws Exception {

        DesiredCapabilities caps = null;
        String port ="4444";

        switch (browser) {

            case "chrome":
                caps = new DesiredCapabilities();
                ChromeOptions chOptions = new ChromeOptions();
                Map<String, Object> chromePrefs = new HashMap<String, Object>();
                chromePrefs.put("credentials_enable_service", false);
                chOptions.setExperimentalOption("prefs", chromePrefs);
                chOptions.addArguments("--disable-plugins", "--disable-extensions",
                        "--disable-popup-blocking");
                //caps.setCapability(ChromeOptions.CAPABILITY, chOptions);
                caps.setCapability("applicationCacheEnabled", false);
                caps.setBrowserName(BrowserType.CHROME);
                caps.setCapability("name", "myChromeTestName");

                caps.merge(chOptions);

                if (isRemoteDriver) {
                    webDriver.set(new RemoteWebDriver(new URL("http://localhost:"+port+"/wd/hub"), caps));
                } else {
                    System.setProperty("webdriver.chrome.driver", "/home/shravan/Documents/selenium4_browsers/chromedriver_linux64/75/chromedriver_linux64/chromedriver");
                    webDriver.set(new ChromeDriver());
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
                caps.setCapability("name", "myFFTestName");
                caps.setCapability("build", "myTestBuild");
                caps.setCapability("screenResolution", "1280x720");
                caps.setCapability("tz", "Asia/Calcutta");


                caps.merge(ffOptions);

                if (isRemoteDriver) {
                    webDriver.set(new RemoteWebDriver(new URL("http://localhost:"+port+"/wd/hub"), caps));
                } else {
                    System.setProperty("webdriver.gecko.driver", "/home/shravan/Documents/selenium4_browsers/geckodriver-v0.26.0-linux64/geckodriver");
                    webDriver.set(new FirefoxDriver());
                }
                break;

            case "opera":
                caps = new DesiredCapabilities();
                caps.setBrowserName(BrowserType.OPERA);
                OperaOptions operaOptions = new OperaOptions();
                caps.merge(operaOptions);
                webDriver.set(new RemoteWebDriver(new URL("http://localhost:"+port+"/wd/hub"), caps));
                break;
        }
    }

    public WebDriver getDriver() {
        return webDriver.get();
    }
}
