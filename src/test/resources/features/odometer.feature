Feature: Verify that USER can create a new Odometer
  User Story:
  As a POSMANAGER, I should be able to create a new Odometer.


  Background: user should be able to access to the odometer page
    Given user is on the login page of fidexio page
    When user enters username "posmanager140@info.com"
    And user enters password "posmanager"
    And user clicks to login button
    And user clicks on the More menu
    And user clicks on the Fleet menu
    And user clicks on the Vehicles Odometer menu

  @wip
    Scenario:
      Given user is on the Vehicles odometer page








