package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountActivityPage extends BasePage {

    public  AccountActivityPage(){ PageFactory.initElements(Driver.get(),this);}


    @FindBy(id = "aa_accountId")
        public WebElement accountDropDown;

    @FindBy(xpath = "//*[text()='Account Activity']")
        public WebElement accountActivity;

    @FindBy(xpath = "//*[text()='Find Transactions']")
    public WebElement FindTransactions;

    @FindBy(xpath = "//*[@id='aa_fromDate']")
    public WebElement fromDate;

    @FindBy(name="toDate")
    public WebElement toDate;

    @FindBy(name="fromAmount")
    public WebElement fromAmount;

    @FindBy(name="toAmount")
    public WebElement toAmount;

    @FindBy(xpath = "//*[text()='Find']")
    public WebElement findButton;

    @FindBy(id = "aa_description")
    public  WebElement description;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")
    public List<String> dates;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[4]")
    public List<WebElement> withdrawal;


    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[3]")
    public List<WebElement> deposit;

    @FindBy(id = "aa_type")
    public WebElement type;

    public WebElement getType(String idType){
        return Driver.get().findElement(By.xpath("//*[@value='"+idType+"']"));
    }

    @FindBy(linkText = "Pay Bills")
    public  WebElement payBills;

    @FindBy(linkText = "Purchase Foreign Currency")
    public  WebElement purchaseForeignCurrency;

    @FindBy(xpath = "//*[@id='pc_currency']/option")
    public List<WebElement> currency;

    @FindBy(linkText = "Add New Payee")
    public  WebElement  AddNewPayee;

    @FindBy(id ="np_new_payee_name")
    public  WebElement pname;

    @FindBy(id ="np_new_payee_details")
    public  WebElement pdetails;

    @FindBy(id ="np_new_payee_address")
    public  WebElement paddress;

    @FindBy(id ="np_new_payee_account")
    public  WebElement paccount;

    @FindBy(id ="add_new_payee")
    public  WebElement padd;

    @FindBy(id="alert_content")
    public WebElement palert;

    @FindBy(id = "pc_calculate_costs")
    public  WebElement calculate;

    @FindBy(id = "pc_amount")
    public WebElement amountForeign;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")
    public List<String> datesAccount;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/h2")
    public List<WebElement> accountTitles;
}
