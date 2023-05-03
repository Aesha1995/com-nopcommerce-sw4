package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By cellPhone = By.xpath("//h1[normalize-space()='Cell phones']");
    By ProductName = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By PriceName = By.xpath("//div[@class='product-price']//span[normalize-space()='$349.00']");
    By listView = By.xpath("//a[normalize-space()='List']");
    By updateQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By successfullyText = By.xpath("//div[@id='bar-notification']/div/p");
    By closeNotificationBar = By.xpath("//span[@title='Close']");
    By nokiaPhone = By.xpath("//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]");
    /**
     * get Cell Phone Text
     * */
    public String getCellPhoneText() {
        return getTextFromElement(cellPhone);
    }

    /**
     * click On List ViewIcon
     */
    public void clickOnListViewIcon(){
        clickOnElement(listView);
    }

    /**
     * select Phone FromList
     */
    public void selectPhoneFromList() {
        clickOnElement(nokiaPhone);
    }

    /**
     * get Product NameText
     */
    public String getProductNameText(){
        return getTextFromElement(ProductName);
    }

    /**
     * get PriceText
     */
    public String getPriceText(){
        return getTextFromElement(PriceName);
    }

    /**
     * update Quantity

     */
    public void updateQuantity(String value){
        sendTextToElement(updateQuantity,value);
    }

    /**
     * click On Add ToCart
     */
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    /**
     * get Successfull Added To CartText
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
}
