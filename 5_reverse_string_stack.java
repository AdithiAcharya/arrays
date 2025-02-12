import java.util.*;
class Main {
    public static void main(String[] args) {
        String str1="hello";
        System.out.println(str1+"<-reverse->"+reverse(str1));
    }
    public static String reverse(String str)
    {
        char[] arr=new char[str.length()];
        Stack<Character>stc= new Stack<Character>();
        
        for(int i=0;i<str.length();i++)
        {
            stc.push(str.charAt(i));
        }
        
        int i=0;
        while(!stc.isEmpty())
        {
            arr[i++]=stc.pop();
        }
        return new String(arr);
    }
}
