package com.hudl.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.baseClass;

public class NeedHelpPage extends baseClass {

	WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(30));
	By needHelpLink=By.xpath("//a[@class='uni-link uni-link--default']");
	By emailIdTextBox=By.xpath("//input[@type='text']|//input[@type='email']");
	By errorMessage=By.xpath("//p[@class='uni-text']");
	By successMessage=By.xpath("//h3[@class='uni-headline uni-headline--3']");
	
	public void clickOnNeedHelp() {
		getDriver().findElement(needHelpLink).click();
	}

	public void enterEmail(String email) {
		getDriver().findElement(emailIdTextBox).clear();
		getDriver().findElement(emailIdTextBox).sendKeys(email);
	}

	public boolean verifyErrorMessage() {
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(errorMessage)));
		return getDriver().findElement(errorMessage).isDisplayed();
	}

	public boolean verifySuccessMessage() {
		return getDriver().findElement(successMessage).isDisplayed();
	}

}
