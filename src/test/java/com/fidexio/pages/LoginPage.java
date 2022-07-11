package com.fidexio.pages;

import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String title = Driver.getDriver().getTitle();

    @FindBy(id = "login")
    public WebElement loginInput;


    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginAlert;

    @FindBy(xpath = "//a[.='Reset Password']")
    public WebElement resetPasswordLink;

    //Navigate to the login page
    public void navigateTo_LoginPage(){
        String loginPageLink = ConfigurationReader.getProperty("fidexioPage");
        Driver.getDriver().get(loginPageLink);
    }


    //login with username and password
    public void login_with_username_password(String username,String password){
        navigateTo_LoginPage();
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    //login with configuration.properties for PosManager
    public void loginPosManagerWithConfiguration(){
        navigateTo_LoginPage();
        String username = ConfigurationReader.getProperty("posManagerUsername");
        String password = ConfigurationReader.getProperty("posManagerPassword");
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }


    //login with configuration.properties for SalesManager
    public void loginSalesManagerWithConfiguration(){
        navigateTo_LoginPage();
        String username = ConfigurationReader.getProperty("salesManagerUsername");
        String password = ConfigurationReader.getProperty("salesManagerPassword");
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }
}
