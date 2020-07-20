Feature: Calculator

  Scenario Outline: Add two numbers
    Given I have calculator
    When I add <firstNumber> and <secondNumber>
    Then Result is <result>
    Examples:
      | firstNumber | secondNumber | result |
      | 100         | 200          | 300    |
      | 345         | 100          | 445    |
      | 659         | 921          | 1580   |
      | 637         | 150          | 787    |

  Scenario: Subtract to numbers
    Given  I have calculator
    When I subtract 4 and 2
    Then Result is 2