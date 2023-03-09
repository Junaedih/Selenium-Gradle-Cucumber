package com.jun.stepdef;

import com.jun.BaseTest;
import com.jun.page.HomePage;
import com.jun.page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPoductToCartStepDef extends BaseTest  {

    @Given("user is on Homepage")
    public void userIsOnHomepage() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.goToLoginPage();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        homePage.validateOnHomePage();
    }


    @When("user click add to cart Product Sauce Labs Backpack")
    public void userClickAddToCartProductSauceLabsBackpack() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonAddToCart_Backpack();

    }

    @Then("Product Sauce Labs Backpack added on list Cart")
    public void productSauceLabsBackpackAddedOnListCart() {

        HomePage homePage = new HomePage(driver);
        homePage.validate_Backpack_AddedToCart();

    }


    @When("user click add to cart Sauce Labs Bike Light")
    public void userClickAddToCartSauceLabsBikeLight() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonAddToCart_BikeLight();

    }


    @Then("Product Sauce Labs Bike Light added on list Cart")
    public void productSauceLabsBikeLightAddedOnListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_BikeLight_AddedToCart();
    }

    @When("user click add to cart Sauce Labs Bolt T-Shirt")
    public void userClickAddToCartSauceLabsBoltTShirt() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonAddToCart_BoltTShirt();

    }

    @Then("Product Sauce Labs Bolt T-Shirt added on list Cart")
    public void productSauceLabsBoltTShirtAddedOnListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_BoltTShirt_AddedToListCart();
    }

    @When("user click add to cart Sauce Labs Fleece Jacket")
    public void userClickAddToCartSauceLabsFleeceJacket() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonAddToCart_FleeceJacket();

    }

    @Then("Product Sauce Labs Fleece Jacket added on list Cart")
    public void productSauceLabsFleeceJacketAddedOnListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_FleeceJacket_AddedToListCart();
    }

    @When("user click add to cart Sauce Labs Onesie")
    public void userClickAddToCartSauceLabsOnesie() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonAddToCart_Onesie();

    }

    @Then("Product Sauce Labs Onesie added on list Cart")
    public void productSauceLabsOnesieAddedOnListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_Onesie_AddedToListCart();

    }


    @When("user click add to cart Test.allTheThings-T-Shirt-Red")
    public void userClickAddToCartTestAllTheThingsTShirtRed() {
        HomePage homePage = new HomePage(driver);
        homePage.click_buttonAddToCart_TShirtRed();
    }

    @Then("Product Test.allTheThings-T-Shirt-Red added on list Cart")
    public void productTestAllTheThingsTShirtRedAddedOnListCart() {
        HomePage homePage = new HomePage(driver);
        homePage.validate_TShirtRed_AddedToListCart();

    }
}
