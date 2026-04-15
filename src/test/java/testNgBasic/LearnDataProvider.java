package testNgBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	@DataProvider(name="login")
	public String[][] getData() {
		String[][] data = new String[2][2];
		data[0][0] ="subash11rko@gmail.com";
		data[0][1] = "Pass123";
		data[1][0] = "subash1271@gmail.com";
		data[1][1] ="Pass123";	
		return data ;
	}
	@Test(dataProvider = "login")
	public void login(String email,String pass) {
		
		/*
		 * steps 
		 */
	}

}
