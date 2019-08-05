package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='search_query']")
	private WebElement searchBox;

	/*@FindBy(xpath = "//*[@id=\"my-account\"]/div[2]/ul/li[1]")
	private WebElement mouseOver;*/

	
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement searchBtn;
	 
	@FindBy(xpath = "//h1[text()='Printed Summer Dress']")
	private WebElement assert2;

	public WebElement getAssert2() {
		return assert2;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	/*public WebElement getMouseOver() {
		return mouseOver;
	}
*/
	public SearchBoxPage(WebDriver ldriver) {

		this.driver = ldriver;
		// to initialize webelement
		PageFactory.initElements(driver, this);

	}

}
