@smoke
Feature:Basic Login features



  Scenario: Login with PosManager
    When User login as PosManager
    Then User should be able to login and see "Odoo" in title


  Scenario: Login with SalesManager
    When User login as SalesManager
    Then User should be able to login and see "Odoo" in title