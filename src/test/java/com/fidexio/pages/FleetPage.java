package com.fidexio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;

public class FleetPage extends BasePage{


    @FindBy(xpath = "//a[@data-menu='147']")
    public WebElement vehiclesFuelLogsMenu;


    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;


    @FindBy(xpath = "//a[@data-menu-xmlid='fleet.fleet_vehicle_odometer_menu']")
    public WebElement vehiclesOdometerMenu;



}
