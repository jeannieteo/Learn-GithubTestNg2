package TestNgLearn;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void LoginViaEmail() {
		System.out.println("Login via Email.");
		throw new SkipException("Skip.");
		//try {
		//Assert.assertEquals("TTrue", "True"); //Fail if not equal
		//Assert.assertTrue(false); //Fail if False
		//} catch(Throwable t)
		//{
		//	System.out.println(t);
		//}
	}
	@Test
	public void LoginViaGoogle() {
		System.out.println("Login via Google.");
		throw new SkipException("Google functionality not supported.");
	}
	@Test(priority=1)
	public void Login() {
		System.out.println("Login.");

	}
	@Test(priority=3)
	public void Logout() {
		System.out.println("Logout.");

	}
	@Test(priority=2,dependsOnMethods={"Login"})
	public void Navigate() {
		System.out.println("Navigate.");

	}
}
