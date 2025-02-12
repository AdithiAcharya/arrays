class Main {
    public static void main(String[] args) {
       int arr[]={1, 2, 3, 4, 5, 6, 7};
       int k=3;
       int n = arr.length;
       
       int[] temp=new int[n];
       
       int j=0;
       for(int i=n-k;i<n;i++)
       {
           temp[j]=arr[i];
           j++;
       }
       
       for(int i=0;i<n-k;i++)
       {
           temp[j]=arr[i];
           j++;
       }
       
       for(int i=0;i<n;i++)
       {
           arr[i]=temp[i];
       }
       
       for(int i=0;i<n;i++)
       {
           System.out.println(arr[i]+" ");
       }
    }
}
