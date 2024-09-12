package com.rostand.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

private WebDriver webDriver;

@FindBy(xpath = "//input[@name='email']")
private WebElement usernameElement;


@FindBy(xpath = "//input[@id='inputPassword']")
private WebElement passwordElement;

@FindBy(xpath = "//button[@type='submit']")
private WebElement loginBtnElement;

@FindBy(xpath = "//a[contains(text(),'Account')]")
private WebElement accountElement;

public  LoginPage(WebDriver driver){
    this.webDriver = driver;

    PageFactory.initElements(driver, this);
}

public void enterEmail(String email){
    usernameElement.sendKeys(email);
}
public void enterPassword(String password){
    passwordElement.sendKeys(password);
}

public void clickLoginBtnElement(){
    loginBtnElement.click();
}

public boolean accountElementIsDisplay(){
   return accountElement.isDisplayed();
}
}
