package com.basic.FirstFeatureFile;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
//		dryRun=true,
		features= {"src/test/resources/com/basic/FirstFeatureFileFF/"},
		glue= {"com/basic/FirstFeatureFile/"},
		plugin= {
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report4.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
				}
)
public class RunMyFirstFeatureTest {


}