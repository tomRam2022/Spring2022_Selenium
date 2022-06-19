Feature: Hotels SignIn

  Scenario: Verify verification message for invalid sign in credentials
    Given I am on Hotels landing page
    Then I click on the sign in button
    Then I click on the sign in button DD
    Then I enter abcd@abcd.com as email
    And I enter abcd as password
    Then I click on the sign in button from DD2
    Then I verify error text is displayed