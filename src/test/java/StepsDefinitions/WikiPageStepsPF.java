package StepsDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageFactory.WikiPagePF;
import pages.WikiPage;

public class WikiPageStepsPF {

    private WebDriver driver;
    private WikiPagePF pf;
    private String country;

//    //regexone.com to check different expressions to use
//    @Given("user is on Wiki")
//    public void user_is_on_wiki_page() {
//        driver = DriverFactory.getDriver();
//        this.pf = new WikiPagePF(driver);
//        driver.navigate().to("https://en.wikipedia.org/wiki/Wiki");
//        System.out.println("user opens wiki page");
//    }
//
//    @When("^user enters searched (.*)$")
//    public void userEntersCountry(String country) throws InterruptedException {
//        System.out.println("enter country");
//        pf.enterSearchInput(country);
//        this.country = country;
//        Thread.sleep(2000);
//    }
//
//    @And("user clicks search")
//    public void userEntersCountry() {
//       pf.clickSearch();
//        System.out.println("user clicked Search");
//    }
//
//    @Then("user redirects to the corresponded page")
//    public void user_redirects_to_the_corresponded_page() {
//       Assert.assertTrue(driver.getPageSource().contains(country));
//        System.out.println("test done");
//        driver.quit();
//    }


}
