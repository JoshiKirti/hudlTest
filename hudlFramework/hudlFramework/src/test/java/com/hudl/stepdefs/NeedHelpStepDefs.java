package com.hudl.stepdefs;

import org.junit.Assert;

import com.hudl.pages.NeedHelpPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NeedHelpStepDefs {

	NeedHelpPage needHelpPage=new NeedHelpPage();
	
	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
		needHelpPage.clickOnNeedHelp();
	}
	
	@When("user enters {string} email id")
	public void user_enters_email_id_and_clicks_on_reset_button(String email) {
		if(email.equalsIgnoreCase("invalid")) {
			email="abc@";
		}else if(email.equalsIgnoreCase("valid")) {
			email="abc@gmail.com";
		}
		needHelpPage.enterEmail(email);
	}
	
	@Then("user verifies error message")
	public void user_verifies_error_message() {
		Assert.assertTrue(needHelpPage.verifyErrorMessage());
	}
	
	@Then("user verifies success message")
	public void user_verifies_success_message() {
		Assert.assertTrue(needHelpPage.verifySuccessMessage());
	}
	
}
