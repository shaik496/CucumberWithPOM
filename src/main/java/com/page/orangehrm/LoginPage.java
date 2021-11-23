package com.page.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	By userName = By.xpath("//input[contains(@id,'txtUsername')]");
	By passWord = By.xpath("//input[contains(@id,'txtPassword')]");
	By button = By.xpath("//input[contains(@id,'btnLogin')]");
	By dashboard = By.xpath("//*[@id='content']/div/div[1]/h1");
	By errorMessage = By.xpath("//span[@id='spanMessage']");
	By welcomeMenu = By.xpath("//a[contains(@id,'welcome')]");
	By logOutButton = By.xpath("//a[text()='Logout']");
	
	WebDriver driver = null;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String uname, String password) {
		driver.findElement(userName).sendKeys(uname);
		driver.findElement(passWord).sendKeys(password);
		driver.findElement(button).click();
	}

	public String getTitle() {
		String dashbordString = null;
		dashbordString = driver.findElement(dashboard).getText();
		return dashbordString;
	}
	
	
	public void logOut() throws InterruptedException {
		driver.findElement(welcomeMenu).click();
		Thread.sleep(5000);
		driver.findElement(logOutButton).click();
	}
	
	public String getErrorMessage() {
		String errMessage = null;
		errMessage = driver.findElement(errorMessage).getText();
		return errMessage;
	}
}
