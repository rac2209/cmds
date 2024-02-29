package com.cmds.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonHelpers extends BaseTest {

	private WebDriver driver;

	public CommonHelpers(WebDriver driver) {
		this.driver = driver;
	}

	public void moveToElements(String electroniclabel) {
		Actions act = new Actions(driver);
		WebElement scroll = driver.findElement(By.xpath(electroniclabel));
		act.moveToElement(scroll).perform();
	}

	public void clickElement(String ele) {
		driver.findElement(By.xpath(ele)).click();
	}

	public String getText(String ele) {
		return driver.findElement(By.xpath(ele)).getText();
	}

	public Boolean isElementDisplayed(String element) {
		return driver.findElement(By.xpath(element)).isDisplayed();
	}

	public void sendKeys(String ele, String value) {
		System.out.println("Send Keys ########" + driver);
		WebElement type = driver.findElement(By.xpath(ele));
		type.sendKeys(value);
	}

	public boolean waitForElementToBeVisible(String ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}

	public void selectValueFromDropDown(WebElement dropDownElement, String dropDownValue) {
		Select dropDown = new Select(dropDownElement);
		dropDown.selectByVisibleText(dropDownValue);
	}

	public String getValueFromDropDown(WebElement dropDownElement, int optionIndex) {
		Select dropDown = new Select(dropDownElement);
		List<WebElement> options = dropDown.getOptions();
		return options.get(optionIndex).getText();
	}

	public void scrollToElement(WebElement webElement) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", webElement);
	}

	// Window handles need to create
}
