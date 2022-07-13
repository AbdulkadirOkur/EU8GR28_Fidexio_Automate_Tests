@FIDE-JiraTestExecutionCode @smoke
Feature: Fidexio Login feature

  Background: User in "url" page
    Given user is on the login page of fidexio page

  @FIDE-JiraTestCaseCode
  Scenario Outline: Positive Login Scenarios
    When user enters username "<Username>"
    And user enters password "<Password>"
    And user clicks to login button
    Then user sees "<UserID>" in top right dropdown title


    Examples: Search values we are going to be using in this scenario is as below table
      | Username                | Password     | UserID         |
      | salesmanager28@info.com | salesmanager | salesmanager28 |
      | posmanager28@info.com   | posmanager   | posmanager28   |