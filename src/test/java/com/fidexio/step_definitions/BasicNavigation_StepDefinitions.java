package com.fidexio.step_definitions;

import com.fidexio.pages.*;
import io.cucumber.java.en.Given;

public class BasicNavigation_StepDefinitions {
    CalendarPage calendarPage = new CalendarPage();
    EmployeesPage employeesPage = new EmployeesPage();
    FleetPage fleetPage = new FleetPage();
    InventoryPage inventoryPage = new InventoryPage();
    SalesPage salesPage = new SalesPage();
    SurveysPage surveysPage = new SurveysPage();

    @Given("PosManager is on the Calendar page")
    public void pos_manager_is_on_the_calendar_page() {
        calendarPage.navigateTo_CalendarPage_asPosManager();
    }

    @Given("PosManager is on the Employees page")
    public void posmanagerIsOnTheEmployeesPage() {
        employeesPage.navigate_to_EmployeesPage_asPosManager();
    }

    @Given("PosManager is on the Fleet page")
    public void posmanagerIsOnTheFleetPage() {
        fleetPage.navigateTo_FleetPage_asPosManager();
    }

    @Given("PosManager is on the Inventory page")
    public void posmanagerIsOnTheInventoryPage() {
        inventoryPage.navigateTo_InventoryPage_asPosManager();
    }

    @Given("SalesManager is on the Sales page")
    public void salesmanagerIsOnTheSalesPage() {
        salesPage.navigateTo_SalesPage_asSalesManager();
    }

    @Given("PosManager is on the Surveys page")
    public void posmanagerIsOnTheSurveysPage() {
        surveysPage.navigateTo_SurveysPage_asPosManager();
    }
}
