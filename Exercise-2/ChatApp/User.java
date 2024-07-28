package ChatApp;

public class User implements UserObserver {
    private String username;
    private ChatRoom chatRoom;

    public User(String username, ChatRoom chatRoom) {
        this.username = username;
        this.chatRoom = chatRoom;
    }

    public String getUsername() {
        return username;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void sendMessage(String message) {
        chatRoom.sendMessage(new Message(username, message));
    }

    @Override
    public void update(String notification) {
        System.out.println(notification);
    }
}