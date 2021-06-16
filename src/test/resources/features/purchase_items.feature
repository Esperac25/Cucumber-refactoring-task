Feature: Purchase items 

	Scenario: Create new user
		Given the user is on the home page
		When the user creates and account
		Then the user logs in to verify their account was created
		
			
		
	Scenario: Add dress to cart
		Given the user clicks  dress tab and navigates to the dresses page
		When the user clicks a dress to add to cart
		Then the item is added to cart
		
		
	Scenario: The user checks out their cart
		Given the user clicks checkout 
		And the user clicks proceed to checkout
		Then the order confirmation page appears
