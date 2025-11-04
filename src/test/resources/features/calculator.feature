# Gherkin: plain text writing scenoerios for BDD
# General definition

Feature: Calculator Operations
  As a user
  I want to perform basic arithmetic operations
  So that I can calculate values

#Specific scenerio
  #Scenario: Add two numbers
  #Given I have a calculator
  #When I add 5 and 3
  #Then the result should be 8
  #

  # Create a general reusable case
  Background:
    Given I have a calculator

  Scenario Outline: Addition
    When I add <num1> and <num2>
    Then the result should be <expected>

    Examples:
      | num1 | num2 | expected |
      |  5   |   3  |    8     |
      |  10  |   20 |   30     |



