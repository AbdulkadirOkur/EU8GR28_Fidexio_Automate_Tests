package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage extends BasePage {
    //There are lots of constant webElements coming from BasePage

    public SurveysPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //navigate to Surveys Page
    public void navigateTo_SurveysPage_asPosManager(){
        loginPage.loginPosManagerWithConfiguration();
        moreMenu.click();
        surveysMenu.click();
    }


    @FindBy(xpath = "//a[@data-menu='476']")
    public WebElement surveysSubMenu;

    @FindBy(xpath = "//a[@data-menu='477']")
    public WebElement AnswersMenu;
}
