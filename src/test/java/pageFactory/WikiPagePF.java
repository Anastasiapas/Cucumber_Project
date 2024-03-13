package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WikiPagePF {
   private WebDriver driver;

    public WikiPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class= 'cdx-text-input__input']")
           //annotation to store element if locator is stable
            @CacheLookup
    WebElement searchInput;

    @FindBy(xpath = "//button[@class='cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button--size-medium cdx-button--framed cdx-search-input__end-button']")
    WebElement searchBtn;

    //List of web elements example
    //@FindBy(xpath = "//input[@class= 'cdx-text-input__input']")
    //List<WebElement> myLinks

//    @FindBy(how = How.NAME, using="name")
//    WebElement example;

    public void enterSearchInput(String country) {
        searchInput.sendKeys(country);
    }

    public void clickSearch(){
        searchBtn.click();
    }
}
