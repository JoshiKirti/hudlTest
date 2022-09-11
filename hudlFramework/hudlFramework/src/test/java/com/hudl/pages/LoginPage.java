package com.hudl.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.baseClass;

public class LoginPage extends baseClass {

	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
	By hudlPageHeader = By.xpath("//h1");
	By loginButton = By.xpath("//a[text()='Log in']|//button[text()='Log In']");
	By emailIdTextBox = By.id("email");
	By passwordTextBox = By.id("password");
	By errorMessage = By.xpath("//p[text()=\"We didn't recognize that email and/or password.\"]");
	By avatar = By.xpath("//div[@class='hui-globaluseritem__avatar']");
	By sendPasswordReset = By.xpath("//button");
	By loginWithAnOrganization = By.xpath("(//button)[2]");
	By loginWithAnOrganizationErrorMessage=By.xpath("//p[@class='uni-text']");

	public boolean verifyHudlPageOpened() {
		return getDriver().findElement(hudlPageHeader).isDisplayed();
		}

	public void enterCredentials(String username, String password) {
		getDriver().findElement(emailIdTextBox).sendKeys(username);
		getDriver().findElement(passwordTextBox).sendKeys(password);
	}

	public void clickOnButton(String button) {
		switch (button) {
		case "Login":
			getDriver().findElement(loginButton).click();
			break;
		case "SendPasswordReset":
			getDriver().findElement(sendPasswordReset).click();
			break;
		case "LoginWithAnOrganization":
			getDriver().findElement(loginWithAnOrganization).click();
			break;
		}
	}

	public boolean verifyInvalidCredentialsMessage() {
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(errorMessage)));
		return getDriver().findElement(errorMessage).isDisplayed();
	}

	public boolean verifySuccessfulLogin() {
		wait.until(ExpectedConditions.stalenessOf(getDriver().findElement(avatar)));
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(avatar)));
		return getDriver().findElement(avatar).isDisplayed();
	}

	public boolean loginWithOrganizationErrorMessage() {
		wait.until(ExpectedConditions.stalenessOf(getDriver().findElement(loginWithAnOrganizationErrorMessage)));
		return getDriver().findElement(loginWithAnOrganizationErrorMessage).isDisplayed();
	}

}
