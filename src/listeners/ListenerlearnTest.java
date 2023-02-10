package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerlearnTest {

	
	@Test
	public void TestwithSignup() {
		System.out.println("Test 1 listener.");
		
	}
	
	
	@Test
	public void TestwithSignup2() {
		System.out.println("Test 2 listener.");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void TestwithSignup3() {
		System.out.println("Test 3 listener.");
		Assert.assertEquals(true, false);
	}
}
