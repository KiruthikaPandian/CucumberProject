package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public WebDriver driver;

	@FindBy(id="email")
	private WebElement emailField;
	
	@FindBy(id="passwd")
	private WebElement passwordField;
	
	@FindBy(id="SubmitLogin")
	private WebElement signInBtn;
	
	@FindBy(xpath="//span[text()='kiruthika Pandian']")
	private WebElement assert1;

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	public WebElement getAssert1() {
		return assert1;
	}
	
	public LogInPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
}
