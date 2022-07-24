package com.fidexio.step_definitions;

import com.fidexio.pages.CreateVehiclesContractsPage;
import com.fidexio.pages.VehiclesContractsPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateVehicleContract_StepDefinitions {

    CreateVehiclesContractsPage createVehiclesContractsPage = new CreateVehiclesContractsPage();
    VehiclesContractsPage vehiclesContractsPage = new VehiclesContractsPage();

    @When("user clicks the Vehicle dropdown")
    public void user_clicks_the_vehicle_dropdown() {
        createVehiclesContractsPage.vehicleDropdown.click();
    }


    @Then("Vehicle dropdown opens")
    public void vehicle_dropdown_opens() {
        //Assert.assertTrue(createVehiclesContractsPage.vehicleDropdown.isEnabled());
        //String actual_StyleAttributeText= createVehiclesContractsPage.vehicleDropdownBlock.getAttribute("style");
        //System.out.println("actual_StyleAttributeText = " + actual_StyleAttributeText);

        try {
            Assert.assertTrue(createVehiclesContractsPage.opelCar.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.assertTrue(false);
        }
    }

    @When("user selects the Opel-Astra-1-ACK-205 option")
    public void user_selects_the_opel_astra_ack_option() {
        createVehiclesContractsPage.opelCar.click();
    }

    @When("user clicks the save button")
    public void user_clicks_the_save_button() {
        createVehiclesContractsPage.saveButton.click();

    }

    @Then("Opel-Astra-1-ACK-205 can be seen as choosen vehicle")
    public void can_be_seen_as_choosen_vehicle() {
        String expected_Vehicle = "Opel/Astra/1-ACK-205";
        String actual_Vehicle = createVehiclesContractsPage.selectedVehicle.getText();
        Assert.assertEquals(actual_Vehicle, expected_Vehicle);

    }


    @When("user clicks the Type dropdown")
    public void user_clicks_the_type_dropdown() {
        createVehiclesContractsPage.typeDropdown.click();

    }

    @Then("Type dropdown opens")
    public void type_dropdown_opens() {

        try {
            Assert.assertTrue(createVehiclesContractsPage.omniumType.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.assertTrue(false);
        }

    }

    @When("user selects the Omnium option")
    public void user_selects_the_option() {
        createVehiclesContractsPage.omniumType.click();
    }

    @Then("user sees the Omnium can be seen as choosen type")
    public void user_sees_the_can_be_seen_as_choosen_type() {
        try {
            Assert.assertTrue(createVehiclesContractsPage.selectedType.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.assertTrue(false);
        }

    }

    @When("user enters the 158 as a valid amount in the Activation Cost field")
    public void user_enters_the_as_a_valid_amount_in_the_activation_cost_field() throws InterruptedException {
        createVehiclesContractsPage.activationCostField.clear();
        createVehiclesContractsPage.activationCostField.sendKeys("158");
    }

    @Then("user sees the same amount in the Activation Cost field")
    public void user_sees_the_same_amount_in_the_activation_cost_field() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleContains("Opel"));
        Assert.assertEquals("158.00", createVehiclesContractsPage.selectedActivationCost.getText());
    }

    @When("user clicks the Recurring Cost Amount dropdown and selects the Monthly option from the dropdown")
    public void user_clicks_the_recurring_cost_amount_dropdown() {
        Select select = new Select(createVehiclesContractsPage.recurringCostDropdown);
        select.selectByVisibleText("Monthly");
    }

    @Then("Monthly can be seen as choosen in the Recurring Cost Amount field")
    public void monthly_can_be_seen_as_choosen_in_the_recurring_cost_amount_field() {
      String expected_recurringCostAmountTime= "Monthly";
      Assert.assertEquals(expected_recurringCostAmountTime, createVehiclesContractsPage.selectedRecurringCostAmountTime.getText());

    }

    @When("user enters the 75 as a valid amount in the Recurring Cost Amount field")
    public void user_enters_the_as_a_valid_amount_in_the_recurring_cost_amount_field() {
        createVehiclesContractsPage.recurringCostField.clear();
        createVehiclesContractsPage.recurringCostField.sendKeys("75");
    }

    @Then("user sees the same amount in the Recurring Cost Amount field")
    public void user_sees_the_same_amount_in_the_recurring_cost_amount_field() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleContains("Opel"));
        String expected_RecurringCostAmount="75.00";
        Assert.assertEquals(expected_RecurringCostAmount, createVehiclesContractsPage.selectedRecurringCostAmount.getText());
    }

    @Then("the title of the page changes to the {string} and the provided information of the vehicle-type-activation cost-recurring cost amount and time is the same")
    public void the_title_of_the_page_changes_to_the_and_under_the_the_information_of_the_vehicle_type_date_is_seen(String title) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleContains("Opel"));

        title = "Opel/Astra/1-ACK-205 / Omnium / 2022";
        String expected_Type= "Omnium";
        String expected_ActivationCost = "158.00";
        String expected_RecurringCostTime="Monthly";
        String expected_RecurringCostAmount= "75.00";

        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
        Assert.assertEquals(expected_Type, createVehiclesContractsPage.selectedType.getText());
        Assert.assertEquals(expected_ActivationCost, createVehiclesContractsPage.selectedActivationCost.getText());
        Assert.assertEquals(expected_RecurringCostTime, createVehiclesContractsPage.selectedRecurringCostAmountTime.getText());
        Assert.assertEquals(expected_RecurringCostAmount, createVehiclesContractsPage.selectedRecurringCostAmount.getText());

    }





    @When("user navigates back")
    public void user_navigates_back() {
        Driver.getDriver().navigate().back();
    }

    @When("user enters characters other than numeric {string} into the Activation Cost field")
    public void user_enters_characters_other_than_numeric_into_the_activation_cost_field(String data) {
        createVehiclesContractsPage.activationCostField.sendKeys(data);
    }

    @When("user enters characters other than numeric {string} into the Recurring Cost Amount field")
    public void user_enters_characters_other_than_numeric_into_the_recurring_cost_amount_field(String data) {
        createVehiclesContractsPage.recurringCostField.sendKeys(data);
    }

    @Then("The following fields are invalid error message is displayed")
    public void the_following_fields_are_invalid_error_message_is_displayed() {
        Assert.assertTrue(createVehiclesContractsPage.invalidErrorMessage.isDisplayed());
    }






}
