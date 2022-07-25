package com.fidexio.step_definitions;

import com.fidexio.pages.CalendarPage;
import com.fidexio.utilities.BrowserUtilities;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Utilities;

public class CalendarStepDefinitions {
    CalendarPage calendarPage = new CalendarPage();


    @When("User click on calendar button")
    public void user_click_on_calendar_button() throws InterruptedException {
        calendarPage.calendarButton.click();
    }

    @Then("Verify that user lands on weekly display")
    public void verify_that_user_lands_on_weekly_display() {
        Assert.assertTrue(calendarPage.weekButton.isDisplayed());
    }

    @When("Click on day button and verify that user  on day view")
    public void click_on_day_button_and_verify_that_user_on_day_view() {
        calendarPage.dayButton.click();
        Assert.assertTrue(calendarPage.dayButton.isDisplayed());
    }

    @When("Click on week button and verify that user on week view")
    public void click_on_week_button_and_verify_that_user_on_week_view() {
        calendarPage.weekButton.click();
        Assert.assertTrue(calendarPage.weekButton.isDisplayed());
    }

    @When("Click on month button and verify that user on month view")
    public void click_on_month_button_and_verify_that_user_on_month_view() {
        calendarPage.monthButton.click();
        Assert.assertTrue(calendarPage.monthButton.isDisplayed());
    }

}
