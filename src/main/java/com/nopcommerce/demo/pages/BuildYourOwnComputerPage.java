package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.UtilityClass;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends UtilityClass {
    By processor = By.xpath("////label[normalize-space()='Processor']");
    By processor1 = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//label[normalize-space()='RAM']");
    By selectRam1 = By.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.xpath("//label[@for='product_attribute_3_7']");
    By oSRadiVistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
   // By softWare = By.xpath("//label[@for='product_attribute_5_10']");
    By software = By.xpath("//label[@for='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[@id='price-value-1'and contains(text(),'$1,470.00')]");;
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyMessage = By.xpath("//p[@class='content']");

    By closeBar = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");




    public void selectprocessor() {
        mouseHoverToElement(processor);
    }
    public void selectProcessor1(){
        selectByIndexFromDropDown(processor1,1);
    }
    public void Ram() {
        mouseHoverToElement(selectRam);
    }
    public void selectRam() {
        selectByIndexFromDropDown(selectRam1, 3);
    }

    public void selectHddRadio()
    {mouseHoverToElementAndClick(hddRadio);


    }
    public void selectOsRadio() {
        mouseHoverToElementAndClick(oSRadiVistaPremium);
    }
    public void selectSotware() {
        mouseHoverToElementAndClick(software);

    }
    public String verifyPrice() {
        return getTextFromElement(verifyPrice);

    }
    public void clickOnAddToCartButton(){
        mouseHoverToElementAndClick(addToCart);
    }
    public String setVerifyMessage(){
        return getTextFromElement(verifyMessage);

    }public void closeBar(){
        mouseHoverToElementAndClick(closeBar);
    }
   // public void mouseHoverOnShoppingCart(){}
    public void shopingCartButton(){

        mouseHoverToElementAndClick(shoppingCart);

    }

}
