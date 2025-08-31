package ExtraString;
import java.util.Scanner;

public class ReplaceWord {
    
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        String updatedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Updated Sentence: " + updatedSentence);
        
        scanner.close();
    }
}

