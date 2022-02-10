Feature: Sign up new account from Data Table
  @signUp
  Scenario: Signup with valid credentials using data table
    Given User in a TalentTEK homepage
    When User click on New Account button
    Then user should land on Sign Pp page
    Then user should fill out the information below
    |FirstName|LastName|Email|Password|ConfirmPassword|Month|Day|Year|
    |John     |Doe   |Abc12@gmail.com|abc1234 |abc1234|Feb |20 |1975|
    And user select the radio button for Gender
    And user click on checkbox for Agreement
    When user click on Create New account
    Then user should be able to Create account successfully



