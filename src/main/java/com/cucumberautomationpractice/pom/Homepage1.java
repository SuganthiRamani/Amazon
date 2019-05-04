package com.cucumberautomationpractice.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
public WebDriver driver;
public Homepage1(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver,this);
}
@FindBy(id="site-my-mac")
private WebElement signin;


public WebElement getSignin() {
	return signin;
}
@FindBy(id="form--signin--field--EMAIL_ADDRESS")
private WebElement emailidfield;
public WebDriver getDriver() {
	return driver;
}
public WebElement getEmailidfield() {
	return emailidfield;
}
public WebElement getPasswordfield() {
	return passwordfield;
}
@FindBy(id="form--signin--field--PASSWORD")
private WebElement passwordfield;
}
