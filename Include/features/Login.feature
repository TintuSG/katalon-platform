Feature: Test Login Functionality

  Scenario: Check Login scccessful with valid credentials.
    Given user is on login Page
    When user enter username and password
    And user Clickon login button
    Then user is navigated to home Page
