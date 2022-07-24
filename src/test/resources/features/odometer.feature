@FIDEXI-553
Feature: Verify that USER can create a new Odometer
  User Story:
  As a POSMANAGER, I should be able to create a new Odometer.

  #@FIDEXI-550
  Background:
    Given user is on the login page of fidexio page
    When user enters username "posmanager140@info.com"
    And user enters password "posmanager"
    And user clicks to login button
    And user clicks on the More menu
    And user clicks on the Fleet menu
    And user clicks on the Vehicles Odometer menu

  @FIDEXI-551
  Scenario Outline: Verify that PosManager can create a new  Odometer with valid information
    Given user is on the Vehicles odometer page
    When user clicks the Create Button
    And user enters the "<Vehicle>" as Vehicle
    And user enters the <Odometer Value> as Odometer Value
    And user enters the "<Date>" as Date
    And user clicks on the Save button
    Then user should be able to see the "<Vehicle>", <Odometer Value>, "<Date>" as same as the entered input
    Examples:
      | Vehicle                    | Odometer Value | Date       |
      | Mercedes/Class A/1-MER-001 | 150            | 07/21/2022 |
      | Opel/Corsa/1-SYN-404       | 250            | 12/11/2021 |
      | Bmw/520ES/111              | 2563           | 05/13/2022 |
      | Audi/A1/1-AUD-001          | 1000           | 02/08/2022 |

  @FIDEXI-552
  Scenario Outline: Verify that PosManager can not create a new Odometer with invalid information
    Given user is on the Vehicles odometer page
    When user clicks the Create Button
    And user enters the "<Vehicle>" as invalid Vehicle
    And user enters the "<Odometer Value>" as Odometer Value
    And user enters the "<Date>" as Date
    And user clicks on the Save button
    Then user should be able to see the "<Error Message>" on the screen
    Examples:
      | Vehicle              | Odometer Value | Date       | Error Message  |
      | Dogan SLX            | 240            | 07/21/2022 | Vehicle        |
      | Opel/Corsa/1-SYN-404 | jasdlf         | 08/04/2022 | Odometer Value |