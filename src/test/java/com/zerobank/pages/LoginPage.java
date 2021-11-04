package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(){
    PageFactory.initElements(Driver.get(),this);
}

@FindBy(id = "signin_button")
    public WebElement signButton;


}
