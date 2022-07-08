package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage{
    //There are lots of constant webElements coming from BasePage

    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //navigate to Inventory Page
    public void navigateTo_InventoryPage_asPosManager(){
        loginPage.loginPosManagerWithConfiguration();
        moreMenu.click();
        inventoryMenu.click();
    }

    @FindBy(xpath = "//a[@data-menu='378']")
    public WebElement productsMenu ;
}
