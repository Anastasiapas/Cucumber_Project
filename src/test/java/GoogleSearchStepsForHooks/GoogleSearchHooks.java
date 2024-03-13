package GoogleSearchStepsForHooks;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.WikiPage;

import java.util.concurrent.TimeUnit;

public class GoogleSearchHooks {
    private WebDriver driver;

    @Before (order =0)
    //@Before (order =0, value="@smokeTest")
    public void browserSetUp1() throws InterruptedException {
        System.out.println("user gets Driver1");
            driver = DriverFactory.getDriver();
            Thread.sleep(4000);
            driver.navigate().to("https://www.google.com/");
    }

    @Before (order= 2)
    public void browserSetUp2(){
        // \n - new line
        System.out.println("user gets Driver2 \n");
    }
    @BeforeStep
    public static void beforeSteps(){
        System.out.println("before steps");
    }
    @Given("user is on google page")
    public void user_is_on_google_page() {
//        driver = DriverFactory.getDriver();
//        driver.navigate().to("https://www.google.com/");
        System.out.println("user open google page");
    }

    @When("user clicks on link from the search results")
    public void user_clicks_on_link_from_the_search_results() {
        System.out.println("user enters search input");
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Test");
    }

    @Then("user redirects to the corresponded page from the google main page")
    public void user_redirects_to_the_corresponded_page_from_the_google_main_page() {
        System.out.println("user");
    }

    @AfterStep
    public static void afterSteps(){
        System.out.println("after steps");
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
