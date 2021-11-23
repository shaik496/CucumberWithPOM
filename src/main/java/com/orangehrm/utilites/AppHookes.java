package com.orangehrm.utilites;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHookes {
	private WebDriver driver = null;
	private DriverFactory driverfactory = null;

	@Before()
	public void launchBrowser() {
		driverfactory = new DriverFactory();
		driver = driverfactory.initDriver("chrome");
	}
	@After() // from cucumber
	public void tearDown() {
		driver.quit();
	}
}
