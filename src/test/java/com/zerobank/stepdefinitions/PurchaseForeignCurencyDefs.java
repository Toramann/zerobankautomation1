package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PurchaseForeignCurencyDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    @Given("the user accesses the Purchase foreign currency cash tab")
    public void theUserAccessesThePurchaseForeignCurrencyCashTab() {

        accountActivityPage.payBills.click();
        BrowserUtils.waitFor(1);
        accountActivityPage.purchaseForeignCurrency.click();
        BrowserUtils.waitFor(1);




    }


    @Then("following currencies should be available")
    public void followingCurrenciesShouldBeAvailable(List<String> expectedElements) {

        List<String> actualElements = BrowserUtils.getElementsText(accountActivityPage.currency);
        System.out.println("expectedElements = " + expectedElements);
        System.out.println("actualElements = " + actualElements);

        Assert.assertEquals(expectedElements,actualElements);



    }


    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {

        accountActivityPage.calculate.click();

    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {

        Alert alert = Driver.get().switchTo().alert();

        String alertmessage =  alert.getText();
        Assert.assertEquals("Please, ensure that you have filled all the required fields with valid values.",alertmessage);

        alert.accept();
    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {
        accountActivityPage.calculate.click();

    }
}
