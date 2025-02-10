import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter the size of  an input array");
    int  n = scanner.nextInt();
    
    if(n<2)
    {
        System.out.println("please enter more than 2 numbers");
        scanner.close();
        return;
    }
    
    
    int[] arr = new int[n];
    System.out.println("enter  the array elements ");
    for(int i=0;i<n;i++)
    {
        
        arr[i] = scanner.nextInt();
    }
    int max=arr[0], smax=-1;
    for(int i=1;i<n;i++)
    {
    if(arr[i]>max)
    {
        smax=max;
        max =arr[i];
    }
    else if(arr[i]!=max  && (smax!=-1 || arr[i]>smax))
    {
        smax=arr[i];
    }
    }
    System.out.println("the  max number is "+max);
    scanner.close();
    
    if(smax!=-1)
    {
        System.out.println("smax is "+smax);
    }
    else
    {
        System.out.println("smax is not found");
    }
    
}
}
    
