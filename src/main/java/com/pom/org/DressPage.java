package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {

	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[1]")
	private WebElement gotoDress;
	
	@FindBy(xpath="(//span[text()='More'])[1]")
	private WebElement moreBtn;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement quantityInc;
	
	/*@FindBy(xpath="//select[@id='group_1']")
	private WebElement sizeBox;*/
	
	@FindBy(xpath="//a[@title='Orange']")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="//span[text()='Printed Summer Dress']")
	private WebElement assert3;

	@FindBy(xpath="(//a[@title='Proceed to checkout'])[1]")
	private WebElement checkOut1;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkOut2;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement comment;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement checkOut3;
	
	public WebElement getComment() {
		return comment;
	}
	
	public WebElement getAssert3() {
		return assert3;
	}
	
	public WebElement getCheckOut2() {
		return checkOut2;
	}

	public WebElement getCheckOut1() {
		return checkOut1;
	}

	public WebElement getCheckOut3() {
		return checkOut3;
	}

	public WebElement getQuantityInc() {
		return quantityInc;
	}
	
	public WebElement getMoreBtn() {
		return moreBtn;
	}
	
	public WebElement getGotoDress() {
		return gotoDress;
	}

	/*public WebElement getSizeBox() {
		return sizeBox;
	}*/

	public WebElement getColor() {
		return color;
	}

	public WebElement getCart() {
		return cart;
	}
	
	public DressPage(WebDriver ldriver) {
		
		this.driver=ldriver;
		//to initialize webelement
		PageFactory.initElements(driver, this);
		
	}
	
	
}
