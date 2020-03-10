package base;

import org.openqa.selenium.WebDriver;

import utilities.elements.AlertHandler;
import utilities.elements.FindElementUtil;
import utilities.elements.JavascriptHelper;
import utilities.elements.WaitController;
import utilities.elements.WebElementUtil;
import utilities.reportRelated.TestListener;


public class PageBase extends TestListener {


	protected JavascriptHelper jsHelper;
	protected WaitController wait;
	protected FindElementUtil by;
	protected WebElementUtil elementUtils;
	protected AlertHandler alert;
	
	
	
	

	
	public PageBase() {
		
		this.jsHelper = new JavascriptHelper(driver);
		this.wait = new WaitController(driver);
		this.by = new FindElementUtil(driver);
		this.elementUtils = new WebElementUtil(driver);
		this.alert = new AlertHandler(driver);

	}

	/**
	 * Returns the WebDriver object
	 *
	 * @return Driver instance from the parent class
	 */
	protected WebDriver driver() {
		return driver;
	}

}
