Feature: Login feature
  User story: User should be able to sign in using credentials
 @login
  Scenario: Login as marketing
    Given user is on the login page
    When user enters username and password
    Then user should be able to login

  @login_with_credentials
  Scenario Outline: Login with credentials, Login as<username>
    Given user is on the login page
    When user enters "<username>" username and "<password>" password
    Then user should be able to login
    Examples:
      | username                       | password |
      | helpdesk41@cybertekschool.com  | UserUser |
      | helpdesk42@cybertekschool.com  | UserUser |
      | hr41@cybertekschool.com        | UserUser |
      | hr42@cybertekschool.com        | UserUser |
      | marketing41@cybertekschool.com | UserUser |
      | marketing42@cybertekschool.com | UserUser |