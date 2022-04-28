Feature: To check the Hotel Booking Functionality of Adactin

@login
Scenario:  login the Adactin hotel booking
Given  user navigate the login page
When  user enter the valid username and password
Then  Then clicks the lgin button

@searching
Scenario: Select the mandatory fields for Hotel Booking
Given User select the location in location Field
When User select the Hotel in Hotel Field
And User select the room type in room type Field
And User select the Number of Rooms in Number of Rooms Field
And User select the Check in date in Check in date Field
And User select the Check out date in Check out date Field
And User select the Adult per room in Adults per room Field
And User select the Childrens per room in Childrens per room Field
Then clicks the Search Button
Then clicks Hotels deatils radio button
Then clicks the continue button

@booking
Scenario: Select the valid user details to Booking hotel
Given User enter the first and last name
When User enter the Adress
And User enter the Credit card deatils
And User enter the Credit card type
And User Select Expiry month and Expiry Year
And User Enter the cvv number
Then clicks the booknow Button
Then Clicks the itinerary Button

@itinerary
Scenario: Take the Screenshot and cancel the unwanted booking details
Given User take the screenshot for booking details
Then Clicks the cancel selected
And user Take the Screenshot for cancelled selected
Then clicks the logout button
