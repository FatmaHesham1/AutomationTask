@smoke
Feature: F01_Register | users can create new accounts

  Scenario Outline: user could register with all valid data successfully
    Given user is on Jumia Website
    When user click on account tab then choose signIn
    And user enter "<email>"
    And user fill "<password>"
    And user confirm password "<confirmPassword>"
    And user type firstname "<firstName>"
    And user entered lastname "<lastName>"
    And user enter phone number "<phoneNumber>"
    And user select "<gender>"
    And user select DOB
    And user accept terms and conditions then continue
    Then user registered successfully "<firstName>"

    Examples:
      | email                  | firstName  | lastName   |  password       | confirmPassword   | phoneNumber | gender |
      | Jumiatest300@gmail.com   | automation | tester     | P@ssw0rd&&&     | P@ssw0rd&&&       | 1155508342  | female |
      | Jumiatest400@gmail.com   | jumia      | testerdemo  | 123Password??  | 123Password??     | 1155508342  | male   |