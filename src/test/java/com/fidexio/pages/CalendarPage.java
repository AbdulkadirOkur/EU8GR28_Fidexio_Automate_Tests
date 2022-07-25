package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends LoginPage{

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[2]/a/span")
    public WebElement calendarButton;

    @FindBy (xpath = "//button[.='Day']")
    public WebElement dayButton;

    @FindBy (xpath = "//button[.='Week']")
    public WebElement weekButton;

    @FindBy (xpath = "//button[.='Month']")
    public WebElement monthButton;






    
    

}
