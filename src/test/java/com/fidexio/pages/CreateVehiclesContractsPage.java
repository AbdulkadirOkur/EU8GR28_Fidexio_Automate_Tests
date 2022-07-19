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

    @FindBy (id = "ui-id-3")
    public WebElement vehicleDropdownBlock;

    @FindBy(xpath = "//div[@name='cost_subtype_id']//div")
    public WebElement typeDropdown;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']//tr)[4]//td//input")
    public WebElement activationCostField;

    @FindBy(id = "o_field_input_311")
    public WebElement recurringCostDropdown;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']//tr)[5]//td//input")
    public WebElement recurringCostField;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

}
