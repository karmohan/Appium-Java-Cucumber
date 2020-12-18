package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/Feature"},
		glue={"stepdefinations"},
				plugin = {"json:target/cucumber.json"}
		)
public class Testrunner extends AbstractTestNGCucumberTests {

}
