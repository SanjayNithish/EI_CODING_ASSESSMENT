package ChatApp;

public class GetActiveUsersCommand implements Command {
    private ChatRoomManager chatRoomManager;
    private String roomId;

    public GetActiveUsersCommand(ChatRoomManager chatRoomManager, String roomId) {
        this.chatRoomManager = chatRoomManager;
        this.roomId = roomId;
    }

    @Override
    public void execute() {
        chatRoomManager.getActiveUsers(roomId);
    }
}
