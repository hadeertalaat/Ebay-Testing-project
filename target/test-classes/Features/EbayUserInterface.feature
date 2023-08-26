Feature: validate ebay service

  Scenario: validate the ebay ui
    Given user navigates to ebay
    And user has landed on the main page
    And user searches for "mazda mx-5"
    And user can see the search results for "Mazda MX-5"
    And log the number of obtained search results
    And user clicks on check button for "Manual" label

    #Navigate to https://www.ebay.com/
#Validate that you have landed on the main page.
#Search for "mazda mx-5".
#Validate the results obtained.
#Print/log the number of obtained search results.
#From the left hand side filter using "Transmission" -> "Manual"

#The framework should be capable of:
#Handling browser common actions that will be needed for these scenarios.
#Should support Page Object Model design pattern.
#Should provide an adequate execution report.
#All needed test data shouldn't be hardcoded and must be read from an external data source
#(JSON, XLS,...etc.)
#Deliverables:
#● The Framework should be properly documented and published on a remote repo
#(GitHub, BitBucket,...etc.).

#● A video proof of the working script:
#o You can video-record using any screen recording tools (TinyTake could be
#useful).
#o The video should display all the automated actions starting from the browser
#launch to its closure.

#Test Instructions:
#1. Please make sure to send all the deliverables compressed in (.rar/.zip) file for API
#task related files and the video recording of test automation.
#2. Also please make sure to send the "URL" of the remote repo that should have the
#uploaded framework code used to r
