package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import utilities.Log;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="ctl00_txtLoginID")
	WebElement userId;
	
	@FindBy(id="ctl00_txtPassword")
	WebElement password;
	
	@FindBy(id="ctl00$CaptchaControl1")
	WebElement captcha;
	
	@FindBys(
			{@FindBy(id="ctl00_btnSubmit"),@FindBy(name="ctl00$btnSubmit")}
	)
	WebElement submit;
	
	@FindBy(id="ctl00_btnReset")
	WebElement reset;
	
	
	@FindBy(id="ctl00_lnkNewUserRegistration")
	WebElement newUserRegLink;

	@FindBy(id="ctl00_lnk")
	WebElement forgotPasswordLink;
	
	
	public void clickNewUserRegistrationLink()
	{
		newUserRegLink.click();
		
		Log.info("Click on new user registration link");
	}
	
}
