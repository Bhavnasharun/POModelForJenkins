package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _clickComputer = By.xpath("//a[text()='Build your own computer']");
    private By _Electrics = By.xpath("(//a[text()='Electronics '])[1]");
    private By _Clickcamera = By.xpath("//a[text()=' Camera & photo ']");
    public void emailfriendIteam() {
        clickOnElement(_clickComputer);
    }
    public void addTocardIteam() {
        clickOnElement(_Electrics);
        clickOnElement(_Clickcamera);
    }
}
