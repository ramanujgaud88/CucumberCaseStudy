Feature: Conduit CRUD Functions

Background: Login into App
Given User is on login page
When User provide "ramanujgaud88@gmail.com" and "Ramanuj@123"
Then User should be on Home page

Scenario: Create new Article
Given User should be on New Article Page
When User enters Article details
| Article Title | Desc | Content | tag |
#| Conduit Case Study | ConduitCaseStudy | This is Conduit Case Study Article | CCS |
Then Article must be created

Scenario: View Article
Given User should be on the Bloble Feed page
When User select an "Article Title"
Then Article detail page must be displayed

Scenario: Update an Article
Given Article detail page must be displayed
When User update article detail
Then Article detail must be updated

Scenario: Delete an Article
Given Article detail page must be displayed
When User delete article
Then Article must be deleted