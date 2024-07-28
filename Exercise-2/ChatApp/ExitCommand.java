package ChatApp;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Exiting the application.");
        System.exit(0);
    }
}