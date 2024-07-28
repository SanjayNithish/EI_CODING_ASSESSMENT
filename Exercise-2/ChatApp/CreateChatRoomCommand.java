package ChatApp;

public class CreateChatRoomCommand implements Command {
    private ChatRoomManager chatRoomManager;
    private String roomId;

    public CreateChatRoomCommand(ChatRoomManager chatRoomManager, String roomId) {
        this.chatRoomManager = chatRoomManager;
        this.roomId = roomId;
    }

    @Override
    public void execute() {
        chatRoomManager.createChatRoom(roomId);
    }
}
