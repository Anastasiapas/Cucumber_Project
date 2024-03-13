Feature: link redirection validation in google

  @RegressionTest
  @SmokeTest
  Scenario: Check redirection works in google
    Given user is on google page
    When user clicks on link from the search results
    Then user redirects to the corresponded page from the google main page

