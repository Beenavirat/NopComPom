$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "User  should able to register successfully.so that he can use all other features from our website.",
  "description": "",
  "id": "user--should-able-to-register-successfully.so-that-he-can-use-all-other-features-from-our-website.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14318423000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to register",
  "description": "",
  "id": "user--should-able-to-register-successfully.so-that-he-can-use-all-other-features-from-our-website.;user-should-able-to-register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on register page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters all registration details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on register button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to register successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 152200,
  "status": "passed"
});
});