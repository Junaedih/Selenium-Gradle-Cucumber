package com.jun.stepdef;

import com.jun.BaseTest;
import com.jun.page.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkoutOverviewStepDef extends BaseTest {
    @Given("User Is On Checkout Overview Page")
    public void userIsOnChekoutOverviewPage() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);


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
        cartPage.clickCheckoutButton();
        checkoutYourInformationPage.validateCheckoutYourInformationPageDisplayed();
        checkoutYourInformationPage.inputFirstName("Junaedih");
        checkoutYourInformationPage.inputLastName("Alghazali");
        checkoutYourInformationPage.inputPostalCode("15416");
        checkoutYourInformationPage.clickContinueButton();
        checkoutOverviewPage.validateCheckoutOverviewPageDisplayed();

    }

    @When("User Click Finish Button")
    public void userClickFinishButton() {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.clickFinishButton();
    }

    @Then("User Is On Checkout Complete Page")
    public void userIsOnCheckoutCompletePage() {
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        checkoutCompletePage.validateCheckoutCompletePageDisplayed();
    }


    @Then("User Is Redirect To Homepage")
    public void userIsRedirectToHomepage() {
        HomePage homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @When("User Click Cancel_Button")
    public void userClickCancel_Button() {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.clickCancelButton();

    }
}
