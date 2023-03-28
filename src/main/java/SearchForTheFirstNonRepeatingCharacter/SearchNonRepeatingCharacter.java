package SearchForTheFirstNonRepeatingCharacter;

import java.util.Scanner;

public class SearchNonRepeatingCharacter {
    public static void main(String[] args) {
        String inputString = new Scanner(System.in).nextLine();

        System.out.println(getFirstNonRepeatingCharacter(inputString));
    }

   /**
    * This method searches for the first non-repeating character
    * @param inputString The string in which the search will be performed
    * @return The first non-repeating character
    */
    public static char getFirstNonRepeatingCharacter(String inputString){
        inputString = inputString.trim();
        char verificationCharacter = inputString.charAt(0);
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i)!=verificationCharacter&&inputString.charAt(i)!=' ')return inputString.charAt(i);
        }
        return '0';
    }
}
