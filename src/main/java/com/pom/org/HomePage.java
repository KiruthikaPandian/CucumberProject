package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signInLink;

	public WebElement getSignInLink() {
		return signInLink;
	}
	
	public HomePage(WebDriver ldriver) {
		
		this.driver=ldriver;
		//to initialize webelement
		PageFactory.initElements(driver, this);
		
	}
}
