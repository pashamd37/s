package Testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\mohammadp\\IdeaProjects\\s\\src\\test\\java\\Feature"
        ,glue={"StepDefination"}
)


public class runner {
}
