package TestNgLearn;

import org.testng.annotations.Test;

public class Grouptests {
	
	@Test(groups={"regression"})
	public void feature1() {
		System.out.println("FEATURE 1 R");
	}
	
	@Test(groups={"functionality"})
	public void feature2() {
		System.out.println("FEATURE 2 F");
	}
	@Test(groups={"functionality", "regression"})
	public void feature3() {
		System.out.println("FEATURE 3 F R");
	}
	@Test
	public void feature4() {
		System.out.println("FEATURE 4");
	}

}
