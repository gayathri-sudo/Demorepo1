package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Ranjith\\eclipse-workspace\\Cucumber\\src\\main\\java\\Feature"
		,glue= {"StepDefinition"},
		
		format= {"pretty","html:test-output"},
		dryRun=false,
		monochrome=true
		
		
		
		
		
      )

public class TestRunner {

}
