package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Testcase OASSS woohooooo!!");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Testcase FAIL uuuurrrrrggggghhhh!!");
	}
}
