package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.*;

public class WikiPage {

    protected WebDriver driver;


    public WikiPage(WebDriver driver) {
        this.driver = driver;
    }

    ;

    private By searchInput = By.xpath("//input[@class= 'cdx-text-input__input']");
    private By searchButton = By.xpath("//button[@class='cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button--size-medium cdx-button--framed cdx-search-input__end-button']");

    public void enterSearchInput(String country) {
        driver.findElement(searchInput).sendKeys(country);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}
