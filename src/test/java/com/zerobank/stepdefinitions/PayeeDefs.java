package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class PayeeDefs {


    AccountActivityPage accountActivityPage = new AccountActivityPage();


    @Given("Add New Payee tab")
    public void addNewPayeeTab() {

        accountActivityPage.payBills.click();
        BrowserUtils.waitFor(2);
        accountActivityPage.AddNewPayee.click();
        BrowserUtils.waitFor(2);
    }

    @And("creates new payee using following information")
    public void createsNewPayeeUsingFollowingInformation(Map<String, String> elements) {

        accountActivityPage.pname.sendKeys(elements.get("Payee Name"));
        accountActivityPage.paddress.sendKeys(elements.get("Payee Address"));
        accountActivityPage.paccount.sendKeys(elements.get("Account"));
        accountActivityPage.pdetails.sendKeys(elements.get("Payee details"));

        accountActivityPage.padd.click();



    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed")
    public void messageTheNewPayeeTheLawOfficesOfHydePriceScharksWasSuccessfullyCreatedShouldBeDisplayed()  {

        String expectedMessage ="The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";

        String actualMessage = accountActivityPage.palert.getText();

        Assert.assertEquals(expectedMessage,actualMessage);

    }
}
