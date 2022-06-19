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
    Then I verify total number of guest is displayed correctly

  Scenario: I verify text "Tell us how we can improve our site" is displayed at the end of search results
    Given I am on Hotels landing page
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

  Scenario: Verify share feedback button is displayed at the end of search results
    Given I am on Hotels landing page
      And I enter Bora Bora in the going to box
      And  I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion
    Then I click on check-in box
      And I click on next month arrow icon
      And I click on August 1 2022 as check-in date
      And I click on August 10 2022 as check-out date
      And I click on done
    Then I click on the search button
    Then I scroll down to the end of search results
    Then I verify Share feedback button is displayed

  Scenario: Verify share feedback button is enabled at the end of search results
    Given I am on Hotels landing page
      And I enter Bora Bora in the going to box
      And  I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion
    Then I click on check-in box
      And I click on next month arrow icon
      And I click on August 1 2022 as check-in date
      And I click on August 10 2022 as check-out date
      And I click on done
    Then I click on the search button
    Then I scroll down to the end of search results
    Then I verify Share feedback button is enabled