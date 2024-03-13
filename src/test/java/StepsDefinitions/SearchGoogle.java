package StepsDefinitions;

import driver.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

public class SearchGoogle {

    private WebDriver driver;

    @Given("user is on google page")
    public void user_is_on_google_page() {
        driver = DriverFactory.getDriver();
        driver.navigate().to("https://www.google.com/");
        System.out.println("user open wiki page");
    }
    @When("user clicks on link from the search results")
    public void user_clicks_on_link_from_the_search_results() {

        System.out.println("useiki page");
    }

    @Then("user redirects to the corresponded page from the google main page")
    public void user_redirects_to_the_corresponded_page_from_the_google_main_page() {
        System.out.println("user");
    }
}
