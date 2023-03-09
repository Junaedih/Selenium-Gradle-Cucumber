@Cart
Feature: Cart

  @Cart-Continue-Step-Checkout
  Scenario: Continue to step checkout product from cart page
    Given : user is on cart page and already added product
    When user click checkout button
    Then user is on checkout_your_information page

@Cart-Back-To-HomePage-Continue-Shopping
  Scenario: Continue Shopping (back to homepage) from cart page
    Given : user is on cart page and already added product
    When user click continue_shopping button
    Then user back to list products page


