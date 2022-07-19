package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.VehiclesContractsPage;
import com.fidexio.pages.VehiclesPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class NavigatingVehicleContracts_StepDefinitions {

    BasePage basePage = new BasePage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    VehiclesContractsPage vehiclesContractsPage = new VehiclesContractsPage();

    @And("user clicks on the Fleet module")
    public void user_clicks_on_the_fleet_module() {
        basePage.moreMenu.click();
        basePage.fleetMenu.click();
    }


    @And("user clicks the Vehicles Contracts")
    public void userClicksTheVehiclesContracts() {
        vehiclesPage.vehiclesContractsButton.click();
    }

    @And("user clicks the Create button")
    public void userClicksTheCreateButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesContractsPage.createButton));
        vehiclesContractsPage.createButton.click();
    }

    @Then("user lands on the Vehicles Contracts-New page")
    public void userLandsOnTheVehiclesContractsNewPage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("New - Odoo"));
        assertEquals("New - Odoo", Driver.getDriver().getTitle());
    }
}
