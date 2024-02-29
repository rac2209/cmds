package com.cmds.base;

public class Locators {

	// CMDS LOGIN

	public static final String emailTextField = "//div/input[@id='email']";
	public static final String passwordTextField = "//div/input[@id='password']";
	public static final String loginButton = "//button[@id='btn-login']";
	public static final String nonExistingXpath = "//div/tr[@id='123']";
	public static final String manageTestTakerSection = "(//div[@class=\"LPDGroup1 \"])[1]";
	public static final String header = "//div[@class=\"headerGrp1\"]";
	public static final String headerNew = "//p[@class='headerText']";

	// Manage User
	public static final String manageUser = "//div[@label='Manage User Details']";

	// Add New User
	public static final String addUsers = "//div[@class='buttonIcon']";
	public static final String givenName = "//input[@name='givenName']";
	public static final String familyName = "//input[@name='familyName']";
	public static final String email = "//input[@name='email']";
	public static final String phoneNumber = "//input[@name='phoneNumber']";
	public static final String toggleEmail = "//span[@id='emailVerified']";
	public static final String organisation = "//div[@id='organisation']";
	public static final String continueButton1 = "//button[@id='Continue']";
	public static final String locationType = "//div[@id='Location_Type_0']";
	public static final String locationTypePlace = "//a[text()='Global']";
	public static final String location = "//div[@id='Location_0']";
	public static final String locationOrganisation = "//a[text()='IELTS Global']";
	public static final String userGroup = "//div[@id='UserGroup_0']";
	public static final String continueButton2 = "//button[@id='Continue']";
	public static final String addButton = "//button[@id='Add']";

	// Location Management
	public static final String locationManagement = "//div[@label='Location Management']";

	// Add New Location
	public static final String addNewLocation = "//div[@title='Add New']";
	public static final String addLocationAssert = "//div[@class='addUpdateLocationPage_locationHeadetext__EyOW6']";
	public static final String selectLocationType = "//div[@id='locationTypeCode']";
	public static final String partner = "(//div[@data-testid='dropdownInput'])[2]";
	public static final String parentLocation = "//div[@id='parentLocationUuid']";
	public static final String externalLocationId = "//input[@name='externalLocationUuid']";
	public static final String externalParentLocation = "//input[@name='externalParentLocationUuid']";
	public static final String testCentreNumber = "//input[@name='testCentreNumber']";
	public static final String locationName = "//input[@id='locationName']";
	public static final String timeZoneName = "//input[@name='timezoneName']";
	public static final String websiteUrl = "//input[@name='websiteURL']";
	public static final String locationStatus = "//div[@id='locationStatus']";
	public static final String toggleOfflineTesting = "//span[@id='eligibleForOfflineTesting']";
	public static final String postalAddress = "//label[@id='postalAddress']";
	public static final String postalAddress1 = "//input[@id='postaladdressLine1']";
	public static final String postalAddress2 = "//input[@id='postaladdressLine2']";
	public static final String postalAddress3 = "//input[@id='postaladdressLine3']";
	public static final String postalAddress4 = "//input[@id='postaladdressLine4']";
	public static final String postalCity = "//input[@id='postalcity']";
	public static final String postalPostalCode = "//input[@id='postalpostalCode']";
	public static final String postalCountry = "//div[@id='postalcountryUuid']";
	public static final String postalCountryTerritory = "//div[@id='postalterritoryUuid']";
	public static final String postalEmail = "//input[@id='postalemail']";
	public static final String postalPrimaryPhone = "//input[@id='postalprimaryPhone']";
	public static final String postalSecondaryPhone = "//input[@id='postalsecondaryPhone']";
	public static final String physicalAddressSameAsPostalAddress = "//div[@class='checkboxComponent']";
	public static final String physicalAddress = "//label[@id='physicalAddress']";
	public static final String physicalAddress1 = "//input[@id='physicaladdressLine1']";
	public static final String physicalAddress2 = "//input[@id='physicaladdressLine2']";
	public static final String physicalAddress3 = "//input[@id='physicaladdressLine3']";
	public static final String physicalAddress4 = "//input[@id='physicaladdressLine4']";
	public static final String physicalCity = "//input[@id='physicalcity']";
	public static final String physicalPostalCode = "//input[@id='physicalpostalCode']";
	public static final String physicalCountry = "//div[@id='physicalcountryUuid']";
	public static final String physicalCountryTerritory = "(//div[@class='dropdownArrowDown '])[8]";
	public static final String physicalEmail = "//input[@id='physicalemail']";
	public static final String physicalPrimaryPhone = "//input[@id='physicalprimaryPhone']";
	public static final String physicalSecondaryPhone = "//input[@id='physicalsecondaryPhone']";
	public static final String ieltsOnlineGT = "(//span[@id='productAuthorization_checkbox_label'])[1]";

	public static final String addLocationButton = "//button[@id='AddLocation']";
	public static final String confirmLocationButton = "//div[text()='Confirm']";

	public static final String addLocationTypeAssert1 = "//div[@id='locationTypeCode']";
	public static final String addLocationTypeAssert2 = "//div[@id='partnerCode']";
	public static final String addLocationTypeAssert3 = "//div[@id='locationStatus']";
//	public static final String addLocationTypeAssert4 = "(//label[@tabindex='0'])[2]";
	public static final String addLocationTypeAssert4 = "//div[@class='LocationAddressPanel_locPrimaryLabel__zqCUP']/label[@id='physicalAddress']";
	public static final String addLocationTypeAssert5 = "(//label[@tabindex='0'])[3]";

}