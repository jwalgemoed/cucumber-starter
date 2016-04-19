Feature: Google something

  Scenario Outline: Google a value and check the results
    When I google for "<query>"
    Then I expect it to return results for "<result>"

    Examples:
      | query   | result  |
      | toeten  | toeten  |
      | bloazen | bloazen |
      | melk    | melk    |

  Scenario: Google a value and check if the result do not contain anything else
    When I google for "Something different"
    Then I expect it to not return results for "Bruce Willis"