package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.testrunner.day2;

import Reusablecode.Baseclass;
import Reusablecode.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonstepdefinition extends Baseclass {
	public static WebDriver driver = day2.driver;

	public static PageObjectManager p = new PageObjectManager(driver);
	@Given("^User should be the Amazon Home Page$")
	public void user_should_be_the_Amazon_Home_Page() throws Throwable {
	    getUrl("https://www.amazon.in/");
	}

	@When("^User mouse hover to the SignIn button in the Header$")
	public void user_mouse_hover_to_the_SignIn_button_in_the_Header() throws Throwable {
	    movetoElement(p.getHomePage().getMouseHover());
	}

	@When("^User Click on  Signin button in AJAX call$")
	public void user_Click_on_Signin_button_in_AJAX_call() throws Throwable {
		elementClick(p.getHomePage().getClickSignin());
		System.out.println("user_Click_on_Signin_button_in_AJAX_call");
	    	}

	@When("^User enter the email/mobile number in  emailid feild$")
	public void user_enter_the_email_mobile_number_in_emailid_feild() throws Throwable {
	   sendKeys(p.getLoginPage().getEmailFeild(),"9884774411");
	}

	@When("^User click on the Continue button$")
	public void user_click_on_the_Continue_button() throws Throwable {
	    elementClick(p.getLoginPage().getContinueBtn());
	}

	@When("^User enter the password'(.*)' in  password feild$")
	public void user_enter_the_password_in_password_feild() throws Throwable {
		sendKeys(p.getLoginPage().getPassword(),"Lumia*1989*");
	}

	@When("^User click the signin button to  the login  application$")
	public void user_click_the_signin_button_to_the_login_application() throws Throwable {
	    elementClick(p.getLoginPage().getLoginBtn());
	}

	@When("^User wait for the'(\\d+)' seconds$")
	public void user_wait_for_the_seconds(int seconds) throws Throwable {
	    int i=seconds*1000;
	    Thread.sleep(i);
	}

	@Then("^User validate  username'(.*)' in the Header$")
	public void user_validate_username_in_the_Header() throws Throwable {
	    String actual = p.getHomePage().getUserName_Header().getText();
	    highLightWebElement(p.getHomePage().getUserName_Header());
		org.junit.Assert.assertEquals("Hello, HariPriya", actual);
	}
	@Then("^User mouse hover to username in the header$")
	public void user_mouse_hover_to_username_in_the_header() throws Throwable {
	    movetoElement(p.getHomePage().getUserName_Header());
	    
	}

	@Then("^User click on signout button$")
	public void user_click_on_signout_button() throws Throwable {
	    elementClick(p.getHomePage().getSignOut());
	}

}