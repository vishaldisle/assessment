package listenersPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilityPAck.Screenshot;

public class ListenersClass extends Screenshot implements ITestListener {
	

		public void onTestStart(ITestResult result) 
		{
			String testName = result.getName();
			System.out.println(testName + "Started");
		}

		public void onTestSuccess(ITestResult result) 
		{
			String testName = result.getName();
			System.out.println(testName + "Passed");
		}

		
		
	public void onTestFailure(ITestResult result) 
	{
		String testName = result.getName();
		System.out.println(testName + "Failed");

		takeScreenShot(testName);
	}



	public void onTestSkipped(ITestResult result) 
	{
		String testName = result.getName();
		System.out.println(testName + "Skipped");
	}
}
