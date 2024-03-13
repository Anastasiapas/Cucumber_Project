package StepsDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features", glue = {"StepsDefinitions"},
        monochrome = true,
       // create JSON folder   plugin = {"pretty", "json:target/JSONReports/report.json"}
        plugin = {"pretty", "junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html: target/HtmlReports"
        }
       // plugin = {"pretty", "html:target/HTMLReports"}
)
public class TestRunner {

}
