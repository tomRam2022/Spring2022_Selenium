Feature: Hotels Feedback

  Scenario: Verify error is displayed when user submits the empty feedback form
    Given I am on Hotels landing page
        Then I click on the sign in button
        Then I click on the feedback button
        Then I click on the submit button
