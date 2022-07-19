Feature: Fleet / Vehicles / Create A New Vehicle Contracts Function
  As a POSMANAGER, I should be able to create a new Vehicle Contract.

  Background: User is on the homepage
    Given user is on the login page of fidexio page
    And user enters username "posmanager28@info.com"
    And user enters password "posmanager"
    And user clicks to login button
    And user clicks on the Fleet module
    And user clicks the Vehicles Contracts
    And user clicks the Create button
    Then user lands on the Vehicles Contracts-New page

@wip
  Scenario: Verify that PosManager should be able to open the dropdown for the Vehicle
    When user clicks the Vehicle dropdown
    Then Vehicle dropdown opens

  Scenario: Verify that PosManager should be able to select and see the option as choosen one from the 'Vehicle' dropdown.
    When user selects the Opel/Astra/1-ACK-205 option
    And user clicks the save button
    Then "Opel/Astra/1-ACK-205" can be seen as choosen vehicle

  Scenario:Verify that 'Type' dropdown opens
    When user clicks the Type dropdown
    Then Type dropdown opens

  Scenario: Verify that PosManager should be able to select and see the option as choosen one from the 'Type' dropdown
    When user selects the Opel/Astra/1-ACK-205 option
    And user selects the 'Omnium' option
    And user clicks the save button
    Then user sees the 'Omnium' can be seen as choosen type

  Scenario: Verify that PosManager should be able to enter valid amount in the Activation Cost field
    When user selects the Opel/Astra/1-ACK-205 option
    And user enters the "158.00" as a valid amount in the Activation Cost field
    And user clicks the save button
    Then user sees the same amount in the Activation Cost field

  Scenario:Verify that Recurring Cost Amount dropdown opens
    When user clicks the Recurring Cost Amount dropdown
    Then recurring Cost Amount dropdown opens

  Scenario: Verify that PosManager should be able to select and see the option as choosen one from the 'Recurring Cost Amount.' dropdown
    When user selects the Monthly option from the dropdown
    Then Monthly can be seen as choosen in the Recurring Cost Amount field

  Scenario: Verify that PosManager should be able to enter valid amount in the Recurring Cost Amount field
    When user selects the Opel/Astra/1-ACK-205 option
    And user enters the "75.00" as a valid amount in the Recurring Cost Amount field
    And user clicks the save button
    Then user sees the same amount in the Recurring Cost Amount field

  Scenario: Verify that PosManager can save and see the contract that's created
    When user selects the Opel/Astra/1-ACK-205 option
    And user selects the 'Omnium' option
    And user enters the "158.00" as a valid amount in the Activation Cost field
    And user selects the Monthly option from the dropdown
    And user enters the "75.00" as a valid amount in the Recurring Cost Amount field
    And user clicks the save button
    Then the title of the page changes to the "Opel/Astra/1-ACK-205 / Omnium / 2022-06-13 - Odoo" and under the "Vehicle Contracts", the information of the vehicle-type-date is seen

  Scenario: Verify that PosManager should be able to see the contract and its details
    When user clicks the 'x' in the In Progress button
    And user clicks the created contract
    Then user sees the information he/she provided is same as the information under the contract details

  Scenario Outline: Verify that "The following fields are invalid" is displayed after typing non numeric characters into the 'Activation Cost' field
    When user selects the Opel/Astra/1-ACK-205 option
    And user enters characters other than numeric characters into the 'Activation Cost' field
    And user clicks the save button
    Then The following fields are invalid error message is displayed
    Examples:
      | 500$             |
      | One hundred Euro |
      | 5-000            |
      | 5000#            |
      | 500+100          |
      | 500(Dollars)     |

  Scenario Outline: Verify that "The following fields are invalid" is displayed after typing non numeric characters into the 'Recurring Cost Amount' field
    When user selects the Opel/Astra/1-ACK-205 option
    And user enters characters other than numeric characters into the 'Recurring Cost Amount' field
    And user clicks the save button
    Then The following fields are invalid error message is displayed
    Examples:
      | 500$             |
      | One hundred Euro |
      | 5-000            |
      | 5000#            |
      | 500+100          |
      | 500(Dollars)     |










