package sample.autamtion.gmail.com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reusableUtils.CommonFunctions;

public class GoogleMailBodyPage {

	private WebDriver driver;
	
	public GoogleMailBodyPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath="//tr[@role='tablist']/td[1]//div[contains(text(),'Primary')]")
	WebElement primaryEmailTabLink;
	
	public void checkGoogleMails () {
		
		CommonFunctions.waitForElement(driver, primaryEmailTabLink);
		primaryEmailTabLink.click();
	}
}
