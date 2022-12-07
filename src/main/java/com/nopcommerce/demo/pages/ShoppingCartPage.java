package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.UtilityClass;
import org.openqa.selenium.By;

public class ShoppingCartPage extends UtilityClass {

    By shoppingCart = By.xpath("\"//h1[contains(text(),'Shopping cart')]");
    By updateQuantity = By.xpath("(//input[contains(@id, 'itemquantity')])");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By verifyTotal = By.xpath("//span[@class='product-subtotal']");
    By checkBox = By.xpath("//label[contains(text(),'I agree with the terms of service and I adhere to ')]");
    By checkOut = By.xpath("//button[@id='checkout']");
    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By verifyShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By verifyQuantity2 = By.xpath("//span[contains(text(),'(2)')]");
    By verifyNokiaSubTotal = By.xpath("//span[@class='product-subtotal']");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkOutNokia = By.xpath("//button[@id='checkout']");
    By nokiaShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By termsOfServiceNokia = By.xpath("//input[@id='termsofservice']");
    By checkOutNokiaShopping = By.xpath("//button[@id='checkout']");


    public String shoppingCartText() {
        return getTextFromElement(shoppingCart);
    }

    public void updateQuantity() {
        sendTextToElement(updateQuantity, "2");
    }

    public void updateShoppingCart() {
        clickOnElement(updateShoppingCart);

    }

    public String getVerifySubTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
    }

    public String VerifyShoppingCart() {
        return getTextFromElement(verifyShoppingCart);
    }

    public String VerifyQuantity2() {
        return getTextFromElement(verifyQuantity2);
    }

    public String getVerifyNokiaSubTotal() {
        return getTextFromElement(verifyNokiaSubTotal);
    }

    public void clickTermsOfService() {
        clickOnElement(termsOfService);
    }

    public void clickCheckOutNokia() {
        clickOnElement(checkOutNokia);
    }

    public String verifyNokiaShoppingCart() {
        return getTextFromElement(nokiaShoppingCart);
    }

    public void clickTermsOfServiceNokia() {
        clickOnElement(termsOfServiceNokia);
    }

    public void clickCheckOutNokiaShopping() {
        clickOnElement(checkOutNokiaShopping);
    }


}