package TestNgLearn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignUpTest {
	@Parameters("email")
	@Test
	public void SigninViaEmail(String email) {
		System.out.println("Signin via Email.");
		System.out.println(email);	
	}
	@Parameters("email")
	@Test
	public void SigninViaGoogle(String email) {
		System.out.println("Signin via Google.");
		System.out.println(email);	
	}

}
