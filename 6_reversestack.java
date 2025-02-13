import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="aabbc";
        
        Stack<Character>st=new Stack<>();
        Stack<Character>rev=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }
        while(!st.isEmpty())
        {
            rev.push(st.pop());
        }
        System.out.println(str+"<reversed to>"+rev);
    }
}
