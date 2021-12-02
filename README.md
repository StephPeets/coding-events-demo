The purpose of this app is to provide a website where people can find events they would like to attend.

Currently, we are creating a feature to view the events as filtered by the tags class.

The following is an outline of a user class, and proposed support classes to possibly add more personalized functionalities including a user profile in the future.

## Person Class

####   a.	Fields
  
      •	id (int)
      
      •	full name (String)
      
      •	display name (String)
      
      •	city (String)
      
      •	email (String)
      
      •	password (String)
      
 #### b.	Methods
  
      •	getters for all
      
      •	setters for all (except for id)
      
      •	toString
      
      •	equals 
      
      •	hashmap


## Person Support Classes

  ####  a.	User Preferences
  
      •	Max Distance
      
        o	user selects furthest distance they can travel to events
        
      •	Remote Events
      
        o	user selects whether they would like to attend remote events
        
      •	User Interests
      
        o	user selects personal interests from list of tags and event types
        
 ####   b.	Events User Plans to Attend
  
      •	list of events user will attend
      
  ####  c.	Friends
  
      •	list of people user knows 
      
  ####  d.	Events Recommended for User
  
      •	list of events with tags that match user interests or events user friends plan to attend
      
      •	recommended events need to be within user distance range
      
  ####  e.  User Profile
  
      • displayname, city, profile picture, user interests, events user is going to attend
      

## App Classes (related to Person class)

 ####   a.	Event 
  
     • event date, time, location, description of event, type of event, tags, attendees, capacity 
     
 ####   b.	Calendar
  
     • events displayed can be filtered by date, time, location, type of event, tags, events user plans to attend, friends attending 
     
  ####  c.	Event Type
  
     • event categories/formats
     
  ####  d.	Tags (list of)
  
