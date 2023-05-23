package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    EmailFriendpage emailFriendpage = new EmailFriendpage();
    AddToCart addToCart  = new AddToCart();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void veryfiyUserShouldableToemailFriend(){
        homePage.emailfriendIteam();
        computerPage.ClickOnEmailToFriend();
        emailFriendpage.clickemaildetails();
        emailFriendpage.SuccessfullyemailtoFriend();}
    @Test
    public void verfiyUserShouldAbleToaddIteamoncart(){
        homePage.addTocardIteam();
        addToCart.UsershouldableToaddtheiteam();
        addToCart.successfulyiteamadd();
        shoppingCartPage.successfulyiteamadd();
        shoppingCartPage.CheckOutProcess();}}
