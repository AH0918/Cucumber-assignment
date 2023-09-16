Feature: Remove Apple Pencil from cart

  @RemoveApplePencil
  Scenario: Guest user adds an iPadPencil to the cart and completes checkout
    Given The user is on the Apple website homepage
    When The user searches for iPad "iPad" and click on the Apple pencil tab
    Then Click on shop button
    Then Click on Apple Pencil secondGen Buy button and click on add to bag button
    Then click on Add to bag button
    Then Click on remove button
    Then Verify that product is removed
