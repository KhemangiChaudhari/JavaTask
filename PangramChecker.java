import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        boolean isPangram = checkPangram(sentence);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        HashSet<Character> alphabetSet = new HashSet<>();
        
        for (char c : lowerCaseSentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }
        
        return alphabetSet.size() == 26; // There are 26 letters in the English alphabet
    }
}
