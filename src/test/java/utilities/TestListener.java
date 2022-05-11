package utilities;

import java.time.LocalDateTime;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	ExtentReporter reporter;

	private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
	
	public void onStart(ITestContext context) {
		Log.info("***************************");
		Log.info("Tests for "+context.getName() +" are starting at " + LocalDateTime.now());
		Log.info("***************************");
		
		reporter=new ExtentReporter(context.getName());
	}

	
	public void onTestStart(ITestResult result) {
		Log.info(getTestMethodName(result)+" test Started");
		
		reporter.createTest(getTestMethodName(result));
		
	}

	public void onTestSuccess(ITestResult result) {
		Log.info("Test Passed");

		reporter.passTest();
	}

	public void onTestFailure(ITestResult result) {
		Log.error("Test Failed");
		
		reporter.failTest();
		
	}

	public void onTestSkipped(ITestResult result) {

		Log.warn("Test Skipped");
		
		reporter.skipTest();
		

	}

	public void onTestFailedWithTimeout(ITestResult result) {

		Log.error("Test Failed with Timeout");
		
		reporter.failTest();
	}


	public void onFinish(ITestContext context) {
		Log.info("***************************");
		Log.info("Tests "+context.getName() +" are ending at "+ LocalDateTime.now());
		Log.info("***************************");
		
		reporter.publishReport();
	}

}
