@Checkout-Complete
Feature: Checkout Complete

@Checkout-Complete-And-Back-to-Homepage
  Scenario: Checkout Complete And Back to Homepage
    Given User Is On Checkout_Complete Page
    When User Click Back Home Button
    Then User Is Redirect to Home_Page

