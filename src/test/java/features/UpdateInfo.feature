#Author: Suresh Chary Maroju
#Keywords Summary : updateinfo

@updateinfo
Feature: Update Personal Information
  I want to update FirstName in my account

	Background: I logged in
		Given I login to AutomationPracticeShopping website
		
  @updateinfo
  Scenario: Update First Name in my account
    When I click on "View My Customer Account" CTA
    Then I should navigate to "MY ACCOUNT" page
    When I click on "MY PERSONAL INFORMATTION" CTA
    Then I should navigate to "IDENTITY" page
    When I rename first name
    And I enter password
    And I click on "Save" button on "IDENTITY" page
    Then I should see success message as "Your personal information has been successfully updated."
  