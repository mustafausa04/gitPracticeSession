@dashboardTests
Feature: Dashboard home page

Background:
   Given As an entity user, I am logged in
   
   @SalesandExpensesHeader
   Scenario: As a user when I log in, I should be on the dashboard page and see the header sales and expenses
   Then I should be on the Dasboard home page
   And I should see the header "Sales & Expenses"
   
   @dashboardButtons
   Scenario: As a user when I log in, I should see the four buttons
   Then I should be on the Dashboard home page
   And I should see the buttons "Amount Due", "Customers", "Invoices", and "Estimates"