package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage {
    //There are lots of constant webElements coming from BasePage

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //navigate to Calendar Page
    public void navigateTo_CalendarPage_asPosManager(){
        loginPage.loginPosManagerWithConfiguration();
        moreMenu.click();
        calendarMenu.click();
    }
}
