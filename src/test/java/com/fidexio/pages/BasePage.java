package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    //this class contains common constant elements for the different pages
    //you can use this page as master class
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userDropdown;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutLink;

    @FindBy(xpath = "//a[@data-menu='134']")
    public WebElement FleetMenu;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement moreMenu;


}
