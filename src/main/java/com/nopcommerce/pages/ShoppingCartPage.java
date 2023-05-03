package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By priceText = By.xpath("//span[@class='value-summary']//strong");
    By quantity = By.xpath("//input[contains(@id,'itemquantity')]");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By termsAndCondition = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By shopingCart =By.xpath("//span[@class='cart-label']");
    By goToCart =By.xpath("//button[contains(text(),'Go to cart')]");
    By quantityValue =By.xpath("//input[contains(@id,'itemquantity')]");

    /**
     * get Shopping CartText
     */
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get PriceText
     */
    public String getPriceText(){
        return getTextFromElement(priceText);
    }

    /**
     * change Value Of Quantity
     */
    public void changeValueOfQuantity(String value){
        sendTextToElement(quantity,value);
    }

    /**
     * update Shopping Cart
     */
    public void updateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }

    /**
     * select Terms And Condition
     */
    public void selectTermsAndCondition(){
        clickOnElement(termsAndCondition);
    }

    /**
     * click On CheckOut
     */
    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }

    /**
     * mouse Hover To Shopping Card
     */
    public void mouseHoverToShoppingCard(){
        mouseHoverToElement(shopingCart);
    }

    /**
     * mouse Hover To GoTo Card And Click
     */
    public void mouseHoverToGoToCardAndClick(){
        mouseHoverToElementAndClick(goToCart);
    }

    /**
     * get Number Of Quantity Value
     */
    public String getNumberOfQuantityValue(){
        return getAttributeValueFromElement(quantityValue);
    }

}
