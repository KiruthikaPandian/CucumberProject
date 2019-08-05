package com.mavencucumber.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\java\\com\\mavencucumber\\feature\\",
		glue="com.mavencucumber.stepdef"
		/*tags="@Logintocustomisetheproduct"
		strict=false,
		dryRun=true,
		monochrome=true*/
		)



public class TestRunner {

}
