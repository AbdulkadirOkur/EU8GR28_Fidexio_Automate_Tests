package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.VehiclesContractsPage;
import com.fidexio.pages.VehiclesPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.interactions.Actions;
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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));

        try{
            basePage.moreMenu.click();
            basePage.FleetMenu.click();
       }catch (ElementNotInteractableException e){
            basePage.FleetMenu.click();
        }
    }


    @And("user clicks the Vehicles Contracts")
    public void userClicksTheVehiclesContracts() {
        vehiclesPage.vehiclesContractsButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("Vehicles Contracts - Odoo"));
    }

    @And("user clicks the Create button")
    public void userClicksTheCreateButton() throws InterruptedException {
        vehiclesContractsPage.createButton.click();
    }

    @Then("user lands on the Vehicles Contracts-New page")
    public void userLandsOnTheVehiclesContractsNewPage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs("New - Odoo"));
        assertEquals("New - Odoo", Driver.getDriver().getTitle());
    }


}
