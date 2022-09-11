	Feature: Need Help page functionality

  @Regression
  Scenario: Verify Need Help Page functionality
    Given user verifies Hudl page
    When user clicks on "Login" button
		When user clicks on "Need Help"
		When user enters "invalid" email id
		When user clicks on "SendPasswordReset" button
		Then user verifies error message
		When user enters "valid" email id
		When user clicks on "SendPasswordReset" button
		Then user verifies success message
    
  