package com.basic.datatableSD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
//		dryRun=true,
		features= {"src/test/resources/com/basic/datatableFF/"},
		glue= {"com/basic/datatableSD/"},
		plugin= {
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report3.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
				}
)
public class RunDataTableScenarioTest {


}