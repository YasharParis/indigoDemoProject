package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import utilities.reportRelated.Log4jManager;

public class HP_HeaderContentInfo extends PageBase {
	
	
	/*-----------url section----------------*/
	private String url = "https://www.chapters.indigo.ca/en-ca/";
	
	
	/* ============= elements ================= */
	

	//	Primary Section
	
	@FindBy(xpath = "//a[@class='indigo-logo']")
	@CacheLookup
	private WebElement headerLogo;
	
	
	
	@FindBy(xpath = "//button[@class='browse-signin-down service-link__link']")
	@CacheLookup
	private WebElement signInMain_btn;
	
	@FindBy(xpath = "//input[@data-a8n='lightbox__email-input']")
	@CacheLookup
	private WebElement emailAddress_input;
	
	@FindBy(xpath = "//input[@data-a8n='lightbox__password-input']")
	@CacheLookup
	private WebElement password_input;
	
	@FindBy(xpath = "//button[@data-a8n='lightbox__sign-in-button']")
	@CacheLookup
	private WebElement signInPrimary_btn;
	
	@FindBy(xpath = "//span[@data-a8n='service-link__display-greeting']")
	@CacheLookup
	private WebElement greetingDisplay;
	
	
	
	
	
	@FindBy(xpath = "//label[@title='Go to submenu']")
	@CacheLookup
	private WebElement accountDropdown;
	
	@FindBy(xpath = "//button[@title='sign in']")
	@CacheLookup
	private WebElement signIn_btn2;
	
	
	@FindBy(xpath = "//a[@title='Click to Go to Rewards']")
	@CacheLookup
	private WebElement rewardsCenter_link;
	
	@FindBy(xpath = "//span[text()='rewards']")
	@CacheLookup
	private WebElement rewards_text;
	
	 
	//----------------------------------------------------
	
	
	
	
	
	
	
	

	
	/* ============= constructor ================= */
	
	public HP_HeaderContentInfo() {
		// super(driver);
		PageFactory.initElements(driver, this);
		driver.get(url);
		Log4jManager.info("we get the web");

	}
	
	/* ============= functions and assertions ================= */
	
	
	public HP_HeaderContentInfo signIn(String emailAddress,String password) {
		logger.info("Enter Email and Password");
		
		signInMain_btn.click();
		wait.waitTillVisible(emailAddress_input);
		emailAddress_input.clear();
		emailAddress_input.sendKeys(emailAddress);
		password_input.clear();
		password_input.sendKeys(password);
		signInPrimary_btn.click();
		wait.customWait(2);
		
		Log4jManager.info("Filled in Sign in section inofrmation from input ");
		return this;

	}
	
	public HP_HeaderContentInfo signInAssert() {
	
		logger.info("waiting for assertion");
		wait.waitTillVisible(greetingDisplay);
		assertTrue(greetingDisplay.isDisplayed());
		wait.customWait(3);
		return this;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
/* ============= End ================= */

