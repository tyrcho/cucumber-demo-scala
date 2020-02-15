Feature: Basic Additions

  Background: A Calculator
    Given a reset calculator


  Scenario Outline: Simple additions
    Given I press <a>
    Given I press <b>
    When I add
    Then I get <c>

    Examples: Single digits
      | a | b | c  |
      | 1 | 2 | 3  |
      | 2 | 3 | 5 |

    Examples: Double digits
      | a  | b  | c  |
      | 10 | 25 | 35 |
      | 20 | 35 | 55 |


