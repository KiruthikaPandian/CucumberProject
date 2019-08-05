package com.mavencucumber.stepdef;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.basecls.org.BaseClss;
import com.pom.org.DressPage;
import com.pom.org.HomePage;
import com.pom.org.LogInPage;
import com.pom.org.PaymentPage;
import com.pom.org.SearchBoxPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AuPracStepDefinition extends BaseClss{
	
	public static WebDriver driver;

	
	@Given("^User Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		driver=getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
	}
	
	@When("^User Click on Signin button in the header$")
	
	public void user_Click_on_Signin_button_in_the_header() throws Throwable {
		
		HomePage hp=new HomePage(driver);
		clickonWebelement(hp.getSignInLink());
		
	}

	@When("^User enter emailId in SignIn page$")
	public void user_enter_emailId_in_SignIn_page() throws Throwable {
		
		LogInPage lp=new LogInPage(driver);
		inputValuestoWebelement(lp.getEmailField(),"kirthi@gmail.com");
		
	}

	@When("^User enter Password in SignIn page$")
	public void user_enter_Password_in_SignIn_page() throws Throwable {
		
		LogInPage lp=new LogInPage(driver);
		inputValuestoWebelement(lp.getPasswordField(),"abmchsk");
	}

	@When("^User click SignIn button in SigIn page$")
	public void user_click_SignIn_button_in_SigIn_page() throws Throwable {
		
		LogInPage lp=new LogInPage(driver);
		clickonWebelement(lp.getSignInBtn());
	    
	}

	@Then("^User verify the username displayed in the header$")
	
	
	public void user_verify_the_username_displayed_in_the_header() throws Throwable {
	    
		LogInPage lp=new LogInPage(driver);
		String str = getTextinWebelement(lp.getAssert1());
		String actual= "kiruthika Pandian";
		Assert.assertEquals(str, actual);
		System.out.println("Test Passed");
		
		}


	@When("^User enters the product in the Search Box$")
	public void user_enters_the_product_in_the_Search_Box() throws Throwable {
		
		SearchBoxPage sp=new SearchBoxPage(driver);
		inputValuestoWebelement(sp.getSearchBox(),"dress");
	    
	}

	@When("^User click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
		SearchBoxPage sp=new SearchBoxPage(driver);
		clickonWebelement(sp.getSearchBtn());
	}
	
	/*@When("^User select the product displayed in the Search Box$")
	public void user_select_the_product_displayed_in_the_Search_Box() throws Throwable {
		
		SearchBoxPage sp=new SearchBoxPage(driver);
		mouseHoverToElement(sp.getMouseOver());
		
	    
	}*/

	/*@When("^User click on the selected product$")
	public void user_click_on_the_selected_product() throws Throwable {
	    
		SearchBoxPage sp=new SearchBoxPage(driver);
		clickonWebelement(sp.
	}*/

	@Then("^User verify the product displayed in the given page$")
	
	public void user_verify_the_product_displayed_in_the_given_page() throws Throwable {
	    
		SearchBoxPage sp=new SearchBoxPage(driver);
		String str2 = getTextinWebelement(sp.getAssert2());
		String expected="Printed Summer Dress";
		Assert.assertEquals(expected,str2);
		System.out.println("Test Passed");
		}

	@When("^User select the desired dress$")
	public void user_select_the_desired_dress() throws Throwable {
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getGotoDress());
	}

	@When("^User customise the product with more option$")
	public void user_customise_the_product_with_more_option() throws Throwable {
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getMoreBtn());
	   
	}



	@When("^User changes the quantity of the product$")
	public void user_changes_the_quantity_of_the_product() throws Throwable {
		
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getQuantityInc());
	    
	    }


	/*@When("^User changes the size of the product$")
	public void user_changes_the_size_of_the_product() throws Throwable {
	    
		DressPage dp=new DressPage(driver);
		elementisDisplayed(dp.getSizeBox());
		selectDropDownOption(dp.getSizeBox(),"visibletext","S");
		
		}*/

	@When("^User changes the color of the product$")
	public void user_changes_the_color_of_the_product() throws Throwable {
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getColor());
	    
	}

	@When("^user placed the order$")
	public void user_placed_the_order() throws Throwable {
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getCart());
	    
	}

	@Then("^User verify the order has been placed$")
	
	@Test
	public void user_verify_the_order_has_been_placed() throws Throwable {
	    
		DressPage dp=new DressPage(driver);
		String str3 = getTextinWebelement(dp.getAssert3());
		String actual="Printed Summer Dress";
		Assert.assertEquals(str3, actual);
		System.out.println("Test Passed");
		}

	@When("^User click to proceed the order$")
	public void user_click_to_proceed_the_order() throws Throwable {
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getCheckOut1());
	    
	}

	@When("^User click proceed to checkout in summary page$")
	public void user_click_proceed_to_checkout_in_summary_page() throws Throwable {
	    
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getCheckOut2());
	}

	@When("^User enter the comments for the order$")
	public void user_enter_the_comments_for_the_order() throws Throwable {
	    
		DressPage dp=new DressPage(driver);
		inputValuestoWebelement(dp.getComment(),"Beautiful Orange Dress");
		
	}

	@When("^User click on proceed to checkout for shipping$")
	public void user_click_on_proceed_to_checkout_for_shipping() throws Throwable {
		DressPage dp=new DressPage(driver);
		clickonWebelement(dp.getCheckOut3());
	    
	}

	@When("^User agrees to the terms and condition given$")
	public void user_agrees_to_the_terms_and_condition_given() throws Throwable {
		
		PaymentPage pp=new PaymentPage(driver);
		clickonWebelement(pp.getTermBox());
	    
	}

	@When("^User proceed to payment option$")
	public void user_proceed_to_payment_option() throws Throwable {
		PaymentPage pp=new PaymentPage(driver);
		clickonWebelement(pp.getCheckOut4());
	    
	}

	@When("^User select the pay by check option for payment$")
	public void user_select_the_pay_by_check_option_for_payment() throws Throwable {
	    
		PaymentPage pp=new PaymentPage(driver);
		clickonWebelement(pp.getPayment());
	    
	}

	@When("^User click to confirm the order$")
	public void user_click_to_confirm_the_order() throws Throwable {
	    
		PaymentPage pp=new PaymentPage(driver);
		clickonWebelement(pp.getConfirmOrder());
	    
	}

	@Then("^User verify the order has been completed$")
	
	public void user_verify_the_order_has_been_completed() throws Throwable {
	    
		PaymentPage pp=new PaymentPage(driver);
		String str4 = getTextinWebelement(pp.getAssert4());
		String actual="Your order on My Store is complete.";
		Assert.assertEquals(str4, actual);
		System.out.println("Test Passed");
		
	    
	}

	@When("^User click on signout option after completing the order$")
	public void user_click_on_signout_option_after_completing_the_order() throws Throwable {
		PaymentPage pp=new PaymentPage(driver);
		clickonWebelement(pp.getLogOut());
	    
	}

	@Then("^User verify the logout session$")
	
	public void user_verify_the_logout_session() throws Throwable {
		PaymentPage pp=new PaymentPage(driver);
		
	    
	}


	
}

