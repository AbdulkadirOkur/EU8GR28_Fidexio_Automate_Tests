package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage extends BasePage{
    //There are lots of constant webElements coming from BasePage


    public FleetPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //navigate to Fleet Page
    public void navigateTo_FleetPage_asPosManager(){
        loginPage.loginPosManagerWithConfiguration();
        moreMenu.click();
        FleetMenu.click();
    }

    @FindBy(xpath = "//a[@data-menu='139']")
    public WebElement vehiclesMenu;

    @FindBy(xpath = "//a[@data-menu='140']")
    public WebElement vehiclesOdometerMenu;

    @FindBy(xpath = "//a[@data-menu='145']")
    public WebElement vehicleCostsMenu;

    @FindBy(xpath = "//a[@data-menu='146']")
    public WebElement vehiclesContractsMenu;

    @FindBy(xpath = "//a[@data-menu='147']")
    public WebElement vehiclesFuelLogsMenu;

    @FindBy(xpath = "//a[@data-menu='148']")
    public WebElement vehiclesServicesLogsMenu;

    @FindBy(xpath = "//a[@data-menu='150']")
    public WebElement costsMenu;

    @FindBy(xpath = "//a[@data-menu='151']")
    public WebElement indicativeCostsMenu;

    @FindBy(xpath = "//a[@data-menu='136']")
    public WebElement vehicleModelMenu;

    @FindBy(xpath = "//a[@data-menu='137']")
    public WebElement model_make_of_VehicleMenu;

    @FindBy(xpath = "//a[@data-menu='141']")
    public WebElement serviceTypesMenu;

    @FindBy(xpath = "//a[@data-menu='142']")
    public WebElement contractTypesMenu;

    @FindBy(xpath = "//a[@data-menu='143']")
    public WebElement vehicleStatusMenu;

    @FindBy(xpath = "//a[@data-menu='144']")
    public WebElement vehicleTagsMenu;

    @FindBy(xpath = "//button[@aria-label='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//button[@aria-label='Previous']")
    public WebElement previousButton;
}
