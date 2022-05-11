package utilities;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	ExtentReports report;
	ExtentTest test;
	
	public ExtentReporter(String reportName)
	{
		report=new ExtentReports();
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\extent-report\\"+reportName+".html");
		reporter.config().setReportName(reportName);
		
		report.attachReporter(reporter);

	}
	
	public void createTest(String testname)
	{
		test=report.createTest(testname);
	}	
	
	public void passTest()
	{
			test.log(Status.PASS, "Test Passed");	
	}
	
	public void failTest()
	{
		
		test.log(Status.FAIL, "Test Failed");		
	}
		
	public void skipTest()
	{
	
		test.log(Status.SKIP, "Test Skipped");
	}
	
	public void publishReport()
	{
		report.flush();
	}


}
