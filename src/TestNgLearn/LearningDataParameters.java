package TestNgLearn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataParameters {
	
	//@Test(dataProvider="testData1")
	@Test(dataProviderClass=TestDataFile.class, dataProvider="data2")
	public void registerUser(String firstname, String lastname, String email, String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
	}
	
	
	@Test(dataProviderClass=TestDataFile.class, dataProvider="data3")
	public void loginUser (String email, String password) {
		System.out.println(email);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] testData1(){
		Object[][] oobject = new Object[2][4];
		
		oobject[0][0]="Rabit";
		oobject[0][1]="Reebee";
		oobject[0][2]="testing@email.com";
		oobject[0][3]="password123";
		
		oobject[1][0]="Jason";
		oobject[1][1]="Bourne";
		oobject[1][2]="Spying@email.com";
		oobject[1][3]="pWssword123";
		return oobject;
				
	}
	
	
}
