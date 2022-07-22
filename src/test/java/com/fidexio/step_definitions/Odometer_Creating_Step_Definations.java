package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.FleetPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.pages.OdometerPage;
import com.fidexio.utilities.BrowserUtilities;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Odometer_Creating_Step_Definations {




    FleetPage fleetPage = new FleetPage();
    OdometerPage odometerPage = new OdometerPage();




    @When("user clicks on the More menu")
    public void user_clicks_on_the_more_menu() {
        String inboxTextLocator = "//li[.='#Inbox']";
        BrowserUtilities.waitForVisibility(Driver.getDriver().findElement(By.xpath(inboxTextLocator)),10);
        fleetPage.moreMenu.click();
    }

    @When("user clicks on the Fleet menu")
    public void user_clicks_on_the_fleet_menu() {
        fleetPage.FleetMenu.click();
    }

    @When("user clicks on the Vehicles Odometer menu")
    public void user_clicks_on_the_vehicles_odometer_menu() {
        fleetPage.vehiclesOdometerMenu.click();
    }

    @Given("user is on the Vehicles odometer page")
    public void user_is_on_the_vehicles_odometer_page() {
        BrowserUtilities.waitForVisibility(odometerPage.vehiclesOdometerText,10);

    }

    @And("user clicks the Create Button")
    public void userClicksCreateButton() {
        BrowserUtilities.waitForVisibility(By.xpath("//div[@class='o_facet_values']"), 10);
        fleetPage.createButton.click();
    }



    @When("user enters the {string} as Vehicle")
    public void user_enters_the_as_vehicle(String vehicle) {
        odometerPage.vehicleDropDown.click();
        odometerPage.vehicleDropDown.sendKeys(vehicle);
        odometerPage.getVehicleWebElement(vehicle).click();

    }

    @And("user enters the {double} as Odometer Value")
    public void userEntersTheOdometerValueAsOdometerValue(double odometerValue) {
        odometerPage.odometerValueInputBox.clear();
        odometerPage.odometerValueInputBox.sendKeys(odometerValue+"");
    }

//    @When("user enters the {string} as Odometer Value")
//    public void user_enters_the_as_odometer_value(String odometerValue) {
//        odometerPage.odometerValueInputBox.clear();
//        odometerPage.odometerValueInputBox.sendKeys(odometerValue);
//    }


    @When("user enters the {string} as Date")
    public void user_enters_the_as_date(String date) {
odometerPage.dateInputBox.click();
odometerPage.dateInputBox.sendKeys(date);
//Driver.getDriver().findElement(By.xpath("//span[@class='o_field_widget o_readonly_modifier oe_inline']")).click();



    }
    @When("user clicks on the Save button")
    public void user_clicks_on_the_save_button() {
        odometerPage.saveButton.click();
    }



    @Then("user should be able to see the {string}, {double}, {string} as same as the entered input")
    public void user_should_be_able_to_see_the_as_same_as_the_entered_input(String expectedVehicle, double expectedOdometerValue, String expectedDate) {

        Assert.assertEquals(expectedVehicle,odometerPage.vehicleAfterSaved.getText());
        Assert.assertEquals(expectedDate,odometerPage.dateAfterSaved.getText());

        double actualOdometerValue = Double.parseDouble(odometerPage.odometerValueAfterSaved.getText().replace(",",""));
        System.out.println("actualOdometerValue = " + actualOdometerValue);
        System.out.println("expectedOdometerValue = " + expectedOdometerValue);
        Assert.assertTrue(expectedOdometerValue==actualOdometerValue);




    }


    @Then("user should be able to see the {string} on the screen")
    public void userShouldBeAbleToSeeTheOnTheScreen(String errorMessage) {

        Assert.assertTrue(odometerPage.errorMessagTitle.isDisplayed());
        System.out.println("errorMessage = " + errorMessage);

        if(errorMessage.equals("Vehicle") ){
            System.out.println("odometerPage.vehicleErrorMessage.getText() = " + odometerPage.vehicleErrorMessage.getText());
            Assert.assertTrue(odometerPage.vehicleErrorMessage.isDisplayed());
            Assert.assertEquals(errorMessage, odometerPage.vehicleErrorMessage.getText());
        }else{
        System.out.println("odometerPage.odometerValueErrorMessage.getText() = " + odometerPage.odometerValueErrorMessage.getText());
        Assert.assertTrue(odometerPage.odometerValueErrorMessage.isDisplayed());
        Assert.assertEquals(errorMessage,odometerPage.odometerValueErrorMessage.getText());

        }




    }

    @And("user enters the {string} as invalid Vehicle")
    public void userEntersTheAsInvalidVehicle(String vehicle) {

        odometerPage.vehicleDropDown.click();
        odometerPage.vehicleDropDown.sendKeys(vehicle);
        if(vehicle.contains("Dogan")){
            Driver.getDriver().findElement(By.xpath("//a/strong")).click();
            Driver.getDriver().findElement(By.xpath("//button[@class='close']")).click();

        }else{
            odometerPage.getVehicleWebElement(vehicle).click();

        }






    }

    @And("user enters the {string} as Odometer Value")
    public void userEntersTheAsOdometerValue(String odometerValue) {

        odometerPage.odometerValueInputBox.clear();
        odometerPage.odometerValueInputBox.sendKeys(odometerValue);
    }
    }

