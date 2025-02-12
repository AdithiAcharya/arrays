import java.util.LinkedList;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        
        l.add("one");
        l.add("two");
        l.add("one");
        l.add("three");
        
        System.out.println("the original list is: "+l);
        
        LinkedList<String> unique=removeduplicates(l);
        System.out.println("the unique list is: "+unique);
    }
    
    public static LinkedList<String> removeduplicates(LinkedList<String>list)
    {
        LinkedList<String> unique=new LinkedList<String>();
        HashSet<String> seen=new HashSet<String>();
        
        for(String item:list)
        {
            if(seen.add(item))
                unique.add(item);
        }
        return unique;
    }
    
}
