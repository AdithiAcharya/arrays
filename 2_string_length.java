class Main {
    public static void main(String[] args) {
        
    
        String s1 = "aabbc";
        boolean valid = true;
        int l = s1.length();
        System.out.println("the length of the string is " + l);
        
        for(int i=0;i<l;i++)
        {
            char ch =s1.charAt(i);
            if(!Character.isLetter(ch))
            {
                System.out.println("it is not a valid string\n");
                valid = false;
                break;
            }
        }
        
        if(valid)
        {
            System.out.println("the string is valid");
        }
        else
        {
            System.out.println("enter only the valid string with letters\n");
        }
    }
}
