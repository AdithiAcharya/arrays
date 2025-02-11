import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("enter number of elements");
        int n= scanner.nextInt();
        
        int[] arr =new int[n];
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        
        int csum=0;
        for(int i=0;i<3;i++)
        {
            csum += arr[i];
        }
        
        int maxsum=csum;
        
        
        for(int i=3;i<n;i++)
        {
            csum=csum+arr[i]-arr[i-3];
            maxsum = Math.max(csum,maxsum);
        }
        System.out.println("the maximum sum is : "+ maxsum);
        scanner.close();
    }
}
    
    
