package src.test.java.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "src/test/java/StepDefinition",
        dryRun = false,
        tags = "@automation1"

)

public class CukesRunner {
}
