package Task2;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String word1, String word2) {
      
        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", 
        "");

        if (word1.length() != word2.length()) return false;

        int[] letters = new int[256];


        for (int i = 0; i < word1.length(); i++) {
            letters[word1.charAt(i)]++;
            letters[word2.charAt(i)]--;
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
        

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String w1 = input.nextLine();
        System.out.print("Enter second word: ");
        String w2 = input.nextLine();
        input.close();

        System.out.println("Is the Word is Anagram : " + isAnagram(w1, w2));
    }
}
