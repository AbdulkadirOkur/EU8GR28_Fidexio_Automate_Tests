package com.fidexio.step_definitions;

import com.fidexio.pages.EmployeesPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtilities;
import com.fidexio.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_77_Employees_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    EmployeesPage employeesPage = new EmployeesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker();

    @Given("Pos Manager logged in to the homepage and clicked on the Employees module")
    public void pos_manager_logged_in_to_the_homepage_and_clicked_on_the_employees_module() {

        loginPage.navigateTo_LoginPage();
        wait.until(ExpectedConditions.urlContains("qa.fidexio.com"));
        loginPage.loginPosManagerWithConfiguration();
        wait.until(ExpectedConditions.urlContains("web?#menu"));
        BrowserUtilities.waitForVisibility(employeesPage.employeesModuleButton, 10);
        employeesPage.employeesModuleButton.click();
        wait.until(ExpectedConditions.urlContains("employee"));

    }

    @When("Pos Manager click on the Create button")
    public void pos_manager_click_on_the_create_button() {

        BrowserUtilities.waitForVisibility(employeesPage.createButton, 10);
        employeesPage.createButton.click();

    }

    @Then("Pos Manager should be able to land on the new employee information page")
    public void pos_manager_should_be_able_to_land_on_the_new_employee_information_page() {

        BrowserUtilities.waitForVisibility(employeesPage.newEmployeesFormSheet, 10);
        Assert.assertTrue(employeesPage.newEmployeesFormSheet.isDisplayed());

    }

    @When("Pos Manager click on the import button")
    public void pos_manager_click_on_the_import_button() {

        BrowserUtilities.waitForVisibility(employeesPage.importButton, 10);
        employeesPage.importButton.click();

    }

    @Then("Pos Manager should be able to land on the import a File page")
    public void pos_manager_should_be_able_to_land_on_the_import_a_file_page() {

        BrowserUtilities.waitForVisibility(employeesPage.importAFileText, 10);
        String expectedText = "Import a File";
        String actualText = employeesPage.importAFileText.getText();
        Assert.assertEquals("The text is not as expected!!!", expectedText, actualText);

    }

    @When("Pos Manager click on the Left Arrow - \\(<) button")
    public void pos_manager_click_on_the_left_arrow_button() {

        BrowserUtilities.waitForVisibility(employeesPage.leftArrowButton, 10);
        employeesPage.leftArrowButton.click();

    }

    @Then("PosManager should be able to click on the Left Arrow - \\(<) button.")
    public void pos_manager_should_be_able_to_click_on_the_left_arrow_button() {

        Assert.assertTrue(employeesPage.leftArrowButton.isEnabled());

    }

    @When("Pos Manager click on the Right Arrow - \\(>) button.")
    public void pos_manager_click_on_the_right_arrow_button() {

        BrowserUtilities.waitForVisibility(employeesPage.rightArrowButton, 10);
        employeesPage.rightArrowButton.click();

    }

    @Then("Pos Manager should be able to click on the Right Arrow - \\(>) button.")
    public void pos_manager_should_be_able_to_click_on_the_right_arrow_button() {

        Assert.assertTrue(employeesPage.rightArrowButton.isEnabled());

    }

    @When("Pos Manager click on the Kanban button")
    public void pos_manager_click_on_the_kanban_button() {

        //Because the Kanban button is selected by default, I click on the List button first.
        BrowserUtilities.waitForVisibility(employeesPage.inactiveListButton, 10);
        employeesPage.inactiveListButton.click();
        wait.until(ExpectedConditions.urlContains("list"));
        employeesPage.inactiveKanbanButton.click();

    }

    @Then("Pos Manager should be able to click on the Kanban button and should see the list of items in the Kanban style")
    public void pos_manager_should_be_able_to_click_on_the_kanban_button_and_should_see_the_list_of_items_in_the_kanban_style() {

        Assert.assertTrue(employeesPage.inactiveKanbanButton.isEnabled());

    }

    @When("Pos Manager click on the List button")
    public void pos_manager_click_on_the_list_button() {

        employeesPage.inactiveListButton.click();

    }

    @Then("Pos Manager should be able to click on the List button and should see the list of items in the List style")
    public void pos_manager_should_be_able_to_click_on_the_list_button_and_should_see_the_list_of_items_in_the_list_style() {

        Assert.assertTrue(employeesPage.inactiveListButton.isEnabled());

    }

    @When("Pos Manager enters employee credentials at Work information tab")
    public void pos_manager_enters_employee_credentials_at_work_information_tab() {

        String employeeName = faker.name().fullName();
        employeesPage.employeesNameInput.sendKeys(employeeName);

        employeesPage.jobStatusDropdown.click();
        employeesPage.jobStatusDropdownSelect.click();
        BrowserUtilities.waitForVisibility(employeesPage.jobStatusDropdownAfterSelect, 10);

        employeesPage.workAddressDropdown.click();
        employeesPage.workAddressDropdownSelect.click();

        employeesPage.departmentDropdown.click();
        employeesPage.departmentDropdownSelect.click();

        employeesPage.jobPositionDropdown.click();
        employeesPage.jobPositionDropdownSelect.click();

        employeesPage.managerDropdown.click();
        employeesPage.managerDropdownSelect.click();
        wait.until(ExpectedConditions.attributeContains(employeesPage.managerDropdownSelect, "id", "ui-id"));

        employeesPage.coachDropdown.click();
        employeesPage.coachDropdownSelect.click();

        employeesPage.workingHoursDropdown.click();
        employeesPage.workingHoursDropdownSelect.click();

        employeesPage.workLocation.sendKeys(faker.address().cityName());

        employeesPage.workEmail.sendKeys(faker.internet().emailAddress());

        employeesPage.mobilePhone.sendKeys(faker.phoneNumber().cellPhone());

        employeesPage.workPhone.sendKeys(faker.phoneNumber().phoneNumber());

        employeesPage.otherInformation.sendKeys(faker.lorem().characters());

    }

    @When("Pos Manager enters employee credentials at Private information tab")
    public void pos_manager_enters_employee_credentials_at_private_information_tab() {

        employeesPage.privateInformationTab.click();

        employeesPage.nationality.click();
        employeesPage.nationalitySelect.click();

        employeesPage.identificationNo.sendKeys(faker.idNumber().valid());

        employeesPage.passportNo.sendKeys(faker.idNumber().invalid());

        employeesPage.bankAccountNumber.click();
        employeesPage.createAndEditBankAccountNumber.click();
        employeesPage.enterAccountNumberInput.sendKeys(faker.numerify("####-####-####-####"));
        employeesPage.bankDropdown.click();
        employeesPage.bankDropdownSelect.click();
        employeesPage.abaRouting.sendKeys(faker.numerify("#######"));
        employeesPage.createBankAccountSaveButton.click();

        Select selectGender = new Select(employeesPage.genderDropdown);
        selectGender.selectByVisibleText("Female");

        Select selectMaritalStatus = new Select(employeesPage.maritalStatusDropdown);
        selectMaritalStatus.selectByVisibleText("Single");

        employeesPage.dateOfBirth.sendKeys("01/01/1990");
        employeesPage.saveButton.click();
        employeesPage.editButton.click();

        employeesPage.privateAddressDropdown.click();
        employeesPage.privateAddressSelect.click();

        employeesPage.numberOfChildren.sendKeys(faker.numerify("#"));

        employeesPage.placeOfBirth.sendKeys(faker.address().cityName());

        employeesPage.visaNo.sendKeys(faker.business().creditCardNumber());

        employeesPage.workPermitNo.sendKeys(faker.numerify("###########"));

        employeesPage.visaExpireDate.sendKeys("01/01/2030");
        employeesPage.saveButton.click();

    }

    @When("Pos Manager enter employee credentials at HR setting tab")
    public void pos_manager_enter_employee_credentials_at_hr_setting_tab() {

        employeesPage.editButton.click();
        employeesPage.hrSettingTab.click();
        employeesPage.relatedUserDropdownSelect.sendKeys(Keys.BACK_SPACE);

        employeesPage.medicalExamDropdown.sendKeys("01/07/2022");

        employeesPage.companVehicleInput.sendKeys("Mercedes-Benz AMG C63 S");

        employeesPage.vehicleDistanceInput.sendKeys("10");

        employeesPage.badgeId.sendKeys("112233445");

        employeesPage.manualAttandenceCheckbox.click();

    }

    @When("Pos Manager click on the Save button")
    public void pos_manager_click_on_the_save_button() {

        employeesPage.saveButton.click();

    }

    @Then("PosManager should be able to click on the Save button and should be able to create a new Employee id with the Employee created message")
    public void pos_manager_should_be_able_to_click_on_the_save_button_and_should_be_able_to_create_a_new_employee_id_with_the_employee_created_message() {

        Assert.assertTrue(employeesPage.employeeCreatedMessage.isDisplayed());

    }

    @When("PosManager click on Employees button")
    public void pos_manager_click_on_employees_button() {

        employeesPage.employeesModuleButton.click();

    }

    @Then("PosManager should be able to land on the Employees stage and should be able to see the created employee listed after clicking the Employees module")
    public void pos_manager_should_be_able_to_land_on_the_employees_stage_and_should_be_able_to_see_the_created_employee_listed_after_clicking_the_employees_module() {

        if (employeesPage.employeeAfterCreatedAtEmployeePage.isDisplayed()) {
            Assert.assertTrue(employeesPage.employeeAfterCreatedAtEmployeePage.isDisplayed());
            System.out.println("Employee ID created succesfully!!!");
        } else if (!(employeesPage.employeeAfterCreatedAtEmployeePage.isDisplayed())) {
            employeesPage.leftArrowButton.click();
            if (employeesPage.employeeAfterCreatedAtEmployeePage.isDisplayed()) {
                Assert.assertTrue(employeesPage.employeeAfterCreatedAtEmployeePage.isDisplayed());
                System.out.println("Employee ID created succesfully!!!");
            } else {
                System.out.println("Employee ID cannot created succesfully!!!");
            }
        }

    }

}
