Feature: Login Functionality

  Scenario: Valid login with correct credentials
    Given User is on the login page
    When User enters valid username and password
    And clicks on the login button
    Then User should be redirected to the home page
    And User should see a welcome message