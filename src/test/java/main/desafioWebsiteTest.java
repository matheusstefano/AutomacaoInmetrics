package main;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/desafiowebsite.feature", tags = "@ct01", 
glue = {""}, monochrome = true, dryRun = false)


public class desafioWebsiteTest {
	
}
