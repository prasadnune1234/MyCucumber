
@BookFlightAndHotelTickets
Feature: Vacation Trip to Goa
  I want to buy flight tickets and book a hotel
  
  Background:
   Given I Live in Mumbai
    And I work for an MNC
    And we are around 3 Members  
    |Adult1|Adult2|Adult3|
    |A     |B     |  C   |
    |20    |30    | 40   | 
  
  @BookflightTickets
  Scenario: Booking flight tickets to Goa
   
    And we want to book from 29th Feb 2020 to 3rd March 2020
    When I open the travel website
    And search for flights to Goa
    Then I should be able to book the tickets within the budget of 19199 INR
    But all of my team members should be accommodated in the same flight

 @BookHotelTickets
  Scenario Outline: Booking Hotel tickets to Goa
  
    And we would like to stay from <FromDate>
    And would like to leave <Destination> on <ToDate>
    
    Examples:
    |Destination |FromDate       |ToDate        |
    |Goa         |1st March 2020 |3rd March 2020|
    |Hyderabad   |3rd March 2020 |4th March 2020|
    |Rajahmundry |5th March 2020 |8th March 2020|
 
