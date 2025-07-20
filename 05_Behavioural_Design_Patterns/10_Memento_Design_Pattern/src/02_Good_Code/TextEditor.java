package Good_Code;

public class TextEditor {
    private String currentText = "";
    private final MementoManager mementoManager = new MementoManager();

    public void setCurrentText(String text) {
        mementoManager.pushToUndoStack(this.currentText);
        mementoManager.clearRedoStack();
        this.currentText = text;
    }

    public String getCurrentText() {
        return this.currentText;
    }

    public void undo() {
        if (!mementoManager.isUndoStackEmpty()) {
            mementoManager.pushToRedoStack(this.currentText);
            String previousText = mementoManager.popUndoStack().getText();
            this.currentText = previousText;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!mementoManager.isRedoStackEmpty()) {
            mementoManager.pushToUndoStack(this.currentText);
            String text = mementoManager.popRedoStack().getText();
            this.currentText = text;
        } else {
            System.out.println("Nothing to redo.");
        }
    }
}