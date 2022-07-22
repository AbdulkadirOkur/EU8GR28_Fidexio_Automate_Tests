package com.fidexio.step_definitions;

import com.fidexio.pages.FleetPage;
import com.fidexio.pages.Vehicles_Fuel_Logs_Page;
import com.fidexio.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Fleet_FuelLogs_Step_Definitions {
    FleetPage fleetPage = new FleetPage();
    Vehicles_Fuel_Logs_Page vehicles_fuel_logs_page = new Vehicles_Fuel_Logs_Page();


    @When("user clicks to More menu")
    public void user_clicks_to_more_button() {
        fleetPage.moreMenu.click();
    }

    @When("user clicks to Fleet menu")
    public void user_clicks_to_fleet_button() {
        fleetPage.FleetMenu.click();
    }

    @When("user clicks Vehicles Fuel Logs menu")
    public void user_clicks_vehicles_fuel_logs_button() {

        fleetPage.vehiclesFuelLogsMenu.click();


    }

    @And("user clicks Create Button")
    public void userClicksCreateButton() {
        BrowserUtilities.waitForVisibility(By.xpath("//div[@class='o_facet_values']"), 3);
        fleetPage.createButton.click();
    }


    @And("user clicks Save button")
    public void userClicksSaveButton() {
        vehicles_fuel_logs_page.saveButton.click();
    }

    @When("user enters Vehicle {string}")
    public void userEntersVehicle(String vehicle) {



        vehicles_fuel_logs_page.vehicleDropdown.click();
        vehicles_fuel_logs_page.vehicleListGetter(vehicle).click();


    }

    @And("user enters Odometer Value {double}")
    public void userEntersOdometerValue(double odometer) {

        BrowserUtilities.doubleClick(vehicles_fuel_logs_page.odometerValueInput);
        vehicles_fuel_logs_page.odometerValueInput.sendKeys(odometer + "");
    }

    @And("user enters Liter {double}")
    public void userEntersLiter(double liter) {

        vehicles_fuel_logs_page.literInput.clear();
        vehicles_fuel_logs_page.literInput.sendKeys(liter + "");
    }

    @And("user enters Price Per Liter {double}")
    public void userEntersPricePerLiter(double pricePerLiter) {

        vehicles_fuel_logs_page.price_per_literInput.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, pricePerLiter + "");
        //vehicles_fuel_logs_page.totalPriceValueInput.click();
    }

    @And("user enters Date {string}")
    public void userEntersDate(String date) {

        vehicles_fuel_logs_page.dateInput.clear();
        vehicles_fuel_logs_page.dateInput.sendKeys(date);
    }

    @And("user enters Purchaser {string}")
    public void userEntersPurchaser(String purchaser) {

        vehicles_fuel_logs_page.purchaserDropdown.clear();
        vehicles_fuel_logs_page.purchaserDropdown.click();
        vehicles_fuel_logs_page.purchaserDropdown.sendKeys(purchaser);
        vehicles_fuel_logs_page.purcheserListGetter(purchaser).click();
    }

    @And("user enters Invoice Reference {string}")
    public void userEntersInvoiceReference(String ref) {

        vehicles_fuel_logs_page.inv_refInput.sendKeys(ref);
    }

    @And("user enters Vendor {string}")
    public void userEntersVendor(String vendor) {

        vehicles_fuel_logs_page.vendorDropdown.click();
        vehicles_fuel_logs_page.vendorDropdown.clear();
        vehicles_fuel_logs_page.vendorDropdown.sendKeys(vendor);
        vehicles_fuel_logs_page.vendorListGetter(vendor).click();
        vehicles_fuel_logs_page.vendorDropdown.sendKeys(Keys.ENTER);
        vehicles_fuel_logs_page.literInput.click();
    }

    @Then("user sees {string} {double} {double} {double} {string} {string} {string} {string} saved same as input")
    public void userSeesSavedAsInput(String vehicleExpected, double odometerExpected, double literExpected, double pricePerLiterExpected, String dateExpected, String purchaserExpected, String inv_refExpected, String vendorExpected) {

        String vehicleActual = vehicles_fuel_logs_page.vehicleDropdown_AfterSaved.getText();
        Assert.assertEquals(vehicleExpected, vehicleActual);

        double odometerActual = Double.parseDouble(vehicles_fuel_logs_page.odometerValueInput_AfterSaved.getText());
        Assert.assertTrue(odometerExpected == odometerActual);

        double literActual = Double.parseDouble(vehicles_fuel_logs_page.literInput_AfterSaved.getText());
        Assert.assertTrue(literExpected == literActual);

        double pricePerLiterActual = Double.parseDouble(vehicles_fuel_logs_page.price_per_literInput_AfterSaved.getText());
        Assert.assertTrue(pricePerLiterExpected == pricePerLiterActual);

        String dateActual = vehicles_fuel_logs_page.dateInput_AfterSaved.getText();
        Assert.assertEquals(dateExpected, dateActual);

        String purchaserActual = vehicles_fuel_logs_page.purchaserDropdown_AfterSaved.getText();
        Assert.assertEquals(purchaserExpected, purchaserActual);

        String inv_refActual = vehicles_fuel_logs_page.inv_refInput_AfterSaved.getText();
        Assert.assertEquals(inv_refExpected, inv_refActual);

        String vendorActual = vehicles_fuel_logs_page.vendorDropdown_AfterSaved.getText();
        Assert.assertEquals(vendorExpected, vendorActual);


    }
}


