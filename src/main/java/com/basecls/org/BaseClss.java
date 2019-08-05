package com.basecls.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClss {

		
	public static WebDriver driver;
		
		public static WebDriver getBrowser(String browserName) throws Exception {
			
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resource\\com\\cucumber\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
				}else if(browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.geckodriver.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");//copy firefox driver and then copy
					driver =new FirefoxDriver();
					}
				else if(browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
					driver =new InternetExplorerDriver();
				}else {
					throw new Exception("Browser Name is invalid");
					}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
		
		public static String getTextinWebelement(WebElement element) {

			try {
				String text = element.getText();
				return text;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
				
			}
			
		}
		
		public static boolean elementisDisplayed(WebElement element) {
			
			try {
				boolean displayed = element.isDisplayed();
				return displayed;
			} catch (Exception e) {
				
				e.printStackTrace();
				throw new RuntimeException();
			} 
	}
		
	public static boolean elementisEnabled(WebElement element) {
			
			try {
				boolean enabled = element.isEnabled();
				return enabled;
			} catch (Exception e) {
				
				e.printStackTrace();
				throw new RuntimeException();
			} 
		}
	public static void waitforElementVisibility(WebElement element) {
		
		try {
			WebDriverWait wb = new WebDriverWait(driver,60);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	public static void inputValuestoWebelement(WebElement element,String value) {
		
		try {
			waitforElementVisibility(element);
			if(elementisDisplayed(element)&&elementisEnabled(element)) {
				element.sendKeys(value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		}

	public static void clickonWebelement(WebElement element) {

		try {
			waitforElementVisibility(element);
			if(elementisDisplayed(element)){
				element.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
			
		}
	public static void selectDropDownOption(WebElement element,String option,String value) {

		try {
			waitforElementVisibility(element);
			Select s=new Select(element);//since we are selecting one particular xpath
			
			if(option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			}else if(option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			}else if(option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
			}
		}
	public static void takeScreenShot(String fileName) throws IOException {

		try {
			File des= new File(System.getProperty("user.dir")+"\\ScreenShot\\"+ fileName +".png");
			TakesScreenshot ts= (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, des);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

	public static void mouseHoverToElement(WebElement element) {

		try {
			waitforElementVisibility(element);
			Actions ac=new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

	public static void scrollUsingElement(WebElement element,String option,String value) {

		try {
			JavascriptExecutor js= (JavascriptExecutor) driver;
			if(option.equalsIgnoreCase("down")) {
				js.executeScript("argument[0].scrollIntoView(false)",element);
				}else if(option.equalsIgnoreCase("up")) {
					js.executeScript("argument[0].scrollIntoView(true)",element);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void scrollUsingCoOrdinates(String width, int height) {

		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + width + ",", + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void scrollToBottomOfThePage() {

		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
	}

	public static void scrollToTopOfThePage() {

		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		}
	public static void DragAndDrop(WebElement sourceElement, WebElement placedElement) {

		try {
			Actions ac= new Actions(driver);
			ac.dragAndDrop(sourceElement,placedElement).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void getUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
			
		}

	}
	
	
	public static void simpleAlert(WebElement element) {

		try {
			waitforElementVisibility(element);
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	public static void confirmAlert(WebElement element,String userChoice) {
		
		try {
			waitforElementVisibility(element);
			Alert confirmAlert = driver.switchTo().alert();
			if(userChoice.equalsIgnoreCase("ok"))
			{
				confirmAlert.accept();
				driver.switchTo().defaultContent();
			}else if(userChoice.equalsIgnoreCase("cancel"))
			{
				confirmAlert.dismiss();
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	public static void promptAlert(WebElement element,String condition,String value ) {
		
		try {
			waitforElementVisibility(element);
			Alert promptAlert = driver.switchTo().alert();
			if(condition.equalsIgnoreCase("accept")) {
				promptAlert.sendKeys(value);
				promptAlert.accept();
				driver.switchTo().defaultContent();
			}else if(condition.equalsIgnoreCase("dismiss")) {
				
				promptAlert.dismiss();
				promptAlert.sendKeys(value);
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	public static void rightClick(WebElement element) {
		
		try {
			waitforElementVisibility(element);
			Actions ac= new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
	}

	public static void doubleClick(WebElement element) {
		
		try {
			waitforElementVisibility(element);
			Actions ac= new Actions(driver);
			ac.doubleClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

// to highlight the element which used in assert code
	
	public static void highlightOnElement(WebElement element) {
		try {
			waitforElementVisibility(element);
			JavascriptExecutor je=(JavascriptExecutor) driver;
			je.executeScript ("argument[0].setAttribute('style','background:yellow; border:2px solid red;');",element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
		
	}
	
}







