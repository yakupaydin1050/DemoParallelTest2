@smoke
Feature: go to the home page

  Scenario Outline:
    Given go to demo blaze home page
    And login the demo blaze home page "<username>" "<password>"

    Examples:
      | username | password |
      | username | password |
      | aydin    | aydin    |