# SalesTax_CodeChallenge
Build status:  
[![Build Status](https://travis-ci.org/alvaromerino/SalesTax_CodeChallenge.svg?branch=master)](https://travis-ci.org/alvaromerino/SalesTax_CodeChallenge)

Test coverage:  
[![codecov](https://codecov.io/gh/alvaromerino/SalesTax_CodeChallenge/branch/master/graph/badge.svg)](https://codecov.io/gh/alvaromerino/SalesTax_CodeChallenge)

## PROBLEM: SALES TAXES

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.

When I purchase items I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total cost of the items, and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax.

Write an application that prints out the receipt details for these shopping baskets...


- INPUT:  
  - Input 1:  

    1 book at 12.49

    1 music CD at 14.99

    1 chocolate bar at 0.85  

  - Input 2:  

    1 imported box of chocolates at 10.00

    1 imported bottle of perfume at 47.50  

  - Input 3:  

    1 imported bottle of perfume at 27.99

    1 bottle of perfume at 18.99

    1 packet of headache pills at 9.75

    1 box of imported chocolates at 11.25  


- OUTPUT  

  - Output 1:  

    1 book : 12.49
    
    1 music CD: 16.49
    
    1 chocolate bar: 0.85
    
    Sales Taxes: 1.50
    
    Total: 29.83  

  - Output 2:  

    1 imported box of chocolates: 10.50

    1 imported bottle of perfume: 54.65
    
    Sales Taxes: 7.65

    Total: 65.15  

  - Output 3:  

    1 imported bottle of perfume: 32.19

    1 bottle of perfume: 20.89

    1 packet of headache pills: 9.75

    1 imported box of chocolates: 11.85

    Sales Taxes: 6.70

    Total: 74.68  

## Solution

- Solved using Decorator design pattern for add dynamic pricing with tax calculation
- ShoppingBasket class has a LinkedHashMap<Item, Integer> to store the items added to the basket and its amount.
- Read data from "data" folder files.
- An item is imported if contains "imported" keyword in its name.
- Exempt items are defined in Utilities class as LinkedHashMap<ItemType, Set<String>> ITEM_TYPES_BY_KEYWORDS



## Getting Started

### Prerequisites

- Java 8 (JDK)
- Maven 3


### Compile and build
```
mvn clean package
```

### Run it

We have two ways to run the program once packaged. From the project folder:

- Do not pass arguments, and the program scans and executes all cases stored in "data" folder
    ```
    java -jar target/SalesTaxCodeChallenge-1.0.jar
    ```

- Pass arguments, and the program execute all the cases passed as args.
    ```
    java -jar target/SalesTaxCodeChallenge-1.0.jar 001.txt 002.txt 003.txt
    ```

## Running the tests

From the project folder:
```
mvn clean test
```
