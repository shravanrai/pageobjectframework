package com.hldoc.helper;

import com.hldoc.pages.HomePage;
import org.testng.annotations.Test;

public class HelperTest extends TestBase {
    Helper helper;
    HomePage homePage;

    @Test()
    public void test_hoverfunction() throws Exception {
        helper = new Helper(driver);
        homePage = new HomePage(driver);
        helper.hoverOverElement(homePage.btnBusSearchNew);
    }

    @Test
    public void testHightLightElement() throws Exception {
        helper = new Helper(driver);
        homePage = new HomePage(driver);
        helper.highlightElement(homePage.btnBusSearchNew);
    }
}
