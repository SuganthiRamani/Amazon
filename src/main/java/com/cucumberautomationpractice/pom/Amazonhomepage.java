package com.cucumberautomationpractice.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonhomepage {
public WebDriver driver;


public Amazonhomepage(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//span[text()='Hello, Sign in']")
private WebElement mouseHover;

@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']")
private WebElement clickSignin;




public WebElement getClickSignin() {
	return clickSignin;
}
@FindBy(xpath = "//span[text()='Sign Out']")
private WebElement signOut;


public WebDriver getDriver() {
	return driver;
}
public WebElement getMouseHover() {
	return mouseHover;
}
public WebElement getSignOut() {
	return signOut;
}
@FindBy(xpath = "//a[contains(@id,'nav-link')]/span[@class='nav-line-1' and contains(text(), 'Hello')]")
private WebElement userName_Header;


public WebElement getUserName_Header() {
	return userName_Header;
}
}
