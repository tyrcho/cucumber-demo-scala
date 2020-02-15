Feature: Longer Additions

  Background: A Calculator
    Given the previous entries:
      | first | second | operation |
      | 1     | 1      | +         |
      | 2     | 1      | +         |

  Scenario Outline: Many additions
    Given I press <a>
    Given I press <b>
    When I add
    When I add
    When I add
    Then I get <c>

    Examples: Single digits
      | a | b | c  |
      | 1 | 2 | 8  |
      | 2 | 3 | 10 |
