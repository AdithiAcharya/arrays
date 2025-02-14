
import java.util.LinkedList;
import java.util.Queue;

class Main {
    Queue<Integer> q= new LinkedList<Integer>();

    void push(int val)
    {
        q.add(val);
        int size = q.size();
       
        
        for(int i=0;i<size-1;i++)
        {
            int x = q.remove();
            q.add(x);
        }
    }
    int pop()
    {
        if(q.isEmpty())
        {
            System.out.println("NO elements");
            return -1;
        }
        return q.remove();
    }
    
    int top()
    {
        if(q.isEmpty())
        {
            return -1;
        }
        return q.peek();
    }
    
    boolean isEmpty()
    {
        return q.isEmpty();
    } 


    public static void main(String[] args) {
        Main s=new Main();
        s.push(10);
        s.push(20);
        System.out.println("Top element :"+s.top());
        s.pop();
        s.push(30);
        s.pop();
        System.out.println("Top element :"+s.top());
    }
}
