package tests;

import org.testng.annotations.Test;

import utilities.ExtentReporter;
import utilities.RetryAnalyzer;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Test_Sample {
	ExtentReporter obj;
 @BeforeClass
 public void beforeClass()
 {
	obj=new ExtentReporter("Test_Sample"); 
 }
	
  @Test
  public void test1() {
	obj.createTest("Test 1");
	  
	 Assert.assertEquals(false, true); 
	 
	 System.out.println("Completed");
	 
  }
  
  @Test
  public void test2() {
	obj.createTest("Test 2");
		
	 Assert.assertEquals(true, true); 
	 
  }

  
  @AfterClass
  public void afterClass()
  {
	  obj.publishReport();
  }
}
