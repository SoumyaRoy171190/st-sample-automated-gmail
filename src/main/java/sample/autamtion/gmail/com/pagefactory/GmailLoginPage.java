package sample.autamtion.gmail.com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import reusableUtils.CommonFunctions;
import reusableUtils.Constants;

public class GmailLoginPage {

	private WebDriver driver;

	public GmailLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[@class='gb_P'][contains(text(),'Gmail')]")
	WebElement gmailHomeLink;
	
	@FindBy(id="identifierId")
	WebElement userNameTextBoxField;
	
	@FindBy(id="identifierNext")
	WebElement userNameNextBtn;
	
	@FindBy(name="password")
	WebElement passwordTextField;
	
	@FindBy(id="passwordNext")
	WebElement passwordNextBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@role='button']//span[contains(text(),'Done')]")
	WebElement recoveryOprtionDoneBtn;
	
	public void loginGmail () {
		
		gmailHomeLink.click();
		CommonFunctions.waitForElement(driver, userNameTextBoxField);
		userNameTextBoxField.sendKeys(Constants.Google_Mail_ID);
		userNameNextBtn.click();
		CommonFunctions.waitForElement(driver, passwordTextField);
		passwordTextField.sendKeys(Constants.Google_Mail_Password);
		passwordNextBtn.click();
		/*CommonFunctions.waitForElement(driver, recoveryOprtionDoneBtn);
		recoveryOprtionDoneBtn.click();*/
	/*	if (recoveryOprtionDoneBtn.isDisplayed()) {
			recoveryOprtionDoneBtn.click();
		}*/
	}
}
