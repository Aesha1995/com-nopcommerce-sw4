package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmpassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationCompleted = By.xpath("//div[@class='result']");

    /**
     * enter Firstname
     */
    public void enterFirstname(String value){
        sendTextToElement(firstName,value);
    }

    /**
     * enter Lastname
     */
    public void enterLastname(String value){
        sendTextToElement(lastName,value);
    }

    /**
     * enter Email
     */
    public void enterEmail(String value){
        sendTextToElement(email,value);
    }

    /**
     * enter Password
     */
    public void enterPassword(String value){
        sendTextToElement(password,value);
    }

    /**
     * enter Confirm Password
     */
    public void enterConfirmPassword(String value){
        sendTextToElement(confirmpassword,value);
    }

    /**
     * click On Register Button
     */
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    /**
     * get Registration Completed Text
     */
    public String getRegistrationCompletedText(){
        return getTextFromElement(registrationCompleted);
    }
}
