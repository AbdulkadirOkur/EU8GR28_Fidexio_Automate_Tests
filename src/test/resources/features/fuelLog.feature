Feature: Verify that USER can create new Vehicles Fuel Logs.

  Background: User in "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager28@info.com"
    And user enters password "posmanager"
    And user clicks to login button
    And user clicks to More menu
    And user clicks to Fleet menu
    And user clicks Vehicles Fuel Logs menu
    And user clicks Create Button


  @FIDEXI-628
  Scenario Outline:Verify that PosManager can Create a new Vehicles Fuel Log with valid information
    When user enters Vehicle "<Vehicle>"
    And user enters Odometer Value <Odometer Value>
    And user enters Liter <Liter>
    And user enters Price Per Liter <Price Per Liter>
    And user enters Date "<Date>"
    And user enters Purchaser "<Purchaser>"
    And user enters Invoice Reference "<Invoice Reference>"
    And user enters Vendor "<Vendor>"
    And user clicks Save button on fuelLog page
    Then user sees "<Vehicle>" <Odometer Value> <Liter> <Price Per Liter> "<Date>" "<Purchaser>" "<Invoice Reference>" "<Vendor>" saved same as input

    Examples:
      | Vehicle             | Odometer Value | Liter | Price Per Liter | Date       | Purchaser                    | Invoice Reference | Vendor           |
      | Bmw/520ES/01adana01 | 100            | 7     | 30              | 07/15/2022 | CamptocamP, Phillipp Miller  | 1a2b3c            | @#$%&ga          |
      | Bmw/520ES/01adana01 | 120            | 8     | 30              | 06/15/2022 | &*&*)_( (copy), uyyufhg      | asdasd            | &*&*)_(, 7854422 |
      | Bmw/520ES/01adana01 | 100            | 7     | 45              | 05/15/2022 | &*&*)_(, AAAA VA             | 987987            | @#$%&            |
      | Bmw/520ES/01adana01 | 125            | 7.2   | 50              | 04/15/2022 | &*&*)_( (copy), jhgfdghjkhgg | 254asdasd         | ACD (copy)       |


  @smoke @FIDEXI-629
  Scenario: Verifying crate button work as expected
    When user enters Vehicle "Bmw/520ES/01adana01"
    And user clicks Save button on fuelLog page
    Then user sees vehicle added to page "Bmw/520ES/01adana01"



