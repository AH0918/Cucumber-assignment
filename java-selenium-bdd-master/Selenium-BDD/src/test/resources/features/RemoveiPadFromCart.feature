Feature: Remove iPad from cart

  @RemoveiPad
  Scenario: Guest user adds an iPad to the cart and completes checkout
    Given The user is on the Apple website homepage
    When The user searches for iPad "iPad" and clicked on the iPad tab
    Then Click on buy button
    And Choose product configuration of your product
    Then Clicked on Add to bag button
    Then Click on review bag button
    Then Click on remove button
    Then Verify that product is removed
