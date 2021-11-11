$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Account Activity Titles",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.theUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Account Activity",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityDefs.theUserClicksAccountActivity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page should have the title \"Zero - Account Activity\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryDefs.pageShouldHaveTheTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the account dropdown default option should display savings",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityDefs.theAccountDropdownDefaultOptionShouldDisplaySavings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Account dropdown should be verify",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityDefs.theAccountDropdownShouldBeVerify(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Transactions titles should be verify",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityDefs.transactionsTitlesShouldBeVerify(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});