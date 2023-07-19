package uk.co.rightmove.testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/uk/co/rightmove/features"},
        glue = {"uk/co/rightmove/stepDefinitions"},
        publish = true
)

public class testRunners {
}
