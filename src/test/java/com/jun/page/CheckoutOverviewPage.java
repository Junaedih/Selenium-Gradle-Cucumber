package com.jun.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutOverviewPage {

    WebDriver driver;

    By cancelButton = By.cssSelector("button#cancel");

    By finishButton = By.cssSelector("button#finish");

    By summary = By.cssSelector("div.summary_tax_label");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }


    public void validateCheckoutOverviewPageDisplayed() {
        assertTrue(driver.findElement(summary).isDisplayed());

    }


}
