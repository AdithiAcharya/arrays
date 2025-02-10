import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        
    int[] input={1,0,4,0,5};
    moveZerosToEnd(input);
    System.out.println("the resultant array is:"+ Arrays.toString(input));
    }
    
    public static void moveZerosToEnd(int[] arr)
    {
        
        if (arr == null || arr.length == 0) {
            return;
        }
        int nonzeroindex=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[nonzeroindex]=arr[i];
                nonzeroindex++;
            }
        }
    
        for(int i=nonzeroindex;i<arr.length;i++)
        {
            arr[i]=0;
        }
    }
}
