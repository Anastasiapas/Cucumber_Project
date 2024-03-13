package StepsDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Hooks/googleSearchHooks.feature",
        glue = {"GoogleSearchStepsForHooks"},
        monochrome = true,
        plugin = {"pretty", "junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HtmlReports"
        }
        //tags = "@smokeTest"
)
public class TestRunnerHooks {
}
