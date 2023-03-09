package com.jun.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    By buttonAddToCart_BikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By buttonAddToCart_Backpack = By.id("add-to-cart-sauce-labs-backpack");
    By buttonAddToCart_BoltTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By buttonAddToCart_Onesie = By.id("add-to-cart-sauce-labs-onesie");
    By buttonAddToCart_FleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By buttonAddToCart_TShirtRed = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By buttonRemoveFromCart_BikeLight = By.id("remove-sauce-labs-bike-light");
    By buttonRemoveFromCart_Backpack = By.id("remove-sauce-labs-backpack");
    By buttonRemoveFromCart_BoltTShirt = By.id("remove-sauce-labs-bolt-t-shirt");
    By buttonRemoveFromCart_Onesie = By.id("remove-sauce-labs-onesie");
    By buttonRemoveFromCart_FleeceJacket = By.id("remove-sauce-labs-fleece-jacket");
    By buttonRemoveFromCart_TShirtRed = By.id("remove-test.allthethings()-t-shirt-(red)");


    By hyperlinkTextProduct_SauceLabsBackpack = By.id("item_4_title_link");
    By hyperlinkTextProduct_SauceLabsBikeLight = By.id("item_0_title_link");
    By hyperlinkTextProduct_SauceLabsBoltTShirt = By.id("item_1_title_link");
    By hyperlinkTextProduct_SauceLabsFleeceJacket = By.id("item_5_title_link");
    By hyperlinkTextProduct_SauceLabsOnesie = By.id("item_2_title_link");
    By hyperlinkTextProduct_TestallTheThingsTShirtRed = By.id("item_3_title_link");


    By button_BackToProduct = By.id("back-to-products");
    By goToCart = By.cssSelector("span");
    By imageCart = By.id("shopping_cart_container");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }


    public void click_buttonAddToCart_BikeLight() {
        driver.findElement(buttonAddToCart_BikeLight).click();
    }

    public void validate_BikeLight_AddedToCart() {
        driver.findElement(buttonRemoveFromCart_BikeLight).isDisplayed();
    }

    public void click_buttonAddToCart_Backpack() {
        driver.findElement(buttonAddToCart_Backpack).click();
    }

    public void validate_Backpack_AddedToCart() {
        driver.findElement(buttonRemoveFromCart_Backpack).isDisplayed();
    }


    public void click_buttonAddToCart_BoltTShirt() {
        driver.findElement(buttonAddToCart_BoltTShirt).click();
    }

    public void validate_BoltTShirt_AddedToListCart() {
        driver.findElement(buttonRemoveFromCart_BoltTShirt).isDisplayed();
    }



    public void click_buttonAddToCart_Onesie() {
        driver.findElement(buttonAddToCart_Onesie).click();
    }

    public void validate_Onesie_AddedToListCart() {
        driver.findElement(buttonRemoveFromCart_Onesie).isDisplayed();
    }


    public void click_buttonAddToCart_FleeceJacket() {
        driver.findElement(buttonAddToCart_FleeceJacket).click();
    }

    public void validate_FleeceJacket_AddedToListCart() {
        driver.findElement(buttonRemoveFromCart_FleeceJacket).isDisplayed();
    }


    public void click_buttonAddToCart_TShirtRed() {
        driver.findElement(buttonAddToCart_TShirtRed).click();
    }

    public void validate_TShirtRed_AddedToListCart() {
        driver.findElement(buttonRemoveFromCart_TShirtRed).isDisplayed();
    }


    public void click_buttonRemoveFromCart_BikeLight() {
        driver.findElement(buttonRemoveFromCart_BikeLight).click();
    }

    public void validate_BikeLight_RemoveFromCart() {
        driver.findElement(buttonAddToCart_BikeLight).isDisplayed();
    }


    public void click_buttonRemoveFromCart_Backpack() {
        driver.findElement(buttonRemoveFromCart_Backpack).click();
    }

    public void validate_Backpack_RemovedFromCart() {
        driver.findElement(buttonAddToCart_Backpack).isDisplayed();
    }



    public void click_buttonRemoveFromCart_BoltTShirt() {
        driver.findElement(buttonRemoveFromCart_BoltTShirt).click();
    }

    public void validate_BoltTShirt_RemovedFromToCart() {
        driver.findElement(buttonAddToCart_BoltTShirt).isDisplayed();
    }


    public void click_buttonRemoveFromCart_Onesie() {
        driver.findElement(buttonRemoveFromCart_Onesie).click();
    }

    public void validate_Onesie_RemovedFromListCart() {
        driver.findElement(buttonAddToCart_Onesie).isDisplayed();
    }


    public void click_buttonRemoveFromCart_FleeceJacket() {
        driver.findElement(buttonRemoveFromCart_FleeceJacket).click();
    }

    public void validate_FleeceJacket_RemovedFromListCart() {
        driver.findElement(buttonAddToCart_FleeceJacket).isDisplayed();
    }



    public void click_buttonRemoveFromCart_TShirtRed() {
        driver.findElement(buttonRemoveFromCart_TShirtRed).click();
    }

    public void validate_TShirtRed_RemovedFromListCart() {
        driver.findElement(buttonAddToCart_TShirtRed).isDisplayed();
    }




    public void click_text_SauceLabsBackpack() {
        driver.findElement(hyperlinkTextProduct_SauceLabsBackpack).click();
    }

    public void click_text_SauceLabsBikeLight() {
        driver.findElement(hyperlinkTextProduct_SauceLabsBikeLight).click();
    }

    public void click_text_SauceLabsBoltTShirt() {
        driver.findElement(hyperlinkTextProduct_SauceLabsBoltTShirt).click();
    }

    public void click_text_SauceLabsFleeceJacket() {
        driver.findElement(hyperlinkTextProduct_SauceLabsFleeceJacket).click();
    }

    public void click_text_SauceLabsOnesie() {
        driver.findElement(hyperlinkTextProduct_SauceLabsOnesie).click();
    }

    public void click_text_TestallTheThingsTShirtRed() {
        driver.findElement(hyperlinkTextProduct_TestallTheThingsTShirtRed).click();
    }

    public void Click_button_BackToProduct() {
        driver.findElement(button_BackToProduct).click();
    }

    public void click_goToCart() {
        driver.findElement(goToCart).click();
    }

    public void click_ToCart() {
        driver.findElement(imageCart).click();
    }


}
