import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string from the user
        System.out.print("Enter a string (must start and end with '1'): ");
        String input = scanner.nextLine();
        
        // Validate input
        if (input.length() < 2 || input.charAt(0) != '1' || input.charAt(input.length() - 1) != '1') {
            System.out.println("Invalid input! The string must start and end with '1' and have at least 2 characters.");
            scanner.close();
            return;
        }
        
        // Generate substrings
        List<String> substrings = generateSubstrings(input);
        
        // Print the generated substrings
        System.out.println("Substrings of \"" + input + "\" that start and end with '1':");
        for (String substring : substrings) {
            System.out.println(substring);
        }
        
        scanner.close();
    }

    public static List<String> generateSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        int length = str.length();
        
        // Generate all possible substrings
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = str.substring(i, j);
                // Check if the substring starts and ends with '1'
                if (substring.startsWith("1") && substring.endsWith("1")) {
                    substrings.add(substring);
                }
            }
        }
        
        return substrings;
    }
}
