package StringOfDigits;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOfNumbers {
    public static void main(String[] args) {
        String inputString = new Scanner(System.in).nextLine();

        System.out.println(isStringOfNumbers(inputString));
    }

    /**
     * This method checks whether the string contains only numbers
     * @param inputString Introductory line for checking for conformity
     * @return Returns boolean true if the string consists of numbers only
     */
    public static boolean isStringOfNumbers(String inputString){
        Pattern digit = Pattern.compile("\\d*");
        return digit.matcher(inputString).matches();
    }
}
