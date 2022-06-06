Feature: Darksky Time Machine Calender

  Scenario: Verify current date is highlighted
    Given I am on darksky landing page
    When I scroll down the landing page
      And I click on time machine button
    Then I verify current date is selected on calender by default
