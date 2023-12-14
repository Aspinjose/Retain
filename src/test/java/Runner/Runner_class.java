package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)	
@CucumberOptions(features = "/home/aspin/eclipse-workspace/Retain_Project/"
		+ "RP_Retain/src/test/resources/Features",glue = {"com.stepdefinition"})

public class Runner_class {
	
}
