package ChatApp;

public class GetMessageHistoryCommand implements Command {
    private ChatRoomManager chatRoomManager;
    private String roomId;

    public GetMessageHistoryCommand(ChatRoomManager chatRoomManager, String roomId) {
        this.chatRoomManager = chatRoomManager;
        this.roomId = roomId;
    }

    @Override
    public void execute() {
        chatRoomManager.getMessageHistory(roomId);
    }
}
