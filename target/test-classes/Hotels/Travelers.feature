Feature: Hotels Travelers

  Scenario: Verify total number of guest is displayed correctly
    Given I am on Hotels landing page
    Then I click on the travelers button
    And I click add adult button 4 times
    And I click add children button 2 times
    Then I click child 1 age tab
    And I select child 1 age from dropdown
    Then I click child 2 age tab
    And I select child 2 age from dropdown
    And I click on done button
