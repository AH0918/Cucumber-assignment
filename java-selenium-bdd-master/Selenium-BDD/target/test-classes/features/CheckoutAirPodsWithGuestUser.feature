Feature: Guest User Checkout for AirPods

  @AirPodsWithGuest
  Scenario: Guest user adds an iPad to the cart and completes checkout
    Given The user is on the Apple website homepage
    When the user clicks on the AirPods tab
    Then select AirPods second Generation
    And click on buy button
    Then click on Add To Bag button
    Then click on Checkout button
    Then click on Continue As Guest
    Then The user enters their shipping information and enter pincode "11001"
 
