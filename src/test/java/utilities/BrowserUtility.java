package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserUtility {
	
	static WebDriver driver;
	
	
	public static WebDriver initalize(String browser, String url)
	{		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sugat\\eclipse-workspace\\TestNG_CopyRight\\driver\\chromedriver.exe");		
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-geolocation");
			options.setAcceptInsecureCerts(true);
			
			driver=new ChromeDriver(options);	
						
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{	
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sugat\\eclipse-workspace\\TestNG_CopyRight\\driver\\geckodriver.exe");
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-geolocation");
			options.setAcceptInsecureCerts(true);
			
			driver=new FirefoxDriver(options);
	
			driver.manage().window().maximize();
		}
		
		driver.get(url);
		Log.info("Open Application");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		return driver;
		
	}
	
	public static void closeAll()
	{
		driver.quit();
		Log.info("Close Application");
		Log.info("--------------------------------------------");
	}


}
