Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is on the DuckDuckGo home page
    When he searches for "cucumber"
    Then all the result titles should contain the word "cucumber"

  @3
  Scenario: Google
    Given user go to gmail
    When user type in google
    When user type password
