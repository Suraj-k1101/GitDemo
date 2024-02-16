package dataProvider;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Execution is Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Execution is Completed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Execution Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Execution is Skipped");
		
	}

}
