/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package basic;

import java.util.Scanner;

public class p6 {

    // User-defined function
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.toLowerCase().split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                          + word.substring(1) + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String output = capitalizeWords(input);

        System.out.println("Capitalized sentence: " + output);

        sc.close();
    }
}
