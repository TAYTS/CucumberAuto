package com.basic.multiSD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
//		dryRun=true,
		features= {"src/test/resources/com/basic/multiFF/"},
		glue= {"com/basic/multiSD/"},
		plugin= {
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report7.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
				}
)
public class RunMultiScenarioTest {


}