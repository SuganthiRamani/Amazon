package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Reusablecode.Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	features=	{"src\\test\\java\\com\\cucumber\\features\\Amazoncucumber.feature"},
	glue= {"com.cucumber.stepdefinition"},tags= {"@LoginwithStepdata "},strict=true,monochrome=true
	
	)
public class day2 {

	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws Exception{
		driver = Baseclass.Browserlaunch("chrome");
		
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
