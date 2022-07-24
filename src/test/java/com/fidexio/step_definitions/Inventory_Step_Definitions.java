package com.fidexio.step_definitions;

import com.fidexio.pages.BasePage;
import com.fidexio.pages.InventoryPage;
import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class Inventory_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    InventoryPage inventoryPage= new InventoryPage();


    @And("user clicks to inventory button")
    public void userClicksToInventoryButton() {
        basePage.inventoryButton.click();
    }

    @And("user clicks to products button")
    public void userClicksToProductsButton() {
        inventoryPage.productsButton.click();
    }

    @Then("user sees Products headline in middle top of the page")
    public void userSeesProductsHeadlineInMiddleTopOfThePage() {
        String expectedTitle= "Products";
        String actualTitle= inventoryPage.productsText.getText();
        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);
    }

    @When("user clicks to create button")
    public void user_clicks_to_create_button() {
        inventoryPage.createButton.click();
    }

    @And ("user clicks to product name box")
    public void user_clicks_to_product_name_box() {
        inventoryPage.nameBox.click();
    }

    @And ("user enter {string} of product")
    public void user_enter_of_product(String name) {
        inventoryPage.nameBox.sendKeys(name);
    }

    @And("user clicks to product type dropdown button")
    public void userClicksToProductTypeDropdownButton() {inventoryPage.productTypeDropdown.click();
    }

    @And("user select to one of {string}")
    public void userSelectToOneOf(String productType) {
        Select select= new Select(inventoryPage.productTypeDropdown);
        select.selectByVisibleText(productType);
    }

    @Then("user see the {string}")
    public void userSeeThe(String selectedProductType) {
        String expectedProductType=selectedProductType;
        String actualProductType="";

        if (selectedProductType=="Consumable"){

            actualProductType=inventoryPage.consumableText.getText();

        } else if (selectedProductType=="Service"){

            actualProductType=inventoryPage.serviceText.getText();
        } else {

            actualProductType=inventoryPage.stockableProductText.getText();
        }

        Assert.assertEquals("Product type is not as expected!",expectedProductType,actualProductType);
    }

    @And ("user clicks to save button")
    public void user_clicks_to_save_button() {
        inventoryPage.saveButton.click();
    }


    @And("user clicks to product type of Service")
    public void userClicksToProductTypeOfService() {
        Select selectService= new Select(inventoryPage.productTypeDropdown);
        selectService.selectByVisibleText("Service");
    }

    @Then("user sees the product type as Service")
    public void userSeesTheProductTypeAsService() {
        String expectedServiceProductType="Service";
        Assert.assertEquals("Product type is not as expected!",expectedServiceProductType,inventoryPage.serviceText.getText());
    }

    @And("user clicks to product type of consumable")
    public void userClicksToProductTypeOfConsumable() {
        Select selectConsumableTYpe= new Select(inventoryPage.productTypeDropdown);
        selectConsumableTYpe.selectByVisibleText("Consumable");
    }

    @Then("user sees the product type as Consumable")
    public void userSeesTheProductTypeAsConsumable() {
        String expectedConsumableProductType="Consumable";
        Assert.assertEquals("Product type is not as expected!",expectedConsumableProductType,inventoryPage.consumableText.getText());
    }

    @And("user clicks to product type of Stockable Product")
    public void userClicksToProductTypeOfStockableProduct() {
        Select selectStockableProductType= new Select(inventoryPage.productTypeDropdown);
        selectStockableProductType.selectByVisibleText("Stockable Product");
    }

    @Then("user sees the product type as Stockable Product")
    public void userSeesTheProductTypeAsStockableProduct() {
        String expectedStockableProductType="Stockable Product";
        Assert.assertEquals("Product type is not as expected!",expectedStockableProductType,inventoryPage.stockableProductText.getText());
    }

    @And("user clicks to product type of blank")
    public void userClicksToProductTypeOfBlank() {
        Select selectNoneProductType= new Select(inventoryPage.productTypeDropdown);
        selectNoneProductType.selectByValue("false");
    }

    @Then("user sees warning of The following fields are invalid: Product type on the rigt side of page")
    public void userSeesWarningOfTheFollowingFieldsAreInvalidProductTypeOnTheRigtSideOfPage() {
        String expectedProductTypeWarnig= "Product Type";
        String actualProductTypeWarning=inventoryPage.productTypeWarning.getText();
        Assert.assertEquals("Product type warning is not as expected!",expectedProductTypeWarnig,actualProductTypeWarning);
    }

    @Then("user sees warning of The following fields are invalid: Name")
    public void userSeesWarningOfTheFollowingFieldsAreInvalidName() {
        String expectedNameWarnig= "Name";
        String actualNameWarning=inventoryPage.nameWarning.getText();
        Assert.assertEquals("Product type warning is not as expected!",expectedNameWarnig,actualNameWarning);
    }

    @And("user clicks barcode box")
    public void userClicksBarcodeBox() {
        inventoryPage.barcodeBox.click();
    }

    @And("user enter {string}")
    public void userEnter(String barcode) {
        inventoryPage.barcodeBox.sendKeys(barcode);
    }


    @Then("user sees {string} and {string} on the product page")
    public void userSeesAndOnTheProductPage(String displayName, String displayBarcode) {
        String expectedName=displayName;
        String expextedBarcode=displayBarcode;

        String actualName=inventoryPage.displayName.getText();
        String actualBarcode=inventoryPage.displayBarcode.getText();

        Assert.assertEquals("Name is not as expected!",expectedName,actualName);
        Assert.assertEquals("Barcode is not as expected!",expextedBarcode,actualBarcode);
    }

    @And("user clicks sales price box")
    public void userClicksSalesPriceBox() {
        inventoryPage.salesPriceBox.click();
        inventoryPage.salesPriceBox.sendKeys(Keys.BACK_SPACE);
        inventoryPage.salesPriceBox.sendKeys(Keys.BACK_SPACE);
        inventoryPage.salesPriceBox.sendKeys(Keys.BACK_SPACE);
        inventoryPage.salesPriceBox.sendKeys(Keys.BACK_SPACE);
    }


    @And("user input sales price {string}")
    public void userSetSalesPrice(String salesPrice) {
        inventoryPage.salesPriceBox.sendKeys(salesPrice);
    }

    @And("user click cost box")
    public void userClickCostBox() {
        inventoryPage.costBox.click();
        inventoryPage.costBox.sendKeys(Keys.BACK_SPACE);
        inventoryPage.costBox.sendKeys(Keys.BACK_SPACE);
        inventoryPage.costBox.sendKeys(Keys.BACK_SPACE);
        inventoryPage.costBox.sendKeys(Keys.BACK_SPACE);
    }

    @And("user set cost {string}")
    public void userSetCost(String cost) {
        inventoryPage.costBox.sendKeys(cost);
    }

    @Then("user sees sales price as {string} and cost as {string}")
    public void userSeesSalesPriceAsAndCostAs(String displayedPrice, String displayedCost) {
        String expectedPrice=displayedPrice;
        String expectedCost=displayedCost;
        String actualPrice=inventoryPage.displaysalesPrice.getText();
        String actualCost=inventoryPage.displayCost.getText();

        Assert.assertEquals("Sales Price is not as expected!",expectedPrice,actualPrice);
        Assert.assertEquals("Cost is not as expected!",expectedCost,actualCost);

    }


    @And("user set salesprice {string}")
    public void userSetSalessPrice(String salesPrice) {
        inventoryPage.salesPriceBox.sendKeys(salesPrice);
    }

    @And("user setcost {string}")
    public void userSetCostt(String cost) {
        inventoryPage.costBox.sendKeys(cost);
    }

    @Then("user sees {string} The following fields are invalid: Sales Price or\\/and Cost")
    public void userSeesTheFollowingFieldsAreInvalidSalesPriceOrAndCost(String warning) {
    String expectedWarningtext=warning;
    String actualWarningtext=inventoryPage.invalidFieldsWarning.getText();

    }

    @And("user clicks to set product picture edit icon")
    public void userClicksToSetProductPictureEditIcon() {
        inventoryPage.pictureEditButton.click();
    }

    @And("user upload product picture")
    public void userUploadProductPicture() {
        inventoryPage.pictureEditButton.sendKeys("C:\\Users\\GRUNDIG\\Desktop\\SDET\\SoftSkill\\PROJECT-FIDEX\\mountain bike.jpg");
    }

    @Then("user see product picture on the product page")
    public void userSeeProductPictureOnTheProductPage() {
       Boolean expectedPictureDisplay=true;
       Boolean actualPictureDisplay=inventoryPage.displayPicture.isDisplayed();
       Assert.assertEquals("Picture is not display as expected!",expectedPictureDisplay,actualPictureDisplay);
    }

    @And("user clicks to search box")
    public void userClicksToSearchBox() {
        inventoryPage.searchBox.click();
    }
}
