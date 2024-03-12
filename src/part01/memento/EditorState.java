package part01.memento;

public class EditorState {
    private final String content;
    private final String fontName;
    private final int fontSize;

    public String getContent() {
        return content;
    }

    public EditorState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

}
