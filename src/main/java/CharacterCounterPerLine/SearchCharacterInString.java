package CharacterCounterPerLine;

import java.util.Scanner;

public class SearchCharacterInString {
    public static void main(String[] args) {
        String inputString = new Scanner(System.in).nextLine();

        char desiredCharacter = new Scanner(System.in).next().charAt(0);

        System.out.println(countCharacterInString(desiredCharacter,inputString));
    }

    /**
     * This method counts the number of repeats of a character in a given string
     * @param inputString The string in which the character will be counted
     * @return Returns the number of repetitions of the desired character in the string
     * */
    public static int countCharacterInString(char desiredCharacter,String inputString){
        int amountOfRepeats = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i)==desiredCharacter) amountOfRepeats++;
        }
        return amountOfRepeats;
    }
}
