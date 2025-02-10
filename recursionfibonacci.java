import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to find the fibonacci series");
        int num = scanner.nextInt();
        
        for(int i=0;i<=num;i++){
        System.out.println(fibonacci(i)+"");
        }
        scanner.close();
    }
    
    public static int fibonacci(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    
}
