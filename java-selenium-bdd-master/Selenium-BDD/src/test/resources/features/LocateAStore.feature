Feature: Locate store using pincode

  @LocateAStore
  Scenario: Guest user adds an iPad to the cart and completes checkout
    Given The user is on the Apple website homepage
    When Click on the search icon and locate a store
    Then Select state and store
    Then Click on choose this store
