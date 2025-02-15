import java.util.Scanner;

public class Candies {
    public static long candies(int n, int[] arr) {
        long[] candies = new long[n];

        // Each child gets at least one candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Left to right
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up the candies
        long totalCandies = 0;
        for (int i = 0; i < n; i++) {
            totalCandies += candies[i];
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long result = candies(n, arr);
        System.out.println(result);
        
        scanner.close();
    }
}
