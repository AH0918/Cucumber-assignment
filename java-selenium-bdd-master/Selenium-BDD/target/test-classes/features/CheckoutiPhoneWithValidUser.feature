Feature: Valid User Checkout for Apple iPhone

  @UserCheckoutiPhone
  Scenario: Valid user adds an iPhone to the cart and completes checkout
    Given The user is on the Apple website homepage
    When The user searches for "iPhone" and clicked on the product tab
    Then Clicked on No trade button
    And User selected the payment option:"Buy"
    Then Clicked on Add to bag button
    And User verify the selected color "Blue"
    Then Click on review bag button
    Then The user proceeds to checkout
    
