import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="asdfghj";
        Stack<Character> undo= new Stack<>();
        Stack<Character> redo=new Stack<>();
        
        if(str.isEmpty())
        {
            System.out.println("please enter a text ");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            undo.push(str.charAt(i));
        }
        redo.clear();
        
        undoaction(undo,redo);
        undoaction(undo,redo);
        redoaction(undo,redo);
        
        System.out.println("redo satck:"+ redo);
        System.out.println("undone stack"+ undo);
    }
       public static void undoaction(Stack<Character> undo,Stack<Character>redo)
        {
            if(!undo.isEmpty())
            {
                char ch = undo.pop();
                redo.push(ch);
                System.out.println("the character "+ch+" is moved from redo to undo");
            }
            else
            {
                System.out.println("the text is empty");
            }
        }
        
        public static void redoaction(Stack<Character> undo,Stack<Character>redo)
        {
            if(!redo.isEmpty())
            {
                undo.push(redo.pop());
            //apply the redone stack
            }
            else
            {
                System.out.println("the stack is empty");
            }
        }
        
        
    }
