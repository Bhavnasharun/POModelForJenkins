package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCart extends Utils{
    private By _addtocart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _clickMessage = By.xpath("//a[text()='shopping cart']");
    private By _UpdateShoppingCart = By.id("updatecart");
    public void UsershouldableToaddtheiteam(){
        clickOnElement(_addtocart);
        clickOnElement(_clickMessage);
    } public String expectedyouraddtocartcompliteMSG = "Update shopping cart";
    public void successfulyiteamadd(){
        String actualMessage = getTextFromelement(_UpdateShoppingCart);
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedyouraddtocartcompliteMSG,"Update shopping cart");
    }
}
