@tag
Feature: AdvancedCalculator

  Scenario Outline: apply a operation to two integer numbers
    Given Two integer input values, <first> and <second>
    When I apply the operation <operation> to the two values
    Then I expect the <result>

    Examples:
      | first | second | operation | result |
      | 6     | 2      | *         | 12     |
      | -1    | 6      | *         | -6     |
      | 12    | -12    | *         | -144   |
      | -2    | -6     | *         | 12     |

      | 6     | 2      | /         | 3      |
      | 7     | 2      | /         | 3.5    |
      | 1     | 2      | /         | 0.5    |
      | 10    | 10     | /         | 1      |
      | 0     | 100    | /         | 0      |
      | 110   | 1      | /         | 110    |

      | 6     | 2      | ^         | 36     |
      | -2    | 6      | ^         | 64     |
      | -3    | 3      | ^         | -27    |
      | -1    | 6      | ^         | 1      |
      | 2     | -4     | ^         | 0.0625 |
      | 1     | -6     | ^         | 1      |
      | -5    | -2     | ^         | 0.04   |
      | -5    | -3     | ^         | -0.008 |
      | 0     | 10     | ^         | 0      |
      | 10    | 0      | ^         | 1      |
