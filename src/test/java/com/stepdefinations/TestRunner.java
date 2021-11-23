package com.stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // Its from Junit
@CucumberOptions(features = { "src/test/resources/OrangeHRMFeatures" }, glue = { "com.stepdefinations",
		"com.orangehrm.utilites" }, tags = "not @smoke"
		,dryRun = false) // its from cucumber-Junit and
public class TestRunner {

}
