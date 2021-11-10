$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user accesses the Find Transactions tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.the_user_accesses_the_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.clicksSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under Deposit",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.resultsTableShouldShowAtLeastOneResultUnderDeposit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under Withdrawal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.resultsTableShouldShowAtLeastOneResultUnderWithdrawal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects type \"Deposıt\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.userSelectsType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under Deposit",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.resultsTableShouldShowAtLeastOneResultUnderDeposit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show no result under Withdrawal",
  "keyword": "But "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.resultsTableShouldShowNoResultUnderWithdrawal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects type \"Wıthdrawal\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.userSelectsType(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under Withdrawal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.resultsTableShouldShowAtLeastOneResultUnderWithdrawal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show no result under Deposit",
  "keyword": "But "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.FindTransactionsDefs.resultsTableShouldShowNoResultUnderDeposit()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.zerobank.stepdefinitions.FindTransactionsDefs.resultsTableShouldShowNoResultUnderDeposit(FindTransactionsDefs.java:145)\r\n\tat ✽.results table should show no result under Deposit(file:///C:/Users/osman.toraman/IdeaProjects/zerobankautomation/src/test/resources/features/FindTransactions.feature:46)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});