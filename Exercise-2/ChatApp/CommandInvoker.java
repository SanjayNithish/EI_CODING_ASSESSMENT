package ChatApp;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commandHistory;

    public CommandInvoker() {
        commandHistory = new ArrayList<>();
    }

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }
}
