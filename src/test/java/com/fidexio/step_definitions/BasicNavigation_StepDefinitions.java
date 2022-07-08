package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import io.cucumber.java.en.Given;

public class BasicNavigation_StepDefinitions {
    BasePage basePage = new BasePage();

    @Given("PosManager is on the Calendar page")
    public void pos_manager_is_on_the_calendar_page() {
        basePage.navigateTo_CalendarPage_asPosManager();
    }

    @Given("PosManager is on the Employees page")
    public void posmanagerIsOnTheEmployeesPage() {
        basePage.navigate_to_EmployeesPage_asPosManager();
    }

    @Given("PosManager is on the Fleet page")
    public void posmanagerIsOnTheFleetPage() {
        basePage.navigateTo_FleetPage_asPosManager();
    }

    @Given("PosManager is on the Inventory page")
    public void posmanagerIsOnTheInventoryPage() {
        basePage.navigateTo_InventoryPage_asPosManager();
    }

    @Given("SalesManager is on the Sales page")
    public void salesmanagerIsOnTheSalesPage() {
        basePage.navigateToSalesPage_asSalesManager();
    }

    @Given("PosManager is on the Surveys page")
    public void posmanagerIsOnTheSurveysPage() {
        basePage.navigateTo_SurveysPage_asPosManager();
    }
}
