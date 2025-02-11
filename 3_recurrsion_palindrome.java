import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("enter numbers");
        int n= scanner.nextInt();
        
        if(palindrome(n))
        {
            System.out.println("It is a palindrome ");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
        scanner.close();
        
    }
    
    public static int reverse(int n,int rev)
    {
        if(n==0)
        {
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }
    
    public static boolean palindrome(int n)
    {
        if(n==0)
        {
            return false;
        }
        return n == reverse(n,0);
    }
}
