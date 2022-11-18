package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "framework.steps.LetCodeTestSteps",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}
