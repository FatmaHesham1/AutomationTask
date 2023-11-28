@smoke
Feature: F02_Login | users could login with existing account

  Scenario Outline: user could login with valid email and password
    Given user is on Jumia Website
    When user click on account tab then choose signIn
    And user enter "<email>"
    And user enter password "<password>"
    And user hover on supermarket item then click on bakery
    And user add two items to the cart
    Then verify that items and prices are successfully added

      Examples:
      | email                  |  password       |
      | Jumiatest300@gmail.com    | P@ssw0rd&&&    |
