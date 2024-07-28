package ChatApp;

import java.util.*;

public class ChatRoomManager {
    private static ChatRoomManager instance;
    private Map<String, ChatRoom> chatRooms;

    private ChatRoomManager() {
        chatRooms = new HashMap<>();
    }

    public static ChatRoomManager getInstance() {
        if (instance == null) {
            instance = new ChatRoomManager();
        }
        return instance;
    }

    public void createChatRoom(String roomId) {
        if (!chatRooms.containsKey(roomId)) {
            chatRooms.put(roomId, new ChatRoom(roomId));
            System.out.println("Chat room " + roomId + " created.");
        } else {
            System.out.println("Chat room " + roomId + " already exists.");
        }
    }

    public void joinChatRoom(String roomId, String username) {
        ChatRoom chatRoom = chatRooms.get(roomId);
        if (chatRoom != null) {
            User user = new User(username, chatRoom);
            chatRoom.addUser(user);
            System.out.println(username + " joined chat room " + roomId);
        } else {
            System.out.println("Invalid room name. Please enter a valid room ID.");
        }
    }

    public void sendMessage(String roomId, String username, String message) {
        ChatRoom chatRoom = chatRooms.get(roomId);
        if (chatRoom != null) {
            Message msg = new Message(username, message);
            chatRoom.sendMessage(msg);
        } else {
            System.out.println("Invalid room name. Please enter a valid room ID.");
        }
    }

    public void getMessageHistory(String roomId) {
        ChatRoom chatRoom = chatRooms.get(roomId);
        if (chatRoom != null) {
            List<Message> messageHistory = chatRoom.getMessageHistory();
            System.out.println("Message history for " + roomId + ":");
            for (Message message : messageHistory) {
                System.out.println(message.getUsername() + ": " + message.getContent());
            }
        } else {
            System.out.println("Invalid room name. Please enter a valid room ID.");
        }
    }

    public void getActiveUsers(String roomId) {
        ChatRoom chatRoom = chatRooms.get(roomId);
        if (chatRoom != null) {
            List<String> activeUsers = chatRoom.getActiveUsers();
            System.out.println("Active users in " + roomId + ":");
            for (String user : activeUsers) {
                System.out.println(user);
            }
        } else {
            System.out.println("Invalid room name. Please enter a valid room ID.");
        }
    }

    public ChatRoom getChatRoom(String roomId) {
        return chatRooms.get(roomId);
    }
}