package com.hldoc.scenarios;

import com.hldoc.helper.RetryAnalyser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;

public class App4 extends ParentClass{
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Test()
    public void testName() {
        logger.info("App4.testName");
        checkLogger();
        logger.info("this test is meant to fail");
        Assert.assertTrue(false);
    }
}
