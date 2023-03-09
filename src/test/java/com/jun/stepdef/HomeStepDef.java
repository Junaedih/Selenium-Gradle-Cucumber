package com.jun.stepdef;

import com.jun.BaseTest;
import com.jun.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }


}
