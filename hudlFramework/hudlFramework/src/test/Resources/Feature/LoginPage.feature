Feature: Login Page Check

        @Regression
        Scenario Outline: Verify Invalid credentials
            Given user verifies Hudl page
             When user clicks on "Login" button
             When user enters "<username>" and "<password>"
             When user clicks on "Login" button
             Then user verifies invalid credentials message
        Examples:
                  | username                 | password |
                  | abc@gmail.com            | abc      |
                  | Kirtijoshijobs@gmail.com | abc      |

        @Regression
        Scenario Outline: Verify login with valid credentials
            Given user verifies Hudl page
             When user clicks on "Login" button
             When user enters "<username>" and "<password>"
             When user clicks on "Login" button
             Then user verifies successful login
        Examples:
                  | username | password |
                  


        @Regression
        Scenario: Verify login with an organization
            Given user verifies Hudl page
             When user clicks on "Login" button
             When user clicks on "LoginWithAnOrganization" button
             When user enters "valid" email id
             When user clicks on "Login" button
             Then user verifies login with an organization error message
