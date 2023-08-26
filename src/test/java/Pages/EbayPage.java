package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayPage {

    WebDriver driver = null;
    String ebayWebsite = "https://www.ebay.com/";
    By searchBox = By.id("gh-ac");
    By searchButton = By.id("gh-btn");
    By searchResultElements = By.xpath("//*[@id='srp-river-results']//*[@class='s-item__link' ]");

    public EbayPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openEbayWebsite() {
        driver.navigate().to(ebayWebsite);
    }

    public boolean hasLandedOnTheMainPage() {
        return driver.getWindowHandle().equals(ebayWebsite);
    }

    public void searchWithText(String text) {
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys(text);
        driver.findElement(searchButton).click();
    }

    public boolean isTheSearchResultsDisplayed(String text) {
        return driver.findElements(By.xpath("//*[@id='srp-river-results']//*[contains(text(),'" + text + "')]")).size() > 0;
    }

    public int getTheNumberOfObtainedSearchResults() {
        return driver.findElements(searchResultElements).size();
    }

    public void clickOnCheckButtonForLabel(String button) {
        driver.findElement(By.xpath("//*[text()='" + button + "']/../../..//input")).click();
    }
}
