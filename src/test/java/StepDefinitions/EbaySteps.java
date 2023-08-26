package StepDefinitions;

import Pages.EbayPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class EbaySteps {
    WebDriver driver = null;

    @Before
    public void setup() {
        if (this.driver == null) {
            this.driver = BrowserConfig.getIEWebDriver();
        }
    }

    @After
    public void cleanUp() {
        BrowserConfig.releaseResources(driver);
    }

    @Given("^user navigates to ebay$")
    public void navigateToEbay() {
        EbayPage ebayPage = new EbayPage(driver);
        ebayPage.openEbayWebsite();
    }

    @And("^user has landed on the main page$")
    public void hasLandedOnTheMainPage() {
        EbayPage ebayPage = new EbayPage(driver);
        ebayPage.hasLandedOnTheMainPage();
    }

    @And("^user searches for \"([^\"]*)\"$")
    public void searchWithText(String text) {
        EbayPage ebayPage = new EbayPage(driver);
        ebayPage.searchWithText(text);
    }

    @And("^user can see the search results for \"([^\"]*)\"$")
    public void isTheSearchResultsDisplayed(String text) {
        EbayPage ebayPage = new EbayPage(driver);
        Assert.assertTrue(ebayPage.isTheSearchResultsDisplayed(text));
    }

    @And("^log the number of obtained search results")
    public void logTheNumberOfObtainedSearchResults() {
        EbayPage ebayPage = new EbayPage(driver);
        System.out.println("the number of obtained search results: " + ebayPage.getTheNumberOfObtainedSearchResults());
    }

    @And("^user clicks on check button for \"([^\"]*)\" label$")
    public void clickOnCheckButtonForLabel(String button) {
        EbayPage ebayPage = new EbayPage(driver);
        ebayPage.clickOnCheckButtonForLabel(button);
    }

}
