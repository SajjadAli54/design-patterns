package part01.command.editor;

import java.util.Stack;

public class History {
    Stack<UndoableCommand> commands = new Stack<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }
}
