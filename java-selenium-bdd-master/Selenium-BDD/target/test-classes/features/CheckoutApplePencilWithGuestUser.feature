Feature: Guest User Checkout for Apple Pencil

  @GuestApplePencil
  Scenario: Guest user adds an iPadPencil to the cart and completes checkout
    Given The user is on the Apple website homepage
    When The user searches for iPad "iPad" and click on the Apple pencil tab
    Then Click on shop button
    Then Click on Apple Pencil secondGen Buy button and click on add to bag button
    Then click on Add to bag button
    Then Click on checkout button
    Then The user selects as Guest User
    Then The user enters the shipping information and enter pincode "11001"
