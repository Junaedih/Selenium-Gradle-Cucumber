package com.jun.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutYourInformationPage {

    WebDriver driver;

    By firstNameInputText = By.cssSelector("input#first-name");
    By lastNameInputText = By.cssSelector("input#last-name");
    By postalCodeInputText = By.cssSelector("input#postal-code");
    By cancelButton = By.cssSelector("button#cancel");
    By continueButton = By.cssSelector("input#continue");

    public CheckoutYourInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String firstname) {
        driver.findElement(firstNameInputText).sendKeys(firstname);
    }

    public void inputLastName(String lastname) {
        driver.findElement(lastNameInputText).sendKeys(lastname);
    }

    public void inputPostalCode(String postalcode) {
        driver.findElement(postalCodeInputText).sendKeys(postalcode);
    }

    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }


    public void validateCheckoutYourInformationPageDisplayed() {
        assertTrue(driver.findElement(firstNameInputText).isDisplayed());
    }

    public void validateErrorAppear(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }


}
