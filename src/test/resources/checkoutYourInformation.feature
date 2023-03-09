@Continue-To-Checkout-Overview
Feature: Checkout Information Customer

@Valid-Continue-To-Checkout-Overview
  Scenario: [Positive Test] Valid Continue To Step Checkout Overview
    Given User Is On Checkout Customer Information Page
    And User Input First name with "Junaedih"
    And User Input Last Name  with "Al-Ghazali"
    And User Input Postal Code  with "15416"
    When User click Continue button
    Then User is on Checkout_Overview Page

  @Invalid-Continue-First-Name-No-Input
  Scenario: [Negative Test] Invalid Continue (First Name No Input)
    Given User Is On Checkout Customer Information Page
    And User Input First name with ""
    And User Input Last Name  with "Al-Ghazali"
    And User Input Postal Code  with "15416"
    When User click Continue button
    Then User able to see error message "Error: First Name is required"

  @Invalid-Continue-Last-Name-No-Input
  Scenario: [Negative Test] Invalid Continue (Last Name No Input)
    Given User Is On Checkout Customer Information Page
    And User Input First name with "Junaedih"
    And User Input Last Name  with ""
    And User Input Postal Code  with "15416"
    When User click Continue button
    Then User able to see error message "Error: Last Name is required"

  @Invalid-Continue-Postal-Code-No-Input
  Scenario: [Negative Test] Invalid Continue (Postal Code No Input)
    Given User Is On Checkout Customer Information Page
    And User Input First name with "Junaedih"
    And User Input Last Name  with "Alghazali"
    And User Input Postal Code  with ""
    When User click Continue button
    Then User able to see error message "Error: Postal Code is required"

  @Invalid-Continue-All-TextBox-No-Input
  Scenario: [Negative Test] Invalid Continue (All TextBox No Input)
    Given User Is On Checkout Customer Information Page
    And User Input First name with ""
    And User Input Last Name  with ""
    And User Input Postal Code  with ""
    When User click Continue button
    Then User able to see error message "Error: First Name is required"

  @Invalid-Continue-First-Name-And-Last-Name-No-Input
  Scenario: [Negative Test] Invalid Continue (First Name & Last Name No Input)
    Given User Is On Checkout Customer Information Page
    And User Input First name with ""
    And User Input Last Name  with ""
    And User Input Postal Code  with "15416"
    When User click Continue button
    Then User able to see error message "Error: First Name is required"


  @Invalid-Continue-Last-Name-And-Postal-Code-No-Input
  Scenario: [Negative Test] Invalid Continue (Last Name & Postal Code  No Input)
    Given User Is On Checkout Customer Information Page
    And User Input First name with "Junaedih"
    And User Input Last Name  with ""
    And User Input Postal Code  with ""
    When User click Continue button
    Then User able to see error message "Error: Last Name is required"


  @Invalid-Continue-First-Name-And-Postal-Code-No-Input
  Scenario: [Negative Test] Invalid Continue (First Name & Postal Code  No Input)
    Given User Is On Checkout Customer Information Page
    And User Input First name with ""
    And User Input Last Name  with "Alghazali"
    And User Input Postal Code  with ""
    When User click Continue button
    Then User able to see error message "Error: First Name is required"

  @Group-Test-Invalid-Continue
  Scenario Outline: [Negative Test] Group Invalid Continue Proses
    Given User Is On Checkout Customer Information Page
    And User Input First name with <first_name>
    And User Input Last Name  with <last_name>
    And User Input Postal Code  with <postal_code>
    When User click Continue button
    Then User able to see error message <errorMessage>
    Examples:
      | first_name | last_name   | postal_code | errorMessage                     |
      | ""         | "Alghazali" | "15416"     | "Error: First Name is required"  |
      | "Junaedih" | ""          | "15416"     | "Error: Last Name is required"   |
      | "Junaedih" | "Alghazali" | ""          | "Error: Postal Code is required" |
      | "Junaedih" | ""          | ""          | "Error: Last Name is required"   |
      | ""         | "Alghazali" | ""          | "Error: First Name is required"  |
      | ""         | ""          | "15416"     | "Error: First Name is required"  |
      | ""         | ""          | ""          | "Error: First Name is required"  |







