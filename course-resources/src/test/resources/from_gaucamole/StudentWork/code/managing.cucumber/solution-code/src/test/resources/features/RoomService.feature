Feature: RoomService
  This feature verifies the functionality on Room service application

  @REST
  Scenario: When a guest orders items from room service
    Given the guest has checked in
    When guest orders multiple items from room service
      |T4|
      |E1|
      |M5|
      |D6|
    Then a total of 88.90 will be charged

    @Web
    Scenario: When a guest orders items from room service website
      Given the guest has checked in using the website
      And navigates to Order Room Service Webpage
      When guest selects multiple items
        |T4|
        |E1|
        |M5|
        |D6|
      Then the page shows a total of "$ 88.90" to be charged