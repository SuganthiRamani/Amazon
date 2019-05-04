package com.cucumberautomationpractice.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
public WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchField;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement submitButton;
	
	@FindBy(xpath="//span[text()='Hello,Sign in']")
	private WebElement signin;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement signIn_HelloSignin;
}
