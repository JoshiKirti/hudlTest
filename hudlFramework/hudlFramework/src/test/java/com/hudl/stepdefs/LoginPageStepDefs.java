package com.hudl.stepdefs;

import org.junit.Assert;

import com.hudl.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefs {
	
	LoginPage loginPage=new LoginPage();

	@Given("user verifies Hudl page")
	public void verifyHudlPageOpened() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(loginPage.verifyHudlPageOpened());
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		loginPage.enterCredentials(username,password);
	}
	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String button) {
		loginPage.clickOnButton(button);
	}
	
	@Then("user verifies invalid credentials message")
	public void user_verifies_invalid_credentials_message() {
		Assert.assertTrue(loginPage.verifyInvalidCredentialsMessage());
	}
	
	@Then("user verifies successful login")
	public void verifySuccessfulLogin() {
		Assert.assertTrue(loginPage.verifySuccessfulLogin());
	}
	
	@Then("user verifies login with an organization error message")
	public void loginWithOrganizationErrorMessage() {
			Assert.assertTrue(loginPage.loginWithOrganizationErrorMessage());
	}
}
