package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");

    By totalPrice = By.xpath("//div[@class='product-price']//span[@id='price-value-1']");
    By microsoftOfficeSoftwareOption = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommanderSoftwareOption = By.xpath("//input[@id='product_attribute_5_12']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By successfullyText = By.xpath("//div[@id='bar-notification']");
    By closeNotificationBar = By.xpath("//span[@title='Close']");
    By shopingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");

    /**
     * get Build Your Own Computer Text
     */
    public String getBuildYourOwnComputerText(){
        return getTextFromElement(buildYourOwnComputerText);
    }

    /**
     * select Processor
     */
    public void selectProcessor(String name){
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }

    /**
     * select Ram
     */
    public void selectRam(String name){
        selectByVisibleTextFromDropDown(selectRam, name);
    }

    /**
     * select HDD
     */
    public void selectHDD(String value){
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    /**
     * select Os
     */
    public void selectOs(String value){
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }

    /**
     * select Microsoft Office SoftwareOption
     */
    public void selectMicrosoftOfficeSoftwareOption(){
        selectCheckBox(microsoftOfficeSoftwareOption);
    }

    /**
     * select Total Commander Software Option
     */
    public void selectTotalCommanderSoftwareOption(){
        selectCheckBox(totalCommanderSoftwareOption);
    }

    /**
     * get Total Price Text
     */
    public String getTotalPriceText(){
        return getTextFromElement(totalPrice);
    }

    /**
     * click On Add to Cart
     */
    public void clickOnAddtoCart(){
        clickOnElement(addToCart);
    }

    /**
     * get Successfully Added To CartText
     */
    public String getSuccessfullAddedToCartText(){
        return getTextFromElement(successfullyText);
    }

    /**
     * close Notification Bar
     */
    public void closeNotificationBar(){
        clickOnElement(closeNotificationBar);
    }

    /**
     * mouse Hover To ShoppingCart And ClickOnCart
     */
    public void mouseHoverToShoppingCartAndClickOnCart(){
        mouseHoverToElement(shopingCart);
        mouseHoverToElementAndClick(goToCart);
    }
}
