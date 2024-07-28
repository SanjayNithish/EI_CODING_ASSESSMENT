# EI_CODING_ASSESSMENT

## 1. Design patterns

## i) Behavioral Design Patterns
* Use Case 1: ***Observer Pattern***
  
   Weather Station : A weather station that notifies registered display devices (like a phone app or a weather display) when the weather changes.

   ![Screenshot 2024-07-28 164048](https://github.com/user-attachments/assets/49e0abe2-0a02-42dd-bbf6-3a2ab348a12d)

 * Use Case 2: ***Strategy Pattern***

   Payment Method : A shopping cart that allows users to choose different payment methods (Credit Card, PayPal, etc.).

   ![Screenshot 2024-07-28 164150](https://github.com/user-attachments/assets/52f1a016-f827-449c-9b8a-d179dfc35edc)

## ii) Creational Design Patterns
* Use Case 3: ***Factory Method Pattern***
  
   Shape Creation : A shape factory that creates different shapes (Circle, Rectangle) based on input.

   ![Screenshot 2024-07-28 164208](https://github.com/user-attachments/assets/defcd9f2-7809-4e7a-b933-bb86dd22972c)

 * Use Case 4: ***Singleton Pattern***

   Database Connection : A class that manages a single instance of a database connection.

   ![Screenshot 2024-07-28 164224](https://github.com/user-attachments/assets/49965865-4484-47d5-a9b1-febe5b5cf587)

## iii) Structural Design Patterns
* Use Case 5: ***Adapter Pattern***
  
   Media Player : A media player that can play different audio formats (MP3, VLC) using an adapter.

   ![Screenshot 2024-07-28 164237](https://github.com/user-attachments/assets/e32cca0d-09b8-4d8b-9dec-d74c7858e5cd)

 * Use Case 6: ***Decorator Pattern***

   Coffee Shop Order :  A coffee shop that allows customers to customize their coffee orders with different toppings and extras.

   ![Screenshot 2024-07-28 164252](https://github.com/user-attachments/assets/5a7e00e9-05bd-46c6-a52a-e483cc35ad3f)

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

## OUTPUT : 

**User 1**

![1](https://github.com/user-attachments/assets/60282356-d10c-4c17-ab84-87c0b86197cb)

![2](https://github.com/user-attachments/assets/1feec352-72ec-4a65-93d8-497c5cf68962)

![3](https://github.com/user-attachments/assets/f0e1dba7-a878-4cbf-943f-f85b4bce972f)

**User 2**

![4](https://github.com/user-attachments/assets/852d0fb7-4b14-4c00-bdad-b1c9210ac61d)

![5](https://github.com/user-attachments/assets/0a976da5-ac01-4a13-af1c-d6d5d3ede4b5)

![6](https://github.com/user-attachments/assets/f3ad876e-0a67-4637-9fac-517ceb4b99d2)

**Active Users**

![7](https://github.com/user-attachments/assets/eb034325-b7a8-42d0-a7e3-9d436729ddc5)

**Message History**

![8](https://github.com/user-attachments/assets/26736a47-56ca-438a-a6bf-e1ffa8e23246)


![9](https://github.com/user-attachments/assets/a0472cd7-d603-444e-9fca-ae321ff3498b)
