$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/EbayUserInterface.feature");
formatter.feature({
  "name": "validate ebay service",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate the ebay ui",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to ebay",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.EbaySteps.navigateToEbay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has landed on the main page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.EbaySteps.hasLandedOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"mazda mx-5\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.EbaySteps.searchWithText(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see the search results for \"Mazda MX-5\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.EbaySteps.isTheSearchResultsDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "log the number of obtained search results",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.EbaySteps.logTheNumberOfObtainedSearchResults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on check button for \"Manual\" label",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.EbaySteps.clickOnCheckButtonForLabel(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});