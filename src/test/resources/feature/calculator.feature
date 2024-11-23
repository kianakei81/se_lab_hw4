@tag
Feature: Calculator operations
  Scenario Outline: Perform basic operations
    Given the first operand is <operand1>
    And the second operand is <operand2>
    And the operator is "<operator>"
    When the calculation is performed
    Then the result should be "<result>"

    Examples:
      | operand1 | operand2 | operator | result  |
      | 5.0      | 3.0      | +        | 8.0     |
      | 7.0      | 2.0      | -        | 5.0     |
      | 4.0      | 6.0      | *        | 24.0    |
      | 9.0      | 3.0      | /        | 3.0     |
      | 9.0      | 0.0      | /        | error   |
