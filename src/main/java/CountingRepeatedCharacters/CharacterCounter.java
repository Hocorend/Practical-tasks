package CountingRepeatedCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        String inputString = new Scanner(System.in).nextLine();

        System.out.println(countDuplicateCharacters(inputString));
    }

    /**
     * This method counts repeated characters
     * @param inputString The string in which the characters will be counted
     * @return A collection of Map where the key is a symbol
     * and the value is the number of repeat of this symbol
    * */
    public static Map<Character,Integer> countDuplicateCharacters(String inputString){
        Map<Character,Integer> listOfRecurringCharacters = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i)==' ') continue;
            if (!listOfRecurringCharacters.containsKey(inputString.charAt(i))){
                listOfRecurringCharacters.put(inputString.charAt(i),1);
            } else {
                listOfRecurringCharacters.put(inputString.charAt(i),listOfRecurringCharacters.get(inputString.charAt(i))+1);
            }
        }
        return listOfRecurringCharacters;
    }
}
