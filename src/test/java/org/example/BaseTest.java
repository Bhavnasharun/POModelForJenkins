package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    DriverManager driverManager = new DriverManager();
    @BeforeMethod
    public void setup(){driverManager.openBrowser();}
    @AfterMethod
    public void tearDown(){
        driverManager.closebrowser();
    }
}
