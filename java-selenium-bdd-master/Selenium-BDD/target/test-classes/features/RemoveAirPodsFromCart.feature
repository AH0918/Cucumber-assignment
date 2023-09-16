Feature: Remove AirpPods from cart

  @RemoveAirPodsFromCart
  Scenario: Guest user adds an iPad to the cart and completes checkout
    Given The user is on the Apple website homepage
    When the user clicks on the AirPods tab
    Then select AirPods second Generation
    And click on buy button
    Then click on Add To Bag button
    Then Click on remove button
    Then Verify that product is removed
