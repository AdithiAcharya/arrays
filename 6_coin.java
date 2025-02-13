import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void mincoins(int n) {
        int[] coins = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        ArrayList<Integer> result = new ArrayList<>();

        for (int coin : coins) {
            while (n >= coin) {
                n -= coin;
                result.add(coin);
            }
        }

        System.out.println("Minimum coins needed: " + result.size());
        System.out.println("Coins used: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        mincoins(amount);
        scanner.close();
    }
}
