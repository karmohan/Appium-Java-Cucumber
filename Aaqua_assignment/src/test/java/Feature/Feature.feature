Feature: Login to Instagram

Background: User open the Instagram app and log in
Given User open the Instagram application
When Login with Facebook account
Then User successfully logged into the app

Scenario: Edit profile option is available for user 
Given User navigates to a profile page
When Click on the edit profile option
And Click on the profile name and update the name
Then User successfully changed the profile name

Scenario: User verifies option available in the post 
Given User landed to homepage
When A user checks the options available on the home page

Scenario: User search for a person profile
Given User landed to homepage
When User navigate to the Search page Explore
And Search for a person
Then User successfully found a list of person with the same search
