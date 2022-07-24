package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("user is on the login page of fidexio page")
    public void user_is_on_the_login_page_of_fidexio_page() {
        String loginPageLink = ConfigurationReader.getProperty("fidexioPage");
        Driver.getDriver().get(loginPageLink);
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.loginInput.sendKeys(username);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user sees {string} in top right dropdown title")
    public void user_sees_in_the_title(String expectedInTitle) {
        //String actualTitle = Driver.getDriver().getTitle();
        String actualTitle = basePage.userDropdown.getText();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedInTitle));
    }

    @Given("user is on the logged page of fidexio page")
    public void userIsOnTheLoggedPageOfFidexioPage() {
        loginPage.loginPosManagerWithConfiguration();
    }
}
