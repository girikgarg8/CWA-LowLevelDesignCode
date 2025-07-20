package Good_Code;

import java.util.Stack;

public class MementoManager {
    private final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();

    public void pushToUndoStack(String text) {
        undoStack.push(new Memento(text));
    }

    public void pushToRedoStack(String text) {
        redoStack.push(new Memento(text));
    }

    public void clearRedoStack() {
        redoStack.clear();
    }

    public boolean isUndoStackEmpty() {
        return undoStack.isEmpty();
    }

    public boolean isRedoStackEmpty() {
        return redoStack.isEmpty();
    }

    public Memento popUndoStack() {
        return undoStack.pop();
    }

    public Memento popRedoStack() {
        return redoStack.pop();
    }
}