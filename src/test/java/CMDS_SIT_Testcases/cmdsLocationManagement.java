package CMDS_SIT_Testcases;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cmds.base.BasePage;
import com.cmds.base.BaseTest;

import ManageUserDetailsPO.LocationManagementPO;
import utils.ExcelDataProvider;

public class cmdsLocationManagement extends BaseTest {
	BasePage basePage;
	LocationManagementPO manageLocation;

	@BeforeMethod
	public void setupMethod() {
		basePage = new BasePage(getDriver());
		manageLocation = new LocationManagementPO(getDriver());
	}

	ExcelDataProvider testData;

	@DataProvider(name = "users")
	public Object[][] getUsers() throws IOException {
		testData = new ExcelDataProvider();
		Object data[][] = testData.getTestData("td_users", "Sheet1");
		return data;
	}

	@Test(priority = 1, dataProvider = "users", description = "Login Test")
	public void abc(String username, String password, String fullName) throws InterruptedException {

		HashMap<String, String> details = new HashMap<String, String>();

		details.put("externalLocationUuid", "e14d0751-da5b-4218-bf7a-d9a44cbed86e");
		details.put("testCentreNumber", "TPJ10");
		details.put("locationName", "TPJ Test Centre");
		details.put("timeZoneName", "Asia/Calcutta");
		details.put("websiteUrl", "www.google.com");
		details.put("postalAddress1", "hfdthht");
		details.put("postalAddress2", "fghjt");
		details.put("postalAddress3", "gfhrethyfghertd");
		details.put("postalAddress4", "fdruhfyueu");
		details.put("postalCity", "treyhg");
		details.put("postalPostalCode", "15145415");
		details.put("postalEmail", "hjddgfhg@mail.com");
		details.put("postalPrimaryPhone", "52415415215");
		details.put("postalSecondaryPhone", "4498741565");
		details.put("physicalAddress1", "jhdesijhnwuijhnuiew");
		details.put("physicalAddress2", "gsdxygey");
		details.put("physicalAddress3", "oioiwqiuieewq");
		details.put("physicalAddress4", "njfhedrfuhuu");
		details.put("physicalCity", "juidjuihjueiuhw");
		details.put("physicalPostalCode", "7897654656");
		details.put("physicalEmail", "qrerqrwrg@mail.com");
		details.put("physicalPrimaryPhone", "789456123121654");
		details.put("physicalSecondaryPhone", "789546213546879");

		basePage.cmdsLogin(username, password);

//		manageLocation.addLocation(details);
		Assert.assertEquals(manageLocation.addLocation(details), "Add Location");
//		Assert.assertEquals(manageLocation.addLocationDropdown(), "External Location UUID*");
		Assert.assertEquals(manageLocation.addLocationDropdown(), "Test Centre");
		Assert.assertEquals(manageLocation.fillInformationForAddLocation(details), "Active");
//		Assert.assertNotSame(manageLocation.postalAddress(details), "");
//		Assert.assertFalse(manageLocation.postalAddress(details));
//		Assert.assertEquals(manageLocation.postalAddress(details), "PHYSICAL ADDRESS");
//		Assert.assertEquals(manageLocation.postalAddress(details), "");
//		Assert.assertEquals(manageLocation.productsCheckbox(), "");
//		manageLocation.fillInformationForAddLocation(details);
//		manageLocation.postalAddress(details);
//		manageLocation.productsCheckbox();
//		Assert.assertFalse(manageLocation.postalAddress(details));
		manageLocation.postalAddress(details);
//		Assert.assertFalse(manageLocation.clickPhysicalAddressSameAsPostal());
//		Assert.assertTrue(manageLocation.clickPhysicalAddressSameAsPostal());
//		helpers.waitForElementToBeVisible(driver, Locators.addLocationTypeAssert4);
//		manageLocation.clickPhysicalAddressSameAsPostal();

		System.out.println("----------------Test Success------------------------");
	}

}
