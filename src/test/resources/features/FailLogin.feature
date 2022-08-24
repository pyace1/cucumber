Feature: Fail login

  Background: The browser is open
    Given Launch the browser
    Given Maximize the browser window
    Given Open automation practice
    # Given Navigate to Sign in page

  Scenario: Validate user can`t login with invalid credentials
    # When User enters "ljubicicinmejl@fakemejl.com" in email field
    # And User enters "losasifra" in password field
    # And User clicks on Sign in button
    # Then Error message is displayed
    Then Close the browser