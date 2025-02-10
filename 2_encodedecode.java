import java.util.Scanner;
class Main {
    public static String decode(String encode)
    {
        return new StringBuilder(encode).reverse().toString();
    }
    
    
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the message that wants to be decoded ");
        
        String encode = scanner.nextLine();
        String decoded_message = decode(encode);
        
        System.out.println("the decoded message is"+decoded_message);
        scanner.close();
    }
}
    
