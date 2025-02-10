import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = scanner.nextLine();
        
        int len = input.length();
        
        boolean ispalindrome = true;
        for(int i=0;i<len/2;i++)
        {
            if(input.charAt(i) != input.charAt(len-i-1))
                ispalindrome = false;
                break;
        }
        if(ispalindrome)
        {
            System.out.println("the given string is palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome\n");
        }
         scanner.close();
    }
   
}
