package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/features",
		glue = {"stepDefinations"},
		tags = {"@Test-1"},
		dryRun = false, monochrome = true
		)
public class TestRunner {

}
