import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements");
        
        int n= scanner.nextInt();
        int[] arr= new int[n];
        
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        bubblesort(arr);
        
        System.out.println("The resultant array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        scanner.close();
    }
    
    public static void bubblesort(int[] arr)
    {
        
        int n =arr.length;
        boolean swapped;
        
        for(int i=0;i<n-1;i++)
        {
            swapped=false;
            for(int j=0;j<n-1-i;j++ )
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                    break;
            }
        }
    }
}
