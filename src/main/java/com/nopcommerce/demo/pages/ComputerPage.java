package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.UtilityClass;
import org.openqa.selenium.By;

public class ComputerPage extends UtilityClass {
    By computertab = By.linkText("Computers");
    By desktoptab = By.linkText("Desktops");

    By positionZtoA = By.name("products-orderby");
    By positionAtoZ = By.name("products-orderby");
    By textMessage = By.xpath("//*[@id=\"products-orderby\"]/option[3]");
    By addToCartButton = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By verifyMessage1 = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
public void clickOnComputerTab(){
    clickOnElement(computertab);
}
public void clickondesktop(){
    clickOnElement(desktoptab);
}
public void setNameZtoA(){
    //clickOnElement(positionZtoA);
    selectbyvisibleTextFRomDropDown(positionZtoA,"Name: Z to A");

}
public void setNameAtoZ(){
    selectbyvisibleTextFRomDropDown(positionAtoZ,"Name: A to Z");
}
public String getorderarrange(){
    return getTextFromElement(textMessage);
    }
    public void clickOnAddToCart(){
    mouseHoverToElementAndClick(addToCartButton);

    }
    public String textMessage(){
   return getTextFromElement(verifyMessage1);
    }


}