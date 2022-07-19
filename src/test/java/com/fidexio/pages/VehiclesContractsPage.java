package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesContractsPage {

    public VehiclesContractsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "(//div[@class='o_searchview_facet']//div)[2]")
    public WebElement inProgressButton;

    @FindBy(xpath ="(//tbody[@class='ui-sortable']//tr)[1]")
    public WebElement lastCreatedContract;








}
