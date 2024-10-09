package StepsDefinitions;

import driver.DriverFactory;
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

public class WikiPageSteps {

    private WebDriver driver;
    private WikiPage wiki;
    private String country;

    //regexone.com to check different expressions to use
    @Given("user is on Wiki")
    public void user_is_on_wiki_page() {
        driver = DriverFactory.getDriver();
        this.wiki = new WikiPage(driver);
        driver.navigate().to("https://en.wikipedia.org/wiki/Wiki");
        System.out.println("user opens wiki page");
    }

    @When("^user enters searched (.*)$")
    public void userEntersCountry(String country) throws InterruptedException {
        System.out.println("enter country");
        wiki.enterSearchInput(country);
        Thread.sleep(2000);
    }

    @And("user clicks search")
    public void userEntersCountry() {
       wiki.clickSearch();
        System.out.println("user clicked Search");
    }

    @Then("user redirects to the corresponded page")
    public void user_redirects_to_the_corresponded_page() throws InterruptedException {
        Thread.sleep(2000);
//        Assert.assertTrue(driver.getCurrentUrl().contains(country));
//        System.out.println("test done");
        driver.close();
    }


}
