import java.util.Stack;

class TextEditor {
    
    private Stack<String> undo;
    private Stack<String> redo;
    private String text;

    public TextEditor() {
        undo = new Stack<>();
        redo = new Stack<>();
        text = "";
    }

    public void performOp(String newText) { 
        undo.push(text);
        redo.clear();
        text = newText; 
        System.out.println("Current Text: " + text);
    }

    public void undo() {
        if (!undo.isEmpty()) {
            redo.push(text);
            text = undo.pop();
            System.out.println("Undo performed. Current text: " + text);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redo.isEmpty()) {
            undo.push(text);
            text = redo.pop();
            System.out.println("Redo performed. Current text: " + text);
        } else {
            System.out.println("Nothing to redo.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        
        //editor.performOp("Hello");
        editor.performOp("Hello, World!");
        
        editor.undo();
        //editor.undo();
        editor.redo();
    }
}
