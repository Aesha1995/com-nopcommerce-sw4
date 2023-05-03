package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By shippingContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By paymentContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By paymentInfoContinueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By nextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By selectMonth = By.xpath("//select[@id='ExpireMonth']");
    By selectYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By paymentTypeMessage = By.xpath("//span[normalize-space()='Credit Card']");
    By shippingMethodText = By.xpath("//span[normalize-space()='Next Day Air']");
    By totalPriceText = By.xpath("//span[@class='product-subtotal']");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");

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
     * select Country
     */
    public void selectCountry(String value){
        selectByVisibleTextFromDropDown(country,value);
    }

    /**
     * enter City
     */
    public void enterCity(String value){
        sendTextToElement(city,value);
    }

    /**
     * enter Address1
     */
    public void enterAddress1(String value){
        sendTextToElement(address1,value);
    }

    /**
     * enter ZipCode
     */
    public void enterZipCode(String value){
        sendTextToElement(zipCode,value);
    }

    /**
     * enter Phone Number
     */
    public void enterPhoneNumber(String value){
        sendTextToElement(phoneNumber,value);
    }

    /**
     * click On Continue
     */
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

    /**
     * select Next DayAir
     */
    public void selectNextDayAir(){
        clickOnElement(nextDayAir);
    }

    /**
     * click On Shipping Continue
     */
    public void clickOnShippingContinue(){
        clickOnElement(shippingContinueButton);
    }

    /**
     * click On CreditCard
     */
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }

    /**
     * click On Payment Continue
     */
    public void clickOnPaymentContinue(){
        clickOnElement(paymentContinueButton);
    }

    /**
     * select CreditCard Type
     */
    public void selectCreditCardType(String value) {
        selectByVisibleTextFromDropDown(creditCardType,value);
    }

    /**
     * enter CardHolder Name
     */
    public void enterCardHolderName(String value){
        sendTextToElement(cardHolderName,value);
    }

    /**
     * enter CardNumber
     */
    public void enterCardNumber(String value){
        sendTextToElement(cardNumber,value);
    }

    /**
     * select Expiration Date
     */
    public void selectExpirationDate(String month,String year){
        selectByVisibleTextFromDropDown(selectMonth,month);
        selectByVisibleTextFromDropDown(selectYear,year);
    }

    /**
     * enter CardCode
     */
    public void enterCardCode(String value){
        sendTextToElement(cardCode,value);
    }

    /**
     * get Payment Type Text
     */
    public String getPaymentTypeText(){
        return getTextFromElement(paymentTypeMessage);
    }

    /**
     * get Shipping Method Text
     */
    public String getShippingMethodText(){
        return getTextFromElement(shippingMethodText);
    }

    /**
     * get Total PriceText
     */
    public String getTotalPriceText(){
        return getTextFromElement(totalPriceText);
    }

    /**
     * click On Confirm
     */
    public void clickOnConfirm() {
        clickOnElement(confirmButton);
    }

    /**
     * click On Payment Info Continue
     */
    public void clickOnPaymentInfoContinue(){
        clickOnElement(paymentInfoContinueButton);
    }
}
