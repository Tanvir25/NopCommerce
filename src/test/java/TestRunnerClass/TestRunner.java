package TestRunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue = "Step_Defination",
		dryRun=false,
		tags="@search",
		plugin = {"html:target/cucumber.html"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
