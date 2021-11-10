package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class FindTransactionsDefs {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() throws InterruptedException {
            accountActivityPage.accountActivity.click();
            BrowserUtils.waitFor(2);
            accountActivityPage.FindTransactions.click();
        BrowserUtils.waitFor(2);


    }
    @When("the user enters date range from {string} to {string}")
    public void theUserEntersDateRangeFromTo(String arg0, String arg1) {
        accountActivityPage.fromDate.clear();
        accountActivityPage.fromDate.sendKeys(arg0);
        accountActivityPage.toDate.clear();
        accountActivityPage.toDate.sendKeys(arg1);


    }
    @And("clicks search")
    public void clicksSearch() {

        accountActivityPage.findButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("results table should only show transactions dates between {string} to {string}")
    public void resultsTableShouldOnlyShowTransactionsDatesBetweenTo(String arg1, String arg2) {


       Assert.assertEquals(accountActivityPage.fromDate.getAttribute("value"),arg1);
       Assert.assertEquals(accountActivityPage.toDate.getAttribute("value"),arg2);




    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

        List<String> dates = BrowserUtils.getElementsText(Driver.get().findElements(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")));

        System.out.println("dates = " + dates);

        for (String date : dates) {

            List<String> dashdelete = Arrays.asList(date.split("-"));

            List<String> dashdelete2= Collections.singletonList(dashdelete.get(0) + dashdelete.get(1) + dashdelete.get(2));

            System.out.println("dashdelete = " + dashdelete);

        }



    }


    @When("the user enters description {string}")
    public void theUserEntersDescription(String arg0) {

        new AccountActivityPage().description.sendKeys(arg0);
    }

    @Then("results table should only show descriptions containing {string}")
    public void resultsTableShouldOnlyShowDescriptionsContaining(String arg0) {

        Assert.assertEquals(accountActivityPage.description.getAttribute("value"),arg0);

        accountActivityPage.description.clear();

    }

    @But("results table should not show descriptions containing {string}")
    public void resultsTableShouldNotShowDescriptionsContaining(String arg0) {

        Assert.assertNotEquals(accountActivityPage.description.getAttribute("value"),arg0);


    }

    @Then("results table should show at least one result under Deposit")
    public void resultsTableShouldShowAtLeastOneResultUnderDeposit() {
        BrowserUtils.waitFor(2);

        Assert.assertTrue(accountActivityPage.deposit.size()>0);


    }

    @Then("results table should show at least one result under Withdrawal")
    public void resultsTableShouldShowAtLeastOneResultUnderWithdrawal() {
        BrowserUtils.waitFor(2);

        Assert.assertTrue(accountActivityPage.withdrawal.size()>0);

    }

    @When("user selects type {string}")
    public void userSelectsType(String idType) {

        accountActivityPage.type.click();

        accountActivityPage.getType(idType.toUpperCase()).click();

    }


    @But("results table should show no result under Withdrawal")
    public void resultsTableShouldShowNoResultUnderWithdrawal() {



    }






    @But("results table should show no result under Deposit")
    public void resultsTableShouldShowNoResultUnderDeposit() {


    }


    @And("the results table should only not contain transactions dated {string}")
    public void theResultsTableShouldOnlyNotContainTransactionsDated(String arg0) {



    }
}

