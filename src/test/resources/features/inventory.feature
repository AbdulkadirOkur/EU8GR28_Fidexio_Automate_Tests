Feature Fidexio inventory feature

  Background: user login the aplication and go to inventory-product modul
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button
    And user clicks to inventory button
    And user clicks to products button
    Then user sees Products headline in middle top of the page


  Scenario : user can list products with "<" button
    When user clicks to < button
    Then user sees products on the page

  Scenario: user can list products with ">" button
    When user clicks to > button
    Then user sees products on the page

  Scenario: user can list products with "kanban" button

    When user clicks to kanban button
    Then user sees products on the page as a kanban type

  Scenario: user can list products with "list" button

    When user clicks to list button
    Then user sees products on the page as a list type

  Scenario: user can not select the "none-blank" product type when creating a product

    When user clicks to create button
    And user clicks to product name box
    And user enter "name" of product
    And user clicks to product type button
    And user clicks to product type of blank
    And user clicks to save button
    Then user sees warning of The following fields are invalid: Product type on the rigt side of page

  Scenario: user can select the Consumable product type when creating a product

    When user clicks to create button
    And user clicks to product name box
    And user enter "name" of product
    And user clicks to product type button
    And user clicks to product type of consumable
    And user clicks to save button
    Then user sees the product type as Consumable

  Scenario: user can select the Service product type when creating a product

    When user clicks to create button
    And user clicks to product name box
    And user enter "name" of product
    And user clicks to product type button
    And user clicks to product type of Service
    And user clicks to save button
    Then user sees the product type as Service

  Scenario: user can select the Stockable product type when creating a product
    When user clicks to create button
    And user clicks to product name box
    And user enter "name" of product
    And user clicks to product type button
    And user clicks to product type of Stockable Product
    And user clicks to save button
    Then user sees the product type as Stockable Product

  Scenario Outline: user can set sales price or cost with positive number (decimal or integer)
    When user clicks to create button
    And user clicks to product name box
    And user enter "name" of product
    And user clicks sales price box
    And user set sales price "<sales price>"
    And user click cost box
    And user set cost "<cost>"
    And user clicks to save button
    Then user sees sales price as "<sales price>" and cost as "<cost>"

    Examples:
      | sales price | cost |
      | 50          | 30   |
      | 100         | 85.5 |
      | 99.9        | 70.5 |
      | 49.9        | 30   |
      | 0.9         | 0.5  |

  Scenario Outline: user can not set sales price or cost other than numeric characters
    When user clicks to create button
    And user clicks to product name box
    And user enter "name" of product
    And user clicks sales price box
    And user set sales price "<sales price>"
    And user click cost box
    And user set cost "<cost>"
    And user clicks to save button
    Then user sees "<warning>" The following fields are invalid: Sales Price or/and Cost

    Examples:
      | sales price | cost    | warning          |
      | one hundred | 70      | Sales Price      |
      | 100         | seventy | Cost             |
      | ten         | five    | Sales Price Cost |

  Scenario Outline: user can set name and barcode with any characters (alphanumeric characters)

    When user clicks to create button
    And user clicks to product name box
    And user enter "<name>" of product
    And user clicks barcode box
    And user enter "<barcode>"
    And user clicks to save button
    Then user sees "<name>" and "<barcode>" on the product page

    Examples:
      | name             | barcode               |
      | bike             | 112325548662151       |
      | mountain bike    | ASDFGHJKLmnop         |
      | BiKe123*         | 112-fr3255 *4866AS151 |
      | 123BikE mountain | 123 abc ABC /*-       |

    Scenario: user can not save product without name
      When user clicks to create button
      And user clicks to save button
      Then user sees warning of The following fields are invalid: Name

      Scenario: user can set product picture
        When user clicks to create button
        And user clicks to product name box
        And user enter "<name>" of product
        And user clicks to set product picture edit icon
        And user upload product picture
        And user clicks to save button
        Then user see product picture on the product page

        Scenario: user can found the new product in the search result
         When user clicks to create button
          And user clicks to product name box
          And user enter "name" of product
          And user clicks to save button
          And user clicks to search box
          And user enter product name to search box
          Then user sees product name on the product list














