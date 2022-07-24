package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVehiclesContractsPage {

    public CreateVehiclesContractsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@name='vehicle_id']//div")
    public WebElement vehicleDropdown;

    @FindBy(xpath = "//div[@name='cost_subtype_id']//div")
    public WebElement typeDropdown;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']//tr)[4]//td//input")
    public WebElement activationCostField;

    @FindBy(name = "cost_frequency")
    public WebElement recurringCostDropdown;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']//tr)[5]//td//input")
    public WebElement recurringCostField;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[.='Opel/Astra/1-ACK-205']")
    public WebElement opelCar;

    @FindBy(xpath = "//a[@href='#id=1&model=fleet.vehicle']")
    public WebElement selectedVehicle;

    @FindBy(xpath = "//a[.='Omnium']")
    public WebElement omniumType;

    @FindBy(xpath = "//a[@href='#id=72&model=fleet.service.type']")
    public WebElement selectedType;

    @FindBy(name = "amount" )
    public WebElement selectedActivationCost;

    @FindBy(xpath = "//span[.='Monthly']")
    public WebElement selectedRecurringCostAmountTime;

    @FindBy(name = "cost_generated")
    public WebElement selectedRecurringCostAmount;

    @FindBy(xpath = "//span[@class='o_icon fa fa-3x fa-exclamation']")
    public WebElement invalidErrorMessage;


}
