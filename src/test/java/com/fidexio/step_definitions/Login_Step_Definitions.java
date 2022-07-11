package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_Step_Definitions {
    LoginPage loginPage = new LoginPage();


    @Then("User login as PosManager")
    public void user_loges_in_as_pos_manager() {
        loginPage.loginPosManagerWithConfiguration();

    }

    @Then("User login as SalesManager")
    public void user_loges_in_as_sales_manager() {
        loginPage.loginSalesManagerWithConfiguration();

    }

    @Then("User should be able to login and see {string} in title")
    public void userShouldBeAbleToLoginAndSeeInTitle(String expectedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
}
