package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(features="src/test/resources/Features/nejm.feature",
			glue={"stepDefinitions"},
			plugin={ "pretty","html:target/cucumber-html-report", "json:target/cucumber.json",
					"pretty:target/cucumber-pretty.txt",
			"usage:target/cucumber-usage.json" },
			publish=true)
public class Runner {

}
