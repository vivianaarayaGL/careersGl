$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('carreersTab/careerTab.feature');
formatter.feature({
  "line": 1,
  "name": "Navigate to careers tab",
  "description": "",
  "id": "navigate-to-careers-tab",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open careers tab",
  "description": "",
  "id": "navigate-to-careers-tab;open-careers-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Gorilla Logic page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Careers Tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Careers page is showed up",
  "keyword": "Then "
});
formatter.match({
  "location": "careerTab.iAmOnGorillaLogicPage()"
});
formatter.result({
  "duration": 9865215507,
  "status": "passed"
});
formatter.match({
  "location": "careerTab.iClickOnCareersTab()"
});
formatter.result({
  "duration": 6231700212,
  "status": "passed"
});
formatter.match({
  "location": "careerTab.careersPageIsShowedUp()"
});
formatter.result({
  "duration": 8470771,
  "status": "passed"
});
});