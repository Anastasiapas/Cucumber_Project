
Feature: feature for link redirection validation

  @NewTag
  Scenario Outline: Check user can switch to wiki page
    Given user is on Wiki
    When user enters searched <country>
    And user clicks search
    Then user redirects to the corresponded page


    Examples:
      | country |
      | Ukraine |
      | England |
      | Belgium |
      | Poland  |

  @RegressionTest
  Scenario Outline: Check user can switch to wiki page
    Given user is on Wiki
    When user enters searched <country>
    And user clicks search


    Examples:
      | country |
      | Ukraine |
      | England |
      | Belgium |
      | Poland  |