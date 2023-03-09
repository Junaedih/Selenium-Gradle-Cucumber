package com.jun.stepdef;

import com.jun.BaseTest;
import com.jun.page.HomePage;
import com.jun.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveProductFromCartStepDef extends BaseTest {
    @Given("user already added product before")
    public void userAlreadyAddedProductBefore() {
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
    }

    @When("user click button remove product for Sauce Labs Backpack")
    public void userClickButtonRemoveProductForSauceLabsBackpack() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonRemoveFromCart_Backpack();
    }

    @Then("Product Sauce Labs Backpack removed from list Cart")
    public void productSauceLabsBackpackRemovedFromListCart() {

        HomePage homePage = new HomePage(driver);
        homePage.validate_Backpack_RemovedFromCart();
    }

    @When("user click button remove product for Sauce Labs Bike Light")
    public void userClickButtonRemoveProductForSauceLabsBikeLight() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonRemoveFromCart_BikeLight();
    }


    @Then("Product Sauce Labs Bike Light removed from list Cart")
    public void productSauceLabsBikeLightRemovedFromListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_BikeLight_RemoveFromCart();
    }


    @When("user click button remove product for Sauce Labs Bolt T-Shirt")
    public void userClickButtonRemoveProductForSauceLabsBoltTShirt() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonRemoveFromCart_BoltTShirt();
    }


    @Then("Product Sauce Labs Bolt T-Shirt removed from list Cart")
    public void productSauceLabsBoltTShirtRemovedFromListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_BoltTShirt_RemovedFromToCart();
    }

    @When("user click button remove product for Sauce Labs Fleece Jacket")
    public void userClickButtonRemoveProductForSauceLabsFleeceJacket() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonRemoveFromCart_FleeceJacket();
    }

    @Then("Product Sauce Labs Fleece Jacket removed from list Cart")
    public void productSauceLabsFleeceJacketRemovedFromListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_FleeceJacket_RemovedFromListCart();
    }

    @When("user click button remove product for Sauce Labs Onesie")
    public void userClickButtonRemoveProductForSauceLabsOnesie() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonRemoveFromCart_Onesie();
    }

    @Then("Product Sauce Labs Onesie removed from list Cart")
    public void productSauceLabsOnesieRemovedFromListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_Onesie_RemovedFromListCart();
    }

    @When("user click button remove product for T-Shirt-(Red)")
    public void userClickButtonRemoveProductForTShirtRed() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_TShirtRed_RemovedFromListCart();
    }

    @Then("Product T-Shirt-(Red) removed from list Cart")
    public void productTShirtRedRemovedFromListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_TShirtRed_RemovedFromListCart();

    }
}
