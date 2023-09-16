Feature: Guest User Checkout for HomePod

  @HomePodWithGuest
  Scenario: Guest user adds an iPad to the cart and completes checkout
    Given The user is on the Apple website homepage
    When the user clicks on the TV and Home tab
    Then select HomePod from the options
    And click on buy button
    Then select color
    Then scroll and click on Add To Bag button
    Then Click on review bag button
    Then click on Checkout button
    Then click on Continue As Guest
    Then The user enters their shipping information and enter pincode "11001"
 
