@FIDEXI-620
Feature:Fidexio inventory feature

  Background:user login the aplication and go to inventory-product modul
   Given user is on the login page of fidexio page
   When user enters username "posmanager10@info.com"
   And user enters password "posmanager"
   And user clicks to login button
   And user clicks to inventory button
   And user clicks to products button
   Then user sees Products headline in middle top of the page

  @FIDEXI-616
  Scenario Outline:user can list product with different type
    When user click to "<list type button>"
    Then user see "<product list type>" on the page as expected
    Examples:
      | list type button | product list type |
      | previous         | previous list     |
      | next             | next list         |
      | kanban           | kanban list       |
      | list             | list              |

  @FIDEXI-611
  Scenario:user can not select the "none-blank" product type when creating a product
    When user clicks to create button
    And user clicks to product name box
    And user enter "Mountain Bike" of product
    And user clicks to product type dropdown button
    And user clicks to product type of blank
    And user clicks to save button
    Then user sees warning of The following fields are invalid: Product type on the rigt side of page

  @FIDEXI-612
  Scenario Outline:user can select product type
    When user clicks to create button
    And user clicks to product name box
    And user enter "Mountain Bike" of product
    And user clicks to product type dropdown button
    And user select to one of "<product type>"
    And user clicks to save button
    Then user see the "<product type on page>"
    Examples:
      | product type      | product type on page |
      | Consumable        | Consumable           |
      | Service           | Service              |
      | Stockable Product | Stockable Product    |

  @FIDEXI-613
  Scenario Outline:user can set sales price or cost with positive number (decimal or integer)
    When user clicks to create button
    And user clicks to product name box
    And user enter "Mountain Bike" of product
    And user clicks sales price box
    And user input sales price "<salesPrice>"
    And user click cost box
    And user set cost "<cost>"
    And user clicks to save button
    Then user sees sales price as "<displayedPrice>" and cost as "<displayedCost>"
    Examples:
      | salesPrice | cost | displayedPrice | displayedCost |
      | 50         | 30   | $ 50.00        | $ 30.00       |
      | 100        | 85.5 | $ 100.00       | $ 85.50       |
      | 99.9       | 70.5 | $ 99.90        | $ 70.50       |
      | 49.9       | 40   | $ 49.90        | $ 40.00       |
      | 0.9        | 0.5  | $ 0.90         | $ 0.50        |

  @FIDEXI-617
  Scenario Outline:user can not set sales price or cost other than numeric characters
    When user clicks to create button
    And user clicks to product name box
    And user enter "Mountain Bike" of product
    And user clicks sales price box
    And user set salesprice "<sales price>"
    And user click cost box
    And user setcost "<cost>"
    And user clicks to save button
    Then user sees "<warning>" The following fields are invalid: Sales Price or/and Cost
    Examples:
      | sales price | cost    | warning                           |
      | one hundred | 70      | The following fields are invalid: |
      | 100         | seventy | The following fields are invalid: |
      | ten         | five    | The following fields are invalid: |

  @FIDEXI-614
  Scenario Outline:user can set name and barcode with any characters (alphanumeric characters)
    When user clicks to create button
    And user clicks to product name box
    And user enter "<name>" of product
    And user clicks barcode box
    And user enter "<barcode>"
    And user clicks to save button
    Then user sees "<displayName>" and "<displayBarcode>" on the product page
    Examples:
      | name             | barcode               | displayName      | displayBarcode        |
      | bike             | 222325548662151       | bike             | 222325548662151       |
      | mountain bike    | ASDFGHJKLmnopq        | mountain bike    | ASDFGHJKLmnopq        |
      | BiKe123*         | 123-fr3255 *4866AS151 | BiKe123*         | 123-fr3255 *4866AS151 |
      | 123BikE mountain | 123 abc ABC +-*       | 123BikE mountain | 123 abc ABC +-*       |

  @FIDEXI-615 @smoke
  Scenario:user can not save product without name
    When user clicks to create button
    And user clicks to save button
    Then user sees warning of The following fields are invalid: Name

  @FIDEXI-618
  Scenario:user can set product picture
    When user clicks to create button
    And user clicks to product name box
    And user enter "Mountain Bike" of product
    And user upload product picture
    And user clicks to save button
    Then user see product picture on the product page

  @FIDEXI-619
  Scenario Outline:user can search different type of product name and found the new product in the search result
    When user clicks to create button
    And user clicks to product name box
    And user enter "Mountain Bike" of product
    And user clicks to save button
    And user clicks to products button
    And user clicks to search box
    And user enter product "<search value>" to search box
    Then user sees "<product name in search result>" on the product list
    Examples:
      | search value  | product name in search result |
      | MOUNTA??N B??KE | Mountain Bike                 |
      | mountain bike | Mountain Bike                 |
      | MouNtain      | Mountain Bike                 |
      | Bike          | Mountain Bike                 |
      | BiKe          | Mountain Bike                 |















