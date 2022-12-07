package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.pages.loginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenu = new TopMenuPage();
    @Test
    public void verifyUserShouldnavigateToLoginPageSuccessfully(){
        topMenu.clickOnComputerTab();
        Assert.assertEquals(topMenu.verifyComputerTab(),"Computers");
        topMenu.clickOnElectronicsTab();
        Assert.assertEquals(topMenu.verifyElectronicsTab(),"Electronics");
        topMenu.clickOnApparelTab();
        Assert.assertEquals(topMenu.verifyApparelTab(),"Apparel");
        topMenu.clickOnDigitalDownloadsTab();
        Assert.assertEquals(topMenu.getVerifyDigitalDownloadsTab(),"Digital downloads");
        topMenu.clickOnBooksTab();
        Assert.assertEquals(topMenu.getVerifyBooksTab(),"Books");
        topMenu.clickOnJewelryTab();
        Assert.assertEquals(topMenu.verifyJewelryTab(),"Jewelry");
        topMenu.clickOnGiftCardTab();
        Assert.assertEquals(topMenu.verifyGiftCardTab(),"Gift Cards");
    }

    }

