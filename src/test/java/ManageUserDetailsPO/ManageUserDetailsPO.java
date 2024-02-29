package ManageUserDetailsPO;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.cmds.base.BaseTest;
import com.cmds.base.CommonHelpers;
import com.cmds.base.Locators;

public class ManageUserDetailsPO extends BaseTest {

	WebDriver driver;
	CommonHelpers helper;

	public ManageUserDetailsPO(WebDriver driver) {
		this.driver = driver;
		helper = new CommonHelpers(driver);
	}

	public void selectOrganisation(String orgName) {
		helper.clickElement(Locators.organisation);
		helper.clickElement("//a[text()='" + orgName + "']");
	}

	public void userGroupType(String userGroupName) {
		helper.clickElement(Locators.userGroup);
		helper.clickElement("//a[text()='" + userGroupName + "']");
	}

	public void fillPersonalInformationForAddUser(HashMap<String, String> details) {
		helper.sendKeys(Locators.givenName, details.get("givenName"));
		helper.sendKeys(Locators.familyName, details.get("familyName"));
		helper.sendKeys(Locators.email, details.get("email"));
		helper.clickElement(Locators.toggleEmail);
		helper.sendKeys(Locators.phoneNumber, details.get("phoneNumber"));
		helper.waitForElementToBeVisible("orgName");
		this.selectOrganisation("Global IELTS");
		helper.clickElement(Locators.continueButton1);
	}

	public void assignUserGroup() {
		helper.clickElement(Locators.locationType);
		helper.clickElement(Locators.locationTypePlace);
		helper.clickElement(Locators.location);
		helper.waitForElementToBeVisible(Locators.locationOrganisation);
		helper.clickElement(Locators.locationOrganisation);
		helper.waitForElementToBeVisible("userGroupName");
		this.userGroupType("Chief Invigilator");
		helper.clickElement(Locators.continueButton2);
	}

	public void addUser(HashMap<String, String> details) throws InterruptedException {

		helper.waitForElementToBeVisible(Locators.manageUser);
		helper.clickElement(Locators.manageUser);
		helper.clickElement(Locators.addUsers);
		this.fillPersonalInformationForAddUser(details);
		this.assignUserGroup();
		helper.moveToElements(Locators.addButton);
		helper.clickElement(Locators.addButton);
	}
}
