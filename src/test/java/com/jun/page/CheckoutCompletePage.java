package com.jun.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutCompletePage {

    WebDriver driver;

    By backHomeButton = By.cssSelector("button#back-to-products");

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBackHomeButton() {
        driver.findElement(backHomeButton).click();
    }

    public void validateCheckoutCompletePageDisplayed() {
        assertTrue(driver.findElement(backHomeButton).isDisplayed());
    }


}
