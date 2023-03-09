@Continue-to-Step-Checkout
Feature: Continue to Step Checkout Complete

  @Continue-to-Step-Checkout-Complete
  Scenario: Continue to Step Checkout Complete
  Given User Is On Checkout Overview Page
  When User Click Finish Button
  Then User Is On Checkout Complete Page

  @Cancel-to-Step-Checkout-Complete-And-Back-to-Homepage
  Scenario: Cancel (Back to Homepage) No Continue To Step Checkout Complete
    Given User Is On Checkout Overview Page
    When User Click Cancel_Button
    Then User Is Redirect To Homepage
