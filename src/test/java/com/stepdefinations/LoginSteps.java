package com.stepdefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.orangehrm.utilites.DriverFactory;
import com.page.orangehrm.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private LoginPage page = new LoginPage(DriverFactory.getDriver());

	@Given("login into Orange Applicaiton")
	public void login_into_Orange_Applicaiton() {
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		page.login("Admin", "admin123");
	}

	String titleOfpage = null;

	@When("get Valid Title of page")
	public void get_Valid_title_of_page() {
		titleOfpage = page.getTitle();
		System.out.println("OrageHRM page title " + titleOfpage);
	}

	@Given("login into invalid Applicaiton")
	public void login_into_invalid_Applicaiton() {
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		page.login("Admin", "adminsd123");
	}

	@Then("validate title of page")
	public void validate_title_of_page() {
		Assert.assertEquals(titleOfpage, "Dashboard");
	}

	@Then("validate error message")
	public void validate_error_message() {
		String emesage = page.getErrorMessage();
		Assert.assertEquals(emesage, "Invalid credentials");
	}

	@Given("I enter Username as {string} and Password as {string}")
	public void login_into_tech_app_applicaiton(String uname, String pwd) {
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		page.login(uname, pwd);
	}
	
	
	@Given("login into ORANGE Applicaiton")
	public void llogin_into_ORANGE_Applicaiton(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> mapDetails=dataTable.asMaps();
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		for (Map<String, String> map : mapDetails) {
			page.login(map.get("userName"), map.get("password"));
			Thread.sleep(5000);
			page.logOut();
		}
	}

	
	
}
