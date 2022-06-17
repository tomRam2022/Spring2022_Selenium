Feature: Hotels TermsAndPrivacy
  Scenario: Verify Terms and Conditions link open correct page on new tab
    Given I am on Hotels landing page
    Then I click on the sign in button
    Then I click on the sign up button
    Then I click on the Terms and Conditions link
    Then I verify Terms and Conditions page opens in new tab



  Scenario: Verify Privacy Statements link open correct page on new tab
    Given I am on Hotels landing page
    Then I click on the sign in button
    Then I click on the sign up button
    Then I click on the Privacy and Statements link
    Then I verify Privacy Statements page opens in new tab