package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
public WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox'] ")
	private WebElement termBox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement checkOut4;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement payment;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmOrder;
	
	@FindBy(xpath="//p[text()='Your order on My Store is complete.']")
	private WebElement assert4 ;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logOut;
	
	
	
	public WebElement getTermBox() {
		return termBox;
	}

	

	public WebElement getAssert4() {
		return assert4;
	}

	public WebElement getCheckOut4() {
		return checkOut4;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	public PaymentPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		//to initialize webelement
		PageFactory.initElements(driver, this);
		
	}
	
}
