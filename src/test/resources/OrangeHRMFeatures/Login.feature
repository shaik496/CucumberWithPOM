Feature: Login feature

  @smoke
  Scenario: Login with valid credentials
    Given login into Orange Applicaiton
    When get Valid Title of page
    Then validate title of page

  @smoke
  Scenario: Login with invalid credentials
    Given login into invalid Applicaiton
    Then validate error message
  @smoke
  Scenario Outline: Login into Application
    Given I enter Username as "<userName>" and Password as "<password>"
   Examples:
      | userName | password  |
      | Admin    | admin123  |
      | Admin    | admin123  |
      | Admin    | admin1234 |
      
 Scenario: Login into ORANGE Application
    Given login into ORANGE Applicaiton
      | userName | password  |
      | Admin    | admin123  |
     