@FIDEXI-541
Feature: Create A New Vehicle Costs Feature

  Background: user is on the home page.
    Given user is logged in

    @FIDEXI-588
  Scenario: Verify that user should be able to land on 'Fleet' page.
    When user clicks on Fleet option
    Then user should land on Fleet option successfully

  @FIDEXI-589
  Scenario: Verify that 'Vehicle Costs' option is opened
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    Then Vehicle costs page should be opened

  @FIDEXI-590
  Scenario: Verify that user lands on 'Cost Detail' page after clicking 'Create' button
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    Then user should land on Cost Details page

  @FIDEXI-591
  Scenario:  Verify that any vehicle can be selected below 'Vehicle' dropdown.
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    And  user clicks on Vehicle dropdown
    And  user selects a Vehicle from the dropdown option
    Then the vehicle should be selected

  @FIDEXI-592
  Scenario: Verify that a vehicle can be selected below 'Type' dropdown.
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    And  user selects a Type from the TypeDropdown option
    Then the type should be selected

  @FIDEXI-593
  Scenario Outline: Verify that user able to input numeric characters into the 'Total Price' field.
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    And  user clicks on Vehicle dropdown
    And  user selects a Vehicle from the dropdown option
    And  user selects a Type from the TypeDropdown option
    And  user enters "<numeric characters>" into the Total Price field
    Then user should enter numeric characters for Total Price field
    Examples:
      | numeric characters |
      | 10000              |
      | 10000.00           |
      | 10,000             |
      | 123456789          |
      | 10,000.00          |

  @FIDEXI-594
  Scenario Outline: Verify that "The following fields are invalid" is displayed after typing non numeric
  characters into 'Total Price' field and saving.
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    And  User enters "<non-numeric characters>" into the Total Price field
    Then The following fields are invalid should be displayed
    Examples:
      | non-numeric characters |
      | 500$                   |
      | One hundred Euro       |
      | 5-000                  |
      | 5000#                  |
      | 500+100                |

  @FIDEXI-595
  Scenario:  Verify that 'Date' calendar dropdown is opened and any date can be selected.
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    And  user clicks any Date from the calendar
    Then user should click option for Date

  @FIDEXI-596
  Scenario: Verify that user should be able to input any character on cost descriptions field.
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    And  user inputs any character on cost descriptions field
    Then User should input any character on cost descriptions field

  @FIDEXI-597
  Scenario Outline: Verify that user should be able to save new vehicle costs.
    When user clicks on Fleet option
    And  user clicks on Vehicle Costs option
    And  user clicks on Create button
    And  user clicks on Vehicle dropdown
    And  user selects a Vehicle from the dropdown option
    And  user selects a Type from the TypeDropdown option
    And  user enters "<numeric characters>" into the Total Price field
    And  user clicks any Date from the calendar
    And  user inputs any character on cost descriptions field
    And  user clicks save button
    Then user should see the created vehicle costs saved same as inputs
    Examples:
      | numeric characters |
      | 10000              |