
Feature: Validate Nop Commerce Login

Background: 
		Given user open URL
    When user enter valid email as "admin@yourstore.com" and password as "admin"
    And user click login button
    Then User should able to see the dashboard page
    When user click customers menulist
  	
 
 
 Scenario: Login Scenario
   	And click on to customers_role
    When user click logout button
    Then user should redirect to login page
    And user close the browser
    

@search
 Scenario: Search Customer
    And click on to customers
    Then user should see the customer page
    When user enter first name as "virat"
    And click search button
    When user click logout button
    Then user should redirect to login page
    And user close the browser
    