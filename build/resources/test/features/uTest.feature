# Autor: José A. Santamaria F.

  @stories
  Feature: uTest
  As a web user, I want to create user on the Utest website
  @scenario1
  Scenario: Create user on the utest website
    Given that Dante wants create user on utest website and enters the page
    When he filled out the registration from on the utest website
    | strFirstName | strLastName | strEmail              | strBirthMonth | strBirthDay | strBirthYear | strLanguage | strPostalCode | strPassword | strConfirmPassword |
    | Jose         | Santamaria  | alefuedbz21@gmail.com | number:1      | number:1    | number:1996  | Spanish     | 507           | Jose210596  | Jose210596         |

    Then he verify that the user is create successfully