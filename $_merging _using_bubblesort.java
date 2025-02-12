import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the first element");
        int n1=scanner.nextInt();
        
        int[] arr1= new int[n1];
        System.out.println("enter the first array elements");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=scanner.nextInt();
        }
        
        System.out.println("enter the size of the second element");
        int n2=scanner.nextInt();
        
        int[] arr2= new int[n2];
        System.out.println("enter the second array elements");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=scanner.nextInt();
        }
        
        int[] mergearray = new int[n1+n2];
        
        System.arraycopy(arr1,0,mergearray,0,n1);
        System.arraycopy(arr2,0,mergearray,n1,n2);
        
        bubblesort(mergearray);
        
        System.out.println("the merged array is: ");
        for(int num:mergearray)
        {
            System.out.println(num+" ");
        }
        scanner.close();
    }
    
    public static void bubblesort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
        
}
