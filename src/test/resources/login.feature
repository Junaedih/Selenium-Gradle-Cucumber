@login
Feature: Login

  @valid-login
  Scenario: [Positive Test] Login using valid username and valid password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @invalid-password-login
  Scenario: [Negative Test] Login sing valid username and invalid password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid_password_xxx"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"


  @invalid-username-login
  Scenario: [Negative Test] Login using invalid username and valid password
    Given user is on login page
    And user input username with "junaedih_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"


  @blank-password-login
  Scenario: [Negative Test] Login using valid username and blank password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Password is required"

  @invalid-username-and-blank-password-login
  Scenario: [Negative Test] Login using invalid username and blank password
    Given user is on login page
    And user input username with "standard_user_invalid"
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Password is required"

  @blank-username-login
  Scenario: [Negative Test] Login using blank username
    Given user is on login page
    And user input username with ""
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message "Epic sadface: Username is required"


  @blank-username-and-blank-password-login
  Scenario: [Negative Test] Login using invalid username and blank password
    Given user is on login page
    And user input username with ""
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Username is required"

  @lock-username-and-valid-password-login
  Scenario: [Negative Test] Login using lock-username and valid password
    Given user is on login page
    And user input username with "locked_out_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message "Epic sadface: Sorry, this user has been locked out."

  @lock-username-and-invalid-password-login
  Scenario: [Negative Test] Login using lock-username and valid password
    Given user is on login page
    And user input username with "locked_out_user"
    And user input password with "invalid_password"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"


  @grouping-invalid-login
  Scenario Outline: [Negative Test] Group scenario negative testing login
    Given user is on login page
    And user input username with <username>
    And user input password with <password>
    When user click login button
    Then user able to see error message <errorMessage>
    Examples:
      | username          | password               | errorMessage                                                                |
      | "standard_user"   | "invalid_password"     | "Epic sadface: Username and password do not match any user in this service" |
      | "invalid_user"    | "secret_sauce"         | "Epic sadface: Username and password do not match any user in this service" |
      | "invalid_user"    | "invalid_password"     | "Epic sadface: Username and password do not match any user in this service" |
      | "standard_user"   | ""                     | "Epic sadface: Password is required" |
      | ""                | "secret_sauce"         | "Epic sadface: Username is required" |
      | ""                | ""                     | "Epic sadface: Username is required" |
      | "locked_out_user" | "secret_sauce"         | "Epic sadface: Sorry, this user has been locked out" |
      | "locked_out_user" | "invalid_password"     | "Epic sadface: Username and password do not match any user in this service" |
