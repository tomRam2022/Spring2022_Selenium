Feature: Hotels SearchStays

  Scenario: Verify share feedback button is displayed at the end of search results
    Given I am on Hotels landing page
      Then I click on going to box
        And I enter Bora Bora in the going to box
        And  I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion
      Then I click on check-in box
        And I click on next month arrow icon
        And I click on August 1 2022 as check-in date
        And I click on August 10 2022 as check-out date
        And I click on done
      Then I click on the search button
      Then I scroll down to the end of search results
      Then I verify text "Tell us how we can improve our site" is displayed
      Then I verify Share feedback button is displayed
      Then I verify Share feedback button is enabled



