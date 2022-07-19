package com.fidexio.step_definitions;

import com.fidexio.pages.CreateVehiclesContractsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class CreateVehicleContract_StepDefinitions {

    CreateVehiclesContractsPage createVehiclesContractsPage = new CreateVehiclesContractsPage();
    @When("user clicks the Vehicle dropdown")
    public void user_clicks_the_vehicle_dropdown() {
        createVehiclesContractsPage.vehicleDropdown.click();
    }


    @Then("Vehicle dropdown opens")
    public void vehicle_dropdown_opens() {
        String expected_vehicleDropdownStyleAttribute= "display: block";
        String actual_vehicleDropdownStyleAttribute = createVehiclesContractsPage.vehicleDropdownBlock.getAttribute("style");
        assertTrue(actual_vehicleDropdownStyleAttribute.contains(expected_vehicleDropdownStyleAttribute));
    }



}
