package com.orangehrm.utilites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	private WebDriver driver = null;

	public Synchronization(WebDriver driver) {
		this.driver = driver;
	}

	WebDriverWait wait;

	public WebElement until(By locator) {
		WebElement element = null;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}
}
