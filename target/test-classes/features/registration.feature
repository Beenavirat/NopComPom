  Feature: User  should able to register successfully.so that he can use all other features from our website.

    @test
    Scenario: User should able to register
      Given  User is on register page
      When User enters all registration details
      And User clicks on register button
      Then User should be able to register successfully
      Examples:

