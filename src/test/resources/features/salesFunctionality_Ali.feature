Feature: Fidexio Sales Manager functionality
  User Story: As a Sales Manager, I should be able to create and edit a new customers from "Sales" module.


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page of fidexio page
    When user enters username "salesmanager28@info.com"
    And user enters password "salesmanager"
    And user clicks to login button
    And user clicks Sales module button
    And user should be able to see Customers button on left and click

  @FIDEXI-555 @smoke
  Scenario: "Create" button works as expected at the Customer design stage verification
    When user clicks on Create button
    Then user sees the title as New Odoo

  @FIDEXI-556
  Scenario: "Import" button works as expected at the Customer design stage verification
    When user clicks on Import button
    Then user sees the title as Import a file Odoo
  @FIDEXI-557
  Scenario: "Right Arrow" button works as expected at the Customer design stage verification
    When user clicks on Right Arrow button
    Then pager value changes to next numbers
  @FIDEXI-558
  Scenario: "Left Arrow" button works as expected at the Customer design stage verification
    When user clicks on Left Arrow button
    Then pager value changes to previous numbers
  @FIDEXI-559
  Scenario: "Kanban" button works as expected at the Customer design stage verification
    When user clicks on Kanban button
    Then page changes to Kanban format

  @FIDEXI-560
  Scenario: "List" button works as expected at the Customer design stage verification
    When user clicks on List button
    Then page changes to List format

  @FIDEXI-561
  Scenario: Sales Manager should be able to  create "Individual" customer
    When user clicks on Create button
    And user clicks on individual radio button
    And user clicks on blank and enters name
    And user clicks on Address blanks and enters address info
    And user clicks on TIN blank and enters info
    And user clicks on job position and enters info
    And user clicks on phone blank and enters number
    And user clicks on mobile and enters number
    And user clicks on email and enters email
    And user clicks on website and enters website info
    And user clicks on title and enters title info
    Then user clicks on Save button
  @FIDEXI-562
  Scenario: Sales Manager should be able to  view created "Individual" customer
    When user enters Individual customer name to search and clicks search button
    Then user sees the customer


  @FIDEXI-563
  Scenario: Sales Manager should be able to see the created "Company" customer is listed after clicking
  the Customer module verification

    When user clicks on Create button
    And  user clicks on company radio button
    And user clicks on blank and enters name
    And user clicks on Address blanks and enters address info
    And user clicks on TIN blank and enters info
    And user clicks on phone blank and enters number
    And user clicks on mobile and enters number
    And user clicks on email and enters email
    And user clicks on website and enters website info
    Then user clicks on Save button
  @FIDEXI-564
  Scenario: Sales Manager should be able to  view created "Company" customer
    When user enters Company customer name to search and clicks search button
    Then user sees the customer


