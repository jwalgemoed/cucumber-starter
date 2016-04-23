@google # this annotation can be used to run all tests in this feature
Feature: A couple of test scenario's to demonstrate a Cucumber test

  As a user
  I want to be able to google
  In order to find the results I am looking for

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

  @skip # This scenario will be skipped because it is annotated with @skip
  Scenario: This is not yet implemented
    When I want to google something
    Then I expect a certain number of results
