import java .util.Stack;
class Main {
    public static void main(String[] args) {
        String str1 = "([)]";
        
        System.out.println(str1+"is balanced:"+balance(str1));
    }
    
    public static boolean balance(String str)
    {
        Stack<Character>s=new Stack<>();
        
        for(char c :str.toCharArray())
        {
            if(c=='{'||c=='['||c=='(')
            {
                s.push(c);
            }
            else if(c=='}'|| c==']' || c==')')
            {
                if(s.isEmpty())
                {
                    return false;
                }
                
                char top=s.pop();
                
                if((c=='}' && c!='{') ||
                (c==']' && c!='[')||
                (c==')' && c!='('))
                {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
