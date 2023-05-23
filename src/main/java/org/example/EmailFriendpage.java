package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailFriendpage extends Utils {

    private By _email = By.id("FriendEmail");
    private By _yourEmail = By.id("YourEmailAddress");
    private By _SendEmail = By.xpath("//button[text()='Send email']");
    //this one is qutions two add to cart iteam and email the iteam
    private By _message = By.xpath("//li[text()='Only registered customers can use email a friend feature']");
    LoadProp loadProp = new LoadProp();
    public void clickemaildetails(){
        typetext(_email,loadProp.getProperty("Friend_demail")+timestamp()+
                loadProp.getProperty("half_email"));
        typetext(_yourEmail,loadProp.getProperty("Your_email")+timestamp()+
                loadProp.getProperty("domain_your"));
        clickOnElement(_SendEmail);
    }
    public String expectedEmailTOFriendMSG ="Only registered customers can use email a friend feature";
    public void SuccessfullyemailtoFriend(){
        String actualMessage = getTextFromelement(_message);
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedEmailTOFriendMSG,"Only registered customers can use email a friend feature");
    }
}
