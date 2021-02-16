@Shopping
Feature: Shopping experience in AutomationPracticeShopping website
  I want Order T-Shirt and verify in Order History

  @OrderItem @non-login
  Scenario: Order T-Shirt non login scenario
    Given I navigate to AutomationPracticeShopping website
    When I click on T-SHIRTS category
    Then I should navigate to "T-SHIRTS" page
    When I mouse hover and click Add to cart button
    Then Product cart layer should be displayed
    When I click on Procced to checkout button on Product cart layer
    Then I should navigate to "SHOPPING-CART SUMMARY" page
    When I click on "Procced to checkout" button on "SHOPPING-CART SUMMARY" page
    Then I should navigate to "AUTHENTICATION" page
    When I login on AUTHENTICATION page
    Then I should navigate to "ADDRESSES" page
    When I click on "Procced to checkout" button on "ADDRESSES" page
    Then I should navigate to "SHIPPING" page
    When I click on "Procced to checkout" button on "SHIPPING" page
    Then I should navigate to "PAYMENT" page
    When I click on "Pay by bank wire" button on "PAYMENT" page
	  Then I should navigate to "ORDER SUMMARY" page
    When I click on "I confirm my order" button on "ORDER SUMMARY" page
    Then I should navigate to "ORDER CONFIRMATION" page
    And I should get order reference
    When I click on Back to orders CTA
    Then I should navigate to "ORDER HISTORY" page
    And I should see the latest order in the orders list


#
  #@OrderItem @login
  #Scenario: Order T-Shirt login scenario
  #	Given Given I navigate to AutomationPracticeShopping website
  #	When I click on Sign In CTA
  #	Then I should navigate to "AUTHENTICATION" page
    #When I login on AUTHENTICATION page
    #And I click on T-SHIRTS category
    #Then I should navigate to "T-SHIRTS" page
    #When I mouse hover and click Add to cart button
    #Then Product cart layer should be displayed
    #When I click on Procced to checkout button on Product cart layer
    #Then I should navigate to "SHOPPING-CART SUMMARY" page
    #When I click on "Procced to checkout" button on "SHOPPING-CART SUMMARY" page
    #Then I should navigate to "ADDRESSES" page
    #When I click on "Procced to checkout" button on "ADDRESSES" page
    #Then I should navigate to "SHIPPING" page
    #When I click on "Procced to checkout" button on "SHIPPING" page
    #Then I should navigate to "PAYMENT" page
    #When I click on "Pay by bank wire" button on "PAYMENT" page
#	  Then I should navigate to "ORDER SUMMARY" page
    #When I click on "I confirm my order" button on "ORDER SUMMARY" page
    #Then I should navigate to "ORDER CONFIRMATION" page
    #And I should get order reference
    #When I click on Back to orders CTA
    #Then I should navigate to "ORDER HISTORY" page
    #And I should see the latest order in the orders list
