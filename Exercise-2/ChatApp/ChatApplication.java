package ChatApp;

import java.util.Scanner;

public class ChatApplication {
    public static void main(String[] args) {
        ChatRoomManager chatRoomManager = ChatRoomManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        CommandInvoker commandInvoker = new CommandInvoker();
        User currentUser = null;

        while (true) {
            if (currentUser == null) {
                System.out.println("Enter a command (create/join/exit):");
                String commandInput = scanner.nextLine().trim().toLowerCase();

                Command command = getCommand(commandInput, scanner, chatRoomManager);
                if (command != null) {
                    commandInvoker.executeCommand(command);
                    if (command instanceof JoinChatRoomCommand) {
                        currentUser = ((JoinChatRoomCommand) command).getUser(); 
                    }
                } else {
                    System.out.println("Invalid command. Please enter create, join, or exit.");
                }
            } else {
                System.out.println("You are in chat room: " + currentUser.getChatRoom().getRoomId());
                System.out.println("Enter a command (send/history/users/exit):");
                String commandInput = scanner.nextLine().trim().toLowerCase();

                if (commandInput.equals("exit")) {
                    currentUser = null; 
                } else {
                    Command command = getRoomCommand(commandInput, scanner, chatRoomManager, currentUser);
                    if (command != null) {
                        commandInvoker.executeCommand(command);
                    } else {
                        System.out.println("Invalid command. Please enter send, history, users, or exit.");
                    }
                }
            }
        }
    }

    private static Command getCommand(String commandInput, Scanner scanner, ChatRoomManager chatRoomManager) {
        if (commandInput.equals("create")) {
            System.out.println("Enter Chat Room ID:");
            String roomId = scanner.nextLine();
            return new CreateChatRoomCommand(chatRoomManager, roomId);
        } else if (commandInput.equals("join")) {
            System.out.println("Enter Chat Room ID:");
            String roomId = scanner.nextLine();
            System.out.println("Enter your username:");
            String username = scanner.nextLine();
            return new JoinChatRoomCommand(chatRoomManager, roomId, username);
        } else if (commandInput.equals("exit")) {
            return new ExitCommand();
        }
        return null;
    }

    private static Command getRoomCommand(String commandInput, Scanner scanner, ChatRoomManager chatRoomManager, User currentUser) {
        if (commandInput.equals("send")) {
            System.out.println("Enter your message:");
            String message = scanner.nextLine();
            return new SendMessageCommand(chatRoomManager, currentUser.getChatRoom().getRoomId(), currentUser.getUsername(), message);
        } else if (commandInput.equals("history")) {
            return new GetMessageHistoryCommand(chatRoomManager, currentUser.getChatRoom().getRoomId());
        } else if (commandInput.equals("users")) {
            return new GetActiveUsersCommand(chatRoomManager, currentUser.getChatRoom().getRoomId());
        }
        return null;
    }
}
