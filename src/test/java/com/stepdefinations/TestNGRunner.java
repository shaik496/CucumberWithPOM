package com.stepdefinations;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/OrangeHRMFeatures" }, glue = { "com.stepdefinations",
		"com.orangehrm.utilites" }, tags = "not @smoke", dryRun = false) // its from cucumber-Junit and
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
