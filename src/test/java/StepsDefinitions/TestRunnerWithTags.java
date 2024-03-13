package StepsDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/FeaturesWithTags",
        glue = {"StepsDefinitions"},
        //tags = ("@RegressionTest")
        tags= ("@SmokeTest or @RegressionTest")
        //tags= ("@SmokeTest and @RegressionTest")
       // tags= ("not @RegressionTest")


)
public class TestRunnerWithTags {

}
