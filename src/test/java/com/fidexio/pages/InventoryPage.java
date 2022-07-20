package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class InventoryPage extends BasePage{

    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-action-id='521']")
    public WebElement productsButton;

    @FindBy (xpath = "//li[text()='Products']")
    public WebElement productsText;

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

@FindBy(xpath = "//button[@accesskey='p']")
    public WebElement previousListButton;

    @FindBy(xpath = "//button[@accesskey='n']")
    public WebElement nextListButton;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanListButton;







}
