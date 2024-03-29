package part01.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
