package CMDS_SIT_Testcases;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cmds.base.BasePage;
import com.cmds.base.BaseTest;

import ManageUserDetailsPO.ManageUserDetailsPO;
import utils.ExcelDataProvider;

public class cmdsAddUser extends BaseTest {

	ManageUserDetailsPO manageUser;
	BasePage basePage;

	@BeforeMethod
	public void setupMethod() {
		basePage = new BasePage(getDriver());
		manageUser = new ManageUserDetailsPO(getDriver());
	}

	ExcelDataProvider testData;

	@DataProvider(name = "users")
	public Object[][] getUsers() throws IOException {
		testData = new ExcelDataProvider();
		Object data[][] = testData.getTestData("td_users", "Sheet1");
		return data;
	}

	@Test(priority = 1, dataProvider = "users", description = "Add User Test")
	public void abc(String username, String password, String fullName) throws InterruptedException {

		HashMap<String, String> details = new HashMap<String, String>();

		details.put("givenName", "Ben");
		details.put("familyName", "Stokes");
		details.put("nickName", "Bamy");
		details.put("email", "ben.stokes@email.com");
		details.put("phoneNumber", "456633214");

		basePage.cmdsLogin(username, password);
		manageUser.addUser(details);
		System.out.println("----------------Test Success------------------------");

	}

}
