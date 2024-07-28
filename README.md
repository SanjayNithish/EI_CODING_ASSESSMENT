# EI_CODING_ASSESSMENT

## 1. Design patterns

## i) Behavioral Design Patterns
* Use Case 1: ***Observer Pattern***
  
   Weather Station : A weather station that notifies registered display devices (like a phone app or a weather display) when the weather changes.

 * Use Case 2: ***Strategy Pattern***

   Payment Method : A shopping cart that allows users to choose different payment methods (Credit Card, PayPal, etc.).

## ii) Creational Design Patterns
* Use Case 3: ***Factory Method Pattern***
  
   Shape Creation : A shape factory that creates different shapes (Circle, Rectangle) based on input.

 * Use Case 4: ***Singleton Pattern***

   Database Connection : A class that manages a single instance of a database connection.

## iii) Structural Design Patterns
* Use Case 5: ***Adapter Pattern***
  
   Media Player : A media player that can play different audio formats (MP3, VLC) using an adapter

 * Use Case 6: ***Decorator Pattern***

   Coffee Shop Order :  A coffee shop that allows customers to customize their coffee orders with different toppings and extras.

## 2. Mini-Project

## Project 5: Real-time Chat Application Programming Exercise

### Problem Statement

Create a simple real-time chat application where users can join different chat rooms or create their own chat rooms. Users should be able to
send and receive messages in real-time.

### Features

* Users can create or join chat rooms.
* Users can send messages in real-time.
* Users can view active members in the chat room.
* Users can view the message history of the chat room.

## Classes Used in the Chat Application
***ChatApplication***  :  The main entry point of the application that handles user input and manages the overall flow of the chat application.

***ChatRoom***  :  Represents a chat room where users can join, send messages, and view message history.

***ChatRoomManager***  :  A singleton class that manages the state of chat rooms, allowing users to create, join, and interact with chat rooms.

***Command***  :  An interface that defines a method for executing commands.

***CreateChatRoomCommand***  :  A command class that handles the creation of a new chat room.

***JoinChatRoomCommand***  :  A command class that manages the process of a user joining a chat room.

***SendMessageCommand***  :  A command class that handles sending messages within a chat room.

***GetMessageHistoryCommand***  :  A command class that retrieves the message history for a specific chat room.

***GetActiveUsersCommand***  :  A command class that retrieves the list of active users in a chat room.

***ExitCommand***  :  A command class that handles exiting the application.

***Message***  :  Represents a message sent by a user, containing the username and the message content.

***User***  :  Represents a user in the chat application, allowing them to send messages and receive notifications.

***UserObserver***  :  An interface that defines the method for receiving notifications about changes in the chat room.

***CommandInvoker***  :  A class that executes commands and maintains a history of executed commands.
