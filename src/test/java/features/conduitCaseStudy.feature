Feature: Conduit Case Study

Scenario: User Login
Given User is on login page
When User Enters user credentials "ramanujgaud88@gmail.com" and "Ramanuj@123"
Then Conduit homepage should open

Scenario: Click on new article button
Given User is on Home page
When User click on new article button
Then Editor should displayed

Scenario: Edit new Article
Given User is on article editor page
When User add the article Details
| Article Title | About Info | Article Content | Tags |
| Conduit Case Study | ConduitCaseStudy | This is Conduit Case Study Article | CCS |
And publish article
Then Article should get created with the article Title

Scenario: Edit Article
Given User is on article page
When User clicks on edit article button
And User make change in article Title info "Changed Conduit Case Study"
And User clicks on update article button
Then Article should get updated with the updated title 