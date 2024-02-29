package com.cmds.base;

import org.openqa.selenium.WebDriver;

public class BasePage extends BaseTest {

	WebDriver driver;
	CommonHelpers helper;
	Locators locate;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		locate = new Locators();
		helper = new CommonHelpers(driver);
	}

	public String cmdsLogin(String userName, String password) throws InterruptedException {
		helper.sendKeys(Locators.emailTextField, userName);
		helper.sendKeys(Locators.passwordTextField, password);
		helper.clickElement(Locators.loginButton);
		System.out.print(helper.waitForElementToBeVisible(Locators.nonExistingXpath));
		return helper.getText(Locators.headerNew);
	}

}
