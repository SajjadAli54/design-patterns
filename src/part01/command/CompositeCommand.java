package part01.command;

import java.util.ArrayList;
import java.util.List;

import part01.command.fx.Command;

public class CompositeCommand implements Command {
    List<Command> commands = new ArrayList<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void add(Command command) {
        commands.add(command);
    }

}
