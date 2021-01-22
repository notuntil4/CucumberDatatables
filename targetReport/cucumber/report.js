$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Submit user information via contact us form",
  "description": "",
  "id": "submit-user-information-via-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6046583295,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Submit valid data via contact us form",
  "description": "",
  "id": "submit-user-information-via-contact-us-form;submit-valid-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I access webdriveruniversity.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the contact us button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid first name",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter a valid last name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter comments",
  "rows": [
    {
      "cells": [
        "Hello World",
        "Au revoir"
      ],
      "line": 10
    },
    {
      "cells": [
        "Hasta la Vista",
        "Bye Bye Bye"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The information should be successfully submitted via contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.i_access_webdriveruniversity_com()"
});
formatter.result({
  "duration": 816829916,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_click_on_the_contact_us_button()"
});
formatter.result({
  "duration": 150781542,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_first_name()"
});
formatter.result({
  "duration": 496255022,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_last_name()"
});
formatter.result({
  "duration": 44880992,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_email_address()"
});
formatter.result({
  "duration": 43359184,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_comments(DataTable)"
});
formatter.result({
  "duration": 81495132,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 36471911,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_information_should_be_successfully_submitted_via_contact_us_form()"
});
formatter.result({
  "duration": 55540,
  "status": "passed"
});
});