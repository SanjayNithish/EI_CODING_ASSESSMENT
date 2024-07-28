package ChatApp;

public class SendMessageCommand implements Command {
    private ChatRoomManager chatRoomManager;
    private String roomId;
    private String username;
    private String message;

    public SendMessageCommand(ChatRoomManager chatRoomManager, String roomId, String username, String message) {
        this.chatRoomManager = chatRoomManager;
        this.roomId = roomId;
        this.username = username;
        this.message = message;
    }

    @Override
    public void execute() {
        chatRoomManager.sendMessage(roomId, username, message);
    }
}
