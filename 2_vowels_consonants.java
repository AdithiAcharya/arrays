import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("hey please enter the string");
        
        String input = scanner.nextLine();
        
        int vowelcount =0;
        int consonantcount = 0;
        String lc = input.toLowerCase();
        for(char ch: lc.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                if(isVowel(ch))
                {
                    vowelcount++;
                }
                else
                {
                    consonantcount++;
                }
            }
        }
        System.out.println("input entered:"+input);
        System.out.println("the number of vowels in the string"+ vowelcount);
        System.out.println("the number of consonants:"+ consonantcount);
        
        scanner.close();
    }
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1; 
    }
}
