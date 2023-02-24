package TestNgLearn;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TestDataFile {
	
	@DataProvider(name="data2")
	public Object[][] testData2(){
		Object[][] oobject = new Object[2][4];
		
		oobject[0][0]="Rabit2";
		oobject[0][1]="Reebee";
		oobject[0][2]="testing@email.com";
		oobject[0][3]="password123";
		
		oobject[1][0]="Jason2";
		oobject[1][1]="Bourne";
		oobject[1][2]="Spying@email.com";
		oobject[1][3]="pWssword123";
		return oobject;
				
	}

	
	@DataProvider(name="data3")
	public Object[][] testData3(){
		Object[][] oobject = new Object[3][2];
		
		oobject[0][0]="zxcvbn@gemail.com";
		oobject[0][1]="11111111111";
		
		oobject[1][0]="wertt2@gmmail.com";
		oobject[1][1]="222222222222";
		
		oobject[2][0]="youwver2@gmmail.com";
		oobject[2][1]="434546722222";
		return oobject;
				
	}
	
	@DataProvider(name="data_dropdown_contents")
	public String[] data_dropdown_contents(Method m){
		
		String[] dropdownContents =new String[3];
		dropdownContents[0]="Please select an option";
		dropdownContents[1]="Option 1";
		dropdownContents[2]="Option 2";
		return dropdownContents;
				
	}
	
}
