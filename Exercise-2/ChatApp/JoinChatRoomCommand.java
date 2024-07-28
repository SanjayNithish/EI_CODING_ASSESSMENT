package ChatApp;

public class JoinChatRoomCommand implements Command {
    private ChatRoomManager chatRoomManager;
    private String roomId;
    private String username;
    private User user;

    public JoinChatRoomCommand(ChatRoomManager chatRoomManager, String roomId, String username) {
        this.chatRoomManager = chatRoomManager;
        this.roomId = roomId;
        this.username = username;
    }

    @Override
    public void execute() {
        ChatRoom chatRoom = chatRoomManager.getChatRoom(roomId);
        if (chatRoom != null) {
            user = new User(username, chatRoom);
            chatRoom.addUser(user);
            System.out.println(username + " joined chat room " + roomId);
        } else {
            System.out.println("Invalid room name. Please enter a valid room ID.");
        }
    }

    public User getUser() {
        return user;
    }
}