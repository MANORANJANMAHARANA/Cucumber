package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features",glue = {"StepDefinition"},
        plugin = { "pretty", "html:src/main/java/Features/cucumber-reports.html" },
        monochrome = true)

public class TestRunner {
}
