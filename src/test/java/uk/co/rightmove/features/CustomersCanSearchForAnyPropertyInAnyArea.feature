Feature: Search Functionalities
  As a user
  I want to be able to search for any property
  So that i can purchase it

Scenario Outline: Users can search for a property
  Given  I navigate to homepage
  When I enter "<Location>" into the search field
  And I click on For Sale button
  And I select radius "<Radius>" of the location
  And minimum price range of "<MinPrice>"
  And maximum price range of "<MaxPrice>"
  And I select "<MinBed>" as the minimum number of bed
  And I select "<MaxBed>" as the maximum number of bed
  And I select "<Houses>" as the property type
  And I select "<AddedToSite>" as added to site option
  And I ensure that search result page is displayed
  And I click on the second result
  Then the details of the property is displayed

  Examples: Test data for different properties
    | Location   | Radius          | MinPrice | MaxPrice | MinBed | MaxBed | Houses | AddedToSite   |
    | Manchester | Within 10 miles | 125,000  | 250,000  | 2      | 4      | Houses | Last 7 days   |
    | London     | Within 1 mile   | 250,000  | 500,000  | 2      | 4      | Houses | Last 24 hours |