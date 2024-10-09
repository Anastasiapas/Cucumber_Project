#@FunctionalTest
Feature: feature for link redirection validation

  Scenario Outline: Check user can switch to wiki page
    Given user is on Wiki
    When user enters searched <country>
    And user clicks search
    Then user redirects to the corresponded page


    Examples:
      | country |
      | Ukraine |
#      | England |
#      | Belgium |
#      | Poland  |

