package ManageUserDetailsPO;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.cmds.base.BaseTest;
import com.cmds.base.CommonHelpers;
import com.cmds.base.Locators;

public class LocationManagementPO extends BaseTest {

	WebDriver driver;
	CommonHelpers helper;

	public LocationManagementPO(WebDriver driver) {
		this.driver = driver;
		helper = new CommonHelpers(driver);
	}

	public void addLocationType(String locationType) {
		helper.clickElement(Locators.selectLocationType);
		helper.clickElement("//a[text()='" + locationType + "']");
	}

	public void addPartner(String partnerName) {
		helper.clickElement(Locators.partner);
		helper.waitForElementToBeVisible("//a[text()='" + partnerName + "']");
		helper.clickElement("//a[text()='" + partnerName + "']");
	}

	public void addParrentLocation(String locationName) {
		helper.clickElement(Locators.parentLocation);
		helper.clickElement("//a[text()='" + locationName + "']");
	}

	public void locationStatusType(String locationStatusType) {
		helper.clickElement(Locators.locationStatus);
		helper.clickElement("//a[text()='" + locationStatusType + "']");
	}

	public void postalCountryName(String countryName) {
		helper.clickElement(Locators.postalCountry);
		helper.clickElement("//a[text()='" + countryName + "']");
	}

	public void postalCountryTerritoryName(String territoryName) {
		helper.waitForElementToBeVisible(Locators.postalCountryTerritory);
		helper.clickElement(Locators.postalCountryTerritory);
		helper.waitForElementToBeVisible("//a[text()='" + territoryName + "']");
		helper.clickElement("//a[text()='" + territoryName + "']");
	}

	public void physicalCountryName(String countryName1) {
		helper.clickElement(Locators.physicalCountryTerritory);
		helper.clickElement("//a[text()='" + countryName1 + "']");
	}

	public void physicalCountryTerritoryName(String territoryName1) {
		helper.waitForElementToBeVisible(Locators.physicalCountryTerritory);
		helper.clickElement(Locators.physicalCountryTerritory);
		helper.waitForElementToBeVisible("//a[text()='" + territoryName1 + "']");
		helper.clickElement("//a[text()='" + territoryName1 + "']");
	}

	public void ieltsProducts(String ieltsProduct) {
		helper.clickElement("//div[@data-testid='product']/div/span[text()='" + ieltsProduct + "']/../label");
	}

	public String addLocationDropdown() {
		helper.waitForElementToBeVisible("locationType");
		this.addLocationType("Test Centre");
		helper.waitForElementToBeVisible("partnerName");
		this.addPartner("British Council");
		helper.waitForElementToBeVisible("locationName");
		this.addParrentLocation("Afghanistan");
		return helper.getText(Locators.addLocationTypeAssert1);
		// return helper.getText(driver, Locators.addLocationTypeAssert2 );

	}

	public String fillInformationForAddLocation(HashMap<String, String> details) {
		helper.sendKeys(Locators.externalLocationId, details.get("externalLocationUuid"));
		// helper.sendKeys(driver, Locators.externalParentLocation,
		// details.get("externalParentLocationName"));
		helper.sendKeys(Locators.testCentreNumber, details.get("testCentreNumber"));
		helper.sendKeys(Locators.locationName, details.get("locationName"));
		helper.sendKeys(Locators.timeZoneName, details.get("timeZoneName"));
		helper.sendKeys(Locators.websiteUrl, details.get("websiteUrl"));
		helper.clickElement(Locators.postalAddress);
		helper.waitForElementToBeVisible("locationStatusType");
		this.locationStatusType("Active");
		helper.clickElement(Locators.toggleOfflineTesting);
		return helper.getText(Locators.addLocationTypeAssert3);

	}

	public void postalAddress(HashMap<String, String> details) {
		helper.sendKeys(Locators.postalAddress1, details.get("postalAddress1"));
		helper.sendKeys(Locators.postalAddress2, details.get("postalAddress2"));
		helper.sendKeys(Locators.postalAddress3, details.get("postalAddress3"));
		helper.sendKeys(Locators.postalAddress4, details.get("postalAddress4"));
		helper.sendKeys(Locators.postalCity, details.get("postalCity"));
		helper.sendKeys(Locators.postalPostalCode, details.get("postalPostalCode"));
		this.postalCountryName("Afghanistan");
		helper.waitForElementToBeVisible("territoryName");
		this.postalCountryTerritoryName("Badakhshān");
		helper.sendKeys(Locators.postalEmail, details.get("postalEmail"));
		helper.sendKeys(Locators.postalPrimaryPhone, details.get("postalPrimaryPhone"));
		helper.sendKeys(Locators.postalSecondaryPhone, details.get("postalSecondaryPhone"));
		this.clickPhysicalAddressSameAsPostal();
		// return helper.isElementDisplayed(driver, Locators.addLocationTypeAssert4);
	}

//	public void physicalAddress(HashMap<String, String> details) {
//		helper.moveToElements(driver, Locators.physicalAddress);
//		helper.sendKeys(driver, Locators.physicalAddress1, details.get("physicalAddress1"));
//		helper.sendKeys(driver, Locators.physicalAddress2, details.get("physicalAddress2"));
//		helper.sendKeys(driver, Locators.physicalAddress3, details.get("physicalAddress3"));
//		helper.sendKeys(driver, Locators.physicalAddress4, details.get("physicalAddress4"));
//		helper.sendKeys(driver, Locators.physicalCity, details.get("physicalCity"));
//		helper.sendKeys(driver, Locators.physicalPostalCode, details.get("physicalPostalCode"));
//		this.physicalCountryName(driver, "Albania");
//		helper.waitForElementToBeVisible(driver, "territoryName1");
//		this.physicalCountryTerritoryName(driver, "Berat");
//		helper.sendKeys(driver, Locators.physicalEmail, details.get("physicalEmail"));
//		helper.sendKeys(driver, Locators.physicalPrimaryPhone, details.get("physicalPrimaryPhone"));
//		helper.sendKeys(driver, Locators.physicalSecondaryPhone, details.get("physicalSecondaryPhone"));
//}

	public String productsCheckbox() {
		helper.clickElement(" IELTS Online GT ");
		// helper.clickElement(driver, Locators.ieltsOnlineGT);
		helper.clickElement(Locators.addLocationButton);
		// helper.clickElement(driver, Locators.confirmLocationButton);
		return helper.getText(Locators.addLocationTypeAssert5);
	}

	public String addLocation(HashMap<String, String> details) throws InterruptedException {
		helper.waitForElementToBeVisible(Locators.locationManagement);
		helper.clickElement(Locators.locationManagement);
		helper.clickElement(Locators.addNewLocation);
		return helper.getText(Locators.addLocationAssert);
//		return helper.getText(driver, Locators.addLocationType);
//		this.addLocationDropdown(driver);
//		this.fillInformationForAddLocation(driver, details);
//		this.postalAddress(driver, details);
//		// this.physicalAddress(driver, details);
//		this.productsCheckbox(driver);

	}

	public void clickPhysicalAddressSameAsPostal() {
		helper.clickElement(Locators.physicalAddressSameAsPostalAddress);
		// return helper.isElementDisplayed(driver, Locators.addLocationTypeAssert4);
	}

}
