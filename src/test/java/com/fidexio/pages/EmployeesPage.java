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

    @FindBy(xpath = "//a[.='Private Information']")
    public WebElement privateInformationTab;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[8]")
    public WebElement nationality;

    @FindBy(xpath = "//a[contains(text(), 'Albania')]")
    public WebElement nationalitySelect;

    @FindBy(xpath = "//input[@name='identification_id']")
    public WebElement identificationNo;

    @FindBy(xpath = "//input[@name='passport_id']")
    public WebElement passportNo;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[9]")
    public WebElement bankAccountNumber;

    @FindBy(xpath = "(//a[.='Create and Edit...'])[7]")
    public WebElement createAndEditBankAccountNumber;

    @FindBy(xpath = "//input[@name='acc_number']")
    public WebElement enterAccountNumberInput;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[13]")
    public WebElement bankDropdown;

    @FindBy(xpath = "//a[contains(text(),'12323487345645')]")
    public WebElement bankDropdownSelect;

    @FindBy(xpath = "//input[@name='aba_routing']")
    public WebElement abaRouting;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']//span[contains(text(), 'Save')]")
    public WebElement createBankAccountSaveButton;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[10]")
    public WebElement privateAddressDropdown;

    @FindBy(xpath = "//a[contains(text(),'&*&*)_( (co2py), James')]")
    public WebElement privateAddressSelect;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropdown;

    @FindBy(xpath = "//select[@name='marital']")
    public WebElement maritalStatusDropdown;

    @FindBy(xpath = "//input[@name='birthday']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//input[@name='children']")
    public WebElement numberOfChildren;

    @FindBy(xpath = "//input[@name='place_of_birth']")
    public WebElement placeOfBirth;

    @FindBy(xpath = "//input[@name='visa_no']")
    public WebElement visaNo;

    @FindBy(xpath = "//input[@name='visa_expire']")
    public WebElement visaExpireDate;

    @FindBy(xpath = "//input[@name='permit_no']")
    public WebElement workPermitNo;

    @FindBy(xpath = "//button[@accesskey='s'][@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(linkText = "HR Settings")
    public WebElement hrSettingTab;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[12]")
    public WebElement relatedUserDropdown;

    @FindBy(xpath = "//input[@name='medic_exam']")
    public WebElement medicalExamDropdown;

    @FindBy(xpath = "//input[@name='vehicle']")
    public WebElement companVehicleInput;

    @FindBy(xpath = "//input[@name='vehicle_distance']")
    public WebElement vehicleDistanceInput;

    @FindBy(xpath = "//input[@name='barcode']")
    public WebElement badgeId;

    @FindBy(xpath = "//div[@name='manual_attendance']//input")
    public WebElement manualAttandenceCheckbox;

    @FindBy(xpath = "//div[@class='o_thread_message_content']//p")
    public WebElement employeeCreatedMessage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
    public WebElement allCreatedEmployees;

    @FindBy(xpath = "//div[@class='o_kanban_view o_hr_employee_kanban o_kanban_ungrouped']")
    public WebElement finalPageOfEmployee;

    @FindBy(xpath = "//span[.='Seleny Tester']")
    public WebElement employeeThatICreated;



}
