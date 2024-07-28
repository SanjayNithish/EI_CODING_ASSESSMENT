package ChatApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatRoom {
    private String roomId;
    private Map<String, User> users;
    private List<Message> messageHistory;

    public ChatRoom(String roomId) {
        this.roomId = roomId;
        this.users = new HashMap<>();
        this.messageHistory = new ArrayList<>();
    }

    public String getRoomId() {
        return roomId;
    }

    public void addUser(User user) {
        users.put(user.getUsername(), user);
        notifyUsers(user.getUsername() + " has joined the room.");
    }

    public void removeUser(User user) {
        users.remove(user.getUsername());
        notifyUsers(user.getUsername() + " has left the room.");
    }

    public void sendMessage(Message message) {
        messageHistory.add(message);
        notifyUsers(message.getUsername() + ": " + message.getContent());
    }

    public List<String> getActiveUsers() {
        return new ArrayList<>(users.keySet());
    }

    public List<Message> getMessageHistory() {
        return new ArrayList<>(messageHistory);
    }

    private void notifyUsers(String notification) {
        for (User user : users.values()) {
            user.update(notification);
        }
    }
}