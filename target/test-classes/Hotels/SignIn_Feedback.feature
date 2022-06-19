Feature: SignIn_Feedback

  Scenario: Verify error text is displayed when user submits the empty feedback form
    Given I am on Hotels landing page
        Then I click on the sign in button
        Then I click on the feedback button
        Then I click on the submit button
        Then I verify error text is displayed2


  Scenario: Verify error is displayed when user submits the empty feedback form
    Given I am on Hotels landing page
      Then I click on the sign in button
      Then I click on the feedback button
      Then I click on the submit button
      Then I verify Page Rating is red dotted
