package sampleautomation.gmail.com.samplescenariotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import reusableUtils.Constants;
import sample.autamtion.gmail.com.pagefactory.GmailLoginPage;

public class GoogleMailLogin {
	
	public WebDriver driver;
	
	@Test
	public void openGoogleHomePage() {
		driver = new FirefoxDriver();
		driver.get(Constants.Google_Home_URL);
	}
	
	@Test(dependsOnMethods = {"openGoogleHomePage"})
	public void loginGoogleMail() {
		
		GmailLoginPage login_Gmail = PageFactory.initElements(driver, GmailLoginPage.class);
		login_Gmail.loginGmail();
	}
}
