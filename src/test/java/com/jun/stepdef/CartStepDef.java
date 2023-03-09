package com.jun.stepdef;

import com.jun.BaseTest;
import com.jun.page.CartPage;
import com.jun.page.CheckoutYourInformationPage;
import com.jun.page.HomePage;
import com.jun.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDef extends BaseTest {


    @Given(": user is on cart page and already added product")
    public void userIsOnCartPageAndAlreadyAddedProduct() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.goToLoginPage();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        homePage.validateOnHomePage();
        homePage.click_buttonAddToCart_Onesie();
        homePage.click_buttonAddToCart_FleeceJacket();
        homePage.click_buttonAddToCart_TShirtRed();
        homePage.click_buttonAddToCart_BoltTShirt();
        homePage.click_buttonAddToCart_Backpack();
        homePage.click_buttonAddToCart_BikeLight();
        homePage.click_goToCart();

    }


    @When("user click checkout button")
    public void userClickCheckoutButton() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckoutButton();
    }


    @Then("user is on checkout_your_information page")
    public void userIsOnCheckout_your_informationPage() {
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        checkoutYourInformationPage.validateCheckoutYourInformationPageDisplayed();
    }

    @When("user click continue_shopping button")
    public void userClickContinue_shoppingButton() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickContinueShoppingButton();

    }

    @Then("user back to list products page")
    public void userBackToListProductsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
