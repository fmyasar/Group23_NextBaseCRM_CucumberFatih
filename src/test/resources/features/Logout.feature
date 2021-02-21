
Feature: Logout
  @NEX-185
  Scenario: Landing in login page after clicking logout
    Given The user is on the homepage
    When The user clicks the profile
    And The user clicks the Logout button
    Then The user lands in login page