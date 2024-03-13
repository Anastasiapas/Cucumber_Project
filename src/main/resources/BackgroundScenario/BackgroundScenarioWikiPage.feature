
Feature: feature for link redirection validation


  Background: user enters Search
    Given user is on Wiki page



  Scenario Outline: Check user can switch to wiki page
    When user enters searched <country>
    And user clicks search
    Then user redirects to the corresponded page

    Examples:
      | country |
      | Ukraine |
      | England |
      | Belgium |
      | Poland  |


  Scenario Outline : Check user can switch to wiki page
    When user enters searched <country>
    And user clicks search
    Then user redirects to the corresponded page

    Examples:
      | country |
      | Ukraine |
      | England |
      | Belgium |
      | Poland  |