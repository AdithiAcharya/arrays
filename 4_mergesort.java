class Main {
    public static void main(String[] args) {
        int arr[] = {5,7,3,8,9,1,}; 
        
        System.out.println("Original array: ");
        printArray(arr);

        mergesort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] l = new int[n1];
        int[] r = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            l[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = arr[mid + 1 + i];
        }
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }
    
    public static void mergesort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
