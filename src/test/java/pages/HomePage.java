package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Log;

public class HomePage {
	WebDriver driver;
	
	WebDriverWait wait;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));

	}

	@FindBy(xpath="//a[@title='Close']")
	WebElement closePopUpButton;
	
	@FindBy(id="ctl00_lnkE_Filling")
	WebElement regCopyrightXIVLink;
	
	public void closePopup()
	{
		wait.until(ExpectedConditions.elementToBeClickable(closePopUpButton));
		this.closePopUpButton.click();
		Log.info("Close pop up button");
	}
	
	public void clickRegistrationOfCopyRightLink()
	{
		try {	Thread.sleep(2000);} catch (InterruptedException e) {}
		this.regCopyrightXIVLink.click();
		
		Log.info("Click on Registration of copyright Form XIV");
	}
	

}
