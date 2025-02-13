import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number of temp readings(in sorted way)");
        int n=sc.nextInt();
        
        System.out.println("enter the temp readings ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("the sorted temp readings:" +Arrays.toString(arr));
        
        //creating an array to store next warmer days
        
        int[] nextwarmerdays=new int[n];
        {
            for(int i=0;i<n;i++)
            {
               nextwarmerday[i]=findnextday(arr,arr[i],i+1,n); 
            }
        }
        
        System.out.println("next warmer day : ");
        for(int days :nextwarmeday)
        {
            System.out.println(days+" ");
        }
        sc.close();
        
        public static int nex
        int l=0,h=n;
        
        while(l<h)
        {
            int mid = (l+h)/2;
            
            if(arr[mid]==e)
            {
                System.out.println("the mid element found "+ mid);
                return;
            }
            else if(arr[mid]<e)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        System.out.println("element not found");
        sc.close();
        
        
    }
    
}
