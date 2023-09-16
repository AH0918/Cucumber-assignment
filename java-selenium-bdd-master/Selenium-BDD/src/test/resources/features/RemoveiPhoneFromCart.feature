Feature: Remove the iPhone from cartpage

  @RemoveIphone
  Scenario: Guest user adds an iPhone to the cart and removed successfully
    Given The user is on the Apple website homepage
    When The user searches for "iPhone" and clicked on the product tab
    Then Clicked on No trade button
    And User selected the payment option:"Buy"
    Then Clicked on Add to bag button
    And User verify the selected color "Blue"
    Then Click on review bag button
    Then Verify added product into the cart page is "iPhone 14" and the color is "Blue"
    Then Click on remove button
    Then Verify that product is removed
