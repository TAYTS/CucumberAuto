package com.basic.tagsSD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
//		dryRun=true,
//		tags= {"@Important"}, // All scenario if this is tag for feature file
//		tags= {"@Smoke"}, // Only tag with @Smoke
//		tags= {"@Smoke", "@Regression"}, // AND condition
		tags= {"@Smoke,@Regression"}, // OR condition
		features= {"src/test/resources/com/basic/tagsFF/"},
		glue= {"com/basic/tagsSD/"},
		plugin= {
			"pretty",
			"html:target/cucumber-htmlreport",
			"json:target/cucumber-report10.json",
			"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
		}
)
public class RunTagsScenarioTest {
}