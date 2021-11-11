package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountSummaryDefs {
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String links) {

        WebElement locator = Driver.get().findElement(By.xpath("//*[text()='"+links+"']"));

        locator.click();


    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() throws InterruptedException {

        String  actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains("Account Activity"));


    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {

        Select dropDownElement = new Select(accountActivityPage.accountDropDown);

        String actualOption = dropDownElement.getFirstSelectedOption().getText();

        Assert.assertEquals(string,actualOption);




    }




    @When("Account summary page have titles")
    public void accountSummaryPageHaveTitles(List<String> titlesAccount) {

    List<String> actualTitles =BrowserUtils.getElementsText(accountActivityPage.accountTitles);

    Assert.assertEquals(titlesAccount,actualTitles);

    }

    @Then("Account table should have titles")
    public void accountTableShouldHaveTitles(List<String> titlesCredit) {

    List<String> actualTitles = BrowserUtils.getElementsText(accountActivityPage.creditTitles);

    Assert.assertEquals(titlesCredit,actualTitles);

    }

    @Given("Page should have the title {string}")
    public void pageShouldHaveTheTitle(String expectedTitle) {

    String actualTitle = Driver.get().getTitle();

    Assert.assertEquals(expectedTitle,actualTitle);

    }
}
