Feature: Fidexio Employee Module Functionality

  User Story | AC #1 | Description: As a Pos Manager, i should be able to create and edit a new employee from "Employees" module.

  AC #1. Verify that all buttons work as expected at the employees stage
  AC #2. Verify that the "Employee created" message appears under full profile.
  AC #3. Verify that the user should be able to see created employee is listed after clicking the Employees module.

  Background: Pos Manager logs into the application and clicks on the Employees module.
    Given Pos Manager logged in to the homepage and clicked on the Employees module

  Scenario: TC-001 | AC #1 | Verify that the "Create" button in the "Employees" stage works as expected.
    When Pos Manager click on the Create button
    Then Pos Manager should be able to land on the new employee information page

  Scenario: TC-002 | AC #1 | Verify that the "import" button in the "Employees" stage works as expected.
    When Pos Manager click on the import button
    Then Pos Manager should be able to land on the import a File page

    @wip
  Scenario: TC-003 | AC #1 | Verify that the "Left Arrow - (<)" button works as expected at the "Employees" stage.
    When Pos Manager click on the Left Arrow - (<) button
    Then PosManager should be able to click on the Left Arrow - (<) button.

  Scenario: TC-004 | AC #1 | Verify that the "Right Arrow - (>)" button works as expected at the "Employees" stage.
    When Pos Manager click on the Right Arrow - (>) button.
    Then Pos Manager should be able to click on the Right Arrow - (>) button.

  Scenario: TC-005 | AC #1 | Verify that the "Kanban" button works as expected at the "Employees" stage.
    When Pos Manager click on the Kanban button
    Then Pos Manager should be able to click on the Kanban button and should see the list of items in the Kanban style

  Scenario: TC-006 | AC #1 | Verify that the "List" button works as expected at the "Employees"stage.
    When Pos Manager click on the List button
    Then Pos Manager should be able to click on the List button and should see the list of items in the List style

  Scenario: TC-007 | AC #2 | Verify that the "Employee created" message appears under full profile.
    When Pos Manager click on the Create button
    And Pos Manager enters employee credentials
    And Pos Manager click on the Save button
    Then PosManager should be able to click on the Save button and should be able to create a new Employee id with the Employee created message

  Scenario: TC-008 | AC #03 | Verify that the user should be able to see created employee is listed after clicking the Employees module.
    When PosManager click on Employees button
    Then PosManager should be able to land on the Employees stage and should be able to see the created employee listed after clicking the Employees module

