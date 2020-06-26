package com.hldoc.pages;

import com.hldoc.helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class Passanger_details {
    public static WebDriver driver;
    Logger logger = Logger.getLogger(Helper.class.getName());
    //Full name
    @FindBy(id = "ContentPlaceHolder1_txtName")
    WebElement txtName;

    //Mobile no.
    @FindBy(id = "ContentPlaceHolder1_txtPhone")
    WebElement txtPhone;

    //email
    @FindBy(id = "ContentPlaceHolder1_txtEmail")
    WebElement txtEmail;

    //ReEnter email
    @FindBy(id = "ContentPlaceHolder1_txtEmail1")
    WebElement txtEmail1;

    //btnProceedPayment //submit
    @FindBy(id = "ContentPlaceHolder1_btnProceedPayment")
    WebElement btnProceedPayment;

    public Passanger_details(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //EnterPassangerDetailsAndProceed
    public void enterPassangerDetailsAndProceed(String txtName, String txtPhone, String txtEmail, String txtEmail1) {
        this.txtName.sendKeys(txtName);
        this.txtPhone.sendKeys(txtPhone);
        this.txtEmail.sendKeys(txtEmail);
        this.txtEmail1.sendKeys(txtEmail1);

        btnProceedPayment.click();
    }

}
