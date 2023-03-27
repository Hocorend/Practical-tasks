package CountingRepeatedCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//This program counts the repeated characters in a given string
public class CharacterCounter {
    public static void main(String[] args) {
        String inputString = new Scanner(System.in).nextLine();

        System.out.println(countDuplicateCharacters(inputString));
    }

    private static Map<Character,Integer> countDuplicateCharacters(String inputString){
        Map<Character,Integer> listOfRecurringCharacters = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (!listOfRecurringCharacters.containsKey(inputString.charAt(i))){
                listOfRecurringCharacters.put(inputString.charAt(i),1);
            } else {
                listOfRecurringCharacters.put(inputString.charAt(i),listOfRecurringCharacters.get(inputString.charAt(i))+1);
            }
        }
        return listOfRecurringCharacters;
    }
}
