package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features/swaglabs.feature"
		,glue = {"stepDefs"},
		plugin = {"pretty","html:target/cucumber-reports-swag.html"}
		)
public class swaglabrunner {

}
