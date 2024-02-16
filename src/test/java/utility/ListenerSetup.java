package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Case Execution Is Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Case Execution Is Completed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Case Execution Is Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Case Execution Is Skipped");
		
	}

}
