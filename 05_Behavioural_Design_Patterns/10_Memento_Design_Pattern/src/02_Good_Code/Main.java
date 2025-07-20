package Good_Code;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setCurrentText("a");
        textEditor.setCurrentText("ab");
        System.out.println(textEditor.getCurrentText()); // ab
        textEditor.undo();
        System.out.println(textEditor.getCurrentText()); // a
        textEditor.redo();
        System.out.println(textEditor.getCurrentText()); // ab
        textEditor.undo();
        System.out.println(textEditor.getCurrentText()); // a
        textEditor.undo();
        System.out.println(textEditor.getCurrentText()); // ""
        textEditor.undo(); // Nothing to undo
        textEditor.redo();
        System.out.println(textEditor.getCurrentText()); // a
        textEditor.redo();
        System.out.println(textEditor.getCurrentText()); // ab
        textEditor.redo(); // Nothing to redo
    }
}