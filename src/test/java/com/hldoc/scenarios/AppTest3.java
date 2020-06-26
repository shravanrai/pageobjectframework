package com.hldoc.scenarios;

import net.rcarz.jiraclient.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppTest3 {

    private Logger logger;

    public AppTest3() {
        logger = LoggerFactory.getLogger(AppTest3.class);
    }

    @Test
    public void testName() {
        System.out.println("AppTest3.testName");
        Assert.assertTrue(false);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws MalformedURLException, JiraException {
        System.out.println("AppTest3.tearDown");
        if (result.getStatus() == ITestResult.FAILURE) {


            BasicCredentials basicCredentials = new BasicCredentials("admin", "admin");
            JiraClient jiraClient = new JiraClient("https://testautomationworld.atlassian.net", basicCredentials);
            Issue issue = jiraClient.createIssue("Refresh", "Bug").field(Field.SUMMARY, result.getMethod().getMethodName() + "is failed due to" +
                    result.getThrowable().toString()).field(Field.DESCRIPTION, "get the description").execute();
            logger.info("issue created in jira: " + issue);
        }

    }
}
