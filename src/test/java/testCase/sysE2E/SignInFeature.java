package testCase.sysE2E;

import java.util.ArrayList;
import java.util.Map;

import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.HP_HeaderContentInfo;


public class SignInFeature extends TestBase {
	
	@Test
	public void signIn_CorretInfo() {
		
		logger = extent.createTest("Indigo_TestCase001");
		
		//---------------- test data: -------------------

		ArrayList<Map<String, String>> keyValueContents = xlread.parse(1);
		ArrayList<Map<String, String>> testData = xlread.getdata(keyValueContents, "TestCaseID", "TestCase_001");
		String firstName = testData.get(0).get("FirstName");
		String lastName = testData.get(0).get("LastName");
		String email = testData.get(0).get("email or phone");
		String password = testData.get(0).get("Password");
		
		
	
				
		// test execution/ test steps

		HP_HeaderContentInfo h1 = new HP_HeaderContentInfo();
		h1.signIn(email, password).signInAssert();

	}
	

}
