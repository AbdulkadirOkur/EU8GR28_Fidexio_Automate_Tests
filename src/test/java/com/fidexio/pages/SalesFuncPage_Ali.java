package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesFuncPage_Ali {
    public SalesFuncPage_Ali() {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "login")
    public WebElement loginInput;


    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement loginButton;


    @FindBy(xpath = "(//li[6]/a/span)[1]")
    public WebElement salesModuleButton;

    @FindBy(xpath = "//a[@data-menu=\"447\"]/span")
    public WebElement customersButton;

    @FindBy(xpath = "//div/button[@accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//div/ol/li[@class=\"active\"]")
    public WebElement newText;

    @FindBy(xpath = "//div/div/button[2]")
    public WebElement importButton;

    @FindBy(xpath = "//button[@accesskey=\"n\"]")
    public WebElement rightArrowButton;

    @FindBy(xpath = "//span/span[@class='o_pager_value']")
    public WebElement pagerValue;

    @FindBy(xpath = "//button[@accesskey=\"p\"]")
    public WebElement leftArrowButton;

    @FindBy(xpath = "//button[@accesskey=\"k\"]")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@class=\"btn btn-icon fa fa-lg fa-th-large o_cp_switch_kanban active\"]")
    public WebElement kanbanValue;

    @FindBy(xpath = "//button[@accesskey=\"l\"]")
    public WebElement listButton;

    @FindBy(xpath = "//button[@class=\"btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list active\"]")
    public WebElement listValue;



    @FindBy(xpath = "//div/input[@data-value=\"person\"]")
    public WebElement individualButton;

    @FindBy(xpath = "//h1/input[@placeholder=\"Name\"]")
    public WebElement nameBlank;

    @FindBy(xpath = "//div/input[@placeholder=\"Street...\"]")
    public WebElement street;

    @FindBy(xpath = "//div/input[@placeholder=\"Street 2...\"]")
    public WebElement street2;

    @FindBy(xpath = "//input[@placeholder=\"City\"]")
    public WebElement cityBlank;

    @FindBy(xpath = "(//input[@class=\"o_input ui-autocomplete-input\"])[3]")
    public WebElement countryBlank;

    @FindBy(xpath = "//input[@placeholder=\"ZIP\"]")
    public WebElement zipBlank;

    @FindBy(xpath = "//input[@placeholder=\"e.g. BE0477472701\"]")
    public WebElement tinBlank;

    @FindBy(xpath = "//input[@placeholder=\"e.g. Sales Director\"]")
    public WebElement jobBlank;

    @FindBy(xpath = "(//input[@class=\"o_field_phone o_field_widget o_input\"])[1]")
    public WebElement phoneBlank;

    @FindBy(xpath = "(//input[@class=\"o_field_phone o_field_widget o_input\"])[2]")
    public WebElement mobileBlank;

    @FindBy(xpath = "//input[@class=\"o_field_email o_field_widget o_input\"]")
    public WebElement emailBlank;

    @FindBy(xpath = "//input[@placeholder=\"e.g. www.odoo.com\"]")
    public WebElement webSiteBlank;

    @FindBy(xpath = "(//input[@class=\"o_input ui-autocomplete-input\"])[5]")
    public WebElement titleBlank;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveButton;


    @FindBy(xpath = "//input[@class=\"o_searchview_input\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class=\"oe_kanban_details\"]")
    public WebElement viewCustomer;

    @FindBy(xpath = "//div/input[@data-value=\"company\"]")
    public WebElement companyButton;



}
