import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fib(" + n + ") = " + Fibonacci(n));
    }

    public static int Fibonacci(int N) {
        if (N <= 1) {
            return N;
        }
        return Fibonacci(N - 1) + Fibonacci(N - 2);
    }
}
