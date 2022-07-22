Feature: Fidexio Employee Module Functionality

  User Story | Description: As a Posmanager, I should be able to create and edit a new employee from "Employees" module.

  AC #1. Verify that all buttons work as expected at the employees stage
  AC #2. Verify that the "Employee created" message appears under full profile.
  AC #3. Verify that the user should be able to see created employee is listed after clicking the Employees module.

  Background: Pos Manager logs into the application and clicks on the Employees module.
    Given Pos Manager logged in to the homepage and clicked on the Employees module

  Scenario: TC-001 | Verify that the "Create" button in the "Employees" stage works as expected.
    When Pos Manager click on the Create button
    Then Pos Manager should be able to land on the new employee information page

  Scenario: TC-002 | Verify that the "Import" button in the "Employees" stage works as expected.
    When Pos Manager click on the Import button
    Then Pos Manager should be able to land on the Import a File page

  @wip
  Scenario: Verify that the "Left Arrow - (<)" button works as expected at the "Employees" stage.
    When Pos Manager click on the Left Arrow - (<) button
    Then PosManager should be able to click on the Left Arrow - (<) button.

  @wip
  Scenario: Verify that the "Right Arrow - (>)" button works as expected at the "Employees" stage.
    When Pos Manager click on the Right Arrow - (>) button.
    Then Pos Manager should be able to click on the Right Arrow - (>) button.

