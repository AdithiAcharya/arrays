import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = new int[n][n];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < n; i++) {
            arr[i][i] = 0;
        }
        
        System.out.println("Modified Array (Diagonal elements set to 0):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
