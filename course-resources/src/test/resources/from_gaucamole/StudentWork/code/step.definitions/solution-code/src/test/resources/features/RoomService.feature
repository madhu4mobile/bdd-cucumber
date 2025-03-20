Feature: RoomService
  This feature verifies the functionality on Roomservice REST API

  Background: Guest has checked in
    Given the guest has checked in


  Scenario: A $2 delivery fee is added when a guest orders one steak
    When guest orders 1 steak from room service
    Then a 2 dollar delivery fee is added to the bill

  Scenario: A $2 delivery fee is added when a guest orders two steaks
    When guest orders 2 steaks from room service
    Then a 2 dollar delivery fee is added to the bill

  Scenario: When a guest orders items from room service a 10% service charge is added
    When guest orders multiple items from room service
      |T4|
      |E1|
      |M5|
      |D6|
    Then a 10% service charge will be added to the bill

  Scenario Outline:
    When Guest orders item <itemID>
    Then <amount> will be added to the bill
    Examples:
      |itemID  |amount|
      |'S1'    |9.7   |
      |'M5'    |50.4  |
      |'D6'    |14.1  |
