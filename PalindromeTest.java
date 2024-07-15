import java.util.Scanner;
import java.util.Stack;

public class PalindromeTest {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean tryAgain = true;

        while(tryAgain){
            Stack<Character> wordStack = new Stack<>(); 

            System.out.println();
            
            System.out.print("Please enter a word to test (or 'exit' to end the program): ");   
            String wordEntered = userInput.nextLine();

            if (wordEntered.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye for now....");
                break; 
            }
        
            for (int i = 0; i < wordEntered.length(); i++) {
                Character letter = wordEntered.charAt(i);
                wordStack.push(letter);
            }

            String reverseString = "";

            while (!wordStack.isEmpty()) {
                Character letter = wordStack.pop();
                reverseString = reverseString + letter;          
            }

            if (wordEntered.equalsIgnoreCase(reverseString)){
                System.out.println("The word " + wordEntered + " is a Palindrome.");
            } else {
                System.out.println("The word " + wordEntered + " is not a Palindrome.");
            }
        }
        userInput.close();
    }
}   
    

