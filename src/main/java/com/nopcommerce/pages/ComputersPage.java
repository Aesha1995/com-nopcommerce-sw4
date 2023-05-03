package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputersPage extends Utility {
    By desktop= By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");
    By shortingFilterOption = By.xpath("//select[@id='products-orderby']");

    /**
     * click On Desktop
     */
    public void clickOnDesktop(){
        clickOnElement(desktop);
    }

    /**
     * select Value From Shorting DropDown
     */
    public void selectValueFromShortingDropDown(String text){
        WebElement dropDown = driver.findElement(shortingFilterOption);
        Select select = new Select(dropDown);
        // Select by visible text
        select.selectByVisibleText(text);
    }

    /**
     * click Add to Cart By ProductName
     */
    public void clickAddtoCartByProductName(String productName) {
        clickOnElement(By.xpath("(//h2//a[normalize-space()='"+productName+"']//following::button)[1]"));
    }
    public List<String> sortDesktopByPositionZtoA(){
        List<WebElement> beforeShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> beforeShortDesktopValue = new ArrayList<>();
        for (WebElement value : beforeShortValue) {
            beforeShortDesktopValue.add(value.getText());
        }
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"),5);

        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }

        Collections.sort(beforeShortDesktopValue);// Ascending order

        Collections.reverse(beforeShortDesktopValue);// reverse

        return beforeShortDesktopValue;
    }
    public List<String> getAllProductNamesAfterShorting(){
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"),5);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"),5);

        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }
        return afterShortDesktopValue;
    }
}
