package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage extends BasePage {
    //There are lots of constant webElements coming from BasePage
    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //navigate to Employees Page
    public void navigate_to_EmployeesPage_asPosManager(){
        loginPage.loginPosManagerWithConfiguration();
        moreMenu.click();
        employeesMenu.click();
    }
}
