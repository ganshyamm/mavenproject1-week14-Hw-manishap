package com.nopcommerce.demo.computer;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.CheckOutPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.soap.Text;
import java.awt.*;

public class TestSuite extends BaseTest {
    ComputerPage computerPage = new ComputerPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder()throws StaleElementReferenceException {
        computerPage.clickOnComputerTab();
        computerPage.clickondesktop();
        computerPage.setNameZtoA();
        computerPage.selectbyvisibleTextFRomDropDown(By.name("products-orderby"), "Name: Z to A");
        String expectedM = "Name: Z to A";
        Assert.assertEquals(computerPage.getorderarrange(), expectedM, "Name: Z to A");


    }

    @Test
    public void TestnameverifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 2.1 Click on Computer Menu.
        computerPage.clickOnComputerTab();
        //2.2 Click on Desktop
        computerPage.clickondesktop();
        // 2.3 Select Sort By position "Name: A to Z"
        computerPage.setNameAtoZ();
        computerPage.selectbyvisibleTextFRomDropDown(By.name("products-orderby"), "Name: A to Z");
        Thread.sleep(200);
        // 2.4 Click on "Add To Cart"
        computerPage.clickOnAddToCart();
        //2.5 Verify the Text "Build your own computer"
        String expectedM = "Build your own computer";
        Assert.assertEquals(computerPage.textMessage(), expectedM, "Build your own computer");

        buildYourOwnComputerPage.selectProcessor1();
        buildYourOwnComputerPage.selectRam();
        buildYourOwnComputerPage.selectHddRadio();
        buildYourOwnComputerPage.selectOsRadio();
        buildYourOwnComputerPage.selectSotware();
        //2.11 Verify the price "$1,475.00"
        Thread.sleep(600);
        Assert.assertEquals(buildYourOwnComputerPage.verifyPrice(), "$1,470.00", "price is not match");
        buildYourOwnComputerPage.clickOnAddToCartButton();
        Thread.sleep(500);
        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green bar
        Assert.assertEquals(buildYourOwnComputerPage.setVerifyMessage(), "The product has been added to your shopping cart", "Message doesnot match");
        buildYourOwnComputerPage.closeBar();
        buildYourOwnComputerPage.shopingCartButton();
        //2.15 Verify the message "Shopping cart
        Thread.sleep(600);
        //Assert.assertEquals(shoppingCartPage.VerifyShoppingCart(), "Shopping cart");
        shoppingCartPage.updateQuantity();
        shoppingCartPage.updateShoppingCart();
        //2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingCartPage.getVerifySubTotal(), "$2,950.00");
        Thread.sleep(600);
        shoppingCartPage.clickOnCheckBox();
        shoppingCartPage.clickOnCheckOut();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(shoppingCartPage.getWelcomeMessage(), "Welcome, Please Sign In!");
        shoppingCartPage.clickOnCheckOutAsGuest();
        Thread.sleep(500);
        //2.22 Fill the all mandatory field
        checkOutPage.enterFirstName();
        checkOutPage.enterLastName();
        checkOutPage.enterEmail();
        checkOutPage.enterCountry();
        checkOutPage.enterCity();
        Thread.sleep(800);
        checkOutPage.enterAddress1();
        checkOutPage.enterZipPostalCode();
        checkOutPage.enterPhoneNumber();
        Thread.sleep(800);
        checkOutPage.clickOnContinue();
        checkOutPage.clickNextDayAir();
        checkOutPage.clickOnContinueAir();
        Thread.sleep(1000);
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnContinueCard();
        checkOutPage.selectMasterCard();
        Thread.sleep(1000);
        checkOutPage.enterCardHolderName();
        checkOutPage.enterCardNumber();
        checkOutPage.enterExpiryMonth();
        Thread.sleep(1000);
        checkOutPage.enterExpiryYear();
        checkOutPage.enterCardCode();
        checkOutPage.clickOnContinueCheckout();
        Thread.sleep(1000);
        Assert.assertEquals(checkOutPage.getVerifyCreditCardMethod(), "Credit Card");
        //2.32 Verify Shipping Method
        Assert.assertEquals(checkOutPage.getVerifyShippingMethod(), "Next Day Air");
        Thread.sleep(1000);
        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(checkOutPage.getVerifyTotal(), "$2,950.00");
        checkOutPage.clickOnConfirm();
        //2.35 Verify the Text “Thank You”
        Assert.assertEquals(checkOutPage.getVerifyThankYou(), "Thank you");
        Thread.sleep(1000);
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkOutPage.getVerifySuccessMessage(), "Your order has been successfully processed!");
        checkOutPage.clickOnContinueHomepage();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(checkOutPage.verifyWelcomeToStore(), "Welcome to our store");
    }
}





