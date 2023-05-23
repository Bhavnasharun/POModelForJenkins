package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    private By _TermandCondition = By.name("termsofservice");
    private By _CheckOut = By.id("checkout");
    public String expectedaddToCartCompleteMSG = "Update shopping cart";
    public void successfulyiteamadd(){
        String actualMessage = getTextFromelement(By.xpath("//button[text()='Update shopping cart']"));
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedaddToCartCompleteMSG ,"User should add the camera");
    }
    public void CheckOutProcess(){
        clickOnElement(_TermandCondition);
        clickOnElement(_CheckOut);

    }
}
