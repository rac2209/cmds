package com.cmds.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	ChromeDriver driver;

	@BeforeTest
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://ui.sit.cmdsiz.com");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterMethod() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
