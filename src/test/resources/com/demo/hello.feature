@foo
Feature: Basic Arithmetic

  Background: A Calculator
    Given a calculator I just turned on


  Scenario Outline: Many additions
    When I press <a>

  Examples: Single digits
    | a | b | c  |
    | 1 | 2 | 8  |
    | 2 | 3 | 10 |

  Examples: Double digits
    | a  | b  | c  |
    | 10 | 20 | 35 |
    | 20 | 30 | 55 |
