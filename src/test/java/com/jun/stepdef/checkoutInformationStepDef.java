package com.jun.stepdef;

import com.jun.BaseTest;
import com.jun.page.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkoutInformationStepDef extends BaseTest {
    @Given("User Is On Checkout Customer Information Page")
    public void userIsOnCheckoutCustomerInformationPage() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);

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

    }

    @And("User Input First name with {string}")
    public void userInputFirstNameWith(String first_name) {
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        checkoutYourInformationPage.inputFirstName(first_name);
    }

    @And("User Input Last Name  with {string}")
    public void userInputLastNameWith(String last_name) {
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        checkoutYourInformationPage.inputLastName(last_name);
    }

    @And("User Input Postal Code  with {string}")
    public void userInputPostalCodeWith(String postal_code) {
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        checkoutYourInformationPage.inputPostalCode(postal_code);

    }

    @When("User click Continue button")
    public void userClickContinueButton() {
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        checkoutYourInformationPage.clickContinueButton();

    }

    @Then("User is on Checkout_Overview Page")
    public void userIsOnCheckout_OverviewPage() {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.validateCheckoutOverviewPageDisplayed();
    }

    @Then("User able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {
        CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        checkoutYourInformationPage.validateErrorAppear(errorMessage);
    }
}
