package com.basic.multipleScenarioSD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
//		dryRun=true,
		features= {"src/test/resources/com/basic/multipleScenarioFF/"},
		glue= {"com/basic/multipleScenarioSD/"},
		plugin= {
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
				}
)
public class RunMultipleScenarioTest {


}