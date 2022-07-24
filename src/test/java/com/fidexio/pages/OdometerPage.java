package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OdometerPage {

    public OdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//li[.='Vehicles Odometer']")
    public WebElement vehiclesOdometerText;


    @FindBy(xpath = "(//input[contains(@id,'o_field_input')])[1]")
    public WebElement vehicleDropDown;

    @FindBy(xpath = "(//input[contains(@id,'o_field_input')])[2]")
    public WebElement odometerValueInputBox;

    @FindBy(xpath = "(//input[contains(@id,'o_field_input')])[3]")
    public WebElement dateInputBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;



    @FindBy(xpath = "(//a[contains(@id,'o_field_input')])[1]")
    public WebElement vehicleAfterSaved;

    @FindBy(xpath = "//span[@class='o_field_date o_field_widget']")
    public WebElement dateAfterSaved;

    @FindBy(xpath = "//span[@class='o_field_float o_field_number o_field_widget oe_inline']")
    public WebElement odometerValueAfterSaved;

    @FindBy(xpath = "//div[@class='o_notification_title']//span")
    public WebElement errorMessagTitle;

    @FindBy(xpath = "//div[@class='o_notification_content']//li[.='Vehicle']")
    public WebElement vehicleErrorMessage;

    @FindBy(xpath = "//div[@class='o_notification_content']//li[.='Odometer Value']")
    public WebElement odometerValueErrorMessage;






    public WebElement getVehicleWebElement(String vehicleName){
String locator = "//a[.='"+ vehicleName+"']";
        return Driver.getDriver().findElement(By.xpath(locator));


    }


public WebElement getVehicleWebElement2(String vehicle){
    String locator = "//th[contains(text(),'"+vehicle+"')]";

        return Driver.getDriver().findElement(By.xpath(locator));


    }









}
