package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.NewUserRegistrationSignUp;
import utilities.BrowserUtility;
import utilities.PropertiesFileReader;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Test_NewUserRegistrationSignUp {
	WebDriver driver;
	HomePage homepage;
	LoginPage loginpage;
	NewUserRegistrationSignUp signup;
	String url=PropertiesFileReader.getPropertyFromFile("url");
//	String browser=PropertiesFileReader.getPropertyFromFile("browser");

			
	@Parameters("browser")		
	@BeforeMethod
	public void beforeMethod(@Optional("firefox") String browser) {
		driver=BrowserUtility.initalize(browser, url);
	
		homepage=PageFactory.initElements(driver, HomePage.class);
	
		loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		signup=PageFactory.initElements(driver, NewUserRegistrationSignUp.class);
				
	}

	@Test(priority = 1)
	public void test_NameFieldBlank() {

		homepage.closePopup();
		
		homepage.clickRegistrationOfCopyRightLink();
		
		loginpage.clickNewUserRegistrationLink();
		
		signup.selectTitle("Mr.");

		signup.enterName("");		
		
		signup.enterSurname("Shivsharan");	

		signup.enterAddressLine1("Address Line1");
		
		signup.enterAddressLine2("Address line2");
		
		signup.enterCity("Navi Mumbai");
		
		signup.selectCountry("India");
		
		signup.selectState("MAHARASHTRA");
		
		signup.selectDistrict("Thane");	
		
		signup.enterPinCode("400708");
		
		signup.enterEmailId("sugat123@gmail.com");
		
		signup.enterMobileNo("9819990130");
		
		signup.selectQuestions("How many childrens you have?");
		
		signup.enterAnswer("Zero");
		
		signup.enterUserId("sugat123");
		
		signup.enterPassword("Sugat@123");
		
		signup.enterConfirmPassword("Sugat@123");
		
		signup.enterCaptcha("UJ3DPH");
		
		signup.clickSubmit();
		
		Assert.assertEquals(signup.errorMessage(), "Please enter Name.");
			
	}
	
	
	@Test(priority = 2)
	public void test_addressLine1FieldBlank()
	{
		homepage.closePopup();
		
		homepage.clickRegistrationOfCopyRightLink();
		
		loginpage.clickNewUserRegistrationLink();
		
		signup.selectTitle("Mr.");

		signup.enterName("Sugat");		
		
		signup.enterSurname("Shivsharan");	

		signup.enterAddressLine1("");
		
		signup.enterAddressLine2("Address line2");
		
		signup.enterCity("Navi Mumbai");
		
		signup.selectCountry("India");
		
		signup.selectState("MAHARASHTRA");
		
		signup.selectDistrict("Thane");	
		
		signup.enterPinCode("400708");
		
		signup.enterEmailId("sugat123@gmail.com");
		
		signup.enterMobileNo("9819990130");
		
		signup.selectQuestions("How many childrens you have?");
		
		signup.enterAnswer("Zero");
		
		signup.enterUserId("sugat123");
		
		signup.enterPassword("Sugat@123");
		
		signup.enterConfirmPassword("Sugat@123");
		
		signup.enterCaptcha("UJ3DPH");
		
		signup.clickSubmit();
		
		Assert.assertEquals(signup.errorMessage(), "Please enter Address Line1.");
		
	}

	
	@Test(priority = 3)
	public void test_CityBlank()
	{
		homepage.closePopup();
		
		homepage.clickRegistrationOfCopyRightLink();
		
		loginpage.clickNewUserRegistrationLink();
		
		signup.selectTitle("Mr.");

		signup.enterName("Sugat");		
		
		signup.enterSurname("Shivsharan");	

		signup.enterAddressLine1("Address Line1");
		
		signup.enterAddressLine2("Address line2");
		
		signup.enterCity("");
		
		signup.selectCountry("India");
		
		signup.selectState("MAHARASHTRA");
		
		signup.selectDistrict("Thane");	
		
		signup.enterPinCode("400708");
		
		signup.enterEmailId("sugat123@gmail.com");
		
		signup.enterMobileNo("9819990130");
		
		signup.selectQuestions("How many childrens you have?");
		
		signup.enterAnswer("Zero");
		
		signup.enterUserId("sugat123");
		
		signup.enterPassword("Sugat@123");
		
		signup.enterConfirmPassword("Sugat@123");
		
		signup.enterCaptcha("UJ3DPH");
		
		signup.clickSubmit();
		
		Assert.assertEquals(signup.errorMessage(), "Please enter City.");
		
	}

	@AfterMethod
	public void afterMethod() {
		
		BrowserUtility.closeAll();
	}

}
