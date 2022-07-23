package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@data-menu-xmlid='hr.menu_hr_root']")
    public WebElement employeesModuleButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement newEmployeesFormSheet;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//li[.='Import a File']")
    public WebElement importAFileText;

    @FindBy(xpath = "//button[@class='fa fa-chevron-left btn btn-icon o_pager_previous']")
    public WebElement leftArrowButton;

    @FindBy(xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement rightArrowButton;

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-th-large o_cp_switch_kanban']")
    public WebElement inactiveKanbanButton;

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list']")
    public WebElement inactiveListButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement employeesNameInput;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]/input")
    public WebElement jobStatusDropdown;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[1]")
    public WebElement jobStatusDropdownSelect;

    @FindBy(xpath = "//span[.='Trainer']")
    public WebElement jobStatusDropdownAfterSelect;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[2]/input")
    public WebElement workAddressDropdown;

    @FindBy(linkText = "&*&*)_( (co2py), James")
    public WebElement workAddressDropdownSelect;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[3]")
    public WebElement departmentDropdown;

    @FindBy(xpath = "//li[@class='ui-menu-item'][.='Professional Services']")
    public WebElement departmentDropdownSelect;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[4]")
    public WebElement jobPositionDropdown;

    @FindBy(xpath = "//li[@class='ui-menu-item'][.='Chief Technical Officer']")
    public WebElement jobPositionDropdownSelect;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[5]")
    public WebElement managerDropdown;

    @FindBy(xpath = "(//li[@class='ui-menu-item'][.='Ashley Presley'])[1]")
    public WebElement managerDropdownSelect;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[6]")
    public WebElement coachDropdown;

    @FindBy(xpath = "(//a[contains(text(),'Antoine Langlais')])[2]")
    public WebElement coachDropdownSelect;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[7]")
    public WebElement workingHoursDropdown;

    @FindBy(xpath = "//a[contains(text(),'Standard 40 Hours/Week')]")
    public WebElement workingHoursDropdownSelect;

    @FindBy(xpath = "//input[@name='work_location']")
    public WebElement workLocation;

    @FindBy(xpath = "//input[@name='work_email']")
    public WebElement workEmail;

    @FindBy(xpath = "//input[@name='mobile_phone']")
    public WebElement mobilePhone;

    @FindBy(xpath = "//input[@name='work_phone']")
    public WebElement workPhone;

    @FindBy(xpath = "//textarea[@placeholder='Other Information ...']")
    public WebElement otherInformation;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;


}
