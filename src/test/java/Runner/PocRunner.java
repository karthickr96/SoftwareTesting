package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Features/poc.feature"
		,glue= {"stepDefs"},
		plugin = {"pretty","html:target/cucumber-reports-art.html"}
		)
public class PocRunner {

}
