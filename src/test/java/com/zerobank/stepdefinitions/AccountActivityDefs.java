package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @When("the user clicks Account Activity")
    public void theUserClicksAccountActivity() {

        accountActivityPage.accountActivity.click();
        BrowserUtils.waitFor(1);

    }


    @When("the account dropdown default option should display savings")
    public void theAccountDropdownDefaultOptionShouldDisplaySavings() {

        Select select = new Select(accountActivityPage.accountDropDown);



        Assert.assertEquals("Savings",select.getFirstSelectedOption().getText());

    }

    @When("the Account dropdown should be verify")
    public void theAccountDropdownShouldBeVerify(List<String> expectedTitles ) {

        Select select = new Select(accountActivityPage.accountDropDown);

        List<String> elementsText = BrowserUtils.getElementsText(select.getOptions());

        Assert.assertEquals(expectedTitles,elementsText);


    }

    @Then("Transactions titles should be verify")
    public void transactionsTitlesShouldBeVerify(List<String> titles) {

    List<String> actualTitles = BrowserUtils.getElementsText(accountActivityPage.transTitles);

    Assert.assertEquals(titles,actualTitles);

    }
}

