package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.SalesFuncPage_Ali;
import com.fidexio.utilities.BrowserUtilities;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SalesFuncStepDefn_Ali {

    SalesFuncPage_Ali salesFuncPage_ali= new SalesFuncPage_Ali();
    LoginPage loginPage= new LoginPage();


    @When("user clicks Sales module button")
    public void user_clicks_sales_module_button() {

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.elementToBeClickable(salesFuncPage_ali.salesModuleButton));
        salesFuncPage_ali.salesModuleButton.click();

    }

    @And("user should be able to see Customers button on left and click")
    public void user_should_be_able_to_see_customers_button_on_left_and_click() {

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Quotations - Odoo"));
        salesFuncPage_ali.customersButton.click();

    }


    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.createButton.click();



    }
    @Then("user sees the title as New Odoo")
    public void user_sees_the_title_as_new_odoo() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("New - Odoo"));
        String expectedTitle = "New - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user clicks on Import button")
    public void user_clicks_on_import_button() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.importButton.click();
    }

    @Then("user sees the title as Import a file Odoo")
    public void user_sees_the_title_as_import_a_file_odoo() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.titleIs("Import a File - Odoo"));
        String expectedTitle = "Import a File - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user clicks on Right Arrow button")
    public void user_clicks_on_right_arrow_button() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.rightArrowButton.click();
    }
    @Then("pager value changes to next numbers")
    public void pager_value_changes_to_next_numbers() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        String expextedClass= "81-160";
        String actualClass= salesFuncPage_ali.pagerValue.getText().toString();
                Assert.assertEquals(expextedClass,actualClass);
    }

    @When("user clicks on Left Arrow button")
    public void user_clicks_on_left_arrow_button() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.rightArrowButton.click();
        WebDriverWait wait2= new WebDriverWait(Driver.getDriver(),15);
        wait2.until(ExpectedConditions.elementToBeClickable(salesFuncPage_ali.leftArrowButton));
        salesFuncPage_ali.leftArrowButton.click();
    }
    @Then("pager value changes to previous numbers")
    public void pager_value_changes_to_previous_numbers() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        String expextedClass= "1-80";
        String actualClass= salesFuncPage_ali.pagerValue.getText().toString();
        Assert.assertEquals(expextedClass,actualClass);
    }

    @When("user clicks on Kanban button")
    public void user_clicks_on_kanban_button() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.kanbanButton.click();
    }
    @Then("page changes to Kanban format")
    public void page_changes_to_kanban_format() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        String expextedClass= "btn btn-icon fa fa-lg fa-th-large o_cp_switch_kanban active";
        String actualClass= salesFuncPage_ali.kanbanValue.getAttribute("class");
        Assert.assertEquals(expextedClass,actualClass);
    }

    @When("user clicks on List button")
    public void user_clicks_on_list_button() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.listButton.click();
    }
    @Then("page changes to List format")
    public void page_changes_to_list_format() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        String expextedClass= "btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list active";
        String actualClass= salesFuncPage_ali.listValue.getAttribute("class");
        Assert.assertEquals(expextedClass,actualClass);
    }




    @When("user clicks on individual radio button")
    public void user_clicks_on_individual_radio_button() {

        salesFuncPage_ali.individualButton.click();
    }
    @And("user clicks on blank and enters name")
    public void user_clicks_on_blank_and_enters_name() {

        salesFuncPage_ali.nameBlank.sendKeys("Alex De");
    }
    @And("user clicks on Address blanks and enters address info")
    public void user_clicks_on_address_blanks_and_enters_address_info() {
        salesFuncPage_ali.street.sendKeys("Abc Main Street");
        salesFuncPage_ali.street2.sendKeys("XZ Kind Way");
        salesFuncPage_ali.cityBlank.sendKeys("Aydın");
        salesFuncPage_ali.zipBlank.sendKeys("09100");
        salesFuncPage_ali.countryBlank.sendKeys("Turkiye");
    }
    @And("user clicks on TIN blank and enters info")
    public void user_clicks_on_tin_blank_and_enters_info() {
        salesFuncPage_ali.tinBlank.sendKeys("EE1234567890");
    }
    @And("user clicks on job position and enters info")
    public void user_clicks_on_job_position_and_enters_info() {
        salesFuncPage_ali.jobBlank.sendKeys("Protection Manager");
    }
    @And("user clicks on phone blank and enters number")
    public void user_clicks_on_phone_blank_and_enters_number() {
        salesFuncPage_ali.phoneBlank.sendKeys("00905011234567");
    }
    @And("user clicks on mobile and enters number")
    public void user_clicks_on_mobile_and_enter_number() {
        salesFuncPage_ali.mobileBlank.sendKeys("00902566111111");
    }
    @And("user clicks on email and enters email")
    public void user_clicks_on_email_and_enters_email() {
        salesFuncPage_ali.emailBlank.sendKeys("alex_de@alexde.com");
    }
    @And("user clicks on website and enters website info")
    public void user_clicks_on_website_and_enters_website_info() {
        salesFuncPage_ali.webSiteBlank.sendKeys("www.alexde.com");
    }

    @And("user clicks on title and enters title info")
    public void userClicksOnTitleAndEntersTitleInfo() {
        salesFuncPage_ali.titleBlank.sendKeys("Coordinator");
    }

    @Then("user clicks on Save button")
    public void userClicksOnSaveButton() {
        salesFuncPage_ali.saveButton.click();
    }


    @When("user enters Individual customer name to search and clicks search button")
    public void user_enters_individual_customer_name_to_search_and_clicks_search_button() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.searchBox.sendKeys("Alex De"+ Keys.ENTER);
    }
    @Then("user sees the customer")
    public void user_sees_the_customer() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.elementToBeClickable(salesFuncPage_ali.viewCustomer));

        String expectedCustomer= "oe_kanban_details";
        String actualCustomer=salesFuncPage_ali.viewCustomer.getAttribute("class").toString();
        Assert.assertEquals(expectedCustomer,actualCustomer);

    }


    @And("user clicks on company radio button")
    public void userClicksOnCompanyRadioButton() {
        salesFuncPage_ali.companyButton.click();
    }

    @When("user enters Company customer name to search and clicks search button")
    public void user_enters_company_customer_name_to_search_and_clicks_search_button() {
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        salesFuncPage_ali.searchBox.sendKeys("Alex De"+ Keys.ENTER);
    }

}
