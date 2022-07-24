package com.fidexio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleCostsPage extends BasePage{

    @FindBy(xpath = "//li//a[@data-menu='145']")
    public WebElement vehiclesCostsMenu;

    @FindBy(xpath = "//li[.='Vehicles']")
    public WebElement vehicles;

    @FindBy(xpath = "//li[.='Vehicle Costs']")
    public WebElement vehiclesCosts;

    @FindBy(xpath = "//div[.='Cost Details']")
    public WebElement costDetails;

    @FindBy(xpath = "//div[@name='vehicle_id']/div")
    public WebElement vehicleDropDown;

    @FindBy(xpath = "//li//a[.='Audi/A1/01Adana01']")
    public WebElement selectVehicle;

    @FindBy(xpath = "//div[@name='cost_subtype_id']/div")
    public WebElement typeDropDown;

    @FindBy(xpath = "//li//a[.='Tax roll']")
    public WebElement selectCostType;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement totalPriceInput;

    @FindBy(xpath = "//div[@class='o_notification_content']//li[.='Total Price']")
    public WebElement notificationAlertForInvalidTotalPrice;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(xpath = "//input[@name='date']")
    public WebElement inputDate;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionField;

    @FindBy(xpath = "//a[@name='vehicle_id']")
    public WebElement vehicleField;

    @FindBy(xpath = "//a[@name='cost_subtype_id']")
    public WebElement costTypeField;

    @FindBy(xpath = "//span[@name='description']")
    public WebElement costDescriptionField;

    @FindBy(xpath = "//span[@name='date']")
    public WebElement dateField;

    @FindBy(xpath = "//span[@name='amount']")
    public WebElement totalPriceField;





}
