package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    //this class contains common constant elements for the different pages
    LoginPage loginPage = new LoginPage();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //for getting current title
    public String getTitle(){
        return Driver.getDriver().getTitle();
    }
    //for getting current URL
    public String getURL(){
        return Driver.getDriver().getCurrentUrl();
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userDropdown;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutLink;


    @FindBy(xpath = "//a[@data-menu='115']")
    public WebElement discussMenu ;

    @FindBy(xpath = "//a[@data-menu='120']")
    public WebElement calendarMenu;

    @FindBy(xpath = "//a[@data-menu='194']")
    public WebElement notesMenu;

    @FindBy(xpath = "//a[@data-menu='68']")
    public WebElement contactsMenu;

    @FindBy(xpath = "//a[@data-menu='261']")
    public WebElement crmMenu;

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesMenu;

    @FindBy(xpath = "//a[@data-menu='382']")
    public WebElement websiteMenu;

    @FindBy(xpath = "//a[@data-menu='484']")
    public WebElement PointOfSaleMenu;

    @FindBy(xpath = "//a[@data-menu='504']")
    public WebElement purchasesMenu;

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement inventoryMenu;

    @FindBy(xpath = "//a[@data-menu='415']")
    public WebElement manufacturingMenu;

    @FindBy(xpath = "//a[@data-menu='535']")
    public WebElement repairsMenu;

    @FindBy(xpath = "//a[@data-menu='333']")
    public WebElement projectMenu;

    @FindBy(xpath = "//a[@data-menu='124']")
    public WebElement eventsMenu;

    @FindBy(xpath = "//a[@data-menu='475']")
    public WebElement surveysMenu;

    @FindBy(xpath = "//a[@data-menu='157']")
    public WebElement employeesMenu;

    @FindBy(xpath = "//a[@data-menu='281']")
    public WebElement attendanceMenu;

    @FindBy(xpath = "//a[@data-menu='295']")
    public WebElement leavesMenu;

    @FindBy(xpath = "//a[@data-menu='388']")
    public WebElement expensesMenu;

    @FindBy(xpath = "//a[@data-menu='165']")
    public WebElement maintenanceMenu;

    @FindBy(xpath = "//a[@data-menu='134']")
    public WebElement FleetMenu;

    @FindBy(xpath = "//a[@data-menu='1']")
    public WebElement dashboardsMenu;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    public WebElement moreMenu;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    //View kanban Buttons around the pages
    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanViewButton;

    //View list Buttons around the pages
    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listViewButton;

    //View graph Buttons around the pages
    @FindBy(xpath = "//button[@aria-label='graph']")
    public WebElement graphViewButton;

    //View pivot Buttons around the pages
    @FindBy(xpath = "//button[@aria-label='pivot']")
    public WebElement pivotViewButton;

    //View calendar Buttons around the pages
    @FindBy(xpath = "//button[@aria-label='calendar']")
    public WebElement calendarViewButton;
}
