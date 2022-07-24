package com.fidexio.pages;

import com.fidexio.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InventoryPage extends BasePage{

    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@data-menu=347]")
    public WebElement inventoryButton;

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

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement ListButton;

    @FindBy (xpath = "//span[@class='o_pager_value']")
    public WebElement listOrder;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_ungrouped']")
    public WebElement displayKanbanList ;

    @FindBy (xpath = "//div[@class='table-responsive']")
    public WebElement displayListType;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy (xpath = "//span[@name='name']")
    public WebElement displayName;


    @FindBy (xpath = "//select[@name='type']")
    public WebElement productTypeDropdown;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy (xpath = "//span[text()='Consumable']")
    public WebElement consumableText;

    @FindBy (xpath = "//span[text()='Service']")
    public WebElement serviceText;

    @FindBy (xpath = "//span[text()='Stockable Product']")
    public WebElement stockableProductText;

    @FindBy (xpath = "//div[@name='list_price']/input")
    public WebElement salesPriceBox;

    @FindBy (xpath = "//div[@name='standard_price']/input")
    public WebElement costBox;

    @FindBy (xpath = "//span[@name='list_price']")
    public WebElement displaysalesPrice;

    @FindBy (xpath = "//span[@name='standard_price']")
    public WebElement displayCost;

    @FindBy (xpath = "//input[@name='barcode']")
    public WebElement barcodeBox;

    @FindBy (xpath = "//span[@name='barcode']")
    public WebElement displayBarcode;

    @FindBy (css ="span.fa fa-pencil fa-lg pull-left o_select_file_button::before" )
    public WebElement pictureEditButton;

    @FindBy (xpath = "//img[@name='image_medium']")
    public WebElement displayPicture;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy (xpath = "//span[text()='Mountain Bike']")
    public WebElement displayNameInSearchResult;

    @FindBy (xpath = "//li[text()='Product Type']")
    public WebElement productTypeWarning;

    @FindBy (xpath = "//li[text()='Name']")
    public WebElement nameWarning;

    @FindBy (xpath = "//div[@class='o_notification_title']/span")
    public WebElement invalidFieldsWarning;













}
