package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Vehicles_Fuel_Logs_Page extends BasePage {


    @FindBy(xpath = "(//input[contains(@id,'o_field_input_')])[1]")
    public WebElement vehicleDropdown;


    @FindBy(xpath = "//input[@name='odometer']")
    public WebElement odometerValueInput;

    @FindBy(xpath = "//input[@name='liter']")
    public WebElement literInput;

    @FindBy(xpath = "//input[@name='price_per_liter']")
    public WebElement price_per_literInput;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement totalPriceValueInput;

    @FindBy(xpath = "//input[@name='date']")
    public WebElement dateInput;

    @FindBy(xpath = "//input[@name='inv_ref']")
    public WebElement inv_refInput;

    @FindBy(xpath = "(//input[contains(@id,'o_field_input_')])[7]")
    public WebElement purchaserDropdown;

    @FindBy(xpath = "(//input[contains(@id,'o_field_input_')])[9]")
    public WebElement vendorDropdown;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[1]")
    public WebElement vehicleDropdownFirstCar;

    public WebElement vehicleListGetter(String vehicleName){
        String locator = "//a[.='"+vehicleName+"']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }


    public WebElement vendorListGetter(String vendorName){
        String locator = "//a[.='"+vendorName+"']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public WebElement purcheserListGetter(String purcheserName){
        String locator = "//a[.='"+purcheserName+"']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }


    //page after saving

    @FindBy(xpath = "(//a[contains(@id,'o_field_input_')])[1]")
    public WebElement vehicleDropdown_AfterSaved;


    @FindBy(xpath = "//span[@name='odometer']")
    public WebElement odometerValueInput_AfterSaved;

    @FindBy(xpath = "//span[@name='liter']")
    public WebElement literInput_AfterSaved;

    @FindBy(xpath = "//span[@name='price_per_liter']")
    public WebElement price_per_literInput_AfterSaved;

    @FindBy(xpath = "//span[@name='amount']")
    public WebElement totalPriceValueInput_AfterSaved;

    @FindBy(xpath = "//span[@name='date']")
    public WebElement dateInput_AfterSaved;

    @FindBy(xpath = "//span[@name='inv_ref']")
    public WebElement inv_refInput_AfterSaved;

    @FindBy(xpath = "(//a[contains(@id,'o_field_input_')])[2]")
    public WebElement purchaserDropdown_AfterSaved;

    @FindBy(xpath = "(//a[contains(@id,'o_field_input_')])[3]")
    public WebElement vendorDropdown_AfterSaved;



}
