package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.FleetPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.pages.VehicleCostsPage;
import com.fidexio.utilities.BrowserUtilities;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vehicle_Costs_Step_Definitions {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    FleetPage fleetPage = new FleetPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Given("user is logged in")
    public void user_is_logged_in() {
        String loginPageLink = ConfigurationReader.getProperty("fidexioPage");
        Driver.getDriver().get(loginPageLink);
        String username = ConfigurationReader.getProperty("OEusername");
        loginPage.loginInput.sendKeys(username);
        String password = ConfigurationReader.getProperty("OEpassword");
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @When("user clicks on Fleet option")
    public void user_clicks_on_fleet_option() {
        BrowserUtilities.waitForVisibility(fleetPage.moreMenu,15);
        fleetPage.moreMenu.click();
        BrowserUtilities.waitForVisibility(fleetPage.FleetMenu,15);
        fleetPage.FleetMenu.click();
    }

    @Then("user should land on Fleet option successfully")
    public void user_should_land_on_fleet_option_successfully() {
        String fleetOptionPageTitle ="Vehicles - Odoo" ;
        BrowserUtilities.waitForVisibility(vehicleCostsPage.vehicles,15);
        BrowserUtilities.verifyTitle(fleetOptionPageTitle);

    }

    @When("user clicks on Vehicle Costs option")
    public void user_clicks_on_vehicle_costs_option() {
        BrowserUtilities.waitForVisibility(vehicleCostsPage.vehiclesCostsMenu,15);
        vehicleCostsPage.vehiclesCostsMenu.click();
    }

    @Then("Vehicle costs page should be opened")
    public void vehicle_costs_page_should_be_opened() {
        String vehicleCostsPageTitle ="Vehicle Costs - Odoo" ;
        BrowserUtilities.waitForVisibility(vehicleCostsPage.vehiclesCosts,15);
        BrowserUtilities.verifyTitle(vehicleCostsPageTitle);
    }

    @When("as a posmanager25 user clicks on Create button")
    public void as_a_posmanager25_user_clicks_on_create_button() {
        BrowserUtilities.waitForVisibility(vehicleCostsPage.vehiclesCosts,15);
        fleetPage.createButton.click();
    }

    @Then("user should land on Cost Details page")
    public void user_should_land_on_cost_details_page() {
        BrowserUtilities.verifyElementDisplayed(vehicleCostsPage.costDetails);
    }

    @When("user clicks on Vehicle dropdown")
    public void user_clicks_on_vehicle_dropdown() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.vehicleDropDown,15);
        vehicleCostsPage.vehicleDropDown.click();
    }

    @When("user selects a Vehicle from the dropdown option")
    public void user_selects_a_vehicle_from_the_dropdown_option() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.selectVehicle,15);
        vehicleCostsPage.selectVehicle.click();
    }

    @Then("the vehicle should be selected")
    public void the_vehicle_should_be_selected() {
        BrowserUtilities.verifyElementDisplayed(Driver.getDriver().findElement
                (By.xpath("//td//div[@class='o_field_widget o_field_many2one o_required_modifier o_with_button']")));
    }

    @When("user selects a Type from the TypeDropdown option")
    public void user_selects_a_type_from_the_type_dropdown_option() {
        BrowserUtilities.waitForVisibility(vehicleCostsPage.typeDropDown,15);
        vehicleCostsPage.typeDropDown.click();
        BrowserUtilities.waitForVisibility(vehicleCostsPage.selectCostType,15);
        vehicleCostsPage.selectCostType.click();
    }
    @Then("the type should be selected")
    public void the_type_should_be_selected() {
        BrowserUtilities.verifyElementDisplayed(Driver.getDriver().findElement
                (By.xpath("//td//div[@class='o_field_widget o_field_many2one o_with_button']")));
    }

    @When("user enters {string} into the Total Price field")
    public void user_enters_into_the_total_price_field(String string) {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.totalPriceInput,15);
        vehicleCostsPage.totalPriceInput.clear();
        vehicleCostsPage.totalPriceInput.sendKeys(string);
    }

    @Then("user should enter numeric characters for Total Price field")
    public void user_should_enter_numeric_characters_for_total_price_field() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.saveButton,15);
        vehicleCostsPage.saveButton.click();
        BrowserUtilities.waitForClickablility(vehicleCostsPage.editButton,15);
        Assert.assertTrue(vehicleCostsPage.editButton.isEnabled());
    }

    @When("User enters {string} into the Total Price field")
    public void user_enters_invalid_numbers_into_the_total_price_field(String string) {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.totalPriceInput,15);
        vehicleCostsPage.totalPriceInput.clear();
        vehicleCostsPage.totalPriceInput.sendKeys(string);
    }

    @Then("The following fields are invalid should be displayed")
    public void the_following_fields_are_invalid_should_be_displayed() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.saveButton,15);
        vehicleCostsPage.saveButton.click();
        BrowserUtilities.waitForClickablility(vehicleCostsPage.notificationAlertForInvalidTotalPrice,15);
        Assert.assertTrue(vehicleCostsPage.notificationAlertForInvalidTotalPrice.isDisplayed());
    }

    @When("user clicks any Date from the calendar")
    public void user_clicks_any_date_from_the_calendar() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.inputDate,15);
        vehicleCostsPage.inputDate.clear();
        vehicleCostsPage.inputDate.sendKeys("07/23/2022");
    }

    @Then("user should click option for Date")
    public void user_should_click_option_for_date() {
        Assert.assertTrue(vehicleCostsPage.inputDate.isEnabled());
    }

    @When("user inputs any character on cost descriptions field")
    public void user_inputs_any_character_on_cost_descriptions_field() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.descriptionField,15);
        vehicleCostsPage.descriptionField.sendKeys("Fuel, tires, maintenance, repairs and" +
                " labor costs are added together to calculate total operating cost.");
    }

    @Then("User should input any character on cost descriptions field")
    public void user_should_input_any_character_on_cost_descriptions_field() {
        Assert.assertTrue(vehicleCostsPage.descriptionField.isEnabled());
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.saveButton,15);
        vehicleCostsPage.saveButton.click();
    }

    @Then("user should see the created vehicle costs saved same as inputs")
    public void user_should_see_the_created_vehicle_costs_saved_same_as_inputs() {
        BrowserUtilities.waitForClickablility(vehicleCostsPage.editButton,15);
        Assert.assertTrue(vehicleCostsPage.editButton.isEnabled());

        Assert.assertEquals("Audi/A1/01Adana01",vehicleCostsPage.vehicleField.getText());

        Assert.assertEquals("Tax roll",vehicleCostsPage.costTypeField.getText());

        Assert.assertEquals("10,000.00",vehicleCostsPage.totalPriceField.getText());

        Assert.assertEquals("Fuel, tires, maintenance, repairs and labor costs are added together to calculate total operating cost.",vehicleCostsPage.costDescriptionField.getText());

        Assert.assertEquals("07/23/2022", vehicleCostsPage.dateField.getText());
    }





}
