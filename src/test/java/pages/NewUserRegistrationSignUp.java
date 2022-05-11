package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.Log;

public class NewUserRegistrationSignUp {
	WebDriver driver;
	
	public NewUserRegistrationSignUp(WebDriver driver) {
	
			this.driver=driver;
	}

	//General Details
	
	@FindBy(xpath="//td[text()='General Details:']")
	WebElement sectionOneName;
	
	
	@FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolder1_ddlTitle']")
	WebElement title;
	
	@FindBy(name ="ctl00$ContentPlaceHolder1$txtFName")
	WebElement name;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtLName")
	WebElement surname;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress")
	WebElement addressLine1;

	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress2")
	WebElement addressLine2;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtCity")
	WebElement city;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlCountry")
	WebElement country;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlState")
	WebElement state;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlDistrict")
	WebElement district;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtNationality")
	WebElement nationality;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPinCode")
	WebElement pincode;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtEmail")
	WebElement email;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPhoneNumber")
	WebElement phoneNo;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtMobileNum")
	WebElement mobileNo;

	//Choose question and answer
	@FindBy(xpath="//td[text()='Choose your Question and Answer:']")
	WebElement sectionTwoName;
	
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlQuestions")
	WebElement questions;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAnswer")
	WebElement answer;

	@FindBy(name="ctl00_ContentPlaceHolder1_rdoGeneral")
	WebElement generalUser;
	
	@FindBy(name="ctl00_ContentPlaceHolder1_rdoSociety")
	WebElement societyUser;
	
	//Choose userid and password
	@FindBy(xpath="//td[text()='Choose your User Type:']")
	WebElement sectionThreeName;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtUserId")
	WebElement userId;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPassword")
	WebElement password;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtConfirmPwd")
	WebElement confirmPassword;
	

	@FindBy(name="ctl00$ContentPlaceHolder1$CaptchaControl1")
	WebElement captcha;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$btnSubmit")
	WebElement submit;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$btnReset")
	WebElement reset;

	@FindBy(id="ctl00_ContentPlaceHolder1_lblerrorMsg")
	WebElement errMsg;
	
	
	public void selectTitle(String title)
	{
		new Select(this.title).selectByVisibleText(title);
		
		Log.info("Select title");
	}
	
	public void enterName(String name)
	{
		this.name.sendKeys(name);
		
		Log.info("Enter Name");
	}
	
	public void enterSurname(String surname)
	{
		this.surname.sendKeys(surname);
		
		Log.info("Enter Surname");
	}
	
	public void enterAddressLine1(String addressLine1)
	{
		this.addressLine1.sendKeys(addressLine1);
		
		Log.info("Enter Address Line 1");
	}
	
	public void enterAddressLine2(String addressLine2)
	{
		this.addressLine2.sendKeys(addressLine2);
		
		Log.info("Enter Address Line 2");
	}
	
	public void enterCity(String city)
	{
		this.city.sendKeys(city);
		
		Log.info("Enter City");
	}
	
	public void selectCountry(String country)
	{
		new Select(this.country).selectByVisibleText(country);
		
		Log.info("Select Country");
	}
	
	public void selectState(String state)
	{
		new Select(this.state).selectByVisibleText(state);
		
		Log.info("Select State");
	}
	
	public void selectDistrict(String district)
	{
		int attempt=3;
		
		while(attempt<3)
		{
			try
			{
				new Select(this.district).selectByVisibleText(district);	
			}
			catch(StaleElementReferenceException e)
			{
				
			}
			attempt++;
		}
		
		
		Log.info("Select District");
	}
	
	public void enterPinCode(String pincode)
	{
		this.pincode.sendKeys(pincode);
		
		Log.info("Enter Pincode");
	}

	public void enterEmailId(String emailId)
	{
		this.email.sendKeys(emailId);
		
		Log.info("Enter Email Id");
	}
	
	public void enterMobileNo(String mobileNo)
	{
		this.mobileNo.sendKeys(mobileNo);
		
		Log.info("Enter Mobile Number");
	}
	
	public void selectQuestions(String question)
	{
		this.questions.sendKeys(question);
		
		Log.info("Select question");
	}
	
	public void enterAnswer(String answer)
	{
		this.answer.sendKeys(answer);
		
		Log.info("Enter Answer");
	}
	
	public void selectUserType(String userType)
	{
		if(userType.equalsIgnoreCase("General User"))
		{
			this.generalUser.click();
			Log.info("Select General User");
		}
		
		
		if(userType.equalsIgnoreCase("Society User"))
		{
			this.societyUser.click();
			Log.info("Select Society User");
		}
				
	}
	
	
	public void enterUserId(String userId)
	{
		this.userId.sendKeys(userId);
		
		Log.info("Enter User Id");
	}
	
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
		
		Log.info("Enter Password");
	}
	
	public void enterConfirmPassword(String confirmPassword)
	{
		this.confirmPassword.sendKeys(confirmPassword);
		
		Log.info("Enter Confirm Password");
	}
	
	public void enterCaptcha(String captcha)
	{
		this.captcha.sendKeys(captcha);
		Log.info("Enter Captcha");
	}
	
	public void clickSubmit()
	{
		this.submit.click();
		Log.info("Click on Submit Button");
	}
	
	public void clickReset()
	{
		this.reset.click();
		
		Log.info("Click on Reset Button");
	}
	
	public String errorMessage()
	{
		Log.info("System displays error message");
		return this.errMsg.getText();
	}
	

	
}
