Feature: Calendar feature
  As a Posmanager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module


  Background: User in "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager28@info.com"
    And user enters password "posmanager"
    And user clicks to login button

    @wa
  Scenario:
    When User click on calendar button
    Then Verify that user lands on weekly display

    @mami
  Scenario:
    When User click on calendar button
    And Click on day button and verify that user  on day view
    And Click on week button and verify that user on week view
    And Click on month button and verify that user on month view












