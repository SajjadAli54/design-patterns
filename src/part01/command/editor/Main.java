package part01.command.editor;

public class Main {
    public static void main() {
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello, World!");

        BoldCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        boldCommand.unexecute();
        System.out.println(document.getContent());
    }
}
