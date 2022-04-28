package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features ="featurefiles/new.feature", glue="stepdefinitions",

strict= true, monochrome=true, plugin={"html:Reports/Html", "pretty"})

public class newadactinrunner {
	 

}
