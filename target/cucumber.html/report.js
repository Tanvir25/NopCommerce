$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login_NoP.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Nop Commerce Login",
  "description": "",
  "id": "validate-nop-commerce-login",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user open URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter valid email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should able to see the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click customers menulist",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_open_URL()"
});
formatter.result({
  "duration": 2735906100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 27
    },
    {
      "val": "admin",
      "offset": 65
    }
  ],
  "location": "login.user_enter_valid_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 5577281100,
  "status": "passed"
});
formatter.match({
  "location": "login.user_click_login_button()"
});
formatter.result({
  "duration": 489254500,
  "status": "passed"
});
formatter.match({
  "location": "login.user_should_able_to_see_the_dashboard_page()"
});
formatter.result({
  "duration": 5896580000,
  "status": "passed"
});
formatter.match({
  "location": "login.user_click_customers_menulist()"
});
formatter.result({
  "duration": 2125655300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Search Customer",
  "description": "",
  "id": "validate-nop-commerce-login;search-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "click on to customers",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user should see the customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user enter first name as \"virat\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "click search button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click logout button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should redirect to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_to_customers()"
});
formatter.result({
  "duration": 409375400,
  "status": "passed"
});
formatter.match({
  "location": "login.user_should_see_the_customer_page()"
});
formatter.result({
  "duration": 2414206500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "virat",
      "offset": 26
    }
  ],
  "location": "login.user_enter_first_name_as(String)"
});
formatter.result({
  "duration": 2197597600,
  "status": "passed"
});
formatter.match({
  "location": "login.click_search_button()"
});
formatter.result({
  "duration": 2119951100,
  "status": "passed"
});
formatter.match({
  "location": "login.user_click_logout_button()"
});
formatter.result({
  "duration": 657735200,
  "status": "passed"
});
formatter.match({
  "location": "login.user_should_redirect_to_login_page()"
});
formatter.result({
  "duration": 38590700,
  "status": "passed"
});
formatter.match({
  "location": "login.user_close_the_browser()"
});
formatter.result({
  "duration": 490884000,
  "status": "passed"
});
});